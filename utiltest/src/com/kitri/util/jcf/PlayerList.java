package com.kitri.util.jcf;

import java.util.*;

public class PlayerList {

//	List<PlayerDto> list = new ArrayList<PlayerDto>(); 밑에도 결과는 같음
	List<PlayerDto> list = new Vector<PlayerDto>();
	// 벡터는 동기화 가능, synchronized : 먼저 호출된 놈이 먼저 저장됨(뒤가 빨리 끝나는 작업일지라도) : 완벽한 순서 보장 가능
	// 그에 비해서 ArrayList is not synchroized, 즉 어떤거 먼저 들어갈지 보장 X
	// 기능이 똑같다는 가정하에서 ArrayList가 더 빨라(동시다발적으로 처리하니까), but 완벽한 데이터를 보장받을 수는 없어
	// 실제로도 ArrayList를 더 자주 씀, 속도면에서 월등

	private void playerRegister(PlayerDto playerDto) {
		list.add(playerDto);
	}

	private void playerList() {
		System.out.println("=== 두산 베어스 팀명단 ===");
		System.out.println("----------------------------");
		int size = list.size();
		for (int i = 0; i < size; i++)
			System.out.println(list.get(i));
	}

	private PlayerDto playerSearch(int number) {
//		PlayerDto playerDto = null;
//		return playerDto;					이거 두개는 항상 쓰고 시작하렴
		PlayerDto playerDto = null;

		int size = list.size();
		for (int i = 0; i < size; i++) {
			PlayerDto dto = list.get(i);
			if (number == dto.getNumber()) {
				playerDto = dto;
				break;
			}
		}
		return playerDto;
	}
	
	private void playerInfo(PlayerDto playerDto) {		
		if (playerDto != null)
			System.out.println(playerDto);
		else
			System.out.println("그 번호를 가진 선수는 없습니다.");
	}

	public static void main(String[] args) {
		PlayerList pl = new PlayerList();

		pl.playerRegister(new PlayerDto(24, "오재원", 4, 0.321));
		pl.playerRegister(new PlayerDto(13, "허경민", 5, 0.351));
		pl.playerRegister(new PlayerDto(34, "윈드블럼", 1, 0.001));
		pl.playerRegister(new PlayerDto(9, "페르난데스", 3, 0.421));
		pl.playerRegister(new PlayerDto(38, "김대한", 7, 0.384));

		pl.playerList();

		int number = 38;
		System.out.println(number + "번 선수 정보!!");
		PlayerDto playerDto = pl.playerSearch(number);
		pl.playerInfo(playerDto);

		number = 13;
		double score = 0.357;
		System.out.println(number + "번 선수가 안타!!! 타율이 " + score + "로 변경");
		playerDto = pl.playerSearch(number);
		playerDto.setGrade(score);// 배열안에 레퍼런스(주소)가 저장되는거지 배열 자체가 저장되는것은 아님
		pl.playerInfo(playerDto); 
	}
}






























