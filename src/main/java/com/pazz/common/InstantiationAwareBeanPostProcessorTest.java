package com.pazz.common;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author: 彭坚
 * @create: 2019/1/24 11:26
 * @description: InstantiationAwareBeanPostProcessor接口，常用的方法是postProcessBeforeInstantiation和postProcessAfterInstantiation
 * 每个Bean的实例化(即调用构造函数)之前和之后，会分别调用实现了该接口的类中的postProcessBeforeInstantiation和postProcessAfterInstantiation方法
 */
@Component
public class InstantiationAwareBeanPostProcessorTest implements InstantiationAwareBeanPostProcessor {

    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        return null;
    }

    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        return true;
    }

    public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
        PropertyValue[] propertyValues = pvs.getPropertyValues();
        for (int i = 0; i < propertyValues.length; i++) {
            PropertyValue propertyValue = propertyValues[i];
            System.out.println("-->PropertyValue: " + propertyValue.getName() + " == " + propertyValue.getValue());
        }
        return pvs;
    }

}
