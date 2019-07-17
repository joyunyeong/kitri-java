package com.kitri.awt.event;

import java.awt.Checkbox;
import java.awt.event.*;

public class ItemLogic implements ItemListener, ActionListener { // 상속이 말이 안되는 이유는 itemTest에서 ItemLogic을 계속 호출
	itemTest itemTest;// 따라서 itemTest 객체 생성
	
	
	public ItemLogic(itemTest itemTest) {
		this.itemTest = itemTest;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		Object ob = e.getSource(); // object 비교때는 == 하지말것 : 주소값 비교면 ㅇㅋ!
		if(ob == itemTest.ch) {
			String str = itemTest.ch.getSelectedItem();
			if(str.equals("아침")) {
				itemTest.mor.setState(true);
			} else if(str.equals("점심")) {
				itemTest.aft.setState(true);
			} else {
				itemTest.eve.setState(true);
			}
		}
		
		Checkbox sel = itemTest.cg.getSelectedCheckbox();
		String selStr = sel.getLabel();
//		System.out.println(selStr);
		itemTest.ta.setText("--- " + selStr + " ---" + "\n"); //위에꺼만 최종
		itemTest.ta.append("1. 사과 : " + eat(itemTest.app.getState()) + "\n");
		itemTest.ta.append("2. 바나나 : "+ eat(itemTest.banana.getState()) + "\n");
		itemTest.ta.append("3. 딸기 : " + eat(itemTest.straw.getState()) + "\n"); // 3항연산자 계속 쓰면 좋지 않음 차라리 메소드를 만들어라
		itemTest.ch.select(selStr);
	}
	private String eat(boolean flag) {
		return flag?"먹었다.":"안먹었다.";
	}

}
