package crdm.deposit.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import crdm.deposit.entity.Producer;

@Repository
public class ProducerDAOImpl implements ProducerDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Producer> getProducers() {

		Session session = sessionFactory.getCurrentSession();
		
		return session.createQuery("from Producer order by name", Producer.class)
				.getResultList();
	}
	
	public Producer saveProducer(Producer producer) {
		Session session = sessionFactory.getCurrentSession();
		
		session.saveOrUpdate(producer);
		
		return producer;
	}

	@Override
	public Producer getProducer(Integer id) {
		Session session = sessionFactory.getCurrentSession();
		
		return session.find(Producer.class, id);
	}

	@Override
	public void deleteProducer(Integer id) {
		Session session = sessionFactory.getCurrentSession();
		Producer producer = session.find(Producer.class, id);
		
		session.delete(producer);
	}
	
	

}
