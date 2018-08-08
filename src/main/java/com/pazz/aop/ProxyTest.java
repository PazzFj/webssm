package com.pazz.aop;

/**
 * @author: Peng Jian
 * @date: 2018/8/8 17:45
 * @description:
 */
public class ProxyTest {

    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        MyInvocationHandler handler = new MyInvocationHandler(userService);
        UserService proxy = (UserService) handler.getProxy();
        proxy.add();
    }

}
