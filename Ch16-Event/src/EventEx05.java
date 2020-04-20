import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.List;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventEx05 extends Frame{

	List sports;
	TextArea textarea;
	
	public EventEx05() {
		
		setTitle("eee");
		setLayout(new BorderLayout());
		
		sports=new List();
		textarea=new TextArea();
		
		sports.add("a");
		sports.add("b");
		sports.add("c");
		sports.add("d");
		sports.add("e");
		sports.add("f");
		sports.add("g");
		sports.add("h");
		sports.add("i");
		
		add("North",sports);
		add("Center",textarea);
		
		sports.addActionListener(new SportsHandler());
	}
	
	public class SportsHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(sports.getSelectedItem());
//			event occurs when double click
			
			textarea.append(sports.getSelectedItem()+"\n");
		}
		
	}
	
	public static void main(String[] args) {
		EventEx05 eventex05=new EventEx05();
		eventex05.setSize(300,200);
		eventex05.setVisible(true);
	}

}
