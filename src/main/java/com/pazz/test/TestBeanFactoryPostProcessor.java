package com.pazz.test;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @author: 彭坚
 * @create: 2019/1/24 11:27
 * @description: BeanFactoryPostProcessor接口中只有postProcessBeanFactory方法。
 * 实现了该接口的类，可以在Bean被创建之前，获取容器中Bean的定义信息，并且可以进行修改。
 * 实现类中的postProcessBeanFactory方法只会被执行一次，且先于BeanPostProcessor接口的方法
 */
//@Component
public class TestBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactoryPostProcessor Test...");
    }

}
