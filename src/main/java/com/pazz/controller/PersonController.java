package com.pazz.controller;

import com.pazz.service.IPersonService;
import com.pazz.vo.PersonVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

//    @Resource(name = "personService")
//    private IPersonService personService;

    @Autowired
//    @Qualifier("personService")
    private IPersonService personService;

    @ResponseBody
    @GetMapping("/list")
    public List<PersonVo> queryList(PersonVo person) {
        return personService.selectByParam(person);
    }

    @GetMapping("/update")
    public String updatePerson(@RequestParam("name") String name, @RequestParam("pid") int pid) {
        personService.updateByParam(pid, name);
        return "success";
    }

}
