package com.kitri.awt.event;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListTest extends Frame implements ActionListener{
	Panel p1 = new Panel();
	Panel p2 = new Panel();
	Panel p3 = new Panel();
	Panel p4 = new Panel();

	List listL = new List(20);
	List listR = new List(20, true);
	
	Button btR = new Button("▷");
	Button btRAll = new Button("▶");
	Button btL = new Button("◁");
	Button btLAll = new Button("◀");
	
	TextField tfL = new TextField();
	TextField tfR = new TextField();
	
	public ListTest() {
		p1.setLayout(new BorderLayout(0, 10));
		p1.add(listL, "Center");
		p1.add(tfL, "South");

		p2.setLayout(new GridLayout(6, 1, 0, 20));
		p2.add(new Label(""));
		p2.add(btR);
		p2.add(btRAll);
		p2.add(btL);
		p2.add(btLAll);
		
		p3.setLayout(new BorderLayout(0, 10));
		p3.add(listR, "Center");
		p3.add(tfR, "South");
		
		setLayout(new GridLayout(1,3,10,0));
		add(p1);
		add(p2);
		add(p3);
		
		setBounds(300, 200, 500, 400);
		setVisible(true);
		
		//event sourceGGHEE
		tfL.addActionListener(this);
		tfR.addActionListener(this);
		btL.addActionListener(this);
		btLAll.addActionListener(this);
		btR.addActionListener(this);
		btRAll.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		if(ob == tfL) {
//			1. tfL의 값 get해오기(유효성 검사)
			String tmp = tfL.getText().trim(); // 공백제거
			tfL.setText(""); // 왜 67라인 바로 밑으로 가면 안되는가
			if(tmp.isEmpty()) 
				return; // tmp가 비어있으면 다시 가서 검사해
//			2. listL에 추가
			listL.add(tmp);
			
		} else if(ob == btL) { 
			String tmp[] = listR.getSelectedItems();
			if(tmp == null)
				return;
			for (int i = 0; i < tmp.length; i++) {
				listL.add(tmp[i]);
				listR.remove(tmp[i]);
			}
			
		} else if(ob == tfR) {
			String tmp = tfR.getText().trim();
			tfR.setText("");
			if(tmp.isEmpty()) 
				return;
			listR.add(tmp);
			
		} else if(ob == btLAll) {
			String tmp[] = listR.getItems();
			int len = tmp.length;
			for (int i = 0; i < len; i++) 
				listL.add(tmp[i]);
			for (int i = len-1; i >= 0; i--) 
				listR.remove(i);
				
				
		} else if(ob == btR) {
//			1. listL에서 선택한 문자열 get
			String tmp = listL.getSelectedItem();
			if(tmp == null)
				return;
//			2. 1의 값을 listR에 추가
			listR.add(tmp);
//			3. 1의 값을 listL에서 제거
			listL.remove(tmp);
			
		} else if(ob == btRAll) {
//			1. listL의 값을 모두 get : 값이 여러개니 배열!
			String tmp[] = listL.getItems();
//			2. 1값을 listR에 모두 추가
			int len = tmp.length;
			for (int i = 0; i < len; i++) 
				listR.add(tmp[i]);
						
//			3. 1의 값을 LISTl에서 모두 제거
			for (int i = len-1; i >= 0; i--) {
				listL.remove(i);
				
//			listL.removeAll(); : 위에같은 방법도 꼭 필요!!
			}
		}
	}
	
	
	public static void main(String[] args) {
		new ListTest();
	}



}
