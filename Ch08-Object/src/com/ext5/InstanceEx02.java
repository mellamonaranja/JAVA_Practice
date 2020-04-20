package com.ext5;

class Box{
	
	public void simpleWrap() {
		System.out.println("simple wrap");
	}	
}

class PaperBox extends Box{
	
	public void paperWrap() {
		System.out.println("paper wrap");
	}
}

class GoldPaperBox extends PaperBox{
	public void goldWrap() {
		System.out.println("gold wrap");
	}
}

public class InstanceEx02 {

	public static void wrapBox(Box box) {
		if(box instanceof GoldPaperBox) {
			((GoldPaperBox)box).goldWrap();
		}else if(box instanceof PaperBox){
			((PaperBox)box).paperWrap();
		}else {
			box.simpleWrap();
			
		}
	}
	
	public static void main(String[] args) {
		Box box = new Box();
		PaperBox paperbox = new PaperBox();
		GoldPaperBox goldpaperbox = new GoldPaperBox();
//		goldpaperbox is material type of box, paperbox, goldpaperbox
		
		wrapBox(box);
		wrapBox(paperbox);
		wrapBox(goldpaperbox);
		

	}

}
