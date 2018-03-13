package com.test;

import com.pazz.entity.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.Assert;

/**
 * Hello world!
 *
 */
public class ApplicationTest {
    public static void main( String[] args ) throws Exception {
        String str = " a ";

        Assert.hasText(str, "must not is null !");
        System.out.println(str.length());

        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("spring-mvc.xml"));
        Person person = (Person) bf.getBean("nameBean");
        System.out.println(person);
    }
}
