package com.Awt3;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;

public class TextEx01 extends Frame{
	
	TextField textfield;
	TextArea textarea;
	
	public TextEx01() {
		setLayout(new FlowLayout());
		textfield=new TextField(30);
//		display text in one line
		textarea=new TextArea(7,30);
//		text lines and display text
//		this 7 means just display at first open 
		
		add(textfield);
		add(textarea);
		
	}

	public static void main(String[] args) {
		TextEx01 textex01=new TextEx01();
		textex01.setSize(300,200);
		textex01.setVisible(true);
	}

}
