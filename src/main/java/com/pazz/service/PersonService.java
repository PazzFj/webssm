package com.pazz.service;

import java.util.List;

import com.pazz.annotation.LogPrintAnnotation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.pazz.dao.IPersonDao;
import com.pazz.entity.Person;
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

	private IPersonDao personDao;

	public  List<Person> select(String name, int page){
		List<Person> persons = personDao.getPersons(name, page);
		return persons;
	}

	@LogPrintAnnotation
	@Transactional(propagation=Propagation.REQUIRED)
	public void update(String name, int pid){
		Assert.hasText(name, "name is not null!");
		personDao.updatePerson(name, pid);
	}

	public void setPersonDao(IPersonDao personDao) {
		this.personDao = personDao;
	}
}
