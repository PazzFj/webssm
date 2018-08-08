package com.pazz.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;

/**
 * @author: Peng Jian
 * @date: 2018/8/7 13:50
 * @description:
 */
public class Test implements BeanFactoryAware {

    private BeanFactory beanFactory;

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    public void say(){
        Hello hello = (Hello) this.beanFactory.getBean("hello");
        hello.say();
    }


}
