package constructor;

public class Car {
	String carName;
	String color; //null
	String maker;
	int speed;

	public Car() {
		/*
		carName = "쏘나타";
		color = "검정색";
		maker = "현대";
		*/
		this ("쏘나타", "검정색", "현대");}

	public Car(String color) { //
		carName = "쏘나타";
		color = color;
		maker = "현대";
	/*	
		new Car("쏘나타", color, "현대");*/}

	public Car(String carName, String color) { // 단독으로 String cn은 못쓰는데 c랑 cn같이 쓰면 됨
	/*	this.carName = carName;
		this.color = color;
		maker = "현대"; 
	*/	
		new Car(carName, color, "현대");}

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
		return "차이름 : " + carName + "    색상 : " + color + "    제조사 : " + maker; // this는 같은 class안이면 쓸 필요가 없다.
	}

}