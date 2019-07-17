package com.kitri.lang;

public class StringTest5 {

	public static void main(String[] args) {
		String str = "hello java !!!";
		int x = str.indexOf('a');
		System.out.println(str + "���� a�� " + (x + 1) + "��° �ִ�.");

		x = str.indexOf('a', 8);
		System.out.println(str + "���� 8��°���� a�� " + (x + 1) + "��° �ִ�.");

		x = str.indexOf("java");
		System.out.println(str + "���� java�� " + (x + 1) + "��° �ִ�.");
		// �������� �ǹ�
		x = str.lastIndexOf('a');
		System.out.println(str + "���� ���������� a�� " + (x + 1) + "��° �ִ�.");
		System.out.println("--------------------------");

		String str2 = "";
		System.out.println(str2 + "�� ���� : " + str2.length());
		if (str2.isEmpty())
			System.out.println("�� ���ڿ��̴�.");
		else
			System.out.println("str == " + str2);
		System.out.println("--------------------------");

		String str3 = "  hello     ";
		System.out.println(str3 + "�� ���� : " + str3.length());
		System.out.println(str3.trim() + "�� ���� ���� �� ���� : " + str3.trim().length());
		System.out.println("--------------------------");

		String str4 = "jaba";
		System.out.println(str4 + " :::: " + str4.replace(str4, "java"));
		System.out.println(str4 + " :::: " + str4.replace("jaba", "java"));
		System.out.println(str4 + " :::: " + str4.replaceAll("jaba", "java"));
		System.out.println("--------------------------");

		/*
		 * String str5 = "hello java !!!"; String s[] = str5.split(" "); //regex :
		 * ����ǥ����(���� ���ڿ�) int len = s.length; for (int i = 0; i < len; i++)
		 * System.out.println("s[" + i + "] == " + s[i]);
		 * System.out.println("--------------------------");
		 * 
		 * System.out.println(str5.substring(6)); //6���� ����
		 * System.out.println(str5.substring(6, 9)); //6~8 : 6���� 9������
		 * System.out.println("--------------------------");
		 */

		int num = 100;
		String sn1 = num + "";
		System.out.println(sn1 + 100);

		String sn2 = String.valueOf(100);
		System.out.println(sn2 + 100);

		String sn3 = Integer.toString(100);
		System.out.println(sn3 + 100);

		// ���ڿ� > ����
		String ns = "100";
		num = Integer.parseInt(ns);
		System.out.println(num + 100);

	}
}
