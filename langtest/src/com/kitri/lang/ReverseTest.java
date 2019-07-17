package com.kitri.lang;

public class ReverseTest {
	public static void main(String[] args) {
		String str = "!!! avaJ olleH";

		// 1. charAt
		String result = "";
		int len = str.length();
		for (int i = len - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
			result += str.charAt(i);
		}
		System.out.println();
		System.out.println(result.indexOf('e') + 1 + "번째 있습니다.");

		// 2. replace
		System.out.println("---------------------------");
		String str2 = str.replace(str, "Hello Java !!!");
		System.out.println(str2);
		System.out.println("---------------------------");

		// 3. byte
		byte b[] = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97, 32, 33, 33, 33 };
		str2 = new String(b);
		System.out.println(str2);

		// 4.charArray
		System.out.println("---------------------------");
		char c[] = str.toCharArray();
		len = c.length;
		char c2[] = new char[len]; //내가 못한 부분
		int x=0;
		for (int i = len - 1; i > -1; i--)
			c2[x++] = c[i];
		result = new String(c2);
		
		System.out.println(result);
		System.out.println(result.indexOf('e') + 1 + "번째 있습니다.");
		System.out.println("---------------------------");

		byte b1[] = str.getBytes();
		len = b1.length;
		byte b2[] = new byte[len];
		x = 0;
		
		
		System.out.println("---------------------------");
		
		// String은 고정이기 때문에 문자열자체를 바꿀수는 없다. 따라서 다른 곳에 reverse가 따로 있음
		// 버퍼 : 임시저장공간
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());

	}

}
