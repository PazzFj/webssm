package com.pazz.entity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: 彭坚
 * @create: 2019/4/22 15:51
 * @description:
 */
public class Teacher {

    private String name;

    private List<Student> students = new ArrayList<>();

    public Teacher() {
    }

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
