package com.example.demo.controll;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.servi.ExService;
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
	
}
