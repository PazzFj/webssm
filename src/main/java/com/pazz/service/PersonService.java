package com.pazz.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.pazz.aspect.annotation.LogPrintAnnotation;
import com.pazz.framework.AbstractService;
import com.pazz.framework.IService;
import com.pazz.vo.PersonVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.pazz.dao.IPersonDao;
import com.pazz.entity.Person;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * Created by Administrator on 2017-4-8.
 */
@Service("personService")
public class PersonService extends AbstractService<IPersonDao, Person> implements IPersonService<Person> {

	private static final Logger log = LoggerFactory.getLogger(PersonService.class);

	@Autowired
	private IPersonDao personDao;

	@Override
	public List<PersonVo> selectByParam(PersonVo param) {
		Assert.notNull(param, "select param is not null!");
		List<Person> persons = personDao.selectPersons(param.getName(), param.getAge());
		return persons.stream().map(p -> cast(p)).collect(Collectors.toList());
	}

	@Override
	public void updateByParam(int pid, String name) {
		Assert.hasText(name, "update param is not null!");
		personDao.updatePerson(pid, name);
	}

	public PersonVo cast(Person person){
		PersonVo personVo = new PersonVo();
		BeanUtils.copyProperties(person, personVo);
		return personVo;
	}

}
