package com.kitri.io;

import java.io.IOException;

public class StdInOutTest {
	public static void main(String[] args) {
		try {
//			System.out.print("입력 : ");
//			int x = System.in.read();
//			System.out.println("x == " + x); // 제일 앞에 있는 ASCII코드 값을 받아와 버린다.
//			System.out.println("x == " + (char) x); // 2byte 처리가 안됨

			System.out.print("입력2 : ");
			byte b[] = new byte[100];
			int x = System.in.read(b);
			System.out.println("x == " + x); // ENTER(\n(특수문자) :2byte)까지 포함해서 6byte >> 오예
			int len = b.length;
			for (int i = 0; i < len; i++) 
				System.out.println(b[i]); 
			
			String s = new String(b, 0, x-2); // x-2 : enter의 byte수
			System.out.println("s == " + s);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();
	}
}
