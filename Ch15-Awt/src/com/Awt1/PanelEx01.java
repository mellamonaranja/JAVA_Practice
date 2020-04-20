package com.Awt1;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;

public class PanelEx01 extends Frame{
	
	public PanelEx01() {
		
		setLayout(new FlowLayout());
//		Layout means placement
		
		setTitle("panel test");
		setSize(300,300);
		setBackground(Color.yellow);
		
		Panel panel=new Panel();
//		panel is one object of container
		panel.setBackground(Color.green);
		
		Button button=new Button("OK");
		
		panel.add(button);
		
		add(panel);
		
		setVisible(true);
		
//		the size of panel is what added inside panel
	}

	public static void main(String[] args) {
		new PanelEx01();
	}

}
