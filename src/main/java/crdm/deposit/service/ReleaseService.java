package crdm.deposit.service;

import java.util.List;

import crdm.deposit.entity.Release;

public interface ReleaseService {
	public List<Release> getReleases();
	
	public Release saveRelease(Release release);
	
	public Release getRelease(Integer id);
	
	void deleteRelease(Integer id);
}
