package com.pazz.bean;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author: Peng Jian
 * @date: 2018/8/7 15:34
 * @description:
 */
@Aspect
public class AspectJTest {

    @Pointcut("execution(* com.pazz..*.getPersons(..))")
    public void getPersons(){

    }

    @Before("getPersons()")
    public void beforeTest(){
        System.out.println("beforeTest getPersons");
    }

    @After("getPersons()")
    public void afterTest(){
        System.out.println("afterTest getPersons");
    }

    @Around("getPersons()")
    public Object aroundTest(ProceedingJoinPoint point){
        System.out.println("before1 getPersons");
        Object o = null;
        try{
            o = point.proceed();
        }catch (Throwable e){
            e.printStackTrace();
        }
        System.out.println("after1 getPersons");
        return o;
    }

}
