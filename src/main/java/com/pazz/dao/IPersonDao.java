package com.pazz.dao;

import com.pazz.entity.Person;
import com.pazz.framework.BaseDao;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPersonDao extends BaseDao<Person> {

    List<Person> selectPersons(@Param("name") String name, @Param("age") int age);

    void updatePerson(@Param("id") int id, @Param("name") String name);

}
