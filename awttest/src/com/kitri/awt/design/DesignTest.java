package com.kitri.awt.design;

import java.awt.*; // windows > preference > java > code style > organize imports에서 3으로 수정

// 1. Frame 상속
// 2. 선언부에 필요한 객체 생성
// 3. 배치부(생성자)에서 design : component 배치
// 작업은 小  → 大 순으로 하는것이 좋음

public class DesignTest extends Frame {
	// 선언부
	
	Panel pN = new Panel(); // 일반적으로 먼저 디폴트 생성자만 만들고 LM는 DT()에 만듬
	Panel pS = new Panel();
	
	Label l = new Label("입력", Label.CENTER);
	TextField tf = new TextField();
	Button send = new Button("전송");
	
	TextArea ta = new TextArea();
	
	Choice ch = new Choice();
	Button exit = new Button("종료");
	
	
	public DesignTest() {
	//배치부
		super("Design Test !!!");
		pN.setLayout(new BorderLayout(10, 0));
		l.setBackground(new Color(210,10,25));
//		l.setForeground(new Color(0,0,255)); // 글자
		l.setForeground(Color.orange);	// field에서 갖다써도됨
		Font f = new Font("굴림", Font.BOLD, 20);
		l.setFont(f);
		send.setFont(f);
		pN.add(l, "West");
		pN.add(tf, "Center");
		pN.add(send, "East");
		pS.setLayout(new GridLayout(1, 2, 10, 0));
		ch.add("서울");
		ch.add("경기/인천");
		ch.add("강원");
		ch.add("충청");
		pS.add(ch);
		pS.add(exit);
		
		setLayout(new BorderLayout(0, 10));
		add(pN, "North");
		add(ta, "Center");
		add(pS, BorderLayout.SOUTH);
	
//		setSize(300, 400);
//		setLocation(1000, 200);
		setBounds(300, 200, 300, 400); // 위에 있는걸 합쳐놓은것
		setResizable(false);
		setVisible(true); // Class Windows에 있음 > 항상 마지막에 쓸 것!!!
	}
	
	public static void main(String[] args) {
		new DesignTest(); // 그냥 생성자만 호출해도됨 : 익명으로 객체생성 가능 > 메소드를 호출할일이 없으니까
	}
}
