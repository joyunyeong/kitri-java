package com.kitri.io;

import java.io.IOException;

public class StdInOutTest {
	public static void main(String[] args) {
		try {
//			System.out.print("�Է� : ");
//			int x = System.in.read();
//			System.out.println("x == " + x); // ���� �տ� �ִ� ASCII�ڵ� ���� �޾ƿ� ������.
//			System.out.println("x == " + (char) x); // 2byte ó���� �ȵ�

			System.out.print("�Է�2 : ");
			byte b[] = new byte[100];
			int x = System.in.read(b);
			System.out.println("x == " + x); // ENTER(\n(Ư������) :2byte)���� �����ؼ� 6byte >> ����
			int len = b.length;
			for (int i = 0; i < len; i++) 
				System.out.println(b[i]); 
			
			String s = new String(b, 0, x-2); // x-2 : enter�� byte��
			System.out.println("s == " + s);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();
	}
}
