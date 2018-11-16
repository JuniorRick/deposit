package crdm.deposit.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import crdm.deposit.entity.Person;
import crdm.deposit.entity.Producer;

@Repository
public class PersonDAOImpl implements PersonDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Person> getPeople() {
		Session session = sessionFactory.getCurrentSession();
		
		return session.createQuery("from Person order by name", Person.class)
				.getResultList();
	}

	@Override
	public Person savePerson(Person person) {
		Session session = sessionFactory.getCurrentSession();
		
		session.saveOrUpdate(person);
		
		return person;
	}

	@Override
	public Person getPerson(Integer id) {
		Session session = sessionFactory.getCurrentSession();
		
		return session.find(Person.class, id);
	}

	@Override
	public void deletePerson(Integer id) {
		Session session = sessionFactory.getCurrentSession();
		
		Person person = session.find(Person.class, id);
		
		if(person != null) {
			session.delete(person);
		}
	}

}
