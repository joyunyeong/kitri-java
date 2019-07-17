/*/1부터 10까지 출력, 홀수만 출력
public class ForTest1 {
	public static void main(String[] args) {
		int i = 0;
		for(i=1; i<11; i++){ 
			if (i % 2 == 1)
			{
					System.out.print(i + " ");
			}

		}
	}
}

*///1부터 100까지 출력, 10개 단위 줄바꿈
public class ForTest1 {
	public static void main(String[] args) {
		int i=0;
		int j=0; 
		

		for(i=1; i<101; i++){
			if(i%10 == 1 ) {
				System.out.println();
				}
			System.out.print(i + " ");
			}

		}
	}

