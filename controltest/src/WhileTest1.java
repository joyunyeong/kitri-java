public class WhileTest1 {
	public static void main(String[] args) {
		System.out.println("1-10���� ���");
	/*	
		int i=0;
		while(i < 10) {
			System.out.print(++i + " ");
			//11���� ��µǴ� ����? ++i�̱� ������ 10�����ϰ� 11�� �ȴ�.
		}
		System.out.println("1-10������ ���߿� ���� �߻�.");
	*/	
		int i=0; //�����Ұ� �����Ⱚ!!
		boolean flag = true;
		while(flag) { //���ѷ���
			i++;
			int number = (int) (Math.random() * 11); // 0~11
			if( number != 0) {
			System.out.println("number == " + number);
			} else {
				System.out.println("0�� �߻�" + "(" + i + "��°)�Ǿ� ���α׷� ����!!!!");
				flag=false;
			}
		}
	}
}
