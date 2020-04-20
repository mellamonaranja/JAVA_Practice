package com.obj;

class IntNumber2{
	int num;
	public IntNumber2(int num) {
		this.num=num;
	}
	@Override
	public boolean equals(Object obj) {
//		every object can be stored in obj
//		obj type is stored as up-casting type
		if(this.num==((IntNumber2)obj).num) {
//			obj needs to be down-casting in order to compare with int number
			return true;
		}else {
			return false;
		}
	}
}

public class ObjectClassEx02 {

	public static void main(String[] args) {
		IntNumber2 intnumber1=new IntNumber2(10);
		IntNumber2 intnumber2=new IntNumber2(15);
		IntNumber2 intnumber3=new IntNumber2(10);

		if(intnumber1.equals(intnumber2)) {
//			.equals()is the function to compare with two numbers
			System.out.println("intnumber1==intnumber2");
		}else {
			System.out.println("intnumber1!=intnumber2");
		}
		
		if(intnumber1.equals(intnumber3)) {
//			.equals()is the function to compare with two numbers
			System.out.println("intnumber1==intnumber3");
		}else {
			System.out.println("intnumber1!=intnumber3");
		}
	}
}
