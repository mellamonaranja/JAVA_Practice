package com.Awt2;

import java.awt.Choice;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Componentex05 extends Frame{
	
	
	public static void main(String[] args) {
		Componentex05 componentex05 = new Componentex05();
		componentex05.setTitle("Choice box test");
		componentex05.setLayout(new FlowLayout());
		
		Choice choice=new Choice();
		choice.add("item 1");
		choice.add("item 2");
		choice.add("item 3");
		choice.add("item 4");
		
		componentex05.add(choice);
//		choice put into frame
		
		choice.addItem("item 5");
		System.out.println("The number of item is " + choice.getItemCount());
		
		System.out.println("The 2nd item is " +choice.getItem(1)+1);
//		getItem(1) 1 means 2nd index
				
		choice.select(null);
//		if put the null, it returns first index, or non exists number, it returns error
		System.out.println("The 3th item is " + choice.getSelectedItem());
//		it has been chosen 3th item meaning index start from 0
		
		choice.remove(4);
		System.out.println(choice.getItemCount());
		
		for(int i=0;i<choice.getItemCount();i++) {
			System.out.println(choice.getItem(i));
		}
		
		componentex05.setSize(300, 200);
		componentex05.setVisible(true);
		
	}

}
