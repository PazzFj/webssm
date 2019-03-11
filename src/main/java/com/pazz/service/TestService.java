package com.pazz.service;

import com.pazz.annotation.LogPrintAnnotation;
import com.pazz.entity.Person;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @author: 彭坚
 * @create: 2019/3/11 13:45
 * @description:
 */
@Service("testService")
@Primary
public class TestService implements IService<Person> {

    @Override
    public List<Person> select(String name, int page) {
        return Arrays.asList(new Person(1, "pj", 11), new Person(2, "xf", 22));
    }

    @Override
    @LogPrintAnnotation
    public void update(String name, int pid) {
        System.out.println("test updating...");
    }

}
