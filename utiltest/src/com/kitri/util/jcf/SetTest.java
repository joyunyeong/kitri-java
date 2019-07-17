package com.kitri.util.jcf;

import java.util.*;

public class SetTest {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("황선혜");
		set.add("박미래");
		set.add("이혜린");
		set.add("조윤영");
		set.add("박미래");
		System.out.println("set의 크기 : " + set.size()); //똑같은것 넣어도 크기 변화 X
		
		String str[] = set.toArray(new String[0]);
		int len = str.length;
		for (int i = 0; i < len; i++) 
			System.out.println(str[i]);
		
		System.out.println("--------------------------");
		
		Iterator<String> it = set.iterator();
		while(it.hasNext())
			System.out.println(it.next());
		
		//		Object ob[] = set.toArray();
//		int len = ob.length;
//		for (int i = 0; i < len; i++) 
//			System.out.println(ob[i]);
		
	}
}
