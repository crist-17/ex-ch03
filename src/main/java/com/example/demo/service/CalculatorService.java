package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
	
	public String calculate(double num1, double num2, String operation) {
		
		return switch(operation.toUpperCase()) {
		case "ADD" -> add(num1, num2);
		case "SUBTRACT" -> subtract(num1, num2);
		case "MULTIPLY" -> multiply(num1, num2);
		case "DEVIDE" -> devide(num1, num2);
		default -> throw new IllegalArgumentException("틀린연산자");
		};
		
	
	}

	public String add(double num1, double num2) {
		String result = String.valueOf(num1+num2);
		return result;
	}

	public String subtract(double num1, double num2) {
		String result = String.valueOf(num1-num2);
		return result;
	}

	public String multiply(double num1, double num2) {
		String result = String.valueOf(num1*num2);
		return result;
	}

	public String devide(double num1, double num2) {
		if(num2 == 0) {
			throw new ArithmeticException("0으로 나눌수없음.");
		}
		String result = String.valueOf(num1/num2);
		return result;
	}



	

}
