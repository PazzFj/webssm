package com.pazz.service;

import com.pazz.entity.Person;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    public List<Person> select(String name, int age) {
        return Arrays.asList(new Person(1, "peng jian", 11), new Person(2, "jia you", 22));
    }

    @Override
    @Transactional
    public void update(String name, int id) {
        System.out.println("test updating...");
    }

}
