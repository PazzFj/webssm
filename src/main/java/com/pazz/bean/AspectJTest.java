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

    @Pointcut("execution(* com.pazz..*.test(..))")
    public void test(){

    }

    @Before("test()")
    public void beforeTest(){
        System.out.println("beforeTest");
    }

    @After("test()")
    public void afterTest(){
        System.out.println("afterTest");
    }

    @Around("test()")
    public Object aroundTest(ProceedingJoinPoint point){
        System.out.println("before1");
        Object o = null;
        try{
            o = point.proceed();
        }catch (Throwable e){
            e.printStackTrace();
        }
        System.out.println("after1");
        return o;
    }

}
