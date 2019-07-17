package com.kitri.awt.design;

import java.awt.*; // windows > preference > java > code style > organize imports���� 3���� ����

// 1. Frame ���
// 2. ����ο� �ʿ��� ��ü ����
// 3. ��ġ��(������)���� design : component ��ġ
// �۾��� �  �� �� ������ �ϴ°��� ����

public class DesignTest extends Frame {
	// �����
	
	Panel pN = new Panel(); // �Ϲ������� ���� ����Ʈ �����ڸ� ����� LM�� DT()�� ����
	Panel pS = new Panel();
	
	Label l = new Label("�Է�", Label.CENTER);
	TextField tf = new TextField();
	Button send = new Button("����");
	
	TextArea ta = new TextArea();
	
	Choice ch = new Choice();
	Button exit = new Button("����");
	
	
	public DesignTest() {
	//��ġ��
		super("Design Test !!!");
		pN.setLayout(new BorderLayout(10, 0));
		l.setBackground(new Color(210,10,25));
//		l.setForeground(new Color(0,0,255)); // ����
		l.setForeground(Color.orange);	// field���� ���ٽᵵ��
		Font f = new Font("����", Font.BOLD, 20);
		l.setFont(f);
		send.setFont(f);
		pN.add(l, "West");
		pN.add(tf, "Center");
		pN.add(send, "East");
		pS.setLayout(new GridLayout(1, 2, 10, 0));
		ch.add("����");
		ch.add("���/��õ");
		ch.add("����");
		ch.add("��û");
		pS.add(ch);
		pS.add(exit);
		
		setLayout(new BorderLayout(0, 10));
		add(pN, "North");
		add(ta, "Center");
		add(pS, BorderLayout.SOUTH);
	
//		setSize(300, 400);
//		setLocation(1000, 200);
		setBounds(300, 200, 300, 400); // ���� �ִ°� ���ĳ�����
		setResizable(false);
		setVisible(true); // Class Windows�� ���� > �׻� �������� �� ��!!!
	}
	
	public static void main(String[] args) {
		new DesignTest(); // �׳� �����ڸ� ȣ���ص��� : �͸����� ��ü���� ���� > �޼ҵ带 ȣ�������� �����ϱ�
	}
}
