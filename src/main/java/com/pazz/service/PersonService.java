package com.pazz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pazz.dao.IPersonDao;
import com.pazz.entity.Person;

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

}
