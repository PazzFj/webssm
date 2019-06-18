package com.pazz.config;

import com.pazz.entity.Teacher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: 彭坚
 * @create: 2019/4/22 15:48
 * @description:
 */
@Configuration
public class TeacherAutoConfiguration {

    public TeacherAutoConfiguration() {
        System.out.println("teacherAutoConfiguration init constructor");
    }

    @Bean
    public Teacher teacher(){
        return new Teacher("AutoTeacher");
    }
}
