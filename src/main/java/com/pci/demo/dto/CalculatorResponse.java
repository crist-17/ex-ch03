package com.pci.demo.dto;

public record CalculatorResponse(
		double num1, 
		double num2,
		String operation,
		double result
		) {

}
