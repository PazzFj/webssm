package com.pazz.filter;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * @author: Peng Jian
 * @date: 2018/8/15 10:14
 * @description: 默认过滤器
 */
@Component
public class DefaultFilter implements Filter {

    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("DefaultFilter#init(FilterConfig)```");
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("DefaultFilter#doFilter(request, response, chain)```");
        String serverInfo = request.getServletContext().getServerInfo();
        System.out.println(serverInfo);
        chain.doFilter(request, response);
    }

    public void destroy() {
        System.out.println("DefaultFilter#destroy()```");
    }

}
