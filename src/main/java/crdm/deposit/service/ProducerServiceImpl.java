package crdm.deposit.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import crdm.deposit.dao.ProducerDAO;
import crdm.deposit.entity.Producer;

@Service
public class ProducerServiceImpl implements ProducerService{

	@Autowired
	private ProducerDAO producerDAO;

	@Override
	@Transactional
	public List<Producer> getProducers() {
		
		return  producerDAO.getProducers();
	}

	@Override
	@Transactional
	public Producer saveProducer(Producer producer) {
		
		producerDAO.saveProducer(producer);
		
		return producer;
	}

	@Override
	@Transactional
	public Producer getProducer(Integer id) {
		return producerDAO.getProducer(id);
	}

	@Override
	@Transactional
	public void deleteProducer(Integer id) {
		producerDAO.deleteProducer(id);
	}
 
}
