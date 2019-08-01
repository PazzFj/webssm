package com.pazz.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author: 彭坚
 * @create: 2019/2/28 22:09
 * @description:
 */
@Aspect
@Component
public class TransactionalAspect {

    @Around("@annotation(com.pazz.aspect.annotation.LogPrintAnnotation)")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        Object obj = joinPoint.proceed();
        System.out.println("TransactionAspect#around(): ==>>   " + obj);
    }

}
