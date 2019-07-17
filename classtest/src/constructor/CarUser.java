package constructor;

public class CarUser {
	public static void main(String[] args) {
		Car car1 = new Car();
		System.out.println(car1.info());

		Car car2 = new Car("흰색");
		System.out.println("car2. 차이름 : " + car2.carName + "    색상 : " + car2.color + "    제조사 : " + car2.maker);

		Car car3 = new Car("그랜저", "검은색");
		System.out.println("car3. 차이름 : " + car3.carName + "    색상 : " + car3.color + "    제조사 : " + car3.maker);

		Car car4 = new Car("C500", "노란색", "벤츠");
		System.out.println("car4. 차이름 : " + car4.carName + "    색상 : " + car4.color + "    제조사 : " + car4.maker);

		System.out.println("car4의 속도를 3회 증가!!!");
		for (int i=0; i<3; i++)
			car4.speedUp();
		System.out.println("car4 속도 : " + car4.speed);

		System.out.println("car4의 속도를 85 증가!!!");
		int a = car4.speedUp(85);
		System.out.println("car4 속도 : " + a);
		System.out.println("car4 속도 : " + car4.speed);
	}
}
