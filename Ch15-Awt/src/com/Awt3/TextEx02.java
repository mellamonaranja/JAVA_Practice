package com.Awt3;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.TextArea;

public class TextEx02 extends Frame{

	public static void main(String[] args) {
		TextEx02 textex02=new TextEx02();
		
		textex02.setTitle("Text area test");
		textex02.setLayout(new GridLayout(2,4));
		
		TextArea textarea1=new TextArea();
		textarea1.append("Text area 1");
//		way 1.
		textarea1.setColumns(10);
		textarea1.setRows(4);
		
		textex02.add(textarea1);
		
		TextArea textarea2=new TextArea("Text area 2");
//		way 2.
//		same way as way 1.
		
		textarea2.setColumns(10);
		textarea2.setRows(4);
		
		textex02.add(textarea2);
		
		TextArea textarea3=new TextArea("Text area 3", 10, 4);
//		same way as way 1, 2
		textex02.add(textarea3);
		
		TextArea textarea4=new TextArea("Text area 4", 10, 4, TextArea.SCROLLBARS_NONE);
		textex02.add(textarea4);
		
		TextArea textarea5=new TextArea("Text area 5", 10, 4, TextArea.SCROLLBARS_HORIZONTAL_ONLY);
		textex02.add(textarea5);
		
		TextArea textarea6=new TextArea("Text area 6", 10, 4, TextArea.SCROLLBARS_VERTICAL_ONLY);
		textex02.add(textarea6);
		
		TextArea textarea7=new TextArea("Text area 7", 10, 4, TextArea.SCROLLBARS_VERTICAL_ONLY);
		textex02.add(textarea7);
		
		textex02.pack();
		textex02.setVisible(true);
		
		
	}

}
