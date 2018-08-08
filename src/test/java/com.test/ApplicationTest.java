package com.test;

import com.pazz.bean.AspectJTest;
import com.pazz.bean.BeanA;
import com.pazz.bean.Car;
import com.pazz.bean.CarFactoryBean;
import com.pazz.bean.Test;
import com.pazz.bean.TestBean;
import com.pazz.bean.UserBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class ApplicationTest {
    public static void main( String[] args ) throws Exception {
        //applicationContext.xml
        //spring-mvc.xml
        //aspectTest.xml
        ApplicationContext ac = new ClassPathXmlApplicationContext("aspectTest.xml");
        TestBean testBean = ac.getBean("testBean", TestBean.class);
        testBean.test();


//        UserBean userBean = (UserBean) ac.getBean("userBean");
//        userBean.showMe();
//        CarFactoryBean carFactoryBean = (CarFactoryBean) ac.getBean("&car");
//        Car car = carFactoryBean.getObject();
//        System.out.println(car);
//        ((ClassPathXmlApplicationContext) ac).setAllowCircularReferences(false);
//        BeanA beanA = (BeanA) ac.getBean("beanA");
//        System.out.println(beanA.getBeanB());


//        @SuppressWarnings("deprecation")
//        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("spring-mvc.xml"));
//        Person person = (Person) bf.getBean("personName");
//        System.out.println(person);

    }
}
