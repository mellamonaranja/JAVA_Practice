package com.Awt2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Scrollbar;

public class Componentex13 extends Frame{
	
	public Componentex13() {
		super("Scroller test");
		
		setLayout(new BorderLayout(10,10));
		
		Panel panel1=new Panel();
		panel1.setLayout(new GridLayout(2,2));
		
		Scrollbar scrollbar1=new Scrollbar();
//		without a factor(), it setup with vertical type
		Scrollbar scrollbar2=new Scrollbar(Scrollbar.VERTICAL);
		scrollbar1.setValues(50, 20, 0, 100);
//		declare initial -value, visible, minimum, maximum)
		
		panel1.add(new Label("Label1"));
		panel1.add(new Label("Stage"));
		panel1.add(scrollbar1);
		panel1.add(scrollbar2);
		panel1.setBackground(Color.orange);
//		label>scrollbar
		
		Panel panel2=new Panel();
		panel2.setLayout(new GridLayout(2,2));
		Scrollbar scrallbar3=new Scrollbar(Scrollbar.HORIZONTAL,0,10,0,100);
		Scrollbar scrallbar4=new Scrollbar(Scrollbar.HORIZONTAL,50,30,0,100);
		
		panel2.add(new Label("speed"));
		panel2.add(scrallbar3);
		panel2.add(new Label("voltage"));
		panel2.add(scrallbar4);
//		label>scrollbar>label>scrollbar
		
		Panel panel3=new Panel();
		Scrollbar scrallbar5=new Scrollbar(Scrollbar.VERTICAL);
		scrallbar5.setOrientation(Scrollbar.HORIZONTAL);
		panel3.add(scrallbar5);
		panel3.setBackground(Color.pink);
		
		add("North", panel1);
		add("Center", panel2);
		add("South", panel3);
		
		setSize(300,400);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new Componentex13();
	}

}
