package com.pazz.application;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @author: 彭坚
 * @create: 2019/1/19 22:11
 * @description:
 */
@Component
public class TestInitializingBean implements InitializingBean {

    public TestInitializingBean() {
        System.out.println("正在初始化对象...");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("我在构造器之后加载...");
    }
}
