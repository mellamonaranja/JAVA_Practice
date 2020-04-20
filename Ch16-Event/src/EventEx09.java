import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EventEx09 extends Frame{
	
	public EventEx09() {
		
		setLayout(new FlowLayout());
		setBackground(Color.pink);
		
		this.addMouseListener(new MouseHandler());
//		addXXXListenr
	}
	
	public class MouseHandler implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			System.out.println("X is "+ (e.getX())+", Y is "+(e.getY()));
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
		EventEx09 eventex09 = new EventEx09();
		eventex09.setSize(300,200);
		eventex09.setVisible(true);
		eventex09.setTitle("MouseEvent Test");
		
	}

}
