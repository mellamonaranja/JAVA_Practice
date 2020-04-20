import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class EventEx11 extends Frame implements MouseMotionListener{
	
	Label label=new Label("***********", Label.CENTER);
	
	public EventEx11() {
	setTitle("MouseMotionEvent Test");
	
	label.setForeground(Color.white);
	label.setBackground(Color.red);
	
	setLayout(null);
//	"**" cannot trace the mouse motion if there is layout manager
	label.setBounds(100, 50, 100, 20);
	
	add(label);
	
	addMouseMotionListener(this);
//	or this.addMotionListener(new MouseHandler());
	
	setBounds(300,300,300,300);
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
		Point point=e.getPoint();
		label.setLocation(point);
//		point object has x,y coordinates
	}

}
