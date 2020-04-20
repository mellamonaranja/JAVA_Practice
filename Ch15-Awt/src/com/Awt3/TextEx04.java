package com.Awt3;

import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;

public class TextEx04 extends Frame{

	@Override
	public void paint(Graphics g) {
		
		Font serif=new Font("Serif", Font.PLAIN,15);
		g.setFont(serif);
		g.drawString("Serif plain 12 points", 30, 50);
		
		int ascent, descent, height, leading;
		
		ascent=g.getFontMetrics().getAscent();
//		FontMetrics has font information
		descent=g.getFontMetrics().getDescent();
		height=g.getFontMetrics().getHeight();
		leading=g.getFontMetrics().getLeading();
		
		g.drawString("ascent is "+ascent, 30, 75);
		g.drawString("descent is "+descent, 30, 90);
		g.drawString("height is "+height, 30, 110);
//		is ascent + descent + leading
		g.drawString("leading is "+leading, 30, 130);
//		??
				
	}

	public static void main(String[] args) {
		TextEx04 textex04=new TextEx04();
		textex04.setTitle("Font Matrics");
		textex04.setSize(300,200);
		textex04.setVisible(true);
		
	}

}
