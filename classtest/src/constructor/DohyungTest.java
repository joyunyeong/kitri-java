package constructor;

public class DohyungTest {
	public static void main(String[] args) {
		
		//���ΰ� 4�̰� ���ΰ� 3�� �簢���� ���̴� 12 �ѷ��� 14�Դϴ�.
		Rect r1 = new Rect();
		System.out.println("���ΰ� " + r1.width + "�̰� ���ΰ� " +r1.height + "�� �簢���� ���̴� " + r1.calcArea + "�ѷ��� " + r1.calcRound + "�Դϴ�.");

		// Rect r2; // " (������� ����/���� �ٸ��� ����)
		Rect r2 = new Rect();
		r2.width = 4;
		r2.height = 89;
		r2.calcArea();
		r2.calcRound();
		System.out.println("���ΰ� " + r2.width + "�̰� ���ΰ� " +r2.height + "�� �簢���� ���̴� " + r2.calcArea + "�ѷ��� " + r2.calcRound + "�Դϴ�.");
		
		// �������� 4�� ���� ���̴� 48.xxx�̰� �ѷ��� 24.xxx�Դϴ�.
		Circle c1 = new Circle();
		System.out.println("�������� " + c1.radius + "�� ���� ���̴� " +c1.calcArea + " �ѷ��� " + c1.calcRound);
		
		// Circle c2;
		Circle c2 = new Circle();
		c2.radius = 8;
		c2.calcArea();
		c2.calcRound();
	
		System.out.println("�������� " + c2.radius + "�� ���� ���̴� " +c2.calcArea + " �ѷ��� " + c2.calcRound);


	}
}
