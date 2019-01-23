package com.pazz.service;

import java.util.List;

import com.pazz.application.TestApplicationContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pazz.dao.IPersonDao;
import com.pazz.entity.Person;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2017-4-8.
 */
@Service
public class PersonService {

	Logger log = LoggerFactory.getLogger(PersonService.class);

	@Autowired
	private IPersonDao personDao;

	@Autowired
	TestApplicationContext context;

	public  List<Person> getPersons(String name, Integer age){
		System.out.println(context);
		if(null != name){
			name = "%"+name+"%";
		}
		List<Person> persons = personDao.getPersons(name, age);
		log.info("========>> persons: " + persons);
		return persons;
	}

	@Transactional
	public void updatePerson(String name){
		personDao.updatePerson(name);
	}


}
