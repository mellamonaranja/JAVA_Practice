package com.Awt2;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.FlowLayout;
import java.awt.Frame;

public class ComponentEx04 extends Frame{

	public static void main(String[] args) {
		ComponentEx04 componentex04 = new ComponentEx04();
		
		componentex04.setTitle("Radio button test");
		componentex04.setLayout(new FlowLayout());
		
		CheckboxGroup chgroup = new CheckboxGroup();
		
		Checkbox checkbox1=new Checkbox("Radio button 1",chgroup,false);
//		put the checkbox inside the checkboxgroup
		Checkbox checkbox2=new Checkbox("Radio button 2",chgroup,false);
		Checkbox checkbox3=new Checkbox("Radio button 3",chgroup,true);
//		checkbox3 has been chosen as a default with true
		Checkbox checkbox4=new Checkbox("Radio button 4",chgroup,false);

		componentex04.add(checkbox2);
		componentex04.add(checkbox3);
		componentex04.add(checkbox4);
		
		componentex04.pack();
//		to be sized automatically
		
		componentex04.setVisible(true);
		
	}

}
