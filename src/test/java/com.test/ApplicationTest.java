package com.test;

import com.pazz.bean.CircularReferencesA;
import com.pazz.common.BeanFactoryAwareTest;
import com.pazz.config.AutoConfigurable;
import com.pazz.entity.Person;
import com.pazz.service.IPersonService;
import com.pazz.service.PersonService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.ResolvableType;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Hello world!
 */
public class ApplicationTest {
    public static void main(String[] args) throws Exception {
        //spring-mvc.xml    spring-mybatis.xml
        /**
         @SuppressWarnings("deprecation") BeanFactory bf = new XmlBeanFactory(new ClassPathResource("spring-mvc.xml"));  //屌丝ioc

         ApplicationContext ac1 = new ClassPathXmlApplicationContext(new String[]{"spring-mybatis.xml", "spring-mvc.xml"});
         IPersonService personService = (IPersonService) ac1.getBean("personService", IPersonService.class, PersonService.class);
         System.out.println(personService.getPersons("asdf", 0));

         ApplicationContext ac2 = new FileSystemXmlApplicationContext(new String[]{"spring-mybatis.xml", "spring-mvc.xml"});

         ApplicationContext ac3 = new AnnotationConfigApplicationContext(AutoConfigurable.class);

         WebApplicationContext ac4 = new AnnotationConfigWebApplicationContext();   //spring web 使用

         WebApplicationContext ac5 = new XmlWebApplicationContext();  //spring web 使用
         */

        AnnotationConfigApplicationContext acc = new AnnotationConfigApplicationContext(AutoConfigurable.class);
//        AnnotationConfigApplicationContext acc = new AnnotationConfigApplicationContext("com.pazz");
//        System.out.println(((CircularReferencesA)acc.getBean("circularReferencesA")).getReferencesB());

//        DefaultListableBeanFactory defaultBf = new DefaultListableBeanFactory();
//        BeanDefinitionReader bdr = new XmlBeanDefinitionReader(defaultBf);
//        bdr.loadBeanDefinitions(new ClassPathResource("spring-bean.xml"));
//        CircularReferencesA referencesA = defaultBf.getBean("circularReferencesA", CircularReferencesA.class);
//        System.out.println(referencesA);

//        ApplicationContext ac1 = new ClassPathXmlApplicationContext(new String[]{"spring-mybatis.xml", "spring-mvc.xml"});
//        String[] s1 = ac1.getBeanNamesForType(BeanPostProcessor.class);     //根据class获取所有beanName
//        Map<String, BeanPostProcessor> map = ac1.getBeansOfType(BeanPostProcessor.class);   //根据class获取所有对象
//        String[] s2 = ac1.getBeanNamesForAnnotation(Component.class);       //根据注解class获取所有beanName
//        Map<String, Object> map1 = ac1.getBeansWithAnnotation(Component.class); ////根据注解class获取所有对象
//        Component component = ac1.findAnnotationOnBean("beanFactoryAwareTest", Component.class);  //根据beanName注解class获取注解对象
    }
}
