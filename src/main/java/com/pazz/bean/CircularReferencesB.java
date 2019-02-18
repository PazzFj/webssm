package com.pazz.bean;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author: 彭坚
 * @create: 2019/2/14 16:06
 * @description:
 */
public class CircularReferencesB {

    @Autowired
    private CircularReferencesA referencesA;

    private String name = "CircularB";

    public void testB(){
        System.out.println(this.referencesA);
    }

    public CircularReferencesA getReferencesA() {
        return referencesA;
    }
}
