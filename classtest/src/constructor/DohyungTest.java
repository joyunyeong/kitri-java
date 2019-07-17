package constructor;

public class DohyungTest {
	public static void main(String[] args) {
		
		//가로가 4이고 세로가 3인 사각형의 넓이는 12 둘레는 14입니다.
		Rect r1 = new Rect();
		System.out.println("가로가 " + r1.width + "이고 세로가 " +r1.height + "인 사각형의 넓이는 " + r1.calcArea + "둘레는 " + r1.calcRound + "입니다.");

		// Rect r2; // " (내맘대로 가로/세로 다르게 가능)
		Rect r2 = new Rect();
		r2.width = 4;
		r2.height = 89;
		r2.calcArea();
		r2.calcRound();
		System.out.println("가로가 " + r2.width + "이고 세로가 " +r2.height + "인 사각형의 넓이는 " + r2.calcArea + "둘레는 " + r2.calcRound + "입니다.");
		
		// 반지름이 4인 원의 넓이는 48.xxx이고 둘레는 24.xxx입니다.
		Circle c1 = new Circle();
		System.out.println("반지름이 " + c1.radius + "인 원의 넓이는 " +c1.calcArea + " 둘레는 " + c1.calcRound);
		
		// Circle c2;
		Circle c2 = new Circle();
		c2.radius = 8;
		c2.calcArea();
		c2.calcRound();
	
		System.out.println("반지름이 " + c2.radius + "인 원의 넓이는 " +c2.calcArea + " 둘레는 " + c2.calcRound);


	}
}
