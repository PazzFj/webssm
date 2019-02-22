package com.pazz.bean;

/**
 * @author: 彭坚
 * @create: 2019/2/14 16:06
 * @description:
 */
public class CircularReferencesA {

    private CircularReferencesB referencesB;

    private String nameA = "CircularA";

    public void nameA(){
        System.out.println(this.nameA);
    }

    public CircularReferencesB getReferencesB() {
        return referencesB;
    }

    public void setReferencesB(CircularReferencesB referencesB) {
        this.referencesB = referencesB;
    }

    public String getNameA() {
        return nameA;
    }

    public void setNameA(String nameA) {
        this.nameA = nameA;
    }
}
