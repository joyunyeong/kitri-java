package com.kitry.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/*
0. com, my 3자리 배열
1. com - 세자리 난수 발생 >> comRandom() 배열로하자!!
2. 숫자는 중복 숫자 x
     0으로 시작 x
3. 내가 입력한 3자리 숫자를 my 배열에 넣기
4. 숫자와 자리비교
5. 숫자가 같다면 
  5-1 : 자리수 같다면 strike 증가
  5-2 : 자리수 다르다면 ball 증가
6. 5의 결과
 6-1 : strike가 3이면
 	   xxx는 x번째만에 정답입니다.
               계속(1), 종료(0) :
 6-2 : strike가 3이 아니라면
  	xxx는 x스트라이크 x볼입니다. >> 3번으로 (다시 입력해라)
*/
public class NumberBaseBall {
	private int my[] = new int[3];
	private int com[] = new int[3];
	int comNum;
	BufferedReader in;
	int gameLength = 0;

	public NumberBaseBall() { // 생성자
		gameLength = 3;
		my = new int[gameLength];
		com = new int[gameLength];
		comRandom();
		in = new BufferedReader(new InputStreamReader(System.in));
	}

	private void comRandom() {
		int len = com.length;

		do {
			com[0] = (int) (Math.random() * 9);
			com[1] = (int) (Math.random() * 9);
			com[2] = (int) (Math.random() * 9);
		} while (com[0] == com[1] || com[0] == com[2] || com[1] == com[2]);
	}

	private void game() {
		int count =0;
		int strike;
		int ball;
		while (true) {
			strike=0;
			ball=0;
//			comRandom(); 왜 comrandom을 쓸 수 없는가?
			System.out.println("[" + com[0] + "]" + "[" + com[1] + "]" + "[" + com[2] + "]");
			System.out.print("숫자를 입력하시오 : ");
			int myNum = getNumber();
			
			my[0] = myNum / 100; // 1
			my[1] = myNum / 10 % 10; // 4
			my[2] = myNum % 10; // 9

			System.out.println("[" + my[0] + "]" + "[" + my[1] + "]" + "[" + my[2] + "]");

			for (int m = 0; m < gameLength; m++) {
				for (int c = 0; c < gameLength; c++) {
					if (my[m] == com[c]) { // 같은 숫자라면
						if(m==c)
							strike++;
						else
							ball++;
					}
				}
			}
			count++;
						
					
			if(strike ==3) {
				System.out.println(myNum + "을 " + count + "번만에 정답입니다.");
				System.out.print("계속(1), 종료(0) :");
				int num = getNumber();
				if (num ==1) {
					comRandom();
					}
				else
					System.exit(0);
				}
			}
			// 숫자와 자리수 비교

			// 결과 뿌리기
//			if(strike != 3)
//			
//				else
		}
	

	private int getNumber() {
		int num = 0;
		try {
			num = Integer.parseInt(in.readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return num;
	}

	// main!!!!!!!!!!!!!!!!!!
	public static void main(String[] args) {
		NumberBaseBall nbb = new NumberBaseBall();
		nbb.game();
	}
}
