package com.calculator;

// User main��       ����� ��� Ŭ����
// Calculator    �ܺο� ����� Ŭ����
// Adder         �ܺο� ������� �ʴ� Ŭ����, calculatorŬ������ ���ؼ��� ����
// Divider       �ܺο� ������� �ʴ� Ŭ����, calculatorŬ������ ���ؼ��� ����
// Multiflier    �ܺο� ������� �ʴ� Ŭ����, calculatorŬ������ ���ؼ��� ����
// Substractor   �ܺο� ������� �ʴ� Ŭ����, calculatorŬ������ ���ؼ��� ����




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
