package com.pazz.servlet;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author: 彭坚
 * @create: 2019/8/6 9:52
 * @description:
 */
@Component
public class RuntimeFilter implements Filter {

    public RuntimeFilter(){
        System.out.println("runtime filter");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init filter");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("do filter");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        System.out.println("destroy filter");
    }
}
