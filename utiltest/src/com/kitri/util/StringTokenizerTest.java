package com.kitri.util;

import java.util.StringTokenizer;
import java.util.UUID;

public class StringTokenizerTest {
	public static void main(String[] args) {
		String str = "hello java !!!";
		StringTokenizer st = new StringTokenizer(str); // 자를 준비가 끝났다.
		int cnt = st.countTokens();
		System.out.println("토큰수 : " + cnt); // 아무것도 지정을 하지 않으면 공백가지고 Token구분

		while (st.hasMoreTokens())
			System.out.println(st.nextToken());
		System.out.println("-----------------------");

		str = "TO|조윤영|안녕하세요"; // 프로토콜|사용자|메세지
		StringTokenizer st2 = new StringTokenizer(str, "|");
		String protocol = st2.nextToken();
		String to = st2.nextToken();
		String msg = st2.nextToken();
		System.out.println("기능 : " + protocol);
		System.out.println("누구에게 : " + to);
		System.out.println("보내는 메세지 : " + msg);
		System.out.println("-----------------------");

		System.out.println(UUID.randomUUID());
		
	}
}
