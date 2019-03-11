package com.test;

import com.pazz.service.IService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class ApplicationTest {
    public static void main(String[] args) throws Exception {
        //spring-mvc.xml    spring-mybatis.xml
        /*
             ApplicationContext ac1 = new ClassPathXmlApplicationContext(new String[]{"spring-mybatis.xml", "spring-mvc.xml"});

             ApplicationContext ac2 = new FileSystemXmlApplicationContext(new String[]{"spring-mybatis.xml", "spring-mvc.xml"});

             ApplicationContext ac3 = new AnnotationConfigApplicationContext(AutoConfigurable.class);

             WebApplicationContext ac4 = new AnnotationConfigWebApplicationContext();   //spring web 使用

             WebApplicationContext ac5 = new XmlWebApplicationContext();  //spring web 使用
         */

        ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"spring-mybatis.xml", "spring-mvc.xml"});
//        String[] service = ac.getBeanNamesForType(IService.class);
        IService service = (IService) ac.getBean("personService");
        System.out.println(Arrays.asList(service));

//        ApplicationContext acac = new AnnotationConfigApplicationContext("com.pazz");

//        ApplicationContext ac1 = new ClassPathXmlApplicationContext(new String[]{"spring-mybatis.xml", "spring-mvc.xml"});
//        IService personService = ac1.getBean("personService", IService.class);
//        System.out.println(personService);
//        String[] s1 = ac1.getBeanNamesForType(BeanPostProcessor.class);     //根据class获取所有beanName
//        Map<String, BeanPostProcessor> map = ac1.getBeansOfType(BeanPostProcessor.class);   //根据class获取所有对象
//        String[] s2 = ac1.getBeanNamesForAnnotation(Component.class);       //根据注解class获取所有beanName
//        Map<String, Object> map1 = ac1.getBeansWithAnnotation(Component.class); ////根据注解class获取所有对象
//        Component component = ac1.findAnnotationOnBean("beanFactoryAwareTest", Component.class);  //根据beanName注解class获取注解对象
    }
}
