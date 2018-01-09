package com.pazz.dao;

import com.pazz.entity.Person;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IPersonDao {

    List<Person> getPersons();

    void updatePerson(@Param(value="name") String name);

}
