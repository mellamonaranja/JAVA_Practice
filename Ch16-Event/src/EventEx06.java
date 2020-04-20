import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class EventEx06 extends Frame implements ActionListener, ItemListener{
	
	Panel panel1=new Panel();
	Panel panel2=new Panel();
	
	TextArea textarea=new TextArea(5,20);
	Button exit = new Button("exit");
	
	Checkbox checkbox1=new Checkbox("a");
	Checkbox checkbox2=new Checkbox("b");
	Checkbox checkbox3=new Checkbox("c");
	Checkbox checkbox4=new Checkbox("d");
	Checkbox checkbox5=new Checkbox("e");
	Checkbox checkbox6=new Checkbox("f");
	
	public EventEx06() {
		super("ItemEvent Test");
		
		panel1.add(checkbox1);
		panel1.add(checkbox2);
		panel1.add(checkbox3);
		panel1.add(checkbox4);
		panel1.add(checkbox5);
		panel1.add(checkbox6);
		
		panel2.add(exit);
		
		add(panel1, BorderLayout.NORTH);
		add(textarea, BorderLayout.CENTER);
		add(panel2, BorderLayout.SOUTH);
		
		exit.addActionListener(this);
		
		checkbox1.addItemListener(this);
		checkbox2.addItemListener(this);
		checkbox3.addItemListener(this);
		checkbox4.addItemListener(this);
		checkbox5.addItemListener(this);
		checkbox6.addItemListener(this);
		
		setBounds(300,300,300,300);
		setVisible(true);
	}


	public static void main(String[] args) {
		new EventEx06();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
			System.exit(0);
	}
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange()==ItemEvent.SELECTED) {
			
			textarea.append(e.getItem()+" has been selected"+"\n\n");
			
		}else if(e.getStateChange()==ItemEvent.DESELECTED)
			textarea.append(e.getItem()+" has been deselected"+"\n\n");
	}


}
