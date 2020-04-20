import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EventEx10 extends Frame{

	int x;
	int y;
	
	
	public EventEx10() {
		setTitle("MouseEvent TEST");
		setLayout(new FlowLayout());
		
		this.addMouseListener(new MouseHandler());
	}
	
	@Override
	public void update(Graphics g) {
		// TODO Auto-generated method stub
		super.update(g);
		
		g.drawOval(x, y, 30, 30);
		
	}


	public class MouseHandler implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {

			x = (int)e.getX();
			y = (int)e.getY();
			
			repaint();
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	
	public static void main(String[] args) {
		EventEx10 ae = new EventEx10();
		ae.setSize(300, 200);
		ae.setVisible(true);
	}

}
