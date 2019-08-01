package com.pazz.controller;

import com.pazz.entity.Person;
import com.pazz.service.IService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Resource(name = "personService")
    private IService service;

//    @Autowired
//    @Qualifier("personService")
//    private IService service;


    @ResponseBody
    @GetMapping("/list")
    public List<Person> queryList(Person person) {
        return service.select(person.getName(), person.getAge());
    }

    @GetMapping("/updatePerson")
    public String updatePerson(@RequestParam("name") String name, @RequestParam("pid") int pid) {
        service.update(name, pid);
        return "success";
    }

}
