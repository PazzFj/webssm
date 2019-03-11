package com.pazz.service;

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
@Service("personTestService")
@Primary
public class PersonTestService implements IPersonService {
    @Override
    public List<Person> getPersons(String name, int page) {
        return Arrays.asList(new Person("pj"), new Person("xf"));
    }

    @Override
    public void updatePerson(String name, int pid) {
        System.out.println("update");
    }
}
