package com.wrapperEx;

public class WrapperEx01 {

	public static void main(String[] args) {
		boolean b=true;
		
		Boolean wrap_boolean=new Boolean(b);
//		basic material Boolean has been changed to an object
		
		System.out.println(b);
		System.out.println(wrap_boolean);
		System.out.println(wrap_boolean.booleanValue());
//		wrap_boolean has been auto un-boxing
		
		Integer wrap_integer=new Integer(100);
		int i=wrap_integer.intValue();
		System.out.println(i);
		
	}

}
