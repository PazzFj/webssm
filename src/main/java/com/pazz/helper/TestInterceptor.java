package com.pazz.helper;

import com.pazz.entity.Person;
import org.apache.ibatis.cache.CacheKey;
import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Properties;

/**
 * @author: 彭坚
 * @create: 2019/1/3 20:56
 * @description: mybatis 插件测试
 */
@Intercepts({
    @Signature(type = Executor.class, method = "query", args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class}),
    @Signature(type = Executor.class, method = "query", args = {MappedStatement.class, Object.class, RowBounds.class, ResultHandler.class, CacheKey.class, BoundSql.class})
})
@Component
public class TestInterceptor implements Interceptor, BeanFactoryAware {

    @Autowired
    private WrapObject object;

    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        Object[] args = invocation.getArgs();
        MappedStatement statements = (MappedStatement) args[0];
        Object parameter = args[1];
        RowBounds rowBounds = (RowBounds) args[2];
        ResultHandler resultHandler = (ResultHandler) args[3];
        Executor executor = (Executor) invocation.getTarget();
        CacheKey cacheKey;
        BoundSql boundSql;
        if(args.length == 4){
            //4 个参数时
            boundSql = statements.getBoundSql(parameter);
            cacheKey = executor.createCacheKey(statements, parameter, rowBounds, boundSql);
        }else {
            //6 个参数时
            cacheKey = (CacheKey) args[4];
            boundSql = (BoundSql) args[5];
        }
        BoundSql newBoundSql = new BoundSql(statements.getConfiguration(), boundSql.getSql() + "limit 0, 5", boundSql.getParameterMappings(), parameter);
        System.out.println(newBoundSql.getSql());
        List<Person> personList = executor.query(statements, parameter, rowBounds, resultHandler, cacheKey, newBoundSql);
        object.getMap().put("data", personList);
        return object;
    }

    @Override
    public Object plugin(Object target) {
        return Plugin.wrap(target, this);
    }

    @Override
    public void setProperties(Properties properties) {

    }


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        object = beanFactory.getBean("wrapObject", WrapObject.class);
    }
}
