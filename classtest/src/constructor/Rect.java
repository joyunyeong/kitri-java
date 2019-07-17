package constructor;

/*
1. 가로 width, 세로 height
2. 넓이 : calcArea()
   둘레 : calcRound() 생성자 각각 2개씩!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
*/
public class Rect {
	int width, height;
	double calcArea, calcRound;

	public Rect() {
		width = 4;
		height = 3;
	}

	public void calcArea() {
		this.calcArea = width * height;
	}

	public void calcRound() {
		this.calcRound = 2*(width+height);
	}
		
}
