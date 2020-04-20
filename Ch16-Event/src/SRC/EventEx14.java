import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventEx14 extends Frame
	implements WindowListener{

	Label lb;
	
	public EventEx14() {
		super("WindowEvent Test");
		
		lb = new Label("프레임의 우측상단의 종료버튼을 눌러주세요!");
		
		add(lb);
		
		setBounds(100, 100, 300, 300);
		
		setVisible(true);
		
		
		addWindowListener(this);
	}
	
	public static void main(String[] args) {
		new EventEx14();
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {

		System.exit(0);
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
