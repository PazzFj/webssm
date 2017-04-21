package com.pazz.controller;

import com.pazz.dao.IPersonDao;
import com.pazz.entity.Person;
import com.pazz.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017-4-8.
 */
@Controller
public class PersonController {

    @Autowired
    private IPersonDao personDao;

    @ResponseBody
    @RequestMapping("/getPersons")
    public List<Person> getPersons(){
        System.out.println("_______");
        List<Person> personList = new ArrayList<Person>();
        personList = personDao.getPersons();
        personList.add(new Person(1, "zhangs", 21));
        personList.add(new Person(2, "zhangc", 22));
        personList.add(new Person(3, "zhangf", 23));
        return personList;
    }


}
