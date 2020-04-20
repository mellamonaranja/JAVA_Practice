package com.Awt3;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;

public class TextEx03 extends Frame{
	
	@Override
	public void paint(Graphics g) {
		
		Font serif=new Font("Serif", Font.PLAIN,12);
		Font monospaced = new Font("Monospaced", Font.ITALIC, 24);
		Font sansSerif = new Font("SansSerif", Font.BOLD,10);
		Font clearGothic = new Font("ClearGothic", Font.BOLD,20);
		
		g.setFont(serif);
		g.drawString("Serif plain 12 points", 30, 50);
		
		g.setFont(monospaced);
		g.drawString("Monospaced ITALIC 24 points", 30, 80);
		
		g.setFont(clearGothic);
		g.drawString("ClearGothic BOLD 20 points", 30, 150);
		
		g.setFont(new Font("SansSerif", Font.BOLD,10));
//		same way as Font sansSerif = new Font("SansSerif", Font.BOLD,10);
//		within () only allows Font object
		g.drawString("SansSerif BOLD 10 points", 30, 180);

	}
	
	public static void main(String[] args) {
		
		TextEx03 textex03 = new TextEx03();
		textex03.setTitle("Font Style");
		textex03.setSize(500,300);
		textex03.setVisible(true);
	}


}
