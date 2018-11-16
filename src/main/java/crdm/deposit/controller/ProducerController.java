package crdm.deposit.controller;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import crdm.deposit.entity.Producer;
import crdm.deposit.service.ProducerService;

@Controller
@RequestMapping("/producer")
public class ProducerController {
	
	
	@Autowired
	private ProducerService producerService;
	
	@GetMapping("/list")
	public String all(Model model) {
		
		List<Producer> producers = producerService.getProducers();
		model.addAttribute("producers", producers);
		
		return "producers/producers";
	}
	
	@PostMapping("/store")
	public String store(@ModelAttribute("producer")  Producer producer) throws ParseException {
		
        
        producerService.saveProducer(producer);
		
		return "redirect:/producer/list";
	}
	
	@GetMapping("/update")
	public String update(@RequestParam("Id") int id, Model model) {

		Producer producer = producerService.getProducer(id);
		producer.setUpdated_at(new Date());
		model.addAttribute("producer", producer);
		
		
		return "producers/update";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("Id") int id, Model model) {

		producerService.deleteProducer(id);
		
		return "redirect:/producer/list";
	}
	
	@GetMapping("/add")
	public String add(Model model) {
		
		Producer producer = new Producer();
		producer.setCreated_at(new Date());
		producer.setUpdated_at(new Date());
		model.addAttribute("producer", producer);
		
		return "producers/add";
	}
	
}
