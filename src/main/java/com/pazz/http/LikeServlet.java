package com.pazz.http;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

/**
 * @author: 彭坚
 * @create: 2019/3/13 21:00
 * @description:
 */
//@Component
public class LikeServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("servlet init");
        super.init();
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("servlet service");
        super.service(req, res);
    }

    @Override
    public void destroy() {
        System.out.println("servlet destroy");
        super.destroy();
    }
}
