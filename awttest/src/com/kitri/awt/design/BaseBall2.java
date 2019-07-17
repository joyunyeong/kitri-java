package com.kitri.awt.design;

import java.awt.*;

public class BaseBall2 extends Frame {
	Panel p1 = new Panel();
	Panel p2 = new Panel();
	Panel p3 = new Panel();
	
	TextArea ta = new TextArea();
	
	Label l = new Label("숫자");
	TextField tf = new TextField();
	
	Button newG = new Button("새게임");
	Button clear = new Button("지우기");
	Button dap = new Button("정답");
	Button fontC = new Button("글자색");
	Button exit = new Button("종료");
	
	public BaseBall2() { //작은것부터 큰것순으로 하자
		p1.setLayout(new BorderLayout());
		p1.add(ta, "Center");
		p1.add(p1, "South");
		
		p2.setLayout(new BorderLayout());
		p2.add(l, "West");
		p2.add(tf, "Center");
		
		setLayout(new BorderLayout());
		add(p1, "Center");
		add(p2, "South");

		p3.setLayout(new GridLayout(3, 1, 0, 10));
		p3.add(newG);
		p3.add(clear);
		p3.add(dap);
		p3.add(fontC);
		p3.add(exit);
		
		setLayout(new BorderLayout());
		add(p2, "Center");
		add(p3, "East");
		
		setBounds(300, 200, 300, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new BaseBall2();
	}
}
