package com.kitri.io;

import java.io.*;

public class ReaderTest {
	public static void main(String[] args) {
		Reader in = null; //null�� �ϴ� ���� : �������� finally�� ������
		try {
			in = new InputStreamReader(System.in);
			char c[] = new char[100];
			System.out.println("�Է� : ");
			int x = in.read(c);
			System.out.println("x == " + x);
			
			int len = c.length;
			for (int i = 0; i < len; i++) 
				System.out.println(c[i]); // �������� ' '�� ���� ����.
			
			String str = new String(c,0,x-2);
			// x-2�ϴ� ���� : \n�� 2byte�̱� ������ 2�� ���� ��
			System.out.println(str); // �̴���ϸ� �������� ���� ��� ����
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
