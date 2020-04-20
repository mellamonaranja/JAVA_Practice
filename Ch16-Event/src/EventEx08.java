import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class EventEx08 extends Frame implements KeyListener{
	TextArea textarea=new TextArea();
	
	public EventEx08() {
		super("KeyEvent Test");
		
		add(textarea);
		
		textarea.addKeyListener(this);
		
		setBounds(300,300,300,300);
		setVisible(true);
	}

	public static void main(String[] args) {
		EventEx08 eventex08 = new EventEx08();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==KeyEvent.VK_UP) {
			textarea.append("UP key\n");
		}else if(e.getKeyCode()==KeyEvent.VK_DOWN) {
			textarea.append("DOWN key\n");
		}else if(e.getKeyCode()==KeyEvent.VK_LEFT) {
			textarea.append("LEFT key\n");
		}else if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
			textarea.append("RIGHT key\n");
		}else if(e.getKeyCode()==KeyEvent.VK_ENTER) {
			textarea.append("ENTER key\n");
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
