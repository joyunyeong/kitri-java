package com.kitri.util;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		Random random = new Random();
		boolean b = random.nextBoolean();
		System.out.println("b == " + b);
		double d = random.nextDouble();
		System.out.println("d == " + d); // 0���� 1����
		int i = random.nextInt();
		System.out.println("i == " + i); // ���, ����
		
		int r = random.nextInt(256); //256�� ������ : 0~255
		System.out.println("r == " + r);

	}
}
