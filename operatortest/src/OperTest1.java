public class OperTest1
{
	public static void main(String[] args) 
	{
		int x =10;
		System.out.println(x);	// 10
		System.out.println(x++);	// 10
		System.out.println(--x);	// 10
		System.out.println(x++);	// 10
		System.out.println(++x);	// 12
		System.out.println(x--);	// 12
		System.out.println(--x);	// 10
		System.out.println(x++);	// 10
		System.out.println(x);		// 11

		char c = 'a';
		System.out.println("c == " + c);
		System.out.println("(int)c == " + (int)c);
	
		int y = c; //�ڵ�����ȯ
		System.out.println("y == " + y);

		c = (char)y; //��������ȯ
		System.out.println("c == " + c);

		//boolean b = true; //boolean ���� true, false�� �ִ�. ����ȯ ��ų �� �ִ� �͵��� ����. (boolean�� type��ȯ �Ұ�)
		//int z = b;
		
		int z = 30;
		double d = z;
		//z = d; : error
		z = (int)d;
		
	}
}
