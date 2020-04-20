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
import java.awt.event.WindowListener;

public class EventEx16 extends Frame implements ActionListener{

	Panel p1, p2, p3;
	TextField textfield;
	TextArea textarea;
	Button buttonClear;
	Button buttonExit;
	
	public EventEx16() {
		super("AdapterClass Test");
		
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
		
		setBounds(100,100,300,300);
		setVisible(true);
		
		buttonClear.addActionListener(this);
		buttonExit.addActionListener(this);
		
		textfield.addKeyListener(new KeyEventHandler(textfield, textarea));
		
		addWindowListener(new WindowHandlers());
	}
	
	public static void main(String[] args) {
		new EventEx16();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String command=e.getActionCommand();
		if(command.equals("Clear")) {
			textarea.setText("");
			textfield.setText("");
			textfield.requestFocus();
		}else if(command.equals("Exit")) {
			System.exit(0);
		}
	}
}// EventEx16 class finish

class KeyEventHandler extends KeyAdapter{
//	class KeyEventHandler implements KeyListener{ is also validate
	
	TextField textfield;
	TextArea textarea;
		
	public KeyEventHandler(TextField textfield, TextArea textarea) {
		this.textfield=textfield;
		this.textarea=textarea;
		
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		if(e.getKeyChar()==KeyEvent.VK_ENTER) {
//			vk=virtual key
			textarea.append(textfield.getText()+"\n");
			textfield.setText("");
		}
	}
	
}
class WindowHandlers extends WindowAdapter{
	
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
}
