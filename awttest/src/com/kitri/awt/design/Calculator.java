package com.kitri.awt.design;

import java.awt.*;

public class Calculator extends Frame {
	Panel p1 = new Panel();
	Panel p2 = new Panel();

	Label numL = new Label();
	Label operL = new Label("오예오예");

	String[] s = {"7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "*", "0", "c", "=", "/"};
	Button btn[] = new Button[16];
	Button exit = new Button("종료");

	public Calculator() {
			p1.setLayout(new BorderLayout());
			numL.setBackground(Color.BLUE);
			operL.setBackground(Color.CYAN);
			p1.add(numL, "Center");
			p1.add(operL, "East");
			
			p2.setLayout(new GridLayout(4, 4));
			for (int i = 0; i < btn.length; i++) 
				p2.add(btn[i] = new Button(s[i]));
			
			setLayout(new BorderLayout());
			add(p1, "North");
			add(p2, "Center");
			add(exit, "South");
			
			setBounds(300, 200, 300, 500);
			setVisible(true);
		}

	public static void main(String[] args) {
		new Calculator();
	}

}
