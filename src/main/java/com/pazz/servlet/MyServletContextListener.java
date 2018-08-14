package com.pazz.servlet;

import org.springframework.stereotype.Component;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author: Peng Jian
 * @date: 2018/8/10 17:13
 * @description:
 */
@Component
public class MyServletContextListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("initialized");
    }

    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("destroyed");
    }

}
