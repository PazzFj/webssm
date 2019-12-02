package com.pazz.servlet;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author: 彭坚
 * @create: 2019/8/7 15:41
 * @description:
 */
@Component
public class RuntimeInterceptor extends HandlerInterceptorAdapter {

    /**
     * 在业务处理器处理请求之前被调用
     * 如果返回false
     * 从当前的拦截器往回执行所有拦截器的afterCompletion(),再退出拦截器链
     * 如果返回true
     * 执行下一个拦截器,直到所有的拦截器都执行完毕
     * 再执行被拦截的Controller
     * 然后进入拦截器链,
     * 从最后一个拦截器往回执行所有的postHandle()
     * 接着再从最后一个拦截器往回执行所有的afterCompletion()
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if ("GET".equalsIgnoreCase(request.getMethod())) {
            System.out.println("get http method handler interceptor");
        }
        String requestUri = request.getRequestURI();
        String contextPath = request.getContextPath();
        String url = requestUri.substring(contextPath.length());

//        String userName = request.getParameter("userName");
//        if (userName == null || userName.equals("")) {
//            request.getRequestDispatcher("login.do").include(request, response);
//            response.setCharacterEncoding("UTF-8");
//            response.getWriter().write("error");
//            return false;
//        }
        System.out.println("pre handle request:" + request.getRequestURL());
        return super.preHandle(request, response, handler);
    }

}
