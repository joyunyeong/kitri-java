public class TaxiGuest {
	public static void main(String[] args) {
		Taxi t1 = new Taxi();
		System.out.println("t1 >> " + t1.toString()); //Car에서 info()를 얻어온것임

		Taxi t2 = new Taxi("K5", "감홍색", "기아");
		System.out.println("t2 >> " + t2.toString());
		System.out.println();
		
		t2.initPrice();
		System.out.println(">>> 출발하기 전 요금 : " + t2.price + " >>> 현재시간 : " + t2.hour +"시 " + t2.gubun);
		int km =10;
		System.out.println(t2.toString() + "를 타고 구디에서 강남까지 "+ km + "km 이동!!!");
		int price = t2.calcPrice(km);
		System.out.println("요금 : " + price + "원");
		System.out.println();
		
		t2.initPrice();
		System.out.println(">>> 출발하기 전 요금 : " + t2.price + " >>> 현재시간 : " + t2.hour+"시 " + t2.gubun);
		km =20;
		System.out.println("를 타고 구디에서 강남까지 "+ km + "km 이동!!!");
		
		price = t2.calcPrice(km);
		System.out.println("요금 : " + price + "원");
		System.out.println("오늘의 누적수입 : " + t2.totalPrice + "원");

		int upDown = 50;
		System.out.println("t2의 속도를 " + upDown + "만큼 가속!!!");
		int speed = t2.speedUp(upDown);
		System.out.println("t2의 속도 : " + speed + " " + t2.speed);

		upDown = 250;
		System.out.println("t2의 속도를 " + upDown + "만큼 가속!!!"); // 택시는 150초과로 못달린다.
		speed = t2.speedUp(upDown);
		System.out.println("t2의 속도 : " + speed + " " + t2.speed);

		System.out.println(t1 + "  " + t2);
		System.out.println(t1.toString() + "  " + t2.toString());
		System.out.println();
		//Object에 뒤에 문자열이 오게 되면

		Taxi t3 = new Taxi("K5", "감홍색", "기아");
		System.out.println(t2.hashCode() + "  " + t3.hashCode());
		if(t2==t3) // 비교연산자는 기본DT일 경우에 값을 비교, 참조형 DT일 경우는 주소값을 비교
			System.out.println("t2와 t3는 주소값이 같은차이다.");
		else
			System.out.println("t2와 t3는 주소값이 다른차이다."); //다른 차로 나오는 이유 : 내용이 같은거지 값이 같은건 아님(hashcode값 different)

		if(t2.equals(t3)) // 이것 역시 주소값을 비교하는 메소드
			System.out.println("t2와 t3는 차이름이 같은차이다.");
		else
			System.out.println("t2와 t3는 차이름이 다른차이다.");
	}
}
