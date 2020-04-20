import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonEx01 extends Frame implements ActionListener{
//	ButtonEx01 is frame and ActionListener interface at the same time
	
	Panel p;
	Button input;
	Button exit;
	TextArea textarea;
	
	public ButtonEx01() {
		super("ActionEvent Test");
		p=new Panel();
		input=new Button("input");
		exit=new Button("exit");
		
		p.add(input);
		p.add(exit);
		
		textarea=new TextArea();
		
		add(p, BorderLayout.NORTH);
//		??without setlayout
		add(textarea, BorderLayout.CENTER);
//		frame has e,w,s,north basically, can setup with BorderLayout
		
		input.addActionListener(this);
		exit.addActionListener(this);
//		this means
		
		setBounds(300,300,300,300);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new ButtonEx01();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String name=e.getActionCommand();
//		when click the button, show the action
		
		if(name.equals("input")) {
//			??
			textarea.append("clicked the button.\n");
		}else {
			System.exit(0);
		}
	}

}
