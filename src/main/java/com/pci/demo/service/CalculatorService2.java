package com.pci.demo.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService2 {

	//서로다른 패키지로 리턴되기때문에 public // add(10,5)
	public double add(double num1, double num2) {
		double result = num1 + num2;
		return result;
//		return (num1+num2);
		}
	
	//서로다른 패키지로 리턴되기때문에 public // subtract(10,5)
	public double subtract(double num1, double num2) {
		double result = num1 - num2;
		return result;

		}
	
	public double multiply(double num1, double num2) {
		double result = num1 * num2;
		return result;
		}
	
	public double devide(double num1, double num2) {
	//예외처리 (0으로못나눔)
		if (num2 == 0)
			throw new ArithmeticException("0으로 나눌 수 없음");
		return (num1 / num2);
		}

	public double calculate(double num1, double num2, String operation) {
//		사칙연산을 구분해서 수행 + - * /
//		switch (소문자로 변경operation)
		return switch (operation) {
		case "+" -> add(num1, num2);
		case "-" -> subtract(num1, num2);
		case "*" -> multiply(num1, num2);
		case "/" -> devide(num1, num2);
		default -> throw new IllegalArgumentException("적합한 연산자가 없음: " + operation);
		};

	}

}
