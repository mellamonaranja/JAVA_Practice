import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventEx13 extends Frame{
	
	MenuBar menubar;
	
	public EventEx13() {
		setTitle("MenuEvent Test");
		setLayout(new FlowLayout());
		
		menubar=new MenuBar();
		Menu m1=new Menu("MainMenu");
		MenuItem mi_mi1=new MenuItem("SubMenu1");
		MenuItem mi_mi2=new MenuItem("SubMenu2");
		MenuItem mi_mi3=new MenuItem("SubMenu3");
		
		m1.add(mi_mi1);
		m1.add(mi_mi2);
		m1.add(mi_mi3);
		
		menubar.add(m1);
		
		setMenuBar(menubar);
//		show the MenuBar 
		
		m1.addActionListener(new MenuHandler());
	}
	
	class MenuHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println(e.getActionCommand()+ " has been selected");
			
			String command=e.getActionCommand();
			if(command.equals("SubMenu3")) {
				System.out.println("Program terminates");
				System.exit(0);
			}
		}
		
	}

	public static void main(String[] args) {
		EventEx13 eventex13=new EventEx13();
		eventex13.setSize(300,200);
		eventex13.setVisible(true);
		
	}

}
