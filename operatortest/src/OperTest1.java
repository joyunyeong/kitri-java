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
	
		int y = c; //자동형변환
		System.out.println("y == " + y);

		c = (char)y; //강제형변환
		System.out.println("c == " + c);

		//boolean b = true; //boolean 에는 true, false만 있다. 형변환 시킬 수 있는 것들이 존재. (boolean은 type변환 불가)
		//int z = b;
		
		int z = 30;
		double d = z;
		//z = d; : error
		z = (int)d;
		
	}
}
