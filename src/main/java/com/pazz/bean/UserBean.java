package com.pazz.bean;

/**
 * @author: Peng Jian
 * @date: 2018/8/3 10:18
 * @description:
 */
public abstract class UserBean {

    public void showMe(){
        this.getBean().showMe();
    }

    public abstract User getBean();

}
