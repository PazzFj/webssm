package com.pazz.config;

import com.pazz.entity.Student;
import com.pazz.entity.Teacher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Import;

/**
 * @author: 彭坚
 * @create: 2019/4/22 15:46
 * @description:
 */
@Configuration
@Import({TeacherAutoConfiguration.class})
public class StudentAutoConfiguration {

    public StudentAutoConfiguration() {
        System.out.println("studentAutoConfiguration init constructor");
    }

    @Bean
    @DependsOn({"teacher"})
    public Student student(Teacher teacher){
        Student student = new Student("AutoStudent");
        student.setTeacher(teacher);
        return student;
    }

}
