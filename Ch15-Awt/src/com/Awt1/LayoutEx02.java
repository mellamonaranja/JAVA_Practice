package com.Awt1;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

public class LayoutEx02 extends Frame{
	
	public LayoutEx02() {
		setTitle("BorderLayout test");
		setSize(300,300);
		
		setLayout(new BorderLayout());
//		already imported therefore this can be omitted
		Panel panel1=new Panel();
		Panel panel2=new Panel();
		
		Button buttonEast=new Button("East");
		Button buttonWest=new Button("West");
		Button buttonSouth=new Button("South");
		Button buttonNorth=new Button("North");
		Button buttonCenter=new Button("Center");
		
		panel1.add(buttonCenter);
		panel2.add(buttonEast);
		
		add(panel2, BorderLayout.EAST);
		add(buttonWest, BorderLayout.WEST);
		add(buttonSouth, BorderLayout.SOUTH);
		add(buttonNorth, BorderLayout.NORTH);
		add(buttonCenter, BorderLayout.CENTER);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new LayoutEx02();
	}

}
