package com.kitri.util;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarTest {
	public static void main(String[] args) {

		// 2019�� 03�� 26�� ���� 1�� 17�� 35��
		Calendar c = new GregorianCalendar();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int day = c.get(Calendar.DATE);
		int apm = c.get(Calendar.AM_PM);
		int hour = c.get(Calendar.HOUR);
		int min = c.get(Calendar.MINUTE);
		int sec = c.get(Calendar.SECOND);

		System.out.println(year + "�� " + zeroPlus(month) + "��" + zeroPlus(day) + "�� " + (apm == 0 ? "����" : "����") +
				zeroPlus(hour) + "�� " + zeroPlus(min) + "�� " + zeroPlus(sec) + "��");
		Date date = new Date();
		System.out.println(date.toString());
	}

	// static�� ���̴� ����? static������ non-static ȣ�� �Ұ�, �׷��� �������� ���� ȣ���ϴ� �׷��Ÿ� static �ᵵ ������
	private static String zeroPlus(int num) {
		return num < 10 ? "0" + num : "" + num;
	}
}
