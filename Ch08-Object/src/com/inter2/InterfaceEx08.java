package com.inter2;

interface inter8{
	public abstract void play();
}

public class InterfaceEx08 implements inter8{
	@Override
	public void play() {
		System.out.println("play method");
	}
	
	public void study() {
		System.out.println("study method");
	}

	public static void main(String[] args) {
		InterfaceEx08 inter08=new InterfaceEx08();
		inter08.play();
		inter08.study();
		System.out.println();
		
		inter8 if8 = inter08;
		if8.play();
//		if8.study();
//		upcasting occured
//		inter08 has been changed the type from child to parent
//		inter08 is parent
		
		InterfaceEx08 inter8 = (InterfaceEx08)inter08;
//		downcasting 
		
	}

}
