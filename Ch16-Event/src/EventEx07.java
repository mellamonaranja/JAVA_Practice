import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class EventEx07 extends Frame implements ActionListener, TextListener{
	
	TextField textfield=new TextField(20);
	Button input=new Button("input");
	TextArea textarea=new TextArea();
	Button exit=new Button("exit");
	
	public EventEx07() {
		super("TextEvent Test");
		
		input.setEnabled(false);
//		in-activate when un-click
		
		Panel panel1=new Panel();
		panel1.add(new Label("Title"));
		panel1.add(textfield);
		panel1.add(input);
		
		add(panel1, BorderLayout.NORTH);
		add(textfield,BorderLayout.CENTER);
		add(exit,BorderLayout.SOUTH);
		
		textfield.addTextListener(this);
		
		input.addActionListener(this);
		exit.addActionListener(this);
		
		setBounds(300,300,300,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new EventEx07();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand().equals("input")) {
			textarea.append(textfield.getText()+"\n");
			textfield.setText("");
			textfield.requestFocus();
		}else if(e.getActionCommand().equals("exit")) {
			System.exit(0);
		}
	}
	
	@Override
	public void textValueChanged(TextEvent e) {
		if(textfield.getText().contentEquals("")) {
			input.setEnabled(false);
		}else {
			input.setEnabled(true);
		}
		
	}
}
