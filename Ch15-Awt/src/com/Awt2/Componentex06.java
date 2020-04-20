package com.Awt2;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class Componentex06 extends Frame{
	
	Label label1;
	Label label2;
	
	public Componentex06() {
		setLayout(new FlowLayout());
		label1=new Label("Label1");
		label2=new Label();
		label2.setText("Label2");
		label2.setBackground(Color.yellow);
		
		add(label1);
		add(label2);
	}

	public static void main(String[] args) {
		Componentex06 componentex06 = new Componentex06();
		componentex06.setSize(300, 200);
		componentex06.setVisible(true);
	}

}
