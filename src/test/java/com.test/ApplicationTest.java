package com.test;

import com.pazz.bean.CircularReferencesA;
import com.pazz.config.AutoConfigurable;
import com.pazz.service.IPersonService;
import com.pazz.service.PersonService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;

/**
 * Hello world!
 */
public class ApplicationTest {
    public static void main(String[] args) throws Exception {
        //spring-mvc.xml    spring-mybatis.xml
//        @SuppressWarnings("deprecation")
//        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("spring-mvc.xml"));  //屌丝ioc
//        ApplicationContext ac1 = new ClassPathXmlApplicationContext(new String[]{"spring-mybatis.xml", "spring-mvc.xml"});
//        IPersonService personService = (IPersonService) ac1.getBean("personService", IPersonService.class, PersonService.class);
//        System.out.println(personService.getPersons("asdf", 0));
//        ApplicationContext ac2 = new FileSystemXmlApplicationContext(new String[]{"spring-mybatis.xml", "spring-mvc.xml"});
//        ApplicationContext ac3 = new AnnotationConfigApplicationContext(AutoConfigurable.class);
//        WebApplicationContext ac4 = new AnnotationConfigWebApplicationContext();   //spring web 使用
//        WebApplicationContext ac5 = new XmlWebApplicationContext();  //spring web 使用

        DefaultListableBeanFactory defaultBf = new DefaultListableBeanFactory();
        BeanDefinitionReader bdr = new XmlBeanDefinitionReader(defaultBf);
        bdr.loadBeanDefinitions(new ClassPathResource("spring-bean.xml"));
        CircularReferencesA referencesA = defaultBf.getBean("circularReferencesA", CircularReferencesA.class);
        System.out.println(referencesA.getReferencesB().getNameB());
    }
}
