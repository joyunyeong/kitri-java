package com.kitri.awt.event;

import java.awt.Color;
import java.io.BufferedReader;
import java.util.Random;


//메소드

public class BaseBallService {
	
	BaseBallController baseBallController;
	private BaseBall bb;
	private FontColorChooser fcc;
	
	private int my[];
	private int com[];
	int gameLength;
	Random random = new Random();
	int count; //와일문이 없으니 새게임이 시작될때 선언
	int r, g, b;
	
	public BaseBallService(BaseBallController baseBallController) {
		//컨트롤러의 객체를 받음
		this.baseBallController = baseBallController;
		bb = baseBallController.baseBall; 
		fcc = bb.fontColorChooser;
		gameLength = 3;
		my = new int[gameLength];
		com = new int[gameLength];
		newGame();
		
	}

	public void newGame() {
		com[0] = random.nextInt(9) + 1; //0이 나오면 x
		
		do {
			com[1] = random.nextInt(10);
		}while(com[0] == com[1]);	
		do {
			com[2] = random.nextInt(10);
		}while(com[0] == com[2] || com[1] == com[2]);
		bb.tf.setEnabled(true);//새게임할때는 다시 입력가능하게
		clear();
		viewResult("새로운 게임을 시작합니다");
		count = 0; //다시 맞춘횟수 초기화 시켜주기
		System.out.println("컴터: " + com[0] + com[1] + com[2]);
	}
		

	public void clear() {
		bb.ta.setText(" ");//주소값접근//콜바이레퍼런스
	}

	public void showDap() {
		viewResult("정답은 " + com[0] + com[1] + com[2] + "입니다.");
		viewResult("새게임 또는 종료를 누르세요!!!\n");
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
		String myNumStr = bb.tf.getText().trim();//텍스트필드에서 받아서 스트링으로 주기?
		bb.tf.setText("");//바로 지워버려라
		
		if(myNumStr.length() != gameLength) { //아무것도 안치고 엔터쳤을때 오류 해결
			viewResult("3자리 숫자를 입력하세요");
			return;
		}
		
		if(!isNumber(myNumStr)) { //숫자가 아니라면
			viewResult("숫자만 입력하세요!!!!");
			return;
		}
		
		for(int i =0; i<gameLength; i++) {
			my[i] = myNumStr.charAt(i) - 48; //49가 나오니 -48을해주면 1
		}
		
		//숫자와 자리수비교
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
			viewResult(count + ". " + myNumStr +  "은 " + strike + "스트라이크 " + ball + "ball입니다.");
		}else {
			viewResult(myNumStr +  "은" + count + "번만에 정답입니다");
			viewResult("새게임 또는 종료를 누르세요!!!\n");
			bb.tf.setEnabled(false); //사용못하게 막기
		}
		
	}
	
	private void viewResult(String msg) {
		bb.ta.append(msg + "\n");
	}
	
	private boolean isNumber(String str) { //리턴타입이 불린일때는 get보다는 is
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
	int count = 0; // 이걸 생성자가 아니라 전역으로 빼는 이유는?
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
		viewResult("새로운 게임을 시작합니다.");
		count = 0;
		System.out.println("컴터 : " + com[0] + com[1] + com[2]);
	}

	public void clear() {
		bb.ta.setText(" ");
		// baseball.ta.setText 가 안되는 이유 : 그럼 font랑 딴걸 어쩔껀데
	}

	public void showDap() {
		viewResult("정답은 " + com[0] + com[1] + com[2] + "입니다.\n");
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
			viewResult("3자리 숫자를 입력하세요!!!");
			return;
		}

		if (!isNumber(myNumStr)) {
			viewResult("숫자만 입력하세요\n");
			return;
		}

		for (int i = 0; i < gameLength; i++) // null은 아님 String이기 때문에 비어있는 문자열 리턴!
			my[i] = myNumStr.charAt(i) - 48;

		for (int m = 0; m < gameLength; m++) {
			for (int c = 0; c < gameLength; c++) {
				if (my[m] == com[c]) { // 같은 숫자라면
					if (m == c)
						strike++;
					else
						ball++;
				}
			}
		}
		count++;

		if (strike != gameLength) {
			bb.ta.append(count + ". " + myNumStr + "은 " + strike + "스트라이크 " + ball + "볼입니다.\n");
		} else {
//			bb.ta.append(myNumStr + "을 " + count + "번만에 정답입니다.\n");
			viewResult(myNumStr + "을 " + count + "번만에 정답입니다.\n");
//			bb.ta.append("새게임 또는 종료를 누르세요.\n");
			viewResult("새게임 또는 종료를 누르세요.\n");
			bb.tf.setEnabled(false);
		}
	}

	private void viewResult(String msg) {
		bb.ta.append(msg + "\n");
	}

	private boolean isNumber(String str) { // return tyype이 boolean일 때 is 많이씀
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