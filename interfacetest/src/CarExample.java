public class CarExample {
	public static void main(String[] args) {
		Car car = new Car();
		car.run();
		System.out.println("�տ��� Tire ���� : " + car.frontLeftTire + "ȸ\n"
								+ "�տ����� Tire ���� : " + car.frontRightTire + "ȸ\n"
								+ "�ڿ��� Tire ���� : " + car.backLeftTire + "ȸ\n"
								+ "�ڿ����� Tire ���� : " + car.backRightTire + "ȸ");
		System.out.println("-------------------------------------------");
		
		car.run();
	}
}
