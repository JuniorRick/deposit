package crdm.deposit.dao;

import java.util.List;

import crdm.deposit.entity.Release;

public interface ReleaseDAO {
	
	public List<Release> getReleases();
	
	public Release saveRelease(Release release);
	
	public Release getRelease(Integer id);
	
	void deleteRelease(Integer id);
}

