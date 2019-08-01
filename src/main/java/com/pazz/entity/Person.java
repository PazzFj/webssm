package com.pazz.entity;

import lombok.Data;

import javax.persistence.Table;

@Data
@Table(name = "person")
public class Person {

    private int id;
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

}
