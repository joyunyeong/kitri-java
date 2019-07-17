package com.kitri.io;

import java.io.*;

public class ReaderTest {
	public static void main(String[] args) {
		Reader in = null; //null로 하는 이유 : 마지막에 finally로 뺄꺼라서
		try {
			in = new InputStreamReader(System.in);
			char c[] = new char[100];
			System.out.println("입력 : ");
			int x = in.read(c);
			System.out.println("x == " + x);
			
			int len = c.length;
			for (int i = 0; i < len; i++) 
				System.out.println(c[i]); // 쓸데없는 ' '이 많이 들어간다.
			
			String str = new String(c,0,x-2);
			// x-2하는 이유 : \n이 2byte이기 때문에 2를 빼는 것
			System.out.println(str); // 이대로하면 쓸데없는 공간 계속 남아
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
