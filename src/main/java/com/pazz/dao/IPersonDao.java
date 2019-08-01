package com.pazz.dao;

import com.pazz.entity.Person;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPersonDao {

    List<Person> getPersons(@Param("name") String name, @Param("age") int age);

    void updatePerson(@Param("name") String name, @Param("id") int id);

}
