package com.test;

import com.pazz.bean.AspectJTest;
import com.pazz.bean.BeanA;
import com.pazz.bean.Car;
import com.pazz.bean.CarFactoryBean;
import com.pazz.bean.Test;
import com.pazz.bean.TestBean;
import com.pazz.bean.UserBean;
import com.pazz.entity.Person;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Hello world!
 */
public class ApplicationTest {
    public static void main(String[] args) throws Exception {
        //applicationContext.xml
        //spring-mvc.xml
        //aspectTest.xml
        //spring-mybatis.xml
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        DataSource dataSource = ac.getBean("dataSource", DataSource.class);
        DefaultSqlSessionFactory sessionFactory = ac.getBean("sqlSessionFactory", DefaultSqlSessionFactory.class);
        System.out.println(sessionFactory);

//        // Java JDBC
//        Connection connection = dataSource.getConnection();
//        PreparedStatement preparedStatement = connection.prepareStatement("select * from person");
//        ResultSet resultSet = preparedStatement.executeQuery();
//        while (resultSet.next()) {
//            System.out.println(resultSet.getString(2));
//        }
//
//        // Spring JDBC ===> JdbcTemplate
//        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
//        List query = jdbcTemplate.query("select * from person", new RowMapper<Person>(){
//            public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
//                Person person = new Person();
//                person.setPid(rs.getInt(1));
//                person.setPname(rs.getString(2));
//                person.setPage(rs.getInt(3));
//                return person;
//            }
//        });
//        System.out.println(query);


//        @SuppressWarnings("deprecation")
//        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("spring-mvc.xml"));
//        Person person = (Person) bf.getBean("personName");
//        System.out.println(person);
    }
}
