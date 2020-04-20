package com.calculator;

public class Calculator {
	
	private Adder adder;
	private Divider divider;
	private Multiflier multiflier;
	private Substractor substractor;
	
	public Calculator() {
		adder = new Adder();
		divider = new Divider();
		multiflier = new Multiflier();
		substractor = new Substractor();
	}
	
	public int add(int num1, int num2) {
		return adder.add(num1, num2);
	}
	
	public int times(int num1, int num2) {
		return multiflier.times(num1, num2);
	}
	
	public int divide(int num1, int num2) {
		return divider.divide(num1, num2);
	}
	
	public int substract(int num1, int num2) {
		return substractor.substract(num1, num2);
	}

}
