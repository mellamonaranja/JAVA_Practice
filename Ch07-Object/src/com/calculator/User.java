package com.calculator;

// User main부       사용자 사용 클래스
// Calculator    외부에 노출된 클래스
// Adder         외부에 노출되지 않는 클래스, calculator클래스를 통해서만 접근
// Divider       외부에 노출되지 않는 클래스, calculator클래스를 통해서만 접근
// Multiflier    외부에 노출되지 않는 클래스, calculator클래스를 통해서만 접근
// Substractor   외부에 노출되지 않는 클래스, calculator클래스를 통해서만 접근




public class User {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		
		
		System.out.println(calculator.add(10, 7));
		System.out.println(calculator.divide(10, 7));
		System.out.println(calculator.times(10, 7));
		System.out.println(calculator.substract(10, 7));
		
		Adder add=new Adder();
		System.out.println(add.add(20, 8));
		
		Divider divide=new Divider();
		System.out.println(divide.divide(20, 8));
		
	}

}
