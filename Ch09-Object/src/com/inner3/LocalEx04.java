package com.inner3;

interface Readable{
	public void read();
}

class OuterClass{
	private String strName;
	
	public OuterClass(String name) {
		this.strName=name;
	}
	
	public Readable createLocalClassInst() {
//		Readable is from interface
//		createLocalClassInst method created and put Readable type
//		Readable type is interface type
		class LocalClass implements Readable{
			@Override
			public void read() {
				System.out.println("outer inst name is "+ strName);
			}
		}
		LocalClass localclass=new LocalClass();
		return localclass;
//	any object created by LocalClass can be executed and returned here
	}
}

public class LocalEx04 {

	public static void main(String[] args) {
		OuterClass outerclass1 = new OuterClass("kung fu panda po");
		Readable readable1=outerclass1.createLocalClassInst();
		readable1.read();
		
		OuterClass outerclass2=new OuterClass("master shifu");
		Readable readable2=outerclass2.createLocalClassInst();
		readable2.read();
	}

}
