package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

/**
 * Hello world!
 *
 */
public class ApplicationTest {
    public static void main( String[] args ) {

//        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-mvc.xml");
//        MappingJackson2HttpMessageConverter bean = (MappingJackson2HttpMessageConverter) ac.getBean("mappingJacksonHttpMessageConverter");

        System.out.println( "Hello World!");
    }
}
