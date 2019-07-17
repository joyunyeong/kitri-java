package com.kitri.exception.runtime;

public class IndexBoundsTest {
	public static void main(String[] args) {
		String s[] = { "1", "2", "3", "4" };
//		for (int i = 0; i <= 4; i++) 
//			System.out.println(s[i]);

		int len = s.length; // 배열의 길이는 항상 숫자보다 length로 쓰는게 좋다
		for (int i = 0; i < len; i++) 
			System.out.println(s[i]);
		
		System.out.println("-----------------------");
		String str = "hell0";
//		for (int i = 0; i < 5; i++) 
//			System.out.print(str.charAt(i) + " ");
		len = str.length();
		for (int i = 0; i < len; i++) {
			System.out.println(str.charAt(i));
		}
		
	}
}
