package com.final1;

class Me{
	public final void play() {
		System.out.println("play method");
	}
}

public class FinalEx02 extends Me{

//	@Override
//	public final void play() {
////	once defined final, cannot override	
//	}
	
	public static void main(String[] args) {
		FinalEx02 final02=new FinalEx02();
		final02.play();
//		can be inheritable
	}

}
