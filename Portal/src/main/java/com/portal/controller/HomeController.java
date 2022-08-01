package com.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String index() {
		
		return "index";
	}
	
	
	@GetMapping("/job")
	public String job() {
		
		return "job";
	}
	
	@GetMapping("/login")
	public String login() {
		
		return "login";
	}
	
	@GetMapping("/home")
	public String adminindex() {
		
		return "index";
	}
	
}
