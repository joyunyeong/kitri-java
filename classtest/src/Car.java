public class Car {
	String carName;
	String color;
	String maker;
	int speed;


	public void speedUp() { //return�� �ʿ�����Ƿ� void
		speed += 10;
	}

	public void speedDown() {
		speed -= 10;
		if(speed <0)
			stop(); // if�� �ؿ� �ڵ尡 1���϶��� ��ȣ ���� ��� x
	}

	public void stop() {
		speed = 0; 
	}
}