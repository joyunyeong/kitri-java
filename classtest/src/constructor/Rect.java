package constructor;

/*
1. ���� width, ���� height
2. ���� : calcArea()
   �ѷ� : calcRound() ������ ���� 2����!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
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
