package com.pazz.controller;

import com.pazz.entity.Person;
import com.pazz.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
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
