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
public class TestAspect {

    @Around("@annotation(com.pazz.annotation.AspectAnnotation)")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("test aspect annotation");
        joinPoint.proceed();
    }

}
