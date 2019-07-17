package com.kitri.lang;

/*
Wrapper Class : �⺻DT�� Ŭ����ȭ
�⺻DT 	WrapperClass
boolean		Boolean
char		Character
byte		Byte
short		Short
int			Integer
long		Long
float		Float
double		Double
*/
public class WrapperClassTest {
	public static void main(String[] args) {
		Boolean b1 = new Boolean(true);
		boolean b2 = b1.booleanValue();
		boolean b3 = Boolean.parseBoolean("true"); // �길 �˸��

		if (b2)
			System.out.println("b2�� true��.");
		if (b3)
			System.out.println("b3�� true��.");

		String s = "13223"; // �ݵ�� ���������� ���ڿ��� �����ϴ�.
		System.out.println(s + 4);
		// Integer i = new Integer(s); //1234
		// int x = i.intValue();
		int x = Integer.parseInt(s);
		System.out.println(x + 4); // 127

		s = "123.45";
		double d = Double.parseDouble(s);
		System.out.println(d + 4);

		Integer i2 = new Integer(3);
		int y = i2; // unboxing : �̰� ������ ������ �̰� wrapper class �����̴�.

	}

}
