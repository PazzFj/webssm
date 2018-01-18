package com.pazz.entity;

import lombok.Data;
import org.aspectj.lang.annotation.Aspect;

@Data
@Aspect
public class Person {

    private int pid;
    private String pname;
    private int page;

}
