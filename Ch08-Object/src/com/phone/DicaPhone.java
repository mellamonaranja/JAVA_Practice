package com.phone;

public class DicaPhone extends CellPhone{

	private String pixel;
	private String lens;
	
	public DicaPhone(String pixel, String lens, String model, String number, int bellsound) {
//		it needs to be inherited from parents with String model, String number, int bellsound

		super(model, number, bellsound);
//		and then make initialized 3 of them before child(pixel, lens)
		
		this.pixel=pixel;
		this.lens=lens;
	}
	
	public String getPixel() {
		return pixel;
	}
	
	public String getLens() {
		return lens;
	}
	
	public static void main(String[] args) {


	}

}
