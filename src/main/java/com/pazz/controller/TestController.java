package com.pazz.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.GET;

/**
 * @author: 彭坚
 * @create: 2018/12/9 21:50
 * @description:
 */
@RestController
@RequestMapping("test")
public class TestController {

    @GET
    @RequestMapping("/get")
    public void test() {
        System.out.println("test");
    }

}
