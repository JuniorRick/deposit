package crdm.deposit.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import crdm.deposit.entity.Reagent;


@Repository
public class ReagentDAOInpl implements ReagentDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Reagent> getReagents() {
		
		Session session = sessionFactory.getCurrentSession();
		
		return session.createQuery("from Reagent order by name", Reagent.class)
				.getResultList();
	}

	@Override
	public Reagent saveReagent(Reagent reagent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reagent getReagent(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteReagent(Integer id) {
		Session session = sessionFactory.getCurrentSession();
		
		Reagent reagent = session.find(Reagent.class, id);
		
		if(reagent != null) {
			session.delete(reagent);
		}

	}

}
