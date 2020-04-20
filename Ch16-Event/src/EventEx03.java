import java.awt.Frame;
import java.awt.Scrollbar;
import java.awt.TextField;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class EventEx03 extends Frame{

	Scrollbar scrollbar;
	TextField textfield;
	
	public EventEx03() {
		setTitle("AdjustmentEvent Test");
//		basic layout is BorderLayout hence we don't need to setup really
//		setLayout(new BorderLayout()); <--like this
		
		scrollbar=new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
		textfield=new TextField();
		
		add("North", scrollbar);
		add("Center", textfield);
		
		scrollbar.addAdjustmentListener(new ScrollbarHandler());
//		connect event handler's object to event listener
//		when addAdjustmentListener listens the event, it implements the adjustmentValueChanged method
	}
	
	public class ScrollbarHandler implements AdjustmentListener{

		@Override
		public void adjustmentValueChanged(AdjustmentEvent e) {
//			System.out.println(scrollbar.getValue());
			textfield.setText(scrollbar.getValue()+"");
//			setText allows only string
		}
		
	}
	
	public static void main(String[] args) {
		EventEx03 eventex03 = new EventEx03();
		eventex03.setSize(300,200);
		eventex03.setVisible(true);
	}

}
