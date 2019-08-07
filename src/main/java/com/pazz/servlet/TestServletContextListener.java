package com.pazz.servlet;

import org.springframework.stereotype.Component;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @author: 彭坚
 * @create: 2019/8/5 13:55
 * @description:
 */
@Component
public class TestServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("initial sce: " + sce.getServletContext().getContextPath());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("destroy sce: " + sce.getServletContext().getContextPath());
    }
}
