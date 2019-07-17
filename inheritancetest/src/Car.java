public class Car {
	String carName;
	String color;
	String maker;
	int speed;

	public Car() {
		this("쏘나타", "검정색", "현대");
		
	}

	public Car(String color) {
		this("쏘나타", color, "현대");
	}

	public Car(String carName, String color) {                                          
		this(carName, color, "현대");
	}

	public Car(String carName, String color, String maker) {
		super(); // 여기에 super가 있음 object를 출력할 수 있는 매개체!!!
		this.carName = carName;
		this.color = color;
		this.maker = maker;
	}

	void speedUp() {
		speed += 10;
	}

	int speedUp(int speed) {
		this.speed += speed;
		return this.speed;
	}

	void speedDown() {
		speed -= 10;
		if(speed < 0)
			stop();
	}

	int speedDown(int speed) {
		this.speed -= speed;
		if(this.speed < 0)
			stop();
		return this.speed;
	}

	void stop() {
		speed = 0;
	}

	@Override
	public String toString() { //public 안쓰면 에러뜸
		return maker + "에서 만든 " + color + " " + carName;
	}
	
	@Override
	public boolean equals(Object obj) {
		Car car = (Car) obj; //obj를 Car로 형변환
		// if(carName == car.carName) : 이 경우는 true, new String("")일 경우는 false 
		if(carName.equals(car.carName)) 
			return true;
		return false;
	}
}
