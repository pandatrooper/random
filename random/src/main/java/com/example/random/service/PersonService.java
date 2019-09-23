package com.example.random.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.random.dao.PersonDao;
import com.example.random.model.Person;

@Service
public class PersonService {
	
	private final PersonDao personDao;
	
	@Autowired
	public PersonService(@Qualifier("fakeDao") PersonDao personDao) {
		this.personDao = personDao;
	}
	public int addPerson(Person person)
	{
		return personDao.insertPerson(person);
		
	}
}