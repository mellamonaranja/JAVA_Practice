package com.Awt1;

import java.awt.Frame;

public class FrameEx01 {

	public static void main(String[] args) {
		Frame frame=new Frame("Frame Test");
//		possible to put the title when create the object
		frame.setSize(400, 300);
//		width, height
		frame.setVisible(true);
//		in order to visible the frame, need to setVisible(true) 
	}

}

// way 1