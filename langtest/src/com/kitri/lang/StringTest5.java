package com.kitri.lang;

public class StringTest5 {

	public static void main(String[] args) {
		String str = "hello java !!!";
		int x = str.indexOf('a');
		System.out.println(str + "에서 a는 " + (x + 1) + "번째 있다.");

		x = str.indexOf('a', 8);
		System.out.println(str + "에서 8번째부터 a는 " + (x + 1) + "번째 있다.");

		x = str.indexOf("java");
		System.out.println(str + "에서 java는 " + (x + 1) + "번째 있다.");
		// 시작점을 의미
		x = str.lastIndexOf('a');
		System.out.println(str + "에서 끝에서부터 a는 " + (x + 1) + "번째 있다.");
		System.out.println("--------------------------");

		String str2 = "";
		System.out.println(str2 + "의 길이 : " + str2.length());
		if (str2.isEmpty())
			System.out.println("빈 문자열이다.");
		else
			System.out.println("str == " + str2);
		System.out.println("--------------------------");

		String str3 = "  hello     ";
		System.out.println(str3 + "의 길이 : " + str3.length());
		System.out.println(str3.trim() + "의 공백 제거 후 길이 : " + str3.trim().length());
		System.out.println("--------------------------");

		String str4 = "jaba";
		System.out.println(str4 + " :::: " + str4.replace(str4, "java"));
		System.out.println(str4 + " :::: " + str4.replace("jaba", "java"));
		System.out.println(str4 + " :::: " + str4.replaceAll("jaba", "java"));
		System.out.println("--------------------------");

		/*
		 * String str5 = "hello java !!!"; String s[] = str5.split(" "); //regex :
		 * 정규표현식(기준 문자열) int len = s.length; for (int i = 0; i < len; i++)
		 * System.out.println("s[" + i + "] == " + s[i]);
		 * System.out.println("--------------------------");
		 * 
		 * System.out.println(str5.substring(6)); //6부터 시작
		 * System.out.println(str5.substring(6, 9)); //6~8 : 6부터 9전까지
		 * System.out.println("--------------------------");
		 */

		int num = 100;
		String sn1 = num + "";
		System.out.println(sn1 + 100);

		String sn2 = String.valueOf(100);
		System.out.println(sn2 + 100);

		String sn3 = Integer.toString(100);
		System.out.println(sn3 + 100);

		// 문자열 > 숫자
		String ns = "100";
		num = Integer.parseInt(ns);
		System.out.println(num + 100);

	}
}
