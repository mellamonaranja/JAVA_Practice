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

public class EventEx16 extends Frame
	implements ActionListener{
	
	Panel p1, p2, p3;
	TextField tf;
	TextArea ta;
	Button bClear;
	Button bExit;
	
	public EventEx16() {
		super("AdapterClass Test");
		
		
		p1 = new Panel();
		p2 = new Panel();
		p3 = new Panel();
		
		tf = new TextField(35);
		ta = new TextArea(10, 35);
		
		bClear = new Button("Clear");
		bExit = new Button("Exit");
		
		p1.add(tf);
		p2.add(ta);
		p3.add(bClear);
		p3.add(bExit);
		
		add(p1, BorderLayout.NORTH);
		add(p2, BorderLayout.CENTER);
		add(p3, BorderLayout.SOUTH);
		
		setBounds(100, 100, 300, 300);
		setVisible(true);
		
		bClear.addActionListener(this);
		bExit.addActionListener(this);

		
		tf.addKeyListener(new KeyEventHandler(tf, ta));
		
		
		addWindowListener(new WindowHandlers());
		
	}
	



	public static void main(String[] args) {
		new EventEx16();
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		String command = e.getActionCommand();
		
		if(command.equals("Clear")) {
			ta.setText("");
			tf.setText("");
			tf.requestFocus();
		}else if(command.equals("Exit")) {
			System.exit(0);
		}
	}

} // EventEx16


class KeyEventHandler extends KeyAdapter{

	TextField tf;
	TextArea ta;
	
	public KeyEventHandler(TextField tf, TextArea ta) {
		this.tf = tf;
		this.ta = ta;
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		
		if(e.getKeyChar()==KeyEvent.VK_ENTER) {
			ta.append(tf.getText() + "\n");
			tf.setText("");
		}
	}
}



class WindowHandlers extends WindowAdapter{

	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
	
}