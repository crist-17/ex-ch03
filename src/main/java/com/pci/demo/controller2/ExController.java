package com.pci.demo.controller2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pci.demo.service2.ExService;

import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ExController {

	ExService exService;

	public ExController(ExService exService) {
		this.exService = exService;

	}

//	@GetMapping("/")
//	public String getMethodName() {
//		return "루트경로";
//	}
//	
	@GetMapping("/")
	public String getMethodName() {
		return exService.sayHello("안녕");
	}

	@GetMapping("/ex321")
	public String get321() {
		return exService.sayHello("메롱");
	}
	
	@GetMapping("/ex70")
	public String ex70() {
		return exService.ex70();
	}
	
	@GetMapping("ex70_int")
	public Integer ex70_int() {
		return exService.ex70_int();
	}
	
	@GetMapping("/ex322")
	public String ex322() {
		return exService.ex322();
	}
	
	@GetMapping("/ex324")
	public String ex324() {
		return exService.ex324();
	}
	

	@GetMapping("/ex325")
	public String ex325() {
		return exService.ex325();
	}
	
	@GetMapping("/ex326")
	public String ex326() {
		return exService.ex326();
	}
	
	@GetMapping("/ex327")
	public String ex327() {
		return exService.ex327();
	}
	
	@GetMapping("/ex331")
	public String ex331() {
		return exService.ex331();
	}
	
	@GetMapping("/ex332")
	public String ex332() {
		return exService.ex332();
	}
	
	@GetMapping("/ex333")
	public String ex333() {
		return exService.ex333();
	}
	
	@GetMapping("/ex335")
	public String ex335() {
		return exService.ex335();
	}
	
	@GetMapping("/ex337")
	public String ex337() {
		return exService.ex337();
	}
	
	@GetMapping("/ex338")
	public String ex338() {
		return exService.ex338();
	}
	
	@GetMapping("/ex339")
	public String ex339() {
		return exService.ex339();
	}
	
	@GetMapping("/ex3310")
	public String ex3310() {
		return exService.ex3310();
	}
	
	@GetMapping("/ex3311")
	public String ex3311() {
		return exService.ex3311();
	}
	
	@GetMapping("/ex3312")
	public String ex3312() {
		return exService.ex3312();
	}
	
	@GetMapping("/ex3313")
	public String ex3313() {
		return exService.ex3313();
	}
	
	@GetMapping("/ex3314")
	public String ex3314() {
		return exService.ex3314();
	}

}
