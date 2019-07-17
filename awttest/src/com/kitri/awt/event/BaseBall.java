package com.kitri.awt.event;

import java.awt.*;

public class BaseBall extends Frame {
	// 생성부

	// 패널3개
	Panel pC = new Panel();
	Panel pCS = new Panel();
	Panel pE = new Panel();

	TextArea ta = new TextArea();
	Label l = new Label("입력");
	TextField tf = new TextField();

	Button newG = new Button("새게임");
	Button clear = new Button("지우기");
	Button dap = new Button("정답");
	Button fontC = new Button("글자색");
	Button exit = new Button("종료");

	// 베이스볼컨드롤러 호출
	BaseBallController baseballController;
	FontColorChooser fontColorChooser = new FontColorChooser();

	public BaseBall() {
		super("숫자야구게임");
		// 배치부

		// 왼쪽 아래
		pCS.setLayout(new BorderLayout(10, 0));
		pCS.add(l, "West");
		pCS.add(tf, "Center");

		// 왼쪽 합치기
		pC.setLayout(new BorderLayout(0, 10));
		pC.add(pCS, "South");

		pC.add(ta, "Center");

		// 오른쪽 설정
		pE.setLayout(new GridLayout(5, 1));
		pE.add(newG);
		pE.add(clear);
		pE.add(dap);
		pE.add(fontC);
		pE.add(exit);

		// 최종 합치기
		setLayout(new BorderLayout(10, 10));
		add(pC, "Center");
		add(pE, "East");

		setBounds(300, 200, 300, 500);
		setVisible(true);

		baseballController = new BaseBallController(this); // 자기자신의객체 던져주기

		tf.addActionListener(baseballController); // 연결해주기
		newG.addActionListener(baseballController);
		clear.addActionListener(baseballController);
		dap.addActionListener(baseballController);
		fontC.addActionListener(baseballController);
		exit.addActionListener(baseballController);

		this.addWindowListener(baseballController);

		fontColorChooser.sbR.addAdjustmentListener(baseballController);
		fontColorChooser.sbG.addAdjustmentListener(baseballController);
		fontColorChooser.sbB.addAdjustmentListener(baseballController);

		fontColorChooser.ok.addActionListener(baseballController);
		// fontColorChooser 창 닫으려면 여기다가 windowlister해서 닫으면 안됨
	}

	public static void main(String[] args) {
		new BaseBall();
	}

}

/*
 * package com.kitri.awt.event;
 * 
 * import java.awt.*; import java.awt.event.AdjustmentListener;
 * 
 * public class BaseBall extends Frame {
 * 
 * Panel pC = new Panel(); Panel pCS = new Panel(); Panel pE = new Panel();
 * 
 * TextArea ta = new TextArea(); Label l = new Label("입력"); TextField tf = new
 * TextField();
 * 
 * Button newG = new Button("새게임"); Button clear = new Button("지우기"); Button dap
 * = new Button("정답"); Button fontC = new Button("글자색"); Button exit = new
 * Button("종료");
 * 
 * BaseBallController baseballController; FontColorChooser fontColorChooser =
 * new FontColorChooser(); // has a 관계여서 여기다 넣음 새로 객체 생성 //객체를 몇개 만들어야 하는지 이것도
 * 중요!! public BaseBall() { super("숫자야구게임"); pCS.setLayout(new BorderLayout(10,
 * 0)); pCS.add(l, "West"); pCS.add(tf, "Center");
 * 
 * pC.setLayout(new BorderLayout(0, 10)); pC.add(pCS, "South"); ta.setText("");
 * ta.setEditable(false); //수정가능X // ta.setEnabled(false); 위랑 다름 pC.add(ta,
 * "Center");
 * 
 * pE.setLayout(new GridLayout(5,1,0,10)); pE.add(newG); pE.add(clear);
 * pE.add(dap); pE.add(fontC); pE.add(exit);
 * 
 * setLayout(new BorderLayout(10,0)); add(pC,"Center"); add(pE, "East");
 * 
 * setBounds(300, 200, 500, 400); setVisible(true);
 * 
 * baseballController = new BaseBallController(this);
 * 
 * // BaseBall 창 이벤트 등록 tf.addActionListener(baseballController);
 * newG.addActionListener(baseballController);
 * clear.addActionListener(baseballController);
 * dap.addActionListener(baseballController);
 * fontC.addActionListener(baseballController);
 * exit.addActionListener(baseballController);
 * 
 * // FontColorChooser창 이벤트 등록
 * fontColorChooser.sbR.addAdjustmentListener((AdjustmentListener)
 * baseballController);
 * fontColorChooser.sbG.addAdjustmentListener((AdjustmentListener)
 * baseballController);
 * fontColorChooser.sbB.addAdjustmentListener((AdjustmentListener)
 * baseballController);
 * 
 * fontColorChooser.ok.addActionListener(baseballController); }
 * 
 * public static void main(String[] args) { new BaseBall(); }
 * 
 * }
 */
