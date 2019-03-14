package com.pazz.http;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author: 彭坚
 * @create: 2019/3/13 21:00
 * @description:
 */
@Component
public class LikeServlet implements Servlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("init servlet config");
    }

    @Override
    public ServletConfig getServletConfig() {
        System.out.println("get servlet config");
        return null;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("service");
    }

    @Override
    public String getServletInfo() {
        System.out.println("get servlet info");
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("destroy");
    }
}
