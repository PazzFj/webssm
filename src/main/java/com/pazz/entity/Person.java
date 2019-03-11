package com.pazz.entity;

import lombok.Data;

import javax.persistence.Table;

@Data
@Table(name = "person")
public class Person {

    private int pid;
    private String pname;
    private int page;

    public Person() {
    }

    public Person(String pname) {
        this.pname = pname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", page=" + page +
                '}';
    }
}
