import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class EventEx11 extends Frame
	implements MouseMotionListener{

	Label move = new Label("**********", Label.CENTER);
	
	public EventEx11() {
		setTitle("MouseMotionEvent TEST");
		
		move.setForeground(Color.white);
		move.setBackground(Color.red);
		
		setLayout(null);
		move.setBounds(100, 50, 100, 20);
		
		add(move);
		
		
		addMouseMotionListener(this);
		
		setBounds(300, 300, 300, 300);
		setVisible(true);
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		new EventEx11();
	}




	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void mouseMoved(MouseEvent e) {

		Point p = e.getPoint();
		move.setLocation(p);
		
	}

}
