package edu.mum.cs.cs425.masterpageapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping(value= {"/eregister", "/eregister/home"})
	public String displayHomePage() {
		return "home/index";
	}
	
	@GetMapping(value="eregister/home/about")
	public String displayAbout() {
		return "home/about";
	}
	
	@GetMapping(value="eregister/home/contact")
	public String displayContact() {
		return "home/contact";
	}
}
