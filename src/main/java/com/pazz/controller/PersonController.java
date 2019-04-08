package com.pazz.controller;

import com.pazz.helper.WrapObject;
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

    @Autowired
    private WrapObject wrapObject;

    @ResponseBody
    @GetMapping("/list")
    public List<Person> queryList(Person person) {
        service.select(person.getPname(), person.getPage());
        return (List<Person>) wrapObject.getMap().get("data");
    }

    @GetMapping("/updatePerson")
    public String updatePerson(@RequestParam("name") String name, @RequestParam("pid") int pid) {
        service.update(name, pid);
        return "success";
    }

}
