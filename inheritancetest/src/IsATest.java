import java.awt.*;
public class IsATest extends Frame{

	Button b1 = new Button("@������@");
	Button b2 = new Button("@������@");
	Button b3 = new Button("@������@");

	public IsATest() {
		super("Is A Test!!!");
		setLayout(new FlowLayout());
		//b.setLabel("������!!!");
		add(b1);
		add(b2);
		add(b3);
		setSize(400, 300);
		setLocation(300, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		IsATest is = new IsATest();
	}

	
}
