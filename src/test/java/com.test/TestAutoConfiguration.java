package com.test;

import com.pazz.configuration.TestConfiguration;
import com.pazz.entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: 彭坚
 * @create: 2018/8/24 15:20
 * @description:
 */
public class TestAutoConfiguration {

    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestConfiguration.class);
        Person person = (Person) ac.getBean("getPerson");
        System.out.println(person);
    }

}
