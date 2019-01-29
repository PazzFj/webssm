package com.pazz.common;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.SourceLocation;
import org.springframework.stereotype.Component;

@Aspect
@Component // for auto scan
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

//    @Before("execution(public * com.pazz.service..*.getPersons(..)) && args(name,..)")
//    public void before3(int name) {
//        System.out.println("userId-----" + userId);
//    }
//    @Before("myMethod()")
//    public void before2(JoinPoint jp) {
//        Object[] args = jp.getArgs();
//        System.out.println("userId11111: " + (Integer)args[0]);
//        System.out.println(jp.getTarget());
//        System.out.println(jp.getThis());
//        System.out.println(jp.getSignature());
//        System.out.println("method start");
//    }

}
