package com.test;

import com.pazz.bean.CircularReferencesA;
import com.pazz.bean.CircularReferencesB;
import com.pazz.entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.ObjectUtils;

/**
 * Hello world!
 */
public class ApplicationTest {
    public static void main(String[] args) throws Exception {
        //spring-mvc.xml    spring-mybatis.xml
//        ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"spring-mybatis.xml", "spring-mvc.xml"});
        ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"classpath*:spring-mybatis.xml", "classpath*:spring-mvc.xml"});
        CircularReferencesA beanAA = ac.getBean("circularReferencesA", CircularReferencesA.class);
        CircularReferencesB beanBB = ac.getBean("circularReferencesB", CircularReferencesB.class);
        beanAA.testA();
        beanBB.testB();


//        DataSource dataSource = ac.getBean("dataSource", DataSource.class);
//        DefaultSqlSessionFactory sessionFactory = ac.getBean("sqlSessionFactory", DefaultSqlSessionFactory.class);

//        ApplicationContext ac = new AnnotationConfigApplicationContext(TestConfiguration.class);
//        Person p = ac.getBean(Person.class);
//        System.out.println(p);


//        @SuppressWarnings("deprecation")
//        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("spring-mvc.xml"));
//        Person person = (Person) bf.getBean("personName");
//        System.out.println(person);
    }
}
