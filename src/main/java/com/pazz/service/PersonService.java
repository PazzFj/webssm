package com.pazz.service;

import java.util.List;

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
	
	@Autowired
	private IPersonDao personDao;

	public  List<Person> getPersons(){
		 List<Person> persons = personDao.getPersons();
		return persons;
	}

	@Transactional
	public void updatePerson(String name){
		personDao.updatePerson(name);
	}


	public void myMethod(){

	}

	public void getUser(){

	}

}
