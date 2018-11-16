package crdm.deposit.dao;

import java.util.List;

import crdm.deposit.entity.Reagent;

public interface ReagentDAO {
	
	public List<Reagent> getReagents();  
	
	public Reagent saveReagent(Reagent reagent);
	
	public Reagent getReagent(Integer id);
	
	void deleteReagent(Integer id);
}
