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

import crdm.deposit.entity.Person;
import crdm.deposit.service.PersonService;

@Controller
@RequestMapping("/person")
public class PersonController {

	@Autowired
	private PersonService personService;
	
	@GetMapping("/list")
	public String all(Model model) {
		
		List<Person> people = personService.getPeople();
		model.addAttribute("people", people);
		
		return "people/people";
	}
	
	@PostMapping("/store")
	public String store(@ModelAttribute("Person")  Person person) throws ParseException {
		
        
        personService.savePerson(person);
        System.out.println("storing" + person.getName());
		
		return "redirect:/person/list";
	}
	
	@GetMapping("/update")
	public String update(@RequestParam("Id") int id, Model model) {

		Person person = personService.getPerson(id);
//		Person.setUpdated_at(new Date());
		model.addAttribute("person", person);
		
		
		return "people/update";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("Id") int id, Model model) {

		personService.deletePerson(id);
		
		return "redirect:/person/list";
	}
	
	
	@GetMapping("/add")
	public String add(Model model) {
		
		Person person = new Person();
//		Person.setCreated_at(new Date());
//		Person.setUpdated_at(new Date());
		model.addAttribute("person", person);
		
		return "people/add";
	}
}
