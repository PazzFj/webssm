package com.pazz.bean;

import lombok.Data;

/**
 * @author: Peng Jian
 * @date: 2018/8/7 17:31
 * @description:
 */
@Data
public class TestBean {

    private String testStr = "testStr";

    public void test(){
        System.out.println("test");
    }


}
