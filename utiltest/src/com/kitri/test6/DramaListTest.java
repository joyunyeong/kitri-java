package com.kitri.test6;

import java.util.ArrayList;
import java.util.List;

public class DramaListTest {
	public static void main(String[] args) {
		List<Drama> list = new ArrayList<Drama>(); // 인터페이스를 쓰는 이유를 생각해보라
		
		list.add(new Drama("그 겨울", "SBS", "김향기", "조인성", "송혜교"));
		list.add(new Drama("백", "MBC", "주성우"));
		list.add(new Drama("그겨울", "KBS", "김향기", "조인성", "송혜교"));
		list.add(new Drama("그겨울", "KBS", "김향기", "조인성", "송혜교"));
		
		System.out.println("<< ArrayList를 이용한 드라마정보  >>");

		int size = list.size();
		for (int i = 0; i < size; i++) 
			System.out.println(list.get(i));
		
	}
}
