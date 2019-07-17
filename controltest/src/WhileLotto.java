/*
1~3까지의 서로 다른 난수 3개 발생
*/

public class WhileLotto {
	public static void main(String[] args) {
		int n1 = (int) (Math.random() * 3) + 1;
		int n2 = (int) (Math.random() * 3) + 1;
		int n3 = (int) (Math.random() * 3) + 1;

		while (n1 == n2 || n2 == n3 || n1 == n3) {
			n1 = (int) (Math.random() * 3) + 1;
			n2 = (int) (Math.random() * 3) + 1;
			n3 = (int) (Math.random() * 3) + 1;
		}
		System.out.println(n1 + " " + n2 + " " + n3);
	}
}


