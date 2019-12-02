package com.pazz.service;

import java.util.List;
import java.util.stream.Collectors;

import com.pazz.framework.AbstractBaseService;
import com.pazz.vo.PersonVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.pazz.dao.IPersonDao;
import com.pazz.entity.Person;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

/**
 * Created by Administrator on 2017-4-8.
 */
@Service("personService")
public class PersonService extends AbstractBaseService<IPersonDao, Person> implements IPersonService {

	private static final Logger log = LoggerFactory.getLogger(PersonService.class);

	@Override
	public List<PersonVo> selectByParam(PersonVo param) {
		Assert.notNull(param, "select param is not null!");
		List<Person> persons = dao.selectPersons(param.getName(), param.getAge());
		return persons.stream().map(p -> cast(p)).collect(Collectors.toList());
	}

	@Override
	public void updateByParam(int pid, String name) {
		Assert.hasText(name, "update param is not null!");
		dao.updatePerson(pid, name);
	}

	public PersonVo cast(Person person){
		PersonVo personVo = new PersonVo();
		BeanUtils.copyProperties(person, personVo);
		return personVo;
	}

}
