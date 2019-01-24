package com.pazz.service;

import java.util.List;

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
public class PersonService implements IPersonService {

	private static final Logger log = LoggerFactory.getLogger(PersonService.class);

	@Autowired
	private IPersonDao personDao;

	public  List<Person> getPersons(String name, int page){
		List<Person> persons = personDao.getPersons(name, page);
		return persons;
	}

	@Transactional
	public void updatePerson(String name, int pid){
		personDao.updatePerson(name, pid);
	}


}
