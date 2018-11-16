package crdm.deposit.dao;

import java.util.List;

import crdm.deposit.entity.Producer;

public interface ProducerDAO {
	
	public List<Producer> getProducers();  
	
	public Producer saveProducer(Producer producer);
	
	public Producer getProducer(Integer id);
	
	void deleteProducer(Integer id);
}

