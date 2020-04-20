package com.inter2;

class DMB{
	public void onDMB() {
		System.out.println("print DMB");
	}
}

interface MP3{
	public void onMP3();
//	abstract method	
//	no body (empty)
}

class MP3Imple{
	public void onMP3() {
		System.out.println("play MP3");
	}
}

class SmartPhone extends DMB implements MP3{
//	class cannot be inherited multiple from more than one class
//	in order to put MP3, created interface MP3
//	
	MP3Imple mp3imple=new MP3Imple();
	
	@Override
	public void onMP3() {
		mp3imple.onMP3();
	}
	
	public void powerOn() {
		onDMB();
		onMP3();
	}
}


public class InterfaceEx07 {

	public static void main(String[] args) {
		SmartPhone phone=new SmartPhone();
		phone.powerOn();
		
		DMB dmb=phone;
		MP3 mp3=phone;
//		upcasting
		
		dmb.onDMB();
		mp3.onMP3();
	}

}
