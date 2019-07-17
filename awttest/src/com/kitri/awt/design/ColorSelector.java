package com.kitri.awt.design;

import java.awt.*;

public class ColorSelector extends Frame {
	Panel p1 = new Panel();
	Panel p2 = new Panel();
	Panel p3 = new Panel();
	Panel p4 = new Panel();
	Panel p5 = new Panel();
	Panel p6 = new Panel();

	Label lR = new Label("빨강");
	Label lG = new Label("초록");
	Label lB = new Label("파랑");
	Scrollbar sbR = new Scrollbar(Scrollbar.HORIZONTAL, 127, 10, 0, 265);
	Scrollbar sbG = new Scrollbar(Scrollbar.HORIZONTAL, 127, 10, 0, 265);
	Scrollbar sbB = new Scrollbar(Scrollbar.HORIZONTAL, 127, 10, 0, 265);
	// 265인 이유는 바 길이가 10이기 때문에 그 만큼 늘려야한다.
	// 127인 이유는 265의 정가운데에 막대바의 크기 반만큼을 뺀다.

	Panel colorP = new Panel();
	Label colorL = new Label();
	Button ok = new Button("선택");

	public ColorSelector() {
		p1.setLayout(new BorderLayout(10, 0));
		p1.add(lR, "West");
		p1.add(sbR, "Center");
		
		p2.setLayout(new BorderLayout(10, 0));
		p2.add(lG, "West");
		p2.add(sbG, "Center");

		p3.setLayout(new BorderLayout(10, 0));
		p3.add(lB, "West");
		p3.add(sbB, "Center");

		setLayout(new GridLayout());
		p4.add(p1);
		p4.add(p2);
		p4.add(p3);
		
		p5.setLayout(new BorderLayout());
		p5.add(colorL, "Center");
		p5.add(ok, "East");
		
		p6.setLayout(new BorderLayout());
		p6.add(colorP, "Center");
		p6.add(p5, "South");
		
		setLayout(new GridLayout(1,2,10,0));
		add(p4);
		add(p6);
		
		setBounds(300, 200, 300, 300);
		setVisible(true);

		int r = sbR.getValue();
		int g = sbG.getValue();
		int b = sbB.getValue();
		
		colorP.setBackground(new Color(r, g, b));
		colorL.setText("r + " + r + " g = " + g + " b = " + b);
	}

	public static void main(String[] args) {
		new ColorSelector();
	}
}
