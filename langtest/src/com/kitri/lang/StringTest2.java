package com.kitri.lang;

import java.io.UnsupportedEncodingException;

public class StringTest2 { // java.lang.String Class API ������ ����

	public static void main(String[] args) throws UnsupportedEncodingException {
		// String str = null;
		String str1 = new String(); // ""
		System.out.println("���ڿ� ���� : " + str1.length()); // ����ִ� ���ڿ��� �����

//		byte b[] = { 97, 98, 99, 100 }; // byte - ASCII �ڵ�
		byte b[] = { -66, -56, -77, -25, -57, -49, -68, -68, -65, -28, 46 };
		String str2 = new String(b);
		System.out.println("str2 == " + str2); // ���� �ƽ�Ű�ڵ� ���� ���´�.

		byte b2[] = { -20, -107, -120, -21, -123, -107, -19, -107, -104, -20, -124, -72, -20, -102, -108, 46 };
		String str3 = new String(b2, "utf-8");
		System.out.println("str2 == " + str3); // ���� �ƽ�Ű�ڵ� ���� ���´�.

		byte b3[] = { 97, 98, 99, 100, 101, 102, 103, 104 }; // ��𼭺��� ��� �̾Ƽ� ����ڴ�.
		String str4 = new String(b3, 2, 4);
		System.out.println("str4 == " + str4);
		
//		char c[] = {'a','b','c','d','e','f'};
		char c[] = {'��', '��', '��', '��', '��', '.'};
		String str5 = new String(c);
		System.out.println("str5 == " + str5);

		String str6 = new String(c, 2, 4);
		System.out.println("str6 == " + str6);
	}

}
