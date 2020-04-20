package com.obj;

class IntNumber{
	int num;
	
	public IntNumber(int num) {
		this.num=num;
	}
	
	public boolean isEquals(IntNumber numObj) {
//		with using method to compare with two numbers
		if(this.num==numObj.num) {
			return true;
		}else {
			return false;
		}
	}
}

public class ObjectClassEx01 {

	public static void main(String[] args) {
		IntNumber intnumber1=new IntNumber(10);
		IntNumber intnumber2=new IntNumber(15);
		IntNumber intnumber3=new IntNumber(10);
		
		if(intnumber1==intnumber2) {
			System.out.println("intnumber1==intnumber2");
		}else if(intnumber1==intnumber3) {
			System.out.println("intnumber1==intnumber3");
		}else {
			System.out.println("no match");
		}
		System.out.println(intnumber1);
		System.out.println(intnumber2);
		System.out.println(intnumber3);
		
		if(intnumber1.isEquals(intnumber2)) {
			System.out.println("intnumber1==intnumber2");
		}else {
			System.out.println("intnumber1!=intnumber2");
		}
		
		if(intnumber1.isEquals(intnumber3)) {
			System.out.println("intnumber1==intnumber3");
		}else {
			
		}System.out.println("intnumber1!=intnumber3");
		
		System.out.println(intnumber1.num);
		System.out.println(intnumber2.num);
		System.out.println(intnumber3.num);
		}
	
}
