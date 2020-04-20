import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class EventEx12 extends Frame implements MouseMotionListener{
	
	int x=0;
	int y=0;
	
	public EventEx12() {
		super("drawing board");
		
		setBounds(100,100,500,500);
		setVisible(true);
		
		addMouseMotionListener(this);
	}
	
	@Override
	public void update(Graphics g) {
		paint(g);
	}

	@Override
	public void paint(Graphics g) {

		g.setFont(new Font("Serif", Font.PLAIN, 15));
		g.setColor(Color.green);
		g.drawString("*", x, y);
	}

	public static void main(String[] args) {
		new EventEx12();
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		x=e.getX();
		y=e.getY();
		
		repaint();
	}



	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
