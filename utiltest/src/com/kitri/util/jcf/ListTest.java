package com.kitri.util.jcf;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		System.out.println("list size == " + list.size());
		list.add("����");
		list.add("������");
		list.add("����ȸ");
		list.add("�赿��");
		System.out.println("list size == " + list.size());

//		System.out.println("-- �λ��� Ÿ�� --");
//		String str[] = list.toArray(new String[0]);
//		int len = str.length;
//		for (int i = 0; i < len; i++) 
//			System.out.println(i+1 + "��Ÿ��. " + str[i]);

		int size = list.size();
		for (int i = 0; i < size; i++)
			System.out.println(i + 1 + "��Ÿ��. " + list.get(i));
		System.out.println("------------------------------------------------");
		String name = "������";

		for (int i = 0; i < size; i++) {
			if (list.get(i).equals(name)) {
				System.out.println(name + "�� " + (i+1) + "�� Ÿ���Դϴ�.");
			break;
				}
			}

		String name2 = "�����";
		System.out.println(name + "�� " + name2 + "���� ��ü");
		for (int i = 0; i < size; i++) {
			if (list.get(i).equals(name)) 
				list.set(i, name2);
			break;		
			}
	}
}
