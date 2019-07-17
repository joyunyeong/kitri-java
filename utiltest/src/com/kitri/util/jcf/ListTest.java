package com.kitri.util.jcf;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		System.out.println("list size == " + list.size());
		list.add("허경민");
		list.add("정수빈");
		list.add("구준회");
		list.add("김동혁");
		System.out.println("list size == " + list.size());

//		System.out.println("-- 두산의 타순 --");
//		String str[] = list.toArray(new String[0]);
//		int len = str.length;
//		for (int i = 0; i < len; i++) 
//			System.out.println(i+1 + "번타자. " + str[i]);

		int size = list.size();
		for (int i = 0; i < size; i++)
			System.out.println(i + 1 + "번타자. " + list.get(i));
		System.out.println("------------------------------------------------");
		String name = "정수빈";

		for (int i = 0; i < size; i++) {
			if (list.get(i).equals(name)) {
				System.out.println(name + "은 " + (i+1) + "번 타자입니다.");
			break;
				}
			}

		String name2 = "오재원";
		System.out.println(name + "을 " + name2 + "으로 교체");
		for (int i = 0; i < size; i++) {
			if (list.get(i).equals(name)) 
				list.set(i, name2);
			break;		
			}
	}
}
