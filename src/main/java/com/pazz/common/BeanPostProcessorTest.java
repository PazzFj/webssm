package com.pazz.common;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author: 彭坚
 * @create: 2019/1/24 11:08
 * @description: BeanPostProcessor接口中有两个方法，分别为 postProcessBeforeInitialization() 和 postProcessAfterInitialization()
 * 实现了BeanPostProcessor接口的类，会在每个Bean初始化(即调用setter)之前和之后，
 * 分别调用这个类中的postProcessBeforeInitialization方法和postProcessAfterInitialization方法
 * 实现初始化的逻辑控制
 */
//@Component
public class BeanPostProcessorTest implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
