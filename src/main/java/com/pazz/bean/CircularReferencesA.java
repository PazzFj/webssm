package com.pazz.bean;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author: 彭坚
 * @create: 2019/2/14 16:06
 * @description:
 */
public class CircularReferencesA {

    @Autowired
    private CircularReferencesB referencesB;

    private String name = "CircularA";

    public void testA(){
        System.out.println(this.referencesB);
    }

    public CircularReferencesB getReferencesB() {
        return referencesB;
    }
}
