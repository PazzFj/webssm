package com.pazz.controller;

import com.pazz.entity.Person;
import com.pazz.entity.Test;
import com.pazz.service.PersonService;
import com.pazz.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;
    @Autowired
    private TestService testService;

    @ResponseBody
    @GetMapping("/list")
    public List<Person> queryList(String name, Integer age) {
        List<Person> personList = personService.getPersons(name, age);
        return personList;
    }

    @GetMapping("/updatePerson")
    public String updatePerson(@RequestParam("name") String name) {
        personService.updatePerson(name);
        return "success";
    }

    @GetMapping("/getTests")
    public List<Test> getTests() {
        List<Test> testList = testService.getTests();
        return testList;
    }

}
