package constructor;

/*
1. ü�� hp 100, ���(0 : �Ϲݸ�� / 1 : ��и��)
2. ���� attack()
   1ȸ ���ݴ� ���� ü�� (0 : -10 / 1 : -15)
   ��庯�� changeMode()
   �� ü�� : -25;
   �� ü�� 40������ ���� ��� ���� �Ұ�
*/
public class Confirm {
	int hp;
	int mode;


	public Confirm() {
		hp = 100;	
	} //�⺻ ü�� 100

	//attack(Marine enemy)

	int attack(int x) {
			
		if (x == 15) {
			hp -= 15;} else { hp -= 10;}
		return hp;
		
	}	

	public void changeMode(int mode) {
		this.hp -= 25;

		if(hp <= 15)
			System.out.println("��� ���� �Ұ�!!!");
		
			//���� hp�� �״�� ���濡�� �ѽöѽ�
	}
	
}
