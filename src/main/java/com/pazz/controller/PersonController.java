package com.pazz.controller;

import com.pazz.dao.IPersonDao;
import com.pazz.entity.Person;
import com.pazz.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2017-4-8.
 */
@RestController
@RequestMapping("/perosn")
public class PersonController {

    @Autowired
    private PersonService personService;

    @ResponseBody
    @RequestMapping("/getPersons")
    public List<Person> getPersons(){
        List<Person> personList = personService.getPersons();
        return personList;
    }

}
