public class JustPractice {
	public static void main(String[] args) {
		Bus b = new Bus();
		int passenger;

		System.out.println("���� ���� �� �ִ� ������ �¼� �� : " + b.seats);
		System.out.println("���� �� �� : " + b.money);
		System.out.println();		

		passenger = 4;
		System.out.println(passenger + "���� ž�°��� Ż �����Դϴ�.  : " + b.available); //����?�Ұ���?
		b.getOn(passenger);
		System.out.println("���� ���� �� �ִ� ������ �¼� ��  > " + b.seats);
		System.out.println("���� �� �� : " + b.money);
		System.out.println();
		
		passenger = 3;
		System.out.println(passenger + "���� ž�°��� ���� �����Դϴ�.");
		b.getOff(passenger);
		System.out.println("���� ���� �� �ִ� ������ �¼� ��  > " + b.seats);

		passenger = 23;
		System.out.println(passenger + "���� ž�°��� Ż �����Դϴ�.  : " + b.available); //����?�Ұ���?
		b.getOn(passenger);
		System.out.println("���� ���� �� �ִ� ������ �¼� ��  > " + b.seats);
		System.out.println("���� �� �� : " + b.money);
		System.out.println("-------------------------------------------------------------------");
		System.out.println("�� ����� : " + b.totalMoney);




	}
}
