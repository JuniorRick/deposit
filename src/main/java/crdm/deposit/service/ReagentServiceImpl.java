package crdm.deposit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import crdm.deposit.dao.ReagentDAO;
import crdm.deposit.entity.Reagent;

@Service
public class ReagentServiceImpl implements ReagentService {
	
	
	@Autowired
	private ReagentDAO reagentDAO;
	
	@Override
	@Transactional
	public List<Reagent> getReagents() {
		
		return reagentDAO.getReagents();
	}

	@Override
	@Transactional
	public Reagent saveReagent(Reagent reagent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public Reagent getReagent(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public void deleteReagent(Integer id) {
	
		reagentDAO.deleteReagent(id);

	}

}
