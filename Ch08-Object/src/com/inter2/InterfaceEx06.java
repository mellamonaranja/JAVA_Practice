package com.inter2;

interface Inter1{
	public int getA();
}

interface Inter2{
	public abstract int getB();
}

interface Inter3 extends Inter1, Inter2{
	public int getData();
}

interface Inter4{
	public abstract int getC();
}

public class InterfaceEx06 implements Inter3, Inter4 {
	
	@Override
	public int getA() {
		return 100;
	}
	
	@Override
	public int getB() {
		return 200;
	}
	
	@Override
	public int getData() {
		return 300;
	}
	
	@Override
	public int getC() {
		return 400;
	}

	public static void main(String[] args) {
		
		InterfaceEx06 ife = new InterfaceEx06();
		
		System.out.println(ife.getA());
		System.out.println(ife.getB());
		System.out.println(ife.getC());
		System.out.println(ife.getData());
		
	}

}
