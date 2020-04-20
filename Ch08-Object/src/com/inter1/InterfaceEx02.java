package com.inter1;

interface interA{
	
	public abstract void getB();
//	create 'public abstract' necessarily
//	the shape without body
	
	void getC();
//	can be omitted 'public abstract'
}

class B implements interA{
// once create implements from interface, B needs to makes body
	@Override
	public void getB(){
//		need to override every method from interface and makes body
		System.out.println("getB method");
	}
	
	@Override
	public void getC() {
		System.out.println("getC method");
	};
	
	public void getD() {
		System.out.println("getD method");
	}
}

public class InterfaceEx02 {

	public static void main(String[] args) {
		
		B b=new B();
		b.getB();
		b.getC();
		b.getD();
	}
	
}
