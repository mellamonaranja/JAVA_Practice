package com.Awt2;

import java.awt.Checkbox;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;

public class ComponentEx03 extends Frame{

	public static void main(String[] args) {
		ComponentEx03 componentex03 = new ComponentEx03();
		componentex03.setTitle("Check box Test");
		componentex03.setLayout(new FlowLayout());
//		how to set up the layout manager
//		and put the FlowLayout manager
		
		Checkbox checkbox1=new Checkbox();
		Checkbox checkbox2=new Checkbox("Checkbox 2");
		checkbox1.setLabel("checkbox 1");
//		same way as before(ComponentEx02)
		
		checkbox2.setBackground(Color.green);
		
		componentex03.add(checkbox1);
		componentex03.add(checkbox2);
		
		componentex03.add(new Checkbox("Checkbox 3"));
//		create new Checkbox 3
		
		Checkbox checkbox4 = new Checkbox("Checkbox 4", true);
		componentex03.add(checkbox4);
		
		componentex03.pack();
//		causes this window to be sized to fit the preferred size and layouts 
		
		componentex03.setVisible(true);
	}

}
