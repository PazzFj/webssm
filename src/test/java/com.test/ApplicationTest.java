package com.test;

import com.pazz.entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
        System.out.println("----------");
        Person person = ac.getBean("personId", Person.class);
        System.out.println(person.getName());
//        String[] service = ac.getBeanNamesForType(IBaseService.class);
//        IBaseService service = ac.getBean("personService", IBaseService.class);
//        System.out.println(Arrays.asList(service));

//        ApplicationContext acac = new AnnotationConfigApplicationContext("com.pazz");

//        ApplicationContext ac1 = new ClassPathXmlApplicationContext(new String[]{"spring-mybatis.xml", "spring-mvc.xml"});
//        IBaseService personService = ac1.getBean("personService", IBaseService.class);
//        System.out.println(personService);
//        String[] s1 = ac1.getBeanNamesForType(BeanPostProcessor.class);     //根据class获取所有beanName
//        Map<String, BeanPostProcessor> map = ac1.getBeansOfType(BeanPostProcessor.class);   //根据class获取所有对象
//        String[] s2 = ac1.getBeanNamesForAnnotation(Component.class);       //根据注解class获取所有beanName
//        Map<String, Object> map1 = ac1.getBeansWithAnnotation(Component.class); ////根据注解class获取所有对象
//        Component component = ac1.findAnnotationOnBean("beanFactoryAwareTest", Component.class);  //根据beanName注解class获取注解对象

//        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
//        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
//        SqlSessionFactory sessionFactory = builder.build(inputStream);
//        SqlSession sqlSession = sessionFactory.openSession(true);
//        Map<String, Object> map = new HashMap<>();
//        map.put("name", "jay");
//        map.put("id", "1");
//        sqlSession.update("updatePerson", map);
//        sqlSession.commit();
//        sqlSession.close();
    }
}
