package com.kitri.awt.event;

import java.awt.*;

public class BaseBall extends Frame {
	// ������

	// �г�3��
	Panel pC = new Panel();
	Panel pCS = new Panel();
	Panel pE = new Panel();

	TextArea ta = new TextArea();
	Label l = new Label("�Է�");
	TextField tf = new TextField();

	Button newG = new Button("������");
	Button clear = new Button("�����");
	Button dap = new Button("����");
	Button fontC = new Button("���ڻ�");
	Button exit = new Button("����");

	// ���̽�������ѷ� ȣ��
	BaseBallController baseballController;
	FontColorChooser fontColorChooser = new FontColorChooser();

	public BaseBall() {
		super("���ھ߱�����");
		// ��ġ��

		// ���� �Ʒ�
		pCS.setLayout(new BorderLayout(10, 0));
		pCS.add(l, "West");
		pCS.add(tf, "Center");

		// ���� ��ġ��
		pC.setLayout(new BorderLayout(0, 10));
		pC.add(pCS, "South");

		pC.add(ta, "Center");

		// ������ ����
		pE.setLayout(new GridLayout(5, 1));
		pE.add(newG);
		pE.add(clear);
		pE.add(dap);
		pE.add(fontC);
		pE.add(exit);

		// ���� ��ġ��
		setLayout(new BorderLayout(10, 10));
		add(pC, "Center");
		add(pE, "East");

		setBounds(300, 200, 300, 500);
		setVisible(true);

		baseballController = new BaseBallController(this); // �ڱ��ڽ��ǰ�ü �����ֱ�

		tf.addActionListener(baseballController); // �������ֱ�
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
		// fontColorChooser â �������� ����ٰ� windowlister�ؼ� ������ �ȵ�
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
 * TextArea ta = new TextArea(); Label l = new Label("�Է�"); TextField tf = new
 * TextField();
 * 
 * Button newG = new Button("������"); Button clear = new Button("�����"); Button dap
 * = new Button("����"); Button fontC = new Button("���ڻ�"); Button exit = new
 * Button("����");
 * 
 * BaseBallController baseballController; FontColorChooser fontColorChooser =
 * new FontColorChooser(); // has a ���迩�� ����� ���� ���� ��ü ���� //��ü�� � ������ �ϴ��� �̰͵�
 * �߿�!! public BaseBall() { super("���ھ߱�����"); pCS.setLayout(new BorderLayout(10,
 * 0)); pCS.add(l, "West"); pCS.add(tf, "Center");
 * 
 * pC.setLayout(new BorderLayout(0, 10)); pC.add(pCS, "South"); ta.setText("");
 * ta.setEditable(false); //��������X // ta.setEnabled(false); ���� �ٸ� pC.add(ta,
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
 * // BaseBall â �̺�Ʈ ��� tf.addActionListener(baseballController);
 * newG.addActionListener(baseballController);
 * clear.addActionListener(baseballController);
 * dap.addActionListener(baseballController);
 * fontC.addActionListener(baseballController);
 * exit.addActionListener(baseballController);
 * 
 * // FontColorChooserâ �̺�Ʈ ���
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
