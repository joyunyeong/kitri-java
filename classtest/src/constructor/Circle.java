package constructor;

/*
1. 반지름 Radius
2. 넓이 : calcArea()
   둘레 : calcRound()
*/
public class Circle {
	int radius;
	double calcArea, calcRound;

	public Circle() {
		radius = 4;
	}

	double calcArea() {
		return 3.14 * radius * radius;
	}

	double calcRound() {
		return 3.14 * 2 * radius;
	}

}
