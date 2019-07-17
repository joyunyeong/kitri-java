package com.kitri.util;

import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		Random random = new Random();
		boolean b = random.nextBoolean();
		System.out.println("b == " + b);
		double d = random.nextDouble();
		System.out.println("d == " + d); // 0부터 1사이
		int i = random.nextInt();
		System.out.println("i == " + i); // 양수, 음수
		
		int r = random.nextInt(256); //256개 얻어오라 : 0~255
		System.out.println("r == " + r);

	}
}
