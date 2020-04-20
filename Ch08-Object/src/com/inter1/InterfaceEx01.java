package com.inter1;

interface InterfaceTest{
	public static final int A=100;
//	element 1 : constant

	public abstract int getA();
//	element 2 : abstract
}

public class InterfaceEx01 implements InterfaceTest{
// elements of InterfaceTest is inherited
	
	@Override
	public int getA() {
		return A;
		
//		after override from interface and then create signature
	}
	public static void main(String[] args) {
//		InterfaceTest test=new InterfaceTest();
//		impossible to create the object
		
		InterfaceEx01 inter01 = new InterfaceEx01();
		System.out.println(inter01.getA());
	}

}
