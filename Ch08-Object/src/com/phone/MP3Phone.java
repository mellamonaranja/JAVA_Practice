package com.phone;

public class MP3Phone extends CellPhone{

	private String size;
	private String color;
	
	public MP3Phone(String size, String color, String model, String number, int bellsound) {
//		it needs to be inherited from parents with String model, String number, int bellsound
		super(model, number, bellsound);
//		and then make initialized 3of them before child(size, color)
		this.size=size;
		this.color=color;
	}
	
	public String getSize() {
		return size;
	}
	
	public String getColor() {
		return color;
	}
	
	public static void main(String[] args) {
	

	}

}
