package com.pazz.controller;

import com.pazz.entity.Person;
import com.pazz.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private IService service;

    @ResponseBody
    @GetMapping("/list")
    public List<Person> queryList(Person person) {
        List<Person> personList = service.select(person.getPname(), person.getPage());
        return personList;
    }

    @GetMapping("/updatePerson")
    public String updatePerson(@RequestParam("name") String name, @RequestParam("pid") int pid) {
        service.update(name, pid);
        return "success";
    }

}
