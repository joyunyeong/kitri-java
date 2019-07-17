public class IfElseIfTest1 {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		String a;

		if (x==y) {
			a = "같다";
		} else if (x>y) {
					a = "크다";
				}	else {
						a = "작다";
					}
		
		
		System.out.println(x + "는 " + y + "보다 " + a);
	
	}
}
