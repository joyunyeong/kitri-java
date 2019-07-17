package com.kitri.awt.event;

import java.awt.*;
import java.awt.event.*;

public class itemTest extends Frame {
	Panel p1 = new Panel();
	Panel p2 = new Panel();
	Panel p3 = new Panel();
	
	CheckboxGroup cg = new CheckboxGroup();	
	Checkbox mor = new Checkbox("��ħ", cg, true);
	Checkbox aft = new Checkbox("����", cg, false);
	Checkbox eve = new Checkbox("����", cg, false);
	Checkbox app = new Checkbox("���", true);
	Checkbox banana = new Checkbox("�ٳ���");
	Checkbox straw = new Checkbox("����");
	//�Ƹ� üũ�ڽ� �׷�
	
	TextArea ta = new TextArea();
	
	Choice ch = new Choice();
	Button exit = new Button("����");
	
	ItemLogic itemLogic;
	
	public itemTest() {
		super("Item Test !!!");
		p1.setLayout(new GridLayout(2, 3, 10, 10));
		p1.add(mor);
		p1.add(aft);
		p1.add(eve); 
		p1.add(app);
		p1.add(banana);
		p1.add(straw);
		
		p2.setLayout(new BorderLayout(10, 0));
		ch.add("��ħ");
		ch.add("����");
		ch.add("����");
		p2.add(ch, "Center");
		p2.add(exit, "East");
		
		setLayout(new BorderLayout(0, 10));
		add(ta, "Center");
		add(p1,"North");
		add(p2, "South");
		
		setBounds(300, 200, 300, 400);
		setVisible(true);
		
// ���� event starts		
		itemLogic = new ItemLogic(this);
		
		exit.addActionListener(itemLogic); // ������ �� Ŭ�������� �ϰ� �����ϱ� this
										   // �ٸ� Ŭ�������� ������ ��� new itemTest()
		mor.addItemListener(itemLogic);
		aft.addItemListener(itemLogic);
		eve.addItemListener(itemLogic);
		app.addItemListener(itemLogic);
		banana.addItemListener(itemLogic);
		straw.addItemListener(itemLogic);
		ch.addItemListener(itemLogic);
	}
	public static void main(String[] args) {
		new itemTest();
	}
}
