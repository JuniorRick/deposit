package crdm.deposit.controller;

import java.text.ParseException;
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
import crdm.deposit.entity.Reagent;
import crdm.deposit.service.ProducerService;
import crdm.deposit.service.ReagentService;

@Controller
@RequestMapping("/reagent")
public class ReagentController {
	
	@Autowired
	ReagentService reagentService;
	
	@Autowired 
	ProducerService producerService;
	
	@GetMapping("/list")
	public String alll(Model model) {
		
		List<Reagent> reagents = reagentService.getReagents();
		model.addAttribute("reagents", reagents);
		
		return "reagents/reagents";
	}
	
	@PostMapping("/store")
	public String store(@ModelAttribute("reagent")  Reagent reagent) throws ParseException {
		
        
        reagentService.saveReagent(reagent);
		
		return "redirect:/reagent/list";
	}
	
	@GetMapping("/update")
	public String update(@RequestParam("Id") int id, Model model) {

		Reagent reagent= reagentService.getReagent(id);
//		producer.setUpdated_at(new Date());
		model.addAttribute("reagent", reagent);
		
		
		return "reagents/update";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("Id") int id, Model model) {

		reagentService.deleteReagent(id);
		
		return "redirect:/reagent/list";
	}
	
	
	@GetMapping("/add")
	public String add(Model model) {
		
		Reagent reagent = new Reagent();
		List<Producer> producers = producerService.getProducers();
		
		model.addAttribute("producers", producers);
		model.addAttribute("reagent", reagent);
		
		return "reagents/add";
	}
	
}
