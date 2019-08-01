package com.pazz.common;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

/**
 * @author: 彭坚
 * @create: 2019/1/24 11:26
 * @description: InstantiationAwareBeanPostProcessor接口，
 * 每个Bean的实例化(即调用构造函数)之前和之后
 */
//@Component
public class InstantiationAwareBeanPostProcessorTest implements InstantiationAwareBeanPostProcessor {

    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        return null;
    }

    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        return true;
    }

}
