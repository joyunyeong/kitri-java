package com.kitri.awt.event;

import java.awt.*;
import java.awt.event.*;

public class FontColorChooser extends Frame {
	//선언부
	
	//패널6개 필요
	Panel p1 = new Panel();
	Panel p11 = new Panel();
	Panel p12 = new Panel();
	Panel p13 = new Panel();
	Panel p2 = new Panel();
	Panel p21 = new Panel();
	
	Label lR = new Label("빨강", Label.CENTER);
	Label lG = new Label("초록", Label.CENTER);
	Label lB = new Label("파랑", Label.CENTER);
	
	Scrollbar sbR = new Scrollbar(Scrollbar.HORIZONTAL, 127, 10, 0, 265); //초기값,두께,최소값,최대값
	Scrollbar sbG = new Scrollbar(Scrollbar.HORIZONTAL, 127, 10, 0, 265); //색깔은 255색이 최대이지만 바 길이가10이니 +10
	Scrollbar sbB = new Scrollbar(Scrollbar.HORIZONTAL, 127, 10, 0, 265);
	
	Panel colorP = new Panel();
	Label colorL = new Label();
	Button ok = new Button("확인");

	Color color = new Color(153, 56, 156);
	
	public FontColorChooser() {
		super("색상표");
		//배치부
		p11.setLayout(new BorderLayout(10,0));
		lR.setBackground(color.red);
		p11.add(lR, "West");
		p11.add(sbR, "Center");
		
		p12.setLayout(new BorderLayout(10,0));
		lG.setBackground(color.green);
		p12.add(lG, "West");
		p12.add(sbG, "Center");
		
		p13.setLayout(new BorderLayout(10,0));
		lB.setBackground(color.blue);
		p13.add(lB, "West");
		p13.add(sbB, "Center");
		
		p1.setLayout(new GridLayout(6,1));
		p1.add(new Label(""));
		p1.add(p11);
		p1.add(p12);
		p1.add(p13);
		
		p21.setLayout(new BorderLayout());
		p21.add(colorL, "Center");
		p21.add(ok, "East");
		
		p2.setLayout(new BorderLayout());
		p2.add(colorP, "Center");
		p2.add(p21, "South");
		

		setLayout(new GridLayout(1,2, 10, 0));
		add(p1);
		add(p2);
		
		
		setBounds(300, 200, 500, 300);
		
		addWindowListener(new WindowAdapter() {  //이 기능은 이놈한테만 하는것이기 때문에 여기서만 구현하도록 여기다가 적음
											   	// 추상메소드 오버라이드
			@Override
			public void windowClosing(WindowEvent e) {
				setVisible(false);
				}
				
			}
		);
	
		
	}
	
//	@Override
//	public void adjustmentValueChanged(AdjustmentEvent e) {	
//		changeColor();
//		
//	}


	
	//단독적으로 실행하는 클래스가 아니므로 메인이 없다.
	//야구에서 컬러를 선택해야지만 뜬다

}

/*package com.kitri.awt.event;

import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class FontColorChooser extends Frame{
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

	public FontColorChooser() {
		p1.setLayout(new BorderLayout(10, 0));
		lR.setBackground(Color.red);
		p1.add(lR, "West");
		p1.add(sbR, "Center");
		
		p2.setLayout(new BorderLayout(10, 0));
		lG.setBackground(Color.green);
		p2.add(lG, "West");
		p2.add(sbG, "Center");

		p3.setLayout(new BorderLayout(10, 0));
		lB.setBackground(Color.blue);
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
		
		setBounds(300, 200, 500, 300);
	
	}


}
*/

