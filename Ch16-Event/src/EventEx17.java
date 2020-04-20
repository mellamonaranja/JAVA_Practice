import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EventEx17 extends Frame implements ActionListener{

	Panel p1, p2, p3;
	TextField textfield;
	TextArea textarea;
	Button buttonClear;
	Button buttonExit;
	
	public EventEx17() {
		super("AdapterClass Test");
		
		setBounds(100,100,300,300);
		setVisible(true);
		
		p1=new Panel();
		p2=new Panel();
		p3=new Panel();
		
		textfield=new TextField(35);
		textarea=new TextArea(10,35);
		buttonClear=new Button("Clear");
		buttonExit=new Button("Exit");
		
		p1.add(textfield);
		p2.add(textarea);
		p3.add(buttonClear);
		p3.add(buttonExit);
		
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.CENTER);
		add(p3, BorderLayout.SOUTH);
		
		buttonClear.addActionListener(this);
		buttonExit.addActionListener(this);
		
		textfield.addKeyListener(new KeyEventHandler());
		
		addWindowListener(new WindowEventHandlers());
		
	}
	
	class WindowEventHandlers extends WindowAdapter{

		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
		
	}
	
	class KeyEventHandler extends KeyAdapter{

		@Override
		public void keyTyped(KeyEvent e) {
			if(e.getKeyChar()==KeyEvent.VK_ENTER) {
				textarea.append(textfield.getText()+"\n");
				textfield.setText("");
			}
		}
		
	}
	
	public static void main(String[] args) {
		new EventEx17();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command=e.getActionCommand();
		if(command.contentEquals("Clear")) {
			textarea.setText("");
			textfield.setText("");
			textfield.requestFocus();
		}else if(command.contentEquals("Exit"))
			System.exit(0);
	}

}
