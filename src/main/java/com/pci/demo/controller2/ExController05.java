package com.pci.demo.controller2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pci.demo.service2.ExService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class ExController05 {

	ExService exService;

	public ExController05(ExService exService) {
		this.exService = exService;

	}

	@RequestMapping("/521")
	public String hello() {
		return "Hello Spring Boot!";
	}
	
	@RequestMapping("/522")
	public String bye() {
		return "Goodbye!";
	}
	
	 @RequestMapping("/524")
	    public String helloEx() {
	        return "Hello <strong>Backend</strong>";
	    }
	
}
