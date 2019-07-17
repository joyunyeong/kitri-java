package com.kitry.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/*
0. com, my 3�ڸ� �迭
1. com - ���ڸ� ���� �߻� >> comRandom() �迭������!!
2. ���ڴ� �ߺ� ���� x
     0���� ���� x
3. ���� �Է��� 3�ڸ� ���ڸ� my �迭�� �ֱ�
4. ���ڿ� �ڸ���
5. ���ڰ� ���ٸ� 
  5-1 : �ڸ��� ���ٸ� strike ����
  5-2 : �ڸ��� �ٸ��ٸ� ball ����
6. 5�� ���
 6-1 : strike�� 3�̸�
 	   xxx�� x��°���� �����Դϴ�.
               ���(1), ����(0) :
 6-2 : strike�� 3�� �ƴ϶��
  	xxx�� x��Ʈ����ũ x���Դϴ�. >> 3������ (�ٽ� �Է��ض�)
*/
public class NumberBaseBall {
	private int my[] = new int[3];
	private int com[] = new int[3];
	int comNum;
	BufferedReader in;
	int gameLength = 0;

	public NumberBaseBall() { // ������
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
//			comRandom(); �� comrandom�� �� �� ���°�?
			System.out.println("[" + com[0] + "]" + "[" + com[1] + "]" + "[" + com[2] + "]");
			System.out.print("���ڸ� �Է��Ͻÿ� : ");
			int myNum = getNumber();
			
			my[0] = myNum / 100; // 1
			my[1] = myNum / 10 % 10; // 4
			my[2] = myNum % 10; // 9

			System.out.println("[" + my[0] + "]" + "[" + my[1] + "]" + "[" + my[2] + "]");

			for (int m = 0; m < gameLength; m++) {
				for (int c = 0; c < gameLength; c++) {
					if (my[m] == com[c]) { // ���� ���ڶ��
						if(m==c)
							strike++;
						else
							ball++;
					}
				}
			}
			count++;
						
					
			if(strike ==3) {
				System.out.println(myNum + "�� " + count + "������ �����Դϴ�.");
				System.out.print("���(1), ����(0) :");
				int num = getNumber();
				if (num ==1) {
					comRandom();
					}
				else
					System.exit(0);
				}
			}
			// ���ڿ� �ڸ��� ��

			// ��� �Ѹ���
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
