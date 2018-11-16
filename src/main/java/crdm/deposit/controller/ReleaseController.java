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

import crdm.deposit.entity.Release;
import crdm.deposit.service.ReleaseService;

@Controller
@RequestMapping("/release")
public class ReleaseController {
	
	
	@Autowired
	private ReleaseService releaseService;
	
	@GetMapping("/list")
	public String all(Model model) {
		
		List<Release> releases = releaseService.getReleases();
		
		model.addAttribute("releases", releases);
		
		return "releases/releases";
	}
	
	@GetMapping("/new")
	public String addN(Model model) {
		
		return "releases/new";
	}
	
	
	@PostMapping("/store")
	public String store(@ModelAttribute("release")  Release release) throws ParseException {
		
        
//		releaseService.saveRelease(producer);
		
		return "redirect:/release/list";
	}
	
	
	@GetMapping("/delete")
	public String delete(@RequestParam("Id") int id, Model model) {

		releaseService.deleteRelease(id);
		
		return "redirect:/release/list";
	}
	
	
}
