import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//public class EventEx15 extends Frame implements WindowAdapter{
//	WindowAdapter is abstract class hence cannot be implemented, inherited
//	therefore need to create handler class and use

	public class EventEx15 extends Frame {
	
	Button button;
	public EventEx15() {
		super("AdapterClass Test");
		setLayout(new FlowLayout());
		
		button=new Button("click to exit icon");
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
//		WindowAdapter is abstract class so don't need to override every method
		
		
		
	}

	public static void main(String[] args) {
		EventEx15 eventex15=new EventEx15();
		eventex15.setSize(300,200);
		eventex15.setVisible(true);
	}

}
