import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class EventEx04 extends Frame{
	
	List fruits;
	
	public EventEx04() {
		setTitle("ListEvent Test");
		setLayout(new FlowLayout());
//		array the component from left to right side
		
		fruits=new List();
//		creates List object
		
		fruits.add("a");
		fruits.add("b");
		fruits.add("c");
		fruits.add("d");
		fruits.add("e");
		
		add(fruits);
//		added fruits to frame 
		
		fruits.addItemListener(new FruitsHandler());
	}
	
	public class FruitsHandler implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			System.out.println(fruits.getSelectedIndex()+fruits.getSelectedItem());
		}
	}

	public static void main(String[] args) {
		EventEx04 eventex04=new EventEx04();
		eventex04.setSize(300,200);
		eventex04.setVisible(true);
	}

}
