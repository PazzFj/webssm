package com.pazz.entity;

import lombok.Data;

@Data
public class Person {

    private int pid;
    private String pname;
    private int page;

    @Override
    public String toString() {
        return "Person{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", page=" + page +
                '}';
    }
}
