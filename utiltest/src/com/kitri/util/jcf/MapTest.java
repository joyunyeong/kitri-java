package com.kitri.util.jcf;

import java.util.*;

public class MapTest {
	public static void main(String[] args) {
//		 ���� � �̸����� �����ϰ� �ִ��� ����ؾ���(���ϰ���)
//		Map<String, PlayerDto> map = new HashMap<String, PlayerDto>();
		Map<String, PlayerDto> map = new Hashtable<String, PlayerDto>(); // ���� ����� ����
		
//		 hash map is not synchrnoized
//		 hash table is synchronized!!: �Ϻ��ϰ� ������� �� O
//		 hashMap, arrayList�� �� �Ϲ������� ����.
//		 Map�� ���۷����� ����Ǵ� ���� ����ü�� ����Ǵ� ���� �ƴϴ�.(Ű���� ���� : ���ε� : ���� ��ü�� ����)
	
		
		map.put("DS24", new PlayerDto(24, "�����", 4, 0.321));
		map.put("DS9", new PlayerDto(9, "�丣������", 3, 0.421));
		map.put("KW24", new PlayerDto(24, "�ں�ȣ", 3, 0.431));
		map.put("HH19", new PlayerDto(24, "���ٿ�", 7, 0.321));
		// ��ġ�� map������ ����⸦ �ع��� (set�̶� ���)

		int size = map.size();
		System.out.println("����ο� : " + size);
		
		int num = 24;
		System.out.println("�λ��� " + num + "�� ������ ����");
		System.out.println("-------------------------");
		PlayerDto playerDto = map.get("DS" + num); // key���� ���Ͷ�
		System.out.println(playerDto);
		
//		map.values() : ���� ����, return�� Collection�� ������ map���� �������� ������ ���� �����̴�
		
	}
}
