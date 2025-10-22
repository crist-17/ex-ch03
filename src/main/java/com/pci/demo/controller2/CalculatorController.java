package com.pci.demo.controller2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pci.demo.dto2.CalculationRequest;
import com.pci.demo.dto2.CalculationResponse;
import com.pci.demo.service2.CalculatorService;



@RestController
@RequestMapping("calculator")
public class CalculatorController {
	
	CalculatorService calculatorService;
	
	public CalculatorController(CalculatorService calculatorService) {
		this.calculatorService = calculatorService;
	}
	
	@PostMapping("/calculate")
	public CalculationResponse calculat(@RequestBody CalculationRequest request) {
		String result = calculatorService.calculate(request.getNum1(),request.getNum2(), request.getOperation());
		
		return new CalculationResponse(request.getNum1(),request.getNum2(),request.getOperation(), result);
	}
	

//	@GetMapping("/add")
//	public String add(@RequestParam double num1, @RequestParam double num2) {
//		return calculatorService.add(num1,num2);
//		
//	}
	
	//http://localhost:8090/calculator/add?num1=10&num2=5
	@GetMapping("/add")
	public CalculationResponse add(@RequestParam double num1, @RequestParam double num2) {
		String result = calculatorService.add(num1,num2);
		return new CalculationResponse(num1,num2,"ADD",result);
	}
	
	
//	@GetMapping("/subtract")
//	public String subtract(@RequestParam double num1, @RequestParam double num2) {
//		return calculatorService.subtract(num1,num2);
//	}
	
	//http://localhost:8090/calculator/subtract?num1=10&num2=5
	@GetMapping("/subtract")
	public CalculationResponse subtract(@RequestParam double num1, @RequestParam double num2) {
		String result = calculatorService.subtract(num1, num2);
		return new CalculationResponse(num1,num2,"SUBTRACT",result);
	}
	
	

//	@GetMapping("/multiply")
//	public String multiply(@RequestParam double num1, @RequestParam double num2) {
//		return calculatorService.multiply(num1,num2);
//	}
	
	//http://localhost:8090/calculator/multiply?num1=10&num2=5
	@GetMapping("/multiply")
	public CalculationResponse multiply(@RequestParam double num1, @RequestParam double num2) {
		String result = calculatorService.multiply(num1, num2);
		return new CalculationResponse(num1,num2,"MULTIPLY",result);
	}
	
//	@GetMapping("/devide")
//	public String devide(@RequestParam double num1, @RequestParam double num2) {
//		return calculatorService.devide(num1,num2);
//	}
	
	
	//http://localhost:8090/calculator/devide?num1=10&num2=5
	@GetMapping("/devide")
	public CalculationResponse devide(@RequestParam double num1, @RequestParam double num2) {
		String result = calculatorService.devide(num1, num2);
		return new CalculationResponse(num1,num2,"DEVIDE",result);
	}
	
}
