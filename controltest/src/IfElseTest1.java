public class IfElseTest1 {
	public static void main(String[] args) {
		int x = 10;
		int y = 10; 
		/*if (x > y) {
			System.out.println(x + "는 " + y + "보다 크다."); 
		} else {
		System.out.println(x + "는 " + y + "보다 작다."); 
		}
		*/

		String a; //가능하면 같다 비교부터 해주는게 좋음
		if(x==y) {
			a = "같다";
		} else {
			if(x<y) {
				a = "작다";
			} else {
				a = "크다";
		
	}
}
		System.out.println(x + "는 " + y + "보다 " + a);

// Q. 이따 남자/여자 if/else 바꿔보기

	}
}
