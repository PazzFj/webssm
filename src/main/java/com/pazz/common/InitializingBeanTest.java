package com.pazz.common;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @author: 彭坚
 * @create: 2019/1/24 11:01
 * @description: InitializingBean接口中只有一个afterPropertiesSet方法，从方法的名称上很容易理解，
 * 这个方法是在Bean的属性都设置值后被调用，用于完成一些初始化工作。
 * 当然，在Spring的配置文件中init-method的配置也是在Bean的属性都设置值后被调用，
 * 用于完成一些初始化工作，不过在执行顺序上，接口的方法先于配置。值得注意的是，
 * 这两种方式都是用于完成一些初始化工作，所以相应的方法中不要编写一些复杂且执行时间很长的逻辑。
 */
@Component
public class InitializingBeanTest implements InitializingBean {

    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean: ==>> afterPropertiesSet");
    }

}
