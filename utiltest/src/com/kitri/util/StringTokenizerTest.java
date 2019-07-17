package com.kitri.util;

import java.util.StringTokenizer;
import java.util.UUID;

public class StringTokenizerTest {
	public static void main(String[] args) {
		String str = "hello java !!!";
		StringTokenizer st = new StringTokenizer(str); // �ڸ� �غ� ������.
		int cnt = st.countTokens();
		System.out.println("��ū�� : " + cnt); // �ƹ��͵� ������ ���� ������ ���鰡���� Token����

		while (st.hasMoreTokens())
			System.out.println(st.nextToken());
		System.out.println("-----------------------");

		str = "TO|������|�ȳ��ϼ���"; // ��������|�����|�޼���
		StringTokenizer st2 = new StringTokenizer(str, "|");
		String protocol = st2.nextToken();
		String to = st2.nextToken();
		String msg = st2.nextToken();
		System.out.println("��� : " + protocol);
		System.out.println("�������� : " + to);
		System.out.println("������ �޼��� : " + msg);
		System.out.println("-----------------------");

		System.out.println(UUID.randomUUID());
		
	}
}
