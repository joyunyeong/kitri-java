package com.kitri.util.jcf;

import java.util.*;

public class CollectionTest {
	public static void main(String[] args) {
//		Collection coll = new ArrayList();
		Collection coll = new HashSet(); // 순서가 다르게 저장될수도 있다.
		System.out.println("초기 크기 : " + coll.size());
		coll.add("조윤영");
		coll.add("고세라");
		coll.add("이세현");
		coll.add("정현정");
		coll.add("박소현");
		coll.add(new Integer(10));
		System.out.println("마지막 크기 : " + coll.size());

		Object ob[] = coll.toArray();
		int len = ob.length;
		for (int i = 0; i < len; i++) {
			System.out.println((String) ob[i]); // arraylist 참조
		}
	}
}
