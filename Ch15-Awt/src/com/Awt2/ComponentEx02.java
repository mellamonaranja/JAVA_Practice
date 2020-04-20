package com.Awt2;

import java.awt.Button;
import java.awt.Frame;

public class ComponentEx02 extends Frame{
	
	public ComponentEx02() {
		
		super("Button test");
		setSize(300,200);
		
		setVisible(true);
		
		Button b=new Button("ok");
		setLayout(null);
//		if there isn't designated layout, it created automatically therefore 
//		need to set null, and then put the setLocation below
		b.setSize(100,50);
		b.setLocation(100, 50);
		add(b);
	}

	public static void main(String[] args) {
		new ComponentEx02();
	}

}
