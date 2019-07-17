package com.kitri.awt.event;

import java.awt.*;
import java.awt.event.*;

public class FontColorChooser extends Frame {
	//�����
	
	//�г�6�� �ʿ�
	Panel p1 = new Panel();
	Panel p11 = new Panel();
	Panel p12 = new Panel();
	Panel p13 = new Panel();
	Panel p2 = new Panel();
	Panel p21 = new Panel();
	
	Label lR = new Label("����", Label.CENTER);
	Label lG = new Label("�ʷ�", Label.CENTER);
	Label lB = new Label("�Ķ�", Label.CENTER);
	
	Scrollbar sbR = new Scrollbar(Scrollbar.HORIZONTAL, 127, 10, 0, 265); //�ʱⰪ,�β�,�ּҰ�,�ִ밪
	Scrollbar sbG = new Scrollbar(Scrollbar.HORIZONTAL, 127, 10, 0, 265); //������ 255���� �ִ������� �� ���̰�10�̴� +10
	Scrollbar sbB = new Scrollbar(Scrollbar.HORIZONTAL, 127, 10, 0, 265);
	
	Panel colorP = new Panel();
	Label colorL = new Label();
	Button ok = new Button("Ȯ��");

	Color color = new Color(153, 56, 156);
	
	public FontColorChooser() {
		super("����ǥ");
		//��ġ��
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
		
		addWindowListener(new WindowAdapter() {  //�� ����� �̳����׸� �ϴ°��̱� ������ ���⼭�� �����ϵ��� ����ٰ� ����
											   	// �߻�޼ҵ� �������̵�
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


	
	//�ܵ������� �����ϴ� Ŭ������ �ƴϹǷ� ������ ����.
	//�߱����� �÷��� �����ؾ����� ���

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

	Label lR = new Label("����");
	Label lG = new Label("�ʷ�");
	Label lB = new Label("�Ķ�");
	Scrollbar sbR = new Scrollbar(Scrollbar.HORIZONTAL, 127, 10, 0, 265);
	Scrollbar sbG = new Scrollbar(Scrollbar.HORIZONTAL, 127, 10, 0, 265);
	Scrollbar sbB = new Scrollbar(Scrollbar.HORIZONTAL, 127, 10, 0, 265);
	// 265�� ������ �� ���̰� 10�̱� ������ �� ��ŭ �÷����Ѵ�.
	// 127�� ������ 265�� ������� ������� ũ�� �ݸ�ŭ�� ����.

	Panel colorP = new Panel();
	Label colorL = new Label();
	Button ok = new Button("����");

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

