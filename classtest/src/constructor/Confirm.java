package constructor;

/*
1. 체력 hp 100, 모드(0 : 일반모드 / 1 : 흥분모드)
2. 공격 attack()
   1회 공격당 적의 체력 (0 : -10 / 1 : -15)
   모드변경 changeMode()
   내 체력 : -25;
   내 체력 40이하일 경우는 모드 변경 불가
*/
public class Confirm {
	int hp;
	int mode;


	public Confirm() {
		hp = 100;	
	} //기본 체력 100

	//attack(Marine enemy)

	int attack(int x) {
			
		if (x == 15) {
			hp -= 15;} else { hp -= 10;}
		return hp;
		
	}	

	public void changeMode(int mode) {
		this.hp -= 25;

		if(hp <= 15)
			System.out.println("모드 변경 불가!!!");
		
			//지금 hp는 그대로 상대방에게 뚜시뚜시
	}
	
}
