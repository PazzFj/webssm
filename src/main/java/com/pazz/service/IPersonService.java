package com.pazz.service;

import com.pazz.entity.Person;

import java.util.List;

/**
 * @author: 彭坚
 * @create: 2019/1/24 23:59
 * @description:
 */
public interface IPersonService {

    List<Person> getPersons(String name, int page);

    void updatePerson(String name, int pid);

//    void testAspect();

}
