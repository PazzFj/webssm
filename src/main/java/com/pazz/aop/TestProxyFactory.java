package com.pazz.aop;

import com.pazz.service.PersonService;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.DefaultAopProxyFactory;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.target.SingletonTargetSource;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author: 彭坚
 * @create: 2019/3/4 15:18
 * @description:
 */
//@Component
public class TestProxyFactory implements BeanPostProcessor, BeanFactoryAware, AfterReturningAdvice {

    private ConfigurableListableBeanFactory beanFactory;

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        Object obj = null;
        if(bean.getClass().equals(PersonService.class)){
            ProxyFactory proxyFactory = new ProxyFactory();
            proxyFactory.setTargetSource(new SingletonTargetSource(bean));
            proxyFactory.setAopProxyFactory(new DefaultAopProxyFactory());
            proxyFactory.setInterfaces(bean.getClass().getInterfaces());
            proxyFactory.addAdvice(new BeforeAdvice());
            proxyFactory.addAdvice(this);
            obj = proxyFactory.getProxy();
            beanFactory.registerSingleton("personService", obj);
        }
        return obj;
    }

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = (ConfigurableListableBeanFactory) beanFactory;
    }

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("后置: " + method.getName());
    }
}
