package com.Awt2;

import java.awt.Frame;
import java.awt.List;

public class Componentex08 extends Frame{

	public static void main(String[] args) {
		Componentex08 componentex08 = new Componentex08();
		
		componentex08.setTitle("List component test");
		
//		List list=new List(9,true);
//		consists 9 item and multiple choice option when click with true
		
		List list=new List(9,false);
//		when click, only one item can be chosen
		
		list.add("m");
		list.add("v");
		list.add("e");
		list.add("m");
		list.add("jupiter");
		list.add("saturn");
		list.add("uranus");
		list.add("neptune");
		list.add("pluto");
		
		componentex08.add(list);
		
		String[]items=new String[10];
		items=list.getItems();
//		get the items in the list
		
		for(int i=0;i<items.length;i++) {
			System.out.println("List item is [" + i + "]" + items[i]);
		}
		
		list.select(1);
		
		System.out.println("selected items are "+list.getSelectedIndex() + ":" + list.getSelectedItem());
		
		list.select(3);
		System.out.println("2nd item is "+list.isIndexSelected(2));
//		true if the specified item has been selected, otherwise false
		System.out.println("3th item is "+list.isIndexSelected(3));
		
		System.out.println(list.getRows());
//		the number of visible lines
		
		System.out.println(list.isMultipleMode());
//		true if this list allows multiple selection otherwise false
		
		list.setMultipleSelections(true);
//		has been changed to multiple mode with true
		System.out.println(list.isMultipleMode());
		
		String[] selectedItems=new String[3];
		selectedItems=list.getSelectedItems();
//		get arrays of selected items on this scrolling list, if no item is selected, a zero-length array is returned
		
		for(int i=0;i<selectedItems.length;i++) {
			System.out.println(selectedItems.length);
			System.out.println(i+selectedItems[i]);
//			list.isIndexSelected(3)-->3th index has been selected therefore it showed m
//			also when the mode changed from single mode to multiple mode, it selected to only one 
//			that's why it showed 0
		}
		
		list.replaceItem("first item", 0);
		
		
		
		componentex08.pack();
		componentex08.setVisible(true);
		
	}

}
