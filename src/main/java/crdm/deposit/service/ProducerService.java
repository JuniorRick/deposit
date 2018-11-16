package crdm.deposit.service;

import java.util.List;

import crdm.deposit.entity.Producer;

public interface ProducerService {
	
	List<Producer> getProducers();

	Producer saveProducer(Producer producer);
	
	Producer getProducer(Integer id);
	
	void deleteProducer(Integer id);
}
