/*
public class Lotto {
	public static void main(String[] args) {
		int n1, n2, n3;
		do {
			 n1 = (int) (Math.random() * 3) + 1;
			 n2 = (int) (Math.random() * 3) + 1;
			 n3 = (int) (Math.random() * 3) + 1;
		} while (n1 == n2 || n2 == n3 || n1 == n3);
		System.out.println(n1 + " " + n2 + " " + n3);
	}
}
*/

public class Lotto {
	public static void main(String[] args) {
		int n1, n2, n3;
		do {
			 n1 = (int) (Math.random() * 3) + 1;
			 n2 = (int) (Math.random() * 3) + 1;
			 n3 = (int) (Math.random() * 3) + 1;
		} while (n1 == n2 || n2 == n3 || n1 == n3);
		System.out.println(n1 + " " + n2 + " " + n3);
	}
}

