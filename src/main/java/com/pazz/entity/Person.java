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

    public Person(int pid, String pname, int page) {
        this.pid = pid;
        this.pname = pname;
        this.page = page;
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
