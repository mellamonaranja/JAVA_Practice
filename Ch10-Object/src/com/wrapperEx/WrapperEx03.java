package com.wrapperEx;

class IntWrapper{
	private int num;
	
	public IntWrapper(int data) {
		num=data;
	}
	
	@Override
	public String toString() {
//		in order to print reference address to string type, need to override toString()
		return ""+num;
				
	}
}

public class WrapperEx03 {
	
	public static void showData(Object obj) {
//		dont need to create an object, can use showData directly because this is static method
		System.out.println(obj);
	}

	public static void main(String[] args) {
		IntWrapper intwrapper=new IntWrapper(3);
		Integer basicInstance = new Integer(10);
		
		showData(intwrapper);
//		every Object allows everything
		showData(basicInstance);
		showData(new IntWrapper(7));
		showData(2019);
//		has been auto-boxing and input to Object obj
		
		Integer num1=new Integer("300");
		Integer num2=new Integer("200");
		System.out.println(num1);
		System.out.println(num1+num2);
		System.out.println("num1 "+num1+" num2 "+num2);
		
		
		System.out.println(intwrapper);
		

	}

}
