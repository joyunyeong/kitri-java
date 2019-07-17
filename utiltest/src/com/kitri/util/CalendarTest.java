package com.kitri.util;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarTest {
	public static void main(String[] args) {

		// 2019년 03월 26일 오후 1시 17분 35초
		Calendar c = new GregorianCalendar();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int day = c.get(Calendar.DATE);
		int apm = c.get(Calendar.AM_PM);
		int hour = c.get(Calendar.HOUR);
		int min = c.get(Calendar.MINUTE);
		int sec = c.get(Calendar.SECOND);

		System.out.println(year + "년 " + zeroPlus(month) + "월" + zeroPlus(day) + "일 " + (apm == 0 ? "오전" : "오후") +
				zeroPlus(hour) + "시 " + zeroPlus(min) + "분 " + zeroPlus(sec) + "초");
		Date date = new Date();
		System.out.println(date.toString());
	}

	// static을 붙이는 이유? static에서는 non-static 호출 불가, 그래서 내꺼에서 내꺼 호출하는 그런거면 static 써도 무방함
	private static String zeroPlus(int num) {
		return num < 10 ? "0" + num : "" + num;
	}
}
