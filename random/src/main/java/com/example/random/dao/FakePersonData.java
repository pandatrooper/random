package com.example.random.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.example.random.model.Person;

@Repository("fakeDao")
public class FakePersonData implements PersonDao {
	
	private static List<Person> DB = new ArrayList<>();

	@Override
	public int insertPerson(UUID id, Person person) {
		// TODO Auto-generated method stub
		DB.add(new Person(id,person.getName()));
		return 1;
	}

		
}
