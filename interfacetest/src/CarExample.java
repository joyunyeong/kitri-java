public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		car.run();
		System.out.println("앞왼쪽 Tire 수명 : " + car.frontLeftTire + "회\n"
								+ "앞오른쪽 Tire 수명 : " + car.frontRightTire + "회\n"
								+ "뒤왼쪽 Tire 수명 : " + car.backLeftTire + "회\n"
								+ "뒤오른쪽 Tire 수명 : " + car.backRightTire + "회");
		System.out.println("-------------------------------------------");
		
		car.run();
	}
}
