package com.Awt2;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Componentex12 extends Frame{

	Image img=null;
//	declare image object
	
	public Componentex12() {
		super("Graphics test");
		
		Toolkit toolkit=Toolkit.getDefaultToolkit();
		
		img=toolkit.getImage("bird.jpg");
		
		setBounds(100,100,400,400);
		setVisible(true);
	}
	@Override
	public void paint(Graphics g) {
	
		if(img==null) {
			return;
		}
		
		g.drawImage(img, 10, 10, 300, 200, this);
//		img, x, y, width, height, observer
	}



	public static void main(String[] args) {
		new Componentex12();

	}

}
