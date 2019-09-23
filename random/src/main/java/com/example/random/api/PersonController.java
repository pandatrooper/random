package com.example.random.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.random.model.Person;
import com.example.random.service.PersonService;

@RestController
public class PersonController {
	
	private final PersonService personService;
	
	@Autowired
	public PersonController(PersonService personService) {
		super();
		this.personService = personService;
	}
	
	@PostMapping
	public void addPerson (Person person)
	{
		personService.addPerson(person);
	}
}
