package com.pazz.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author: 彭坚
 * @create: 2019/8/7 16:12
 * @description:
 */
@RestController
@RequestMapping("/login")
public class LoginController {

    @ResponseBody
    @GetMapping("doLogin")
    public String doLogin(@RequestParam("userName") String userName, @RequestParam("userPassword") String userPassword) {
        System.out.println("userPassword: " + userPassword);
        return "success";
    }

}
