package constructor;

public class Car {
	String carName;
	String color; //null
	String maker;
	int speed;

	public Car() {
		/*
		carName = "�Ÿ";
		color = "������";
		maker = "����";
		*/
		this ("�Ÿ", "������", "����");}

	public Car(String color) { //
		carName = "�Ÿ";
		color = color;
		maker = "����";
	/*	
		new Car("�Ÿ", color, "����");*/}

	public Car(String carName, String color) { // �ܵ����� String cn�� �����µ� c�� cn���� ���� ��
	/*	this.carName = carName;
		this.color = color;
		maker = "����"; 
	*/	
		new Car(carName, color, "����");}

	public Car(String carName, String color, String maker) {
		this.carName = carName;
		this.color = color;
		this.maker = maker; 
		}


	public void speedUp() {
	 speed += 10;
	}

	int speedUp(int speed) {
		this.speed += speed;
		return this.speed;
	}

	int speedDown(int speed) {
		this.speed -= speed;
		if(this.speed<0)
			stop();
		
		return this.speed;
	}

	public void speedDown() {
	 speed -= 10;
	 if (speed < 0)
	 stop();
	}

	public void stop() {
	 speed = 0;
	}
	
	String info() {
		return "���̸� : " + carName + "    ���� : " + color + "    ������ : " + maker; // this�� ���� class���̸� �� �ʿ䰡 ����.
	}

}