package com.Awt2;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;

class DrawingCanvas extends Canvas{

	@Override
	public void paint(Graphics g) {

		g.setColor(Color.red);
		g.drawRect(30,30,230,100);
//		x,y,width, height
//		left height is the standard as x 0, y 0
	}
}

public class Componentex09 extends Frame{
	
	public Componentex09() {
		super("Canvas Test");
		
		DrawingCanvas drawingcanvas=new DrawingCanvas();
		drawingcanvas.setSize(200, 100);
		drawingcanvas.setBackground(Color.yellow);
		
		setLayout(new FlowLayout());
		
		add(drawingcanvas);
		setSize(300,200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Componentex09();
	}

}
