package crdm.deposit.dao;

import java.util.List;

import crdm.deposit.entity.Person;

public interface PersonDAO {
	
	public List<Person> getPeople();
	
	public Person savePerson(Person person);
	
	public Person getPerson(Integer id);
	
	void deletePerson(Integer id);
}

