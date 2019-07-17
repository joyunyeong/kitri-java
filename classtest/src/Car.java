public class Car {
	String carName;
	String color;
	String maker;
	int speed;


	public void speedUp() { //return값 필요없으므로 void
		speed += 10;
	}

	public void speedDown() {
		speed -= 10;
		if(speed <0)
			stop(); // if문 밑에 코드가 1줄일때는 괄호 빼도 상관 x
	}

	public void stop() {
		speed = 0; 
	}
}