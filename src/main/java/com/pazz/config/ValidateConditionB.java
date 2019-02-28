package com.pazz.config;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author: 彭坚
 * @create: 2019/2/27 23:25
 * @description:
 */
public class ValidateConditionB implements Condition {

    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        BeanFactory bf = context.getBeanFactory();
        Object referencesB = bf.getBean("circularReferencesB");
        System.out.println(referencesB);
        if (referencesB == null) {
            return false;
        }
        return true;
    }

}
