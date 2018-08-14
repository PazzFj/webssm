package com.pazz.dao;

import com.pazz.entity.Person;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IPersonDao {

    List<Person> getPersons(@Param("name") String name, Integer age);

    void updatePerson(@Param(value="name") String name);

}
