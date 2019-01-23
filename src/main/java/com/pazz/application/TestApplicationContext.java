package com.pazz.application;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

/**
 * @author: 彭坚
 * @create: 2019/1/19 22:20
 * @description:
 */
@Component
public class TestApplicationContext implements ApplicationContextAware {

    private static volatile ApplicationContext context;

    private static final Object lock = new Object();

    public TestApplicationContext() {
        System.out.println("初始化对象///");
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        synchronized(lock){
            System.out.println("获取ApplicationContext对象");
            this.context = applicationContext;
        }
    }

    public static WebApplicationContext getApplicationContext() {
        return (WebApplicationContext) context;
    }
}
