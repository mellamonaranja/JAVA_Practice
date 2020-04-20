package com.abs3;

abstract class AbsEx1{
	int a=100;
	public int getA() {
		return a;
	}
	
	abstract public int getB();
	abstract public int getC();
//	must
}

abstract class AbsEx2 extends AbsEx1{
	String msg="abstract";
	
	@Override
	 public int getB() {
		return 200;
	}
	
	public abstract String getMsg();
}

public class abstractEx03 extends AbsEx2{
	

	public static void main(String[] args) {

		abstractEx03 ex03=new abstractEx03();
		System.out.println(ex03.getA());
		System.out.println(ex03.getB());
		System.out.println(ex03.getC());
		System.out.println(ex03.getMsg());
	}

	@Override
	public String getMsg() {
		
		return msg;
	}

	@Override
	public int getC() {

		return 300;
	}

}
