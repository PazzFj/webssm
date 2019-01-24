package com.pazz.test;

import com.pazz.entity.Person;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author: 彭坚
 * @create: 2019/1/24 11:20
 * @description: FactoryBean接口可以实现Bean实例化的个性定制，让Spring容器加载我们想要的Bean。
 * 实现了FactoryBean接口的类，可以通过实现getObject方法，实现加载我们想要的Bean
 */
//@Component
public class TestFactoryBean implements FactoryBean<Person> {
    public Person getObject() throws Exception {
        Person person = new Person();
        person.setPname("FactoryBean");
        return person;
    }

    public Class<?> getObjectType() {
        return Person.class;
    }

}
