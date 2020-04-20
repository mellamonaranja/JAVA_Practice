import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventEX13 extends Frame{
	
	MenuBar mb;
	
	public EventEX13() {
		
		setTitle("MenuEvent TEST");
		
		setLayout(new FlowLayout());
		
		mb = new MenuBar();
		
		Menu m1 = new Menu("MainMenu1");
		
		MenuItem m1_mi1 = new MenuItem("SubMenu1");
		MenuItem m1_mi2 = new MenuItem("SubMenu2");
		MenuItem m1_mi3 = new MenuItem("SubMenu3");
		
		m1.add(m1_mi1);
		m1.add(m1_mi2);
		m1.add(m1_mi3);
		
		mb.add(m1);
		
		setMenuBar(mb);
		
		m1.addActionListener(new MenuHandler());
	}
	
	public class MenuHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			System.out.println(e.getActionCommand() +  "가 선택되었습니다.");
			
			
			String command = e.getActionCommand();
			
			if(command.equals("SubMenu3")) {
				System.out.println("프로그램이 종료되었습니다.");
				System.exit(0);
			}
			
			
			
		}
		
	}
	
	

	public static void main(String[] args) {
		EventEX13 ae = new EventEX13();
		ae.setSize(300, 200);
		ae.setVisible(true);
	}

}
