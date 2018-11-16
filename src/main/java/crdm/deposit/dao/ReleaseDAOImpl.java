package crdm.deposit.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import crdm.deposit.entity.Release;

@Repository
public class ReleaseDAOImpl implements ReleaseDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Release> getReleases() {
		Session session = sessionFactory.getCurrentSession();
		
		return session.createQuery("from Release", Release.class).getResultList();
	}

	@Override
	public Release saveRelease(Release release) {
		Session session = sessionFactory.getCurrentSession();
		
		session.saveOrUpdate(release);
		
		return release;
	}

	@Override
	public Release getRelease(Integer id) {
		Session session = sessionFactory.getCurrentSession();
		
		return session.find(Release.class, id);
	}

	@Override
	public void deleteRelease(Integer id) {
		Session session = sessionFactory.getCurrentSession();
		Release release = session.find(Release.class, id);
		
		session.delete(release);
		
	}


}
