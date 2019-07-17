public class WhileGugudan {
	public static void main(String[] args) {
		int dan = 2;
		while (dan<10)
		{
			int i=1; //i의 위치 주의하기
			while(i<10) {
				System.out.print(dan + " * " + i + " = " + dan * i + "    ");
				i++;
		}
			dan++;
			System.out.println();
		}
	}
}

		