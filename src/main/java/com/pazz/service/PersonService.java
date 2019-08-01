package com.pazz.service;

import java.util.List;

import com.pazz.aspect.annotation.LogPrintAnnotation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.pazz.dao.IPersonDao;
import com.pazz.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * Created by Administrator on 2017-4-8.
 */
@Service("personService")
public class PersonService implements IService<Person> {

	private static final Logger log = LoggerFactory.getLogger(PersonService.class);

	@Autowired
	private IPersonDao personDao;

	@LogPrintAnnotation
	public  List<Person> select(String name, int age){
		List<Person> persons = personDao.getPersons(name, age);
		return persons;
	}

	@LogPrintAnnotation
	@Transactional(propagation=Propagation.REQUIRED)
	public void update(String name, int id){
		Assert.hasText(name, "name is not null!");
		personDao.updatePerson(name, id);
	}

	public void setPersonDao(IPersonDao personDao) {
		this.personDao = personDao;
	}
}
