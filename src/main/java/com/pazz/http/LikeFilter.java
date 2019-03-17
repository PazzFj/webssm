package com.pazz.http;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author: 彭坚
 * @create: 2019/3/13 21:03
 * @description:
 */
//@Component
public class LikeFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("filter init");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("filter doFilter");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        System.out.println("filter destroy");
    }
}
