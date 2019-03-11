package com.pazz.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * @author: 彭坚
 * @create: 2019/2/28 22:09
 * @description:
 */
@Aspect
public class TransactionalAspect {

    @Around("@annotation(com.pazz.annotation.LogPrintAnnotation)")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("log ==>> " + joinPoint.getArgs() != null ? joinPoint.getArgs()[0] : "null");
        joinPoint.proceed();
    }

}
