package com.pazz.filter;

import org.springframework.stereotype.Component;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * @author: Peng Jian
 * @date: 2018/8/15 13:43
 * @description: 框架过滤器
 */
@Component
public class FrameworkFilter extends DefaultFilter {

    private static ServletContext servletContext;

    public static ServletContext getServletContext() {
        return servletContext;
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        setServletContext(filterConfig);
        super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        super.doFilter(request, response, chain);
    }

    @Override
    public void destroy() {
        super.destroy();
    }

    public static void setServletContext(FilterConfig filterConfig) {
        servletContext = filterConfig.getServletContext();
    }
}
