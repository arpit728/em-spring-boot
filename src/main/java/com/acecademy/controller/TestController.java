package com.acecademy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TestController {
	
	@GetMapping("/home")
	public String home() {
		
		System.out.println("Hello!");
		return "Hello! Spring Boot";
	}

}
