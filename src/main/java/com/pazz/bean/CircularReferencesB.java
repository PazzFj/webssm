package com.pazz.bean;

/**
 * @author: 彭坚
 * @create: 2019/2/14 16:06
 * @description:
 */
public class CircularReferencesB {

    private CircularReferencesA referencesA;

    private String nameB = "CircularB";

    public void nameB(){
        System.out.println(this.nameB);
    }

    public CircularReferencesA getReferencesA() {
        return referencesA;
    }

    public void setReferencesA(CircularReferencesA referencesA) {
        this.referencesA = referencesA;
    }

    public String getNameB() {
        return nameB;
    }

    public void setNameB(String nameB) {
        this.nameB = nameB;
    }
}
