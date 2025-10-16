package com.pci.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pci.demo.service.CalculatorService2;
import com.pci.demo.dto.CalculationRequest;
import com.pci.demo.dto.CalculatorResponse;



@RestController
@RequestMapping("calculator2")
public class CalculatorController2 {

// java 방식	
//	CalculatorService calculatorService = new CalculatorService();
	
//	spring방식 1: 기본 연결방식
//	@Autowired
//	CalculatorService calculatorService

//	spring방식 2: 생성자를 통한 객체주입 방식	
	CalculatorService2 calculatorService; 
	
	public CalculatorController2(CalculatorService2 calculatorService) {
		this.calculatorService = calculatorService;
		
	}
	
//	@GetMapping("/add")
//	public String add() {
//			double
//		return (10+5)    --------더블타입의 연산결과를 리턴-----
//		return new String("/덧셈"); ------문자열을 리턴-----
//	}
	
	//-----오브젝트.메소드: 서비스로직으로 연산결과를 리턴-----
//	@GetMapping("/add")
//	public double add() {

//		return calculatorService.add(10,5);
//	}
	
	//---사용자에게 입력값을 받아서, 서비스 로직으로 연산결과를 리턴 ---
	
//	@GetMapping("/add")
//	public double add(@RequestParam int num1, @RequestParam int num2) {
//		return calculatorService.add(num1,num2);
//	}
	
	
	// --- 1.결과값: 서비스 로직으로 연산결과를 얻음
	// --- 2.서비스 로직으로 연산결과를 리턴후, 결과포맷을 dto(recode타입)를 사용하겠다
	// --- 3.return타입을 dto(recode타입)으로 수정해주자 
	// --- 4.브라우져설정 http://localhost:8080/calculator/add?num1=20&num2=5
	@GetMapping("/add")
	public CalculatorResponse add(@RequestParam int num1, @RequestParam int num2) {
//		return calculatorService.add(num1,num2);
		double result = calculatorService.add(num1, num2);
		return new CalculatorResponse(num1, num2, "ADD", result);
	}
	
	@PostMapping("/calculate")
	public CalculatorResponse postMethodName(@RequestBody CalculationRequest request) {
	// + - * /
		double result = calculatorService.calculate(request.getNum1(), request.getNum2(), request.getOperation());
		return new CalculatorResponse(request.getNum1(), request.getNum2(),request.getOperation(), result);
				
		
	}
	
	
	
	
//	@GetMapping("/subtract")
//	public double subtract() {
//		return calculatorService.subtract(10,5);
//	}
	
//	@GetMapping("/subtract")
//	public double subtract(@RequestParam int num1, @RequestParam int num2) {
//		return calculatorService.subtract(10,5);
//	}
	
	@GetMapping("/subtract")
	public CalculatorResponse subtract(@RequestParam int num1, @RequestParam int num2) {
		double result = calculatorService.subtract(num1, num2);
		return new CalculatorResponse(num1, num2, "SUBTRACT", result);
	}
	
	
//	@GetMapping("/multiply")
//	public double multiply() {
//		return calculatorService.multiply(10,5);
//	}
	
	@GetMapping("/multiply")
	public CalculatorResponse multiply(@RequestParam int num1, @RequestParam int num2) {
		double result = calculatorService.multiply(num1, num2);
		return new CalculatorResponse(num1, num2, "MULTIPLY", result);
	}
	
	
//	@GetMapping("/devide")
//	public double devide() {
//		return calculatorService.devide(10,5);
//	}
//	
	@GetMapping("/devide")
	public CalculatorResponse devide(@RequestParam int num1, @RequestParam int num2) {
		double result = calculatorService.devide(num1, num2);
		return new CalculatorResponse(num1, num2, "DEVIDE", result);
	}
	
}
