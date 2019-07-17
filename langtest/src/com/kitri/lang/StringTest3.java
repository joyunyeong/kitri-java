package com.kitri.lang;

public class StringTest3 {
	public static void main(String[] args) {
		String str = "Hello java !!!";
		char c = str.charAt(4);
		System.out.println("c == " + c);

		str = "123";
		int x = str.charAt(0) - 48;
		System.out.println("x == " + x); // x == 1
		System.out.println("-------------------------------------");

		str = "0a9";
		int len = str.length();
		int su = str.charAt(0);

		String s = "";
		// System.out.println("length == " + len);
		// System.out.println(s);

		// int len = array.length;
		// for (int i = 0; i < len; i++) {
		//		
		//}
		for (int i = 0; i < len; i++) {
			su = str.charAt(i);
			System.out.println(su);
			if (su > 47 && su < 58) // 48~57
				s = "숫자입니다.";
			else
				s = "숫자가 아닙니다.";

			
		}
		System.out.println(str + "은 " + s);
		
		String str1="hello";
		String str2 = "java";
		System.out.println(str1 + str2);
		System.out.println(str1.concat(str2));
		System.out.println("----------------------------");
		
		str = "hello java !!!";
		if(str.startsWith("h"))
			System.out.println(str + "은 h로 시작한다.");
		if(str.endsWith("!"))
			System.out.println(str + "은 !로 끝난다.");
		System.out.println("----------------------------");
		
		String s1 = "jAva";
		String s2 = "JavA";
		System.out.println("s1.upperCase() == " + s1.toUpperCase());
		System.out.println("s2.lowerCase() == " + s2.toLowerCase());
		if(s1.equals(s2))
			System.out.println(s1 + "과 " + s2 + "는 같은 문자열이다.");
		else
			System.out.println(s1 + "과 " + s2 + "는 다른 문자열이다.");
		
		
		if(s1.toUpperCase().equals(s2.toUpperCase()))
			System.out.println(s1 + "과 " + s2 + "는 대소문자 구분없이 같은 문자열이다.");
		else
			System.out.println(s1 + "과 " + s2 + "는 대소문자 구분없이 다 문자열이다.");
		
		if(s1.equalsIgnoreCase(s2))
			System.out.println(s1 + "과 " + s2 + "는 대소문자 구분없이 같은 문자열이다.");
		else
			System.out.println(s1 + "과 " + s2 + "는 대소문자 구분없이 다 문자열이다.");
	}
}

