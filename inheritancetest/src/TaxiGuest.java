public class TaxiGuest {
	public static void main(String[] args) {
		Taxi t1 = new Taxi();
		System.out.println("t1 >> " + t1.toString()); //Car���� info()�� ���°���

		Taxi t2 = new Taxi("K5", "��ȫ��", "���");
		System.out.println("t2 >> " + t2.toString());
		System.out.println();
		
		t2.initPrice();
		System.out.println(">>> ����ϱ� �� ��� : " + t2.price + " >>> ����ð� : " + t2.hour +"�� " + t2.gubun);
		int km =10;
		System.out.println(t2.toString() + "�� Ÿ�� ���𿡼� �������� "+ km + "km �̵�!!!");
		int price = t2.calcPrice(km);
		System.out.println("��� : " + price + "��");
		System.out.println();
		
		t2.initPrice();
		System.out.println(">>> ����ϱ� �� ��� : " + t2.price + " >>> ����ð� : " + t2.hour+"�� " + t2.gubun);
		km =20;
		System.out.println("�� Ÿ�� ���𿡼� �������� "+ km + "km �̵�!!!");
		
		price = t2.calcPrice(km);
		System.out.println("��� : " + price + "��");
		System.out.println("������ �������� : " + t2.totalPrice + "��");

		int upDown = 50;
		System.out.println("t2�� �ӵ��� " + upDown + "��ŭ ����!!!");
		int speed = t2.speedUp(upDown);
		System.out.println("t2�� �ӵ� : " + speed + " " + t2.speed);

		upDown = 250;
		System.out.println("t2�� �ӵ��� " + upDown + "��ŭ ����!!!"); // �ýô� 150�ʰ��� ���޸���.
		speed = t2.speedUp(upDown);
		System.out.println("t2�� �ӵ� : " + speed + " " + t2.speed);

		System.out.println(t1 + "  " + t2);
		System.out.println(t1.toString() + "  " + t2.toString());
		System.out.println();
		//Object�� �ڿ� ���ڿ��� ���� �Ǹ�

		Taxi t3 = new Taxi("K5", "��ȫ��", "���");
		System.out.println(t2.hashCode() + "  " + t3.hashCode());
		if(t2==t3) // �񱳿����ڴ� �⺻DT�� ��쿡 ���� ��, ������ DT�� ���� �ּҰ��� ��
			System.out.println("t2�� t3�� �ּҰ��� �������̴�.");
		else
			System.out.println("t2�� t3�� �ּҰ��� �ٸ����̴�."); //�ٸ� ���� ������ ���� : ������ �������� ���� ������ �ƴ�(hashcode�� different)

		if(t2.equals(t3)) // �̰� ���� �ּҰ��� ���ϴ� �޼ҵ�
			System.out.println("t2�� t3�� ���̸��� �������̴�.");
		else
			System.out.println("t2�� t3�� ���̸��� �ٸ����̴�.");
	}
}
