package com.kitri.awt.event;

import java.awt.Color;
import java.io.BufferedReader;
import java.util.Random;


//�޼ҵ�

public class BaseBallService {
	
	BaseBallController baseBallController;
	private BaseBall bb;
	private FontColorChooser fcc;
	
	private int my[];
	private int com[];
	int gameLength;
	Random random = new Random();
	int count; //���Ϲ��� ������ �������� ���۵ɶ� ����
	int r, g, b;
	
	public BaseBallService(BaseBallController baseBallController) {
		//��Ʈ�ѷ��� ��ü�� ����
		this.baseBallController = baseBallController;
		bb = baseBallController.baseBall; 
		fcc = bb.fontColorChooser;
		gameLength = 3;
		my = new int[gameLength];
		com = new int[gameLength];
		newGame();
		
	}

	public void newGame() {
		com[0] = random.nextInt(9) + 1; //0�� ������ x
		
		do {
			com[1] = random.nextInt(10);
		}while(com[0] == com[1]);	
		do {
			com[2] = random.nextInt(10);
		}while(com[0] == com[2] || com[1] == com[2]);
		bb.tf.setEnabled(true);//�������Ҷ��� �ٽ� �Է°����ϰ�
		clear();
		viewResult("���ο� ������ �����մϴ�");
		count = 0; //�ٽ� ����Ƚ�� �ʱ�ȭ �����ֱ�
		System.out.println("����: " + com[0] + com[1] + com[2]);
	}
		

	public void clear() {
		bb.ta.setText(" ");//�ּҰ�����//�ݹ��̷��۷���
	}

	public void showDap() {
		viewResult("������ " + com[0] + com[1] + com[2] + "�Դϴ�.");
		viewResult("������ �Ǵ� ���Ḧ ��������!!!\n");
		bb.tf.setEnabled(false); 
		
	}

	public void fontColorChange() {
		fcc.setVisible(true);
		changeColor();
	}

	public void exit() {
		System.exit(0);
		
	}

	public void game() {

		int strike = 0;
		int ball = 0;
		String myNumStr = bb.tf.getText().trim();//�ؽ�Ʈ�ʵ忡�� �޾Ƽ� ��Ʈ������ �ֱ�?
		bb.tf.setText("");//�ٷ� ����������
		
		if(myNumStr.length() != gameLength) { //�ƹ��͵� ��ġ�� ���������� ���� �ذ�
			viewResult("3�ڸ� ���ڸ� �Է��ϼ���");
			return;
		}
		
		if(!isNumber(myNumStr)) { //���ڰ� �ƴ϶��
			viewResult("���ڸ� �Է��ϼ���!!!!");
			return;
		}
		
		for(int i =0; i<gameLength; i++) {
			my[i] = myNumStr.charAt(i) - 48; //49�� ������ -48�����ָ� 1
		}
		
		//���ڿ� �ڸ�����
		for(int i = 0; i<3; i++) {
			for(int j =0; j<3; j++) {
				if(com[i] == my[j]) {
					if(i == j) {
						strike += 1;
					}else {
						ball += 1;
					}
				}
			}
		}
		count++;
		
		if (strike != gameLength) {
			viewResult(count + ". " + myNumStr +  "�� " + strike + "��Ʈ����ũ " + ball + "ball�Դϴ�.");
		}else {
			viewResult(myNumStr +  "��" + count + "������ �����Դϴ�");
			viewResult("������ �Ǵ� ���Ḧ ��������!!!\n");
			bb.tf.setEnabled(false); //�����ϰ� ����
		}
		
	}
	
	private void viewResult(String msg) {
		bb.ta.append(msg + "\n");
	}
	
	private boolean isNumber(String str) { //����Ÿ���� �Ҹ��϶��� get���ٴ� is
		boolean flag = true;
		for (int i = 0; i < gameLength; i++) {
			int num = str.charAt(i) - 48;
			if(num < 0 || num > 9) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	
		public void changeColor() {
		r = fcc.sbR.getValue();
		g = fcc.sbG.getValue();
		b = fcc.sbB.getValue();
		fcc.colorP.setBackground(new Color(r, g, b));
		fcc.colorL.setText("r = " + r + "g = " + g + "b = " + b);
	}

	public void selectColor() {
		bb.ta.setForeground(new Color(r, g, b));
		fcc.setVisible(false);	
	}
}

/*package com.kitri.awt.event;

import java.awt.Color;
import java.io.BufferedReader;
import java.util.Random;

public class BaseBallService {

	BaseBallController baseBallController;
	private BaseBall bb;
	private FontColorChooser fcc;

	private int my[] = new int[3];
	private int com[] = new int[3];
	int comNum;
	int gameLength = 0;
	Random random = new Random();
	int count = 0; // �̰� �����ڰ� �ƴ϶� �������� ���� ������?
	int r,g,b;

	public BaseBallService(BaseBallController baseBallController) {
		this.baseBallController = baseBallController;
		fcc = bb.fontColorChooser;
		bb = baseBallController.baseBall;
		gameLength = 3;
		my = new int[gameLength];
		com = new int[gameLength];
		newGame();
	}

	public void newGame() {
		com[0] = random.nextInt(9) + 1;
		do {
			com[1] = random.nextInt(10);
		} while (com[0] == com[1]);
		do {
			com[2] = random.nextInt(10);
		} while (com[0] == com[2] || com[1] == com[2]);
		bb.tf.setEnabled(true);
		clear();
		viewResult("���ο� ������ �����մϴ�.");
		count = 0;
		System.out.println("���� : " + com[0] + com[1] + com[2]);
	}

	public void clear() {
		bb.ta.setText(" ");
		// baseball.ta.setText �� �ȵǴ� ���� : �׷� font�� ���� ��¿����
	}

	public void showDap() {
		viewResult("������ " + com[0] + com[1] + com[2] + "�Դϴ�.\n");
	}

	public void exit() {
		System.exit(0);
	}

	public void fontColorChange() {
		fcc.setVisible(true);
		changeColor();
	}

	public void game() {
		int strike = 0;
		int ball = 0;
		String myNumStr = bb.tf.getText().trim();
		bb.tf.setText("");

		if (myNumStr.length() != gameLength) {
			viewResult("3�ڸ� ���ڸ� �Է��ϼ���!!!");
			return;
		}

		if (!isNumber(myNumStr)) {
			viewResult("���ڸ� �Է��ϼ���\n");
			return;
		}

		for (int i = 0; i < gameLength; i++) // null�� �ƴ� String�̱� ������ ����ִ� ���ڿ� ����!
			my[i] = myNumStr.charAt(i) - 48;

		for (int m = 0; m < gameLength; m++) {
			for (int c = 0; c < gameLength; c++) {
				if (my[m] == com[c]) { // ���� ���ڶ��
					if (m == c)
						strike++;
					else
						ball++;
				}
			}
		}
		count++;

		if (strike != gameLength) {
			bb.ta.append(count + ". " + myNumStr + "�� " + strike + "��Ʈ����ũ " + ball + "���Դϴ�.\n");
		} else {
//			bb.ta.append(myNumStr + "�� " + count + "������ �����Դϴ�.\n");
			viewResult(myNumStr + "�� " + count + "������ �����Դϴ�.\n");
//			bb.ta.append("������ �Ǵ� ���Ḧ ��������.\n");
			viewResult("������ �Ǵ� ���Ḧ ��������.\n");
			bb.tf.setEnabled(false);
		}
	}

	private void viewResult(String msg) {
		bb.ta.append(msg + "\n");
	}

	private boolean isNumber(String str) { // return tyype�� boolean�� �� is ���̾�
		boolean flag = true;
		for (int i = 0; i < gameLength; i++) {
			int num = str.charAt(i) - 48;
			if (num < 0 || num > 9) {
				flag = false;
				break;
			}
		}
		return flag;
	}
	public void changeColor() {
		r = fcc.sbR.getValue();
		g = fcc.sbG.getValue();
		b = fcc.sbB.getValue();	
		fcc.colorP.setBackground(new Color(r, g, b));
//		bb.fontColorChooser.colorL.setText("r + " + r + " g = " + g + " b = " + b);
		fcc.colorL.setText("r + " + r + " g = " + g + " b = " + b);
	}

	public void selectColor() {
		bb.ta.setForeground(new Color(r, g, b));
		fcc.setVisible(false);
	}
}
*
*/