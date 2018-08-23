package com.pazz.controller;

import com.pazz.response.Response;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @author: 彭坚
 * @create: 2018/8/23 17:11
 * @description:
 */
@RestController
@RequestMapping("/exception")
public class ExceptionController {

//    @ExceptionHandler(Exception.class)
//    public String handleUserNotLoginException() {
//        //用户未登录重定向到根目录
//        return "redirect:/";
//    }

    @ResponseBody
    @RequestMapping(value = "/{type}", method = RequestMethod.GET)
    public String getPages(@PathVariable(value = "type") String type) throws Exception {
        if ("error".equals(type)) {
            // 由handleCustomException处理
            throw new RuntimeException("This is custom message");
        } else if ("io-error".equals(type)) {
            // 由handleAllException处理
            throw new IOException();
        } else {
            return "yes";
        }
    }

    @ResponseBody
    @ExceptionHandler(RuntimeException.class)//可以直接写@ExceptionHandler,不指明异常类，会自动映射
    public Response customGenericExceptionHandler(RuntimeException exception) { //还可以声明接收其他任意参数
        Response response = new Response();
        response.setResult(exception);
        return response;
    }

    @ResponseBody
    @ExceptionHandler(IOException.class)//可以直接写@ExceptionHandler,不指明异常类，会自动映射
    public Response allExceptionHandler(IOException exception) { //还可以声明接收其他任意参数
        Response response = new Response();
        response.setResult(exception);
        return response;
    }

}
