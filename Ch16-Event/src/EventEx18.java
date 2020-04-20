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

public class EventEx18 extends Frame implements ActionListener{
	
	Panel p1, p2, p3;
	TextField textfield;
	TextArea textarea;
	Button buttonClear;
	Button buttonExit;

	public EventEx18() {
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
		
		textfield.addKeyListener(new KeyAdapter() {
//		no name therefore need to use parent's name
//			declare the class at the same time when create the object

			@Override
			public void keyTyped(KeyEvent e) {
			
			if(e.getKeyChar()==KeyEvent.VK_ENTER) {
				textarea.append(textfield.getText()+"\n");
				textfield.setText("");
			}
			}
		});
		
		addWindowListener(new WindowAdapter() {
//			addWindowListener has no name therefore need to use parent's name
//			declare the class at the same time when create the object
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
		
		
	}
	
	public static void main(String[] args) {
		new EventEx18();
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


