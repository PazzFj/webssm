package com.pazz.aspect;

import org.apache.log4j.Logger;
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

    private final Logger log = Logger.getLogger(getClass());

    //切入点
    @Pointcut("execution(public * com.pazz.service..*.select(..)) && args(name, page)")
    public void myMethod(String name, int page){

    }

    @Pointcut("execution(public * com.pazz.service.PersonService.update(..)) && args(name, pid)")
    public void myMethod2(String name, int pid){

    }

    @Before("myMethod2(name, page)")
    public void before(String name, int page) {
//        log.info("==================>>>>>> Before() name: = " + name + "  page: = " + page);
    }

    @After("myMethod2(name, page)")
    public void after(String name, int page) {
//        log.info("After==>> name: = " + name);
    }

    @AfterReturning("execution(public * com.pazz.service..*.select(..)) && args(name, page)")
    public void AfterReturning(String name, int page) {
//        log.info("AfterReturning==>> name: = " + name);
    }

    @AfterThrowing("execution(public * com.pazz.service..*.select(..)) && args(name, page)")
    public void AfterThrowing(String name, int page) {
//        log.info("AfterThrowing==>> name: = " + name);
    }

    @Around("execution(public * com.pazz.service..*.select(..))")
    public Object Around(ProceedingJoinPoint jp) throws Throwable {
        Object result = jp.proceed();
        log.info("result: ==>> " + result);
        return result;
    }


}
