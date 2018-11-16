package crdm.deposit.service;

import java.util.List;

import crdm.deposit.entity.Person;

public interface PersonService {
	
	List<Person> getPeople();

	Person savePerson(Person Person);
	
	Person getPerson(Integer id);
	
	void deletePerson(Integer id);
}
