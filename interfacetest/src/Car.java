public class Car {
	int frontLeftTire;
	int frontRightTire;
	int backLeftTire;
	int backRightTire;

	public Car() {
		frontLeftTire = 6;
		frontRightTire = 2;
		backLeftTire = 3;
		backRightTire = 4;

	}

	public void run() {
		System.out.println("[�ڵ����� �޸��ϴ�.]");
		frontLeftTire--;
		frontRightTire--;
		backLeftTire--;
		backRightTire--;

		/*if (frontLeftTire = 0) {
			System.out.println("");
		}
*/
		System.out.println(frontLeftTire + "" + frontRightTire + "" + backLeftTire + "" + backRightTire);
	}

	public void stop() {
		System.out.println("[�ڵ����� ����ϴ�.]");
	}
}
