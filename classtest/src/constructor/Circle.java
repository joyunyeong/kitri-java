package constructor;

/*
1. ������ Radius
2. ���� : calcArea()
   �ѷ� : calcRound()
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
