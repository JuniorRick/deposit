package crdm.deposit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import crdm.deposit.dao.PersonDAO;
import crdm.deposit.entity.Person;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonDAO personDAO;
	
	@Override
	@Transactional
	public List<Person> getPeople() {
		return personDAO.getPeople();
	}

	@Override
	@Transactional
	public Person savePerson(Person person) {
		return personDAO.savePerson(person);
	}

	@Override
	@Transactional
	public Person getPerson(Integer id) {
		return personDAO.getPerson(id);
	}

	@Override
	@Transactional
	public void deletePerson(Integer id) {
		personDAO.deletePerson(id);

	}

}
