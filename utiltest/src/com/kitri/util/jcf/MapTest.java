package com.kitri.util.jcf;

import java.util.*;

public class MapTest {
	public static void main(String[] args) {
//		 내가 어떤 이름으로 저장하고 있는지 기억해야함(유일값有)
//		Map<String, PlayerDto> map = new HashMap<String, PlayerDto>();
		Map<String, PlayerDto> map = new Hashtable<String, PlayerDto>(); // 위랑 결과는 같음
		
//		 hash map is not synchrnoized
//		 hash table is synchronized!!: 완벽하게 보장받을 수 O
//		 hashMap, arrayList를 더 일반적으로 쓴다.
//		 Map도 레퍼런스가 저장되는 거지 값자체가 저장되는 것이 아니다.(키값이 저장 : 바인딩 : 실제 객체와 연결)
	
		
		map.put("DS24", new PlayerDto(24, "오재원", 4, 0.321));
		map.put("DS9", new PlayerDto(9, "페르난데스", 3, 0.421));
		map.put("KW24", new PlayerDto(24, "박병호", 3, 0.431));
		map.put("HH19", new PlayerDto(24, "정근우", 7, 0.321));
		// 겹치면 map에서는 덮어쓰기를 해버림 (set이랑 비슷)

		int size = map.size();
		System.out.println("등록인원 : " + size);
		
		int num = 24;
		System.out.println("두산의 " + num + "번 선수의 정보");
		System.out.println("-------------------------");
		PlayerDto playerDto = map.get("DS" + num); // key값을 얻어와라
		System.out.println(playerDto);
		
//		map.values() : 값을 얻어옴, return이 Collection인 이유는 map에서 넣을때는 순서가 없기 때문이다
		
	}
}
