package crdm.deposit.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import crdm.deposit.dao.ReleaseDAO;
import crdm.deposit.entity.Release;


@Service
public class ReleaseServiceImpl implements ReleaseService {

	@Autowired
	private ReleaseDAO releaseDAO;
	
	@Override
	@Transactional
	public List<Release> getReleases() {
		return releaseDAO.getReleases();
	}

	@Override
	public Release saveRelease(Release release) {
		
		return releaseDAO.saveRelease(release);
	}

	@Override
	public Release getRelease(Integer id) {
		// TODO Auto-generated method stub
		return releaseDAO.getRelease(id);
	}

	@Override
	public void deleteRelease(Integer id) {
		releaseDAO.deleteRelease(id);

	}

}
