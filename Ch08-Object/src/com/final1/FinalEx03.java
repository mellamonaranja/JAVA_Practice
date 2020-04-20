package com.final1;


//final class Parent cannot inherit to child 
class Parent{
	int a=100;
}

public class FinalEx03 extends Parent{

	public static void main(String[] args) {
		FinalEx03 final03=new FinalEx03();
		System.out.println(final03.a);

	}

}
