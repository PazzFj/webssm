package com.pazz.config;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.stereotype.Component;

/**
 * @author: 彭坚
 * @create: 2019/2/27 23:25
 * @description:
 */
@Component
public class ValidateConditionA implements Condition {

    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        ConfigurableListableBeanFactory bf = context.getBeanFactory();
        Object referencesA = bf.getBean("circularReferencesA");
        BeanDefinition definition = bf.getBeanDefinition("circularReferencesA");
        System.out.println(referencesA);
        if (definition == null || definition != null) {
            return false;
        }
        if (referencesA == null) {
            return false;
        }
        return true;
    }

}
