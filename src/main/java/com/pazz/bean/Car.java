package com.pazz.bean;

import lombok.Data;

/**
 * @author: Peng Jian
 * @date: 2018/8/6 14:26
 * @description:
 */
@Data
public class Car {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
