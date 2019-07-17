public class JustPractice {
	public static void main(String[] args) {
		Bus b = new Bus();
		int passenger;

		System.out.println("현재 앉을 수 있는 버스의 좌석 수 : " + b.seats);
		System.out.println("현재 번 돈 : " + b.money);
		System.out.println();		

		passenger = 4;
		System.out.println(passenger + "명의 탑승객이 탈 예정입니다.  : " + b.available); //가능?불가능?
		b.getOn(passenger);
		System.out.println("현재 앉을 수 있는 버스의 좌석 수  > " + b.seats);
		System.out.println("현재 번 돈 : " + b.money);
		System.out.println();
		
		passenger = 3;
		System.out.println(passenger + "명의 탑승객이 내릴 예정입니다.");
		b.getOff(passenger);
		System.out.println("현재 앉을 수 있는 버스의 좌석 수  > " + b.seats);

		passenger = 23;
		System.out.println(passenger + "명의 탑승객이 탈 예정입니다.  : " + b.available); //가능?불가능?
		b.getOn(passenger);
		System.out.println("현재 앉을 수 있는 버스의 좌석 수  > " + b.seats);
		System.out.println("현재 번 돈 : " + b.money);
		System.out.println("-------------------------------------------------------------------");
		System.out.println("총 매출액 : " + b.totalMoney);




	}
}
