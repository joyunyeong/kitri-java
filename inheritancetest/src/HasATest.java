import java.awt.*;
public class HasATest { //Æ÷ÇÔ°ü°è


	Frame f = new Frame("Has A Test!!!");
	Button b = new Button("@´­·¯ºÁ@");

	public HasATest() {
		//f.setTitle("Has A Test!!!");
		f.setLayout(new FlowLayout());
		//b.setLabel("´­·¯ºÁ!!!");
		f.add(b);
		f.setSize(400, 300);
		f.setLocation(300, 200);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		HasATest hat = new HasATest();
	}

	
}
