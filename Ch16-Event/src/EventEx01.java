import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// 1. decide event source (button->ActionEvent)
// 2. fill out the event listener (ActionEvent->ActionListener->Handler)
// 3. connect event source and event listener (connect the button to ActionListener)
// 4. execute event handler (ActionPerformed)

public class EventEx01 extends Frame {
	
	Button button;
	
	public EventEx01() {
		setTitle("MouseEvent Test");
		setLayout(new FlowLayout());
		
		button=new Button("click me");
//		action event occurred here hence this is event source
		
		ButtonHandler buttonhandler = new ButtonHandler();
		button.addActionListener(buttonhandler);
//		adds the specified action listener to receive action events from this button
		
		add(button);
	}
	
	public class ButtonHandler implements ActionListener{
//		need to execute ActionListener interface
//		create handler class

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("button has been clicked");
			
		}
		
	}

	public static void main(String[] args) {
		
		EventEx01 eventex01 = new EventEx01();
		eventex01.setSize(300,200);
		eventex01.setVisible(true);
	}

}
