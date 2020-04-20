package com.Awt2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;

public class Componentex10 extends Frame{
	
	Graphics graphics;
	
	public Componentex10() {
		super("Graphics test");
		
		setBounds(100,100,400,300);
//		set up the location and size of this frame
		setVisible(true);
	}

	@Override
	public void paint(Graphics g) {
		g.setFont(new Font("Serif", Font.PLAIN, 15));
//		font is also an object therefore put here the font object
		g.drawString("drawing with the Graphics", 10,50);
//		str, x, y
		g.drawOval(50, 60, 50, 50);
//		x, y, width, height
		g.setColor(Color.blue);
		g.fillOval(100, 100, 50, 50);
		
		g.setColor(Color.red);
		g.drawLine(300, 100, 50, 50);
//		x1, y1, start point to draw line x2, end point y2
		
		g.setColor(Color.cyan);
		g.fillRect(160, 100, 50, 50);
//		rectangle
		
		g.fillRoundRect(220, 100, 120, 80, 100, 100);
//		x, y, width, height, arcWidth, arcHeight
		
		g.setColor(Color.magenta);
		g.fillPolygon(new int[] {50,100,150,200},new int[] {250,200,200,250}, 4);
//		xPoints, yPoints, nPoints
		
		g.setColor(Color.pink);
		g.fillArc(250,200,100,100,0,120);
//		x, y, width, height, startAngle, arcAngle
	}

	public static void main(String[] args) {
		new Componentex10();
	}

}
