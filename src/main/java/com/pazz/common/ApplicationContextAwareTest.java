package com.pazz.common;

import com.pazz.service.IPersonService;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * @author: 彭坚
 * @create: 2019/1/24 11:09
 * @description: ApplicationContextAware中只有一个setApplicationContext方法。
 * 实现了ApplicationContextAware接口的类，可以在该Bean被加载的过程中获取Spring的应用上下文ApplicationContext，
 * 通过ApplicationContext可以获取Spring容器内的很多信息
 */
@Component
public class ApplicationContextAwareTest implements ApplicationContextAware {

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        try {
//            Connection conn = applicationContext.getBean("dataSource", DataSource.class).getConnection();
//            PreparedStatement ps = conn.prepareStatement("update person set pname = 'asdf' where pid = ?");
//            ps.setInt(1, 1);
//            ps.execute();
//            ps.close();
//            conn.close();
//            System.out.println("ApplicationContextAware#setApplicationContext()>>>" + applicationContext.getBean("personService", IPersonService.class).getPersons("asdf", 0));
        }catch(Exception e){
            e.fillInStackTrace();
        }
    }

}
