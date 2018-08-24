package com.pazz.configuration;

import com.pazz.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: 彭坚
 * @create: 2018/8/24 15:21
 * @description:
 */
@Configuration
public class TestConfiguration {

    public TestConfiguration(){
        System.out.println("启动容器=== 加载bean...");
    }

    @Bean
    public Person getPerson(){
        Person person = new Person();
        person.setPname("name");
        person.setPid(1);
        person.setPage(25);
        return person;
    }

}
