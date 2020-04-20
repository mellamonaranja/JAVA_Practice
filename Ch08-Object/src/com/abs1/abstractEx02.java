package com.abs1;

abstract class AbsEx01{
//	if the class has at least one abstract method, must be declared abstract class
//	the purpose is only for inheritance
	int a=2019;
	final String str = "abstract test";
	
	public String getStr() {
		return str;
	}
	
	abstract public int getA();
//	put 'abstract' in front of public  because it hasn't body-->getA(empty)
}

abstract class AbsEx02 extends AbsEx01{
	@Override
	public int getA(){
		return a;
	}
	
	
	@Override
	public abstract String getStr();
//	once override, parent's method is hided
//	the last override method can be called at last
//	override can be used only when inheritance case
}

abstract class AbsEx03 extends AbsEx02{
//	can be inherited from previous class continue
//	but need to put abstract
	
}

public class abstractEx02 extends AbsEx02{

	@Override
	public String getStr() {
		return "Override" + str;
	}
	
	public static void main(String[] args) {
		abstractEx02 ex02=new abstractEx02();
		System.out.println(ex02.getA());
		System.out.println(ex02.getStr());
	}

}
