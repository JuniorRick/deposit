package crdm.deposit.service;

import java.util.List;

import crdm.deposit.entity.Reagent;

public interface ReagentService {
	
	public List<Reagent> getReagents();  
	
	public Reagent saveReagent(Reagent reagent);
	
	public Reagent getReagent(Integer id);
	
	void deleteReagent(Integer id);
}
