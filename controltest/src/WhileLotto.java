/*
1~3������ ���� �ٸ� ���� 3�� �߻�
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


