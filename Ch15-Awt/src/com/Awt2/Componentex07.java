package com.Awt2;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;

public class Componentex07 extends Frame{

	public void printAlignment(int state) {
		switch(state) {
		case 0:	System.out.println(" left alignment");break;
		case 1:	System.out.println(" center alignment");break;
		case 2:	System.out.println(" right alignment");break;
		}
	}
	
	public static void main(String[] args) {
		Componentex07 componentex07 = new Componentex07();
		componentex07.setTitle("Label test");
		componentex07.setLayout(new GridLayout(3,1));

		Label label1=new Label();
		label1.setText("Label1");
		componentex07.add(label1);
		
		Label label2=new Label("Label1");
//		when create the constructor, put the text as well
		label2.setAlignment(Label.CENTER);
//		alignment in center
		componentex07.add(label2);
		
		Label label3=new Label("Label3", Label.RIGHT);
		componentex07.add(label3);
		
		System.out.print(label1.getText()+" is");
		componentex07.printAlignment(label1.getAlignment());
		
		System.out.print(label2.getText()+" is");
		componentex07.printAlignment(label2.getAlignment());
		
		System.out.print(label3.getText()+" is");
		componentex07.printAlignment(label3.getAlignment());
		
		componentex07.setSize(300, 200);
		componentex07.setVisible(true);
		
		
		
		
	}

}
