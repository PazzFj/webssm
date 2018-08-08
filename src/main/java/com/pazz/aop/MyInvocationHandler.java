package com.pazz.aop;

import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.Method;

/**
 * @author: Peng Jian
 * @date: 2018/8/8 17:43
 * @description:
 */
public class MyInvocationHandler implements InvocationHandler {

    private Object target;

    public MyInvocationHandler(Object target) {
        super();
        this.target = target;
    }

    public Object invoke(Object o, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        Object object = method.invoke(this.target, args);
        System.out.println("after");
        return object;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), target.getClass().getInterfaces(), this);
    }

}
