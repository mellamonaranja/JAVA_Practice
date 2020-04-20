package com.Awt1;

import java.awt.Color;
import java.awt.Frame;

public class FrameEx03 extends Frame{
	
	public FrameEx03() {
		super("frame test");
//		call to the parent
		
		setSize(400,300);
		setBackground(Color.yellow);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new FrameEx03();
//		creates object
	}

}

// way 3 how to create the frame