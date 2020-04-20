package com.Awt2;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Componentex11 extends Frame{
	
	public Componentex11() {
		super("AWT paint() test");
		
		Panel panel=new Panel(new FlowLayout());
//		panel is container
		
		panel.add(new Label("update(), paint()"));
		
		Button buttonRefresh=new Button("refresh");
		panel.add(buttonRefresh);
		
		buttonRefresh.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				repaint();
			}
//			repaint is one method which is belong to frame
//			it redefines with new methods such as update, paint
			
		});
//		put the action object into ()
		
		add("North", panel);
		
	}
	@Override
	public void update(Graphics g) {
		System.out.println("update()");
		super.update(g);
	}
	
	@Override
	public void paint(Graphics g) {
		System.out.println("paint()");
		super.paint(g);
		
		g.drawRect(50, 80, 200, 100);
		g.drawString("paint()", 120, 130);
	}
	
	public static void main(String[] args) {
		Componentex11 componentex11 = new Componentex11();
		
		componentex11.setSize(300,200);
		componentex11.setVisible(true);
		
	}


}
