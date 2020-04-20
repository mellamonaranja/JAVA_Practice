package com.Awt2;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class ComponentEx01 extends Frame {
	
	Button button1;
	Button button2;
//	those buttons can be used in anywhere within this class
	
	public ComponentEx01() {
		setLayout(new FlowLayout());
		
		button1=new Button("button1");
		button2=new Button();
		button2.setLabel("button2");
//		the object of button2 is "button2"
		
		add(button1);
		add(button2);
	}

	public static void main(String[] args) {
		ComponentEx01 componentex01 = new ComponentEx01();
		componentex01.setSize(300, 100);
		componentex01.setVisible(true);
	}

}
