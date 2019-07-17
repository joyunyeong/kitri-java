package com.kitri.awt.event;

import java.awt.*;
import java.awt.event.*;

public class itemTest extends Frame {
	Panel p1 = new Panel();
	Panel p2 = new Panel();
	Panel p3 = new Panel();
	
	CheckboxGroup cg = new CheckboxGroup();	
	Checkbox mor = new Checkbox("아침", cg, true);
	Checkbox aft = new Checkbox("점심", cg, false);
	Checkbox eve = new Checkbox("저녁", cg, false);
	Checkbox app = new Checkbox("사과", true);
	Checkbox banana = new Checkbox("바나나");
	Checkbox straw = new Checkbox("딸기");
	//아마 체크박스 그룹
	
	TextArea ta = new TextArea();
	
	Choice ch = new Choice();
	Button exit = new Button("종료");
	
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
		ch.add("아침");
		ch.add("점심");
		ch.add("저녁");
		p2.add(ch, "Center");
		p2.add(exit, "East");
		
		setLayout(new BorderLayout(0, 10));
		add(ta, "Center");
		add(p1,"North");
		add(p2, "South");
		
		setBounds(300, 200, 300, 400);
		setVisible(true);
		
// 이제 event starts		
		itemLogic = new ItemLogic(this);
		
		exit.addActionListener(itemLogic); // 지금은 이 클래스에서 하고 있으니까 this
										   // 다른 클래스에서 구현할 경우 new itemTest()
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
