package com.kitri.exception.runtime;

import java.util.Random;

public class ArithMeticTest {
	public static void main(String[] args) {
		Random random = new Random();
		int x = 30;
//		RuntimeException�� logic���� ó��...
//		int y = random.nextInt(5);
//		try {
//			int z = x/y;
//		
//			System.out.println(x + " / " + y + " = " + z);
//		} catch(ArithmeticException e) {
//			System.out.println(e.getMessage());
//			System.out.println("0���� ���� �� �����ϴ�.");
//			}
//		1.
		int y = random.nextInt(5);
		if( y!= 0) {
			int z = x/y;
			System.out.println(x + " / " + y + " = " + z);
		}	else {
			System.out.println("0���� ���� �� �����ϴ�.");
		}
//		2.
		y = random.nextInt(4) + 1; // ���� 0�� ���ü��� ����
		int z = x/y;
		System.out.println(x + " / " + y + " = " + z);
		
	}
}