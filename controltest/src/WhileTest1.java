public class WhileTest1 {
	public static void main(String[] args) {
		System.out.println("1-10까지 출력");
	/*	
		int i=0;
		while(i < 10) {
			System.out.print(++i + " ");
			//11까지 출력되는 이유? ++i이기 때문에 10만족하고 11이 된다.
		}
		System.out.println("1-10까지의 수중에 난수 발생.");
	*/	
		int i=0; //질문할것 쓰레기값!!
		boolean flag = true;
		while(flag) { //무한루프
			i++;
			int number = (int) (Math.random() * 11); // 0~11
			if( number != 0) {
			System.out.println("number == " + number);
			} else {
				System.out.println("0이 발생" + "(" + i + "번째)되어 프로그램 종료!!!!");
				flag=false;
			}
		}
	}
}
