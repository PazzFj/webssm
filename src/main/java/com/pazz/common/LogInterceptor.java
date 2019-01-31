package com.pazz.common;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogInterceptor {

    private final Logger log = Logger.getLogger(getClass());

    @Pointcut("execution(public * com.pazz.service..*.getPersons(..)) && args(name, page)")
    public void myMethod(String name, int page){

    }

    @Before("myMethod(name, page)")
    public void before(String name, int page) {
        log.info("==================>>>>>> Before() name: = " + name + "  page: = " + page);
    }

    @After("myMethod(name, page)")
    public void after(String name, int page) {
//        log.info("After==>> name: = " + name);
    }

    @AfterReturning("execution(public * com.pazz.service..*.getPersons(..)) && args(name, page)")
    public void AfterReturning(String name, int page) {
//        log.info("AfterReturning==>> name: = " + name);
    }

    @AfterThrowing("execution(public * com.pazz.service..*.getPersons(..)) && args(name, page)")
    public void AfterThrowing(String name, int page) {
//        log.info("AfterThrowing==>> name: = " + name);
    }

    @Around("execution(public * com.pazz.service..*.getPersons(..)) && args(name, page)")
    public Object Around(ProceedingJoinPoint jp, String name, int page) throws Throwable {
        log.info("==================>>>>>> Around() name: = " + name + "  page: = " + page);
        Object ret = jp.proceed();
        System.out.println("result:  " + ret);
        return ret;
    }


}
