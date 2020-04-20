package com.Awt3;

import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;

public class MenuEx01 extends Frame{
	
	MenuBar menubar;
	
	public MenuEx01() {
		super("Menubar Test");
		
		menubar=new MenuBar();
		
		Menu menu_mode = new Menu("Mode");
		Menu menu_options = new Menu("Options");
		Menu menu_help = new Menu("Help");
//		these are main menu item
		
		MenuItem basic = new MenuItem("Basic");
		MenuItem advance = new MenuItem("Advance");
		CheckboxMenuItem checkbox1 = new CheckboxMenuItem("Expert", true);
//		these are sub menu item
		
		Menu menu_morelanguage = new Menu("More language");
		MenuItem item1 = new MenuItem("C");
		MenuItem item2 = new MenuItem("Html5");
		MenuItem item3 = new MenuItem("java");
		MenuItem item4 = new MenuItem("Python");
		
		CheckboxMenuItem checkbox2 = new CheckboxMenuItem("Expert", true);
		
		menu_morelanguage.add(item1);
		menu_morelanguage.add(item2);
		menu_morelanguage.add(item3);
		menu_morelanguage.add(item4);
		menu_morelanguage.add(checkbox2);
		
		MenuItem exit = new MenuItem("Exit");
		
		menu_mode.add(basic);
		menu_mode.add(advance);
		menu_mode.add(checkbox1);
		menu_mode.addSeparator();
//		separator line added
		menu_mode.add(menu_morelanguage);
		menu_mode.addSeparator();
		menu_mode.add(exit);
		
		MenuItem userdefine = new MenuItem("User define");
		MenuItem windowsetting = new MenuItem("Window setting");
		
		menu_options.add(userdefine);
		menu_options.add(windowsetting);
		
		MenuItem about = new MenuItem("About");
		menu_help.add(about);
		
		menubar.add(menu_mode);
		menubar.add(menu_options);
		menubar.add(menu_help);
		
		setMenuBar(menubar);
		
		setSize(300,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MenuEx01();
	}

}
