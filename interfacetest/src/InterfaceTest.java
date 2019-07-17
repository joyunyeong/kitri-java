import java.awt.*;
import java.awt.event.*;

public class InterfaceTest extends Frame implements WindowListener, ActionListener {

	Button b1 = new Button("@눌러봐1@");

	public InterfaceTest() {
		super("Interface Test!!!");
		setLayout(new FlowLayout());
		b1.setBackground(new Color(210, 255, 5));
		add(b1);
		setBackground(new Color(200, 5, 210));
		setSize(400, 300);
		setLocation(300, 200);
		setVisible(true);
		
		// WindowListener w1 = new InterfaceTest(); : 새로운놈을 만들면 안됨 해리포터처럼 계속 생성
		addWindowListener(this); //interface참조
		b1.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		int r = (int)(Math.random() * 256);
		int g = (int)(Math.random() * 256);
		int b = (int)(Math.random() * 256);
		setBackground(new Color(r,g,b));
	}
	
	public void windowDeactivated(WindowEvent e) {}
	public void windowActivated(WindowEvent e) {}
	public void windowDeiconified(WindowEvent e) {}
	public void windowIconified(WindowEvent e) {}
	public void windowClosed(WindowEvent e) {}
	public void windowClosing(WindowEvent e) {System.exit(0);}
	public void windowOpened(WindowEvent e) {}
	
	public static void main(String[] args) throws Exception {
		InterfaceTest iat = new InterfaceTest();
	}
}
