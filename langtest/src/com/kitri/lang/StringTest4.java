package com.kitri.lang;

import java.io.UnsupportedEncodingException;

public class StringTest4 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "abcdef";
		byte b[] = str.getBytes();
		int len = b.length;
		for (int i = 0; i < len; i++) 
			System.out.println("b[" + i + "] == " +b[i]);
		System.out.println("------------------------------------");
		
		String str2 = "Á¶À±¿µ";
//		byte b2[] = str2.getBytes();
		byte b2[] = str2.getBytes("utf-8"); // 3byte¾¿
		int len2 = b2.length;
		for (int i = 0; i < len2; i++) 
			System.out.println("b[" + i + "] == " +b2[i]);
		System.out.println("------------------------------------");
		
		str2 = "Á¶À±¿µ";
		char c[] = str2.toCharArray();
		len2 = c.length;
		for (int i = 0; i < len2; i++) 
			System.out.println("c[" + i + "] == " +c[i]);
		
	}
}




