import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EventEx15 extends Frame{
	
	Button button;

	public EventEx15() {
		super("AdapterClass TEST");
		setLayout(new FlowLayout());
		
		button = new Button("Click to Exit icon");
		
		add(button);
		
		this.addWindowListener(new ExitHandler());
	}
	
	public class ExitHandler extends WindowAdapter{

		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			super.windowClosing(e);
			System.exit(0);
		}
	}
	

	public static void main(String[] args) {
		EventEx15 ae = new EventEx15();
		ae.setSize(300, 200);
		ae.setVisible(true);
	}

}
