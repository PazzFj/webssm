package com.pazz.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pazz.dao.IPersonDao;
import com.pazz.entity.Person;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

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
		Assert.hasText(name, "name is not null!");
		personDao.updatePerson(name, pid);
	}

//	@TransactionalAnnotation
//	public void testAspect(){
//		System.out.println("----------------");
//	}


}
