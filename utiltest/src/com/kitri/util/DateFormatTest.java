package com.kitri.util;

import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatTest {
	public static void main(String[] args) {
//		2019.03.26 14:25:30
		Date date = new Date();
		System.out.println("원래 : " + date);
		
		Format f = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss"); // 하위클래스라고  모두 추상클래스 아니지 X
		String today = f.format(date);
		System.out.println("바뀐 것 : " + today);
		
		}
}
