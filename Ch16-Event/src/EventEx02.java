import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventEx02 extends Frame{
	
	TextField textfield;
	TextArea textarea;
	
	public EventEx02() {
		super("ActionEvent Test");
		
		setLayout(new BorderLayout());
//		setup borderlayout but this sentence isn't necessary
		
		textfield=new TextField();
		textarea=new TextArea();
		
		add(BorderLayout.NORTH,textfield);
//		it occurred when press the enter
//		it means it is event listener
//		when press the enter, occurred action event
//		neet to create action handler class in order to execute
		add(BorderLayout.CENTER,textarea);
//		textarea will be showed fully because there is no west, east
		
		textfield.addActionListener(new textfieldHandler());
		
	}
	
	public class textfieldHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
//			System.out.println(textfield.getText());
			
			textarea.append(textfield.getText()+"\n");
			textfield.setText("");
//			after put the word, textfield will be showed empty
		}
		
		
	}
	

	public static void main(String[] args) {
		EventEx02 eventex02= new EventEx02();
		eventex02.setSize(300,200);
		eventex02.setVisible(true);
	}

}
