package com.kitri.test6;

import java.util.ArrayList;
import java.util.List;

public class DramaListTest {
	public static void main(String[] args) {
		List<Drama> list = new ArrayList<Drama>(); // �������̽��� ���� ������ �����غ���
		
		list.add(new Drama("�� �ܿ�", "SBS", "�����", "���μ�", "������"));
		list.add(new Drama("��", "MBC", "�ּ���"));
		list.add(new Drama("�װܿ�", "KBS", "�����", "���μ�", "������"));
		list.add(new Drama("�װܿ�", "KBS", "�����", "���μ�", "������"));
		
		System.out.println("<< ArrayList�� �̿��� �������  >>");

		int size = list.size();
		for (int i = 0; i < size; i++) 
			System.out.println(list.get(i));
		
	}
}
