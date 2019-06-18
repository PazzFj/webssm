package com.pazz.entity;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author: 彭坚
 * @create: 2019/4/22 15:52
 * @description:
 */
public class Student {

    private String name;
    @Autowired
    private Teacher teacher;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
