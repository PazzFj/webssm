package com.test;

import com.pazz.entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class ApplicationTest {
    public static void main(String[] args) throws Exception {
        //spring-mvc.xml    spring-mybatis.xml
        ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"spring-mybatis.xml", "spring-mvc.xml"});
        Person bean = ac.getBean("factoryBeanTest", Person.class);
        System.out.println(bean.toString());
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
