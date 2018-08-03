package com.test;

import com.pazz.entity.Person;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.StringUtils;

/**
 * Hello world!
 *
 */
public class ApplicationTest {
    public static void main( String[] args ) throws Exception {
//        String str = "abcde";
//        String str2 = "   ";
//        System.out.println(StringUtils.hasText(str2));
//        str = StringUtils.replace(str, "b", "a");
//        System.out.println(str);
//        int index = str.indexOf("c", 4);
//        System.out.println(index);

//        Assert.hasText(str, "must not is null !");
//        System.out.println(str.length());

        @SuppressWarnings("deprecation")
        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("spring-mvc.xml"));
        Person person = (Person) bf.getBean("nameBean");
        System.out.println(person);


        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-mvc.xml");
        Person nameBean = (Person) ac.getBean("nameBean");
        System.out.println(nameBean);


//        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
//        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
//        reader.loadBeanDefinitions(new ClassPathResource("spring-mvc.xml"));
//        Person person2 = (Person) beanFactory.getBean("nameBean");
//        System.out.println(person2);

    }
}
