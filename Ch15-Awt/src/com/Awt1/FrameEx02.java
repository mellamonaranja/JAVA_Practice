package com.Awt1;

import java.awt.Frame;

public class FrameEx02 extends Frame{
	
	public FrameEx02() {
		
	}

	public static void main(String[] args) {
		FrameEx02 frameex02=new FrameEx02();
		frameex02.setTitle("frame test");
//		also can entitle the title with setTitle
		frameex02.setSize(400,300);
		frameex02.setVisible(true);

	}

}

// way 2