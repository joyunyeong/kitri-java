package constructor;

/*
1. ü�� hp 100, ���(0 : �Ϲݸ�� / 1 : ��и��)
2. ���� attack()
   1ȸ ���ݴ� ���� ü�� (0 : -10 / 1 : -15)
   ��庯�� changeMode()
   �� ü�� : -25;
   �� ü�� 40������ ���� ��� ���� �Ұ�
*/
public class Marine {

	int hp;
	int mode;
	int power;

	public Marine() {
		hp = 100;
		power = 10;
	}
	
	void attack(Marine enemy, int count) {
		for(int i=0;i<count;i++)
			enemy.hp -= power;
	}

	void changeMode() {
		if(hp > 40) {
			if(mode == 0) {
				mode = 1;
				hp -= 25;
				power = 15;
			} else {
				mode = 0;
				power = 10;
			}
		} else {
			System.out.println("��� : ��� ���� �Ұ�~!!!!!");
		}
	}

	String getStatus() {
		return hp < 0 ? "die" : hp + "";
	}

}