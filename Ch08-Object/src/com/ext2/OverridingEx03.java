package com.ext2;

class AClass{
	public void rideMethod() {
		System.out.println("method of AClass");
	}
	
	public void loadmethod() {
		System.out.println("void method");
	}
	
}

class BClass extends AClass{
	@Override
	public void rideMethod() {
		System.out.println("method of BClass");
//	public void rideMethod() from parent class is hided	
	}
	public void loadmethod(int num) {
		System.out.println("int method");
	}	
}

class CClass extends BClass{
	@Override
	public void rideMethod() {
		System.out.println("method of CClass");	
	}
	
	public void loadmethod(double num) {
		System.out.println("double method");
				
	}
}

public class OverridingEx03 {

	public static void main(String[] args) {
		
		AClass ref1=new CClass();
		BClass ref2=new CClass();
		CClass ref3=new CClass();
		
		ref1.rideMethod();
		ref2.rideMethod();
		ref3.rideMethod();
		
		ref3.loadmethod();
		ref3.loadmethod(2019);
		ref3.loadmethod(3.14);
		
	}

}
