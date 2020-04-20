package com.Awt1;

import java.awt.Button;
import java.awt.Frame;

public class LayoutEx01 extends Frame {
	
	Button button1;
	Button button2;
	
	public LayoutEx01() {
		setLayout(null);
//		place the layout manager in ()
		
		setTitle("layout test");
		button1=new Button("button1");
//		create the component
		button2=new Button("button2");
		
		button1.setBounds(0, 30, 150, 170);
//		left, right, width, height
		button2.setBounds(150, 30, 150, 170);
		
		add(button1);
		add(button2);
		
	}

	public static void main(String[] args) {
		LayoutEx01 layoutex01 = new LayoutEx01();
		layoutex01.setSize(300, 200);
		layoutex01.setVisible(true);
	}

}
