package com.pazz.common;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogInterceptor {

    @Pointcut("execution(public * com.pazz.service..*.getPersons(..))")
    public void myMethod(){

    }

    @Before("myMethod()")
    public void before() {
        System.out.println("method start");
    }

    @After("myMethod()")
    public void after() {
        System.out.println("method after");
    }

    @AfterReturning("execution(public * com.pazz.service..*.getPersons(..))")
    public void AfterReturning() {
        System.out.println("method AfterReturning");
    }

    @AfterThrowing("execution(public * com.pazz.service..*.getPersons(..))")
    public void AfterThrowing() {
        System.out.println("method AfterThrowing");
    }

    @Around("execution(public * com.pazz.service..*.getPersons(..))")
    public Object Around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("method Around");
        Object ret = jp.proceed();
        System.out.println(jp.getTarget());
        return ret;
    }

}
