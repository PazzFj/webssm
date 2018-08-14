package com.pazz.controller;

import com.pazz.entity.Person;
import com.pazz.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GET
    @ResponseBody
    @RequestMapping("/getPersons")
    public List<Person> getPersons(String name, Integer age){
        List<Person> personList = personService.getPersons(name, age);
        return personList;
    }

    @POST
    @ResponseBody
    @RequestMapping("/updatePerson")
    public String updatePerson(@RequestParam("name") String name){
        personService.updatePerson(name);
        return "success";
    }

}
