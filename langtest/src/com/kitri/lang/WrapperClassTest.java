package com.kitri.lang;

/*
Wrapper Class : 기본DT을 클래스화
기본DT 	WrapperClass
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
		boolean b3 = Boolean.parseBoolean("true"); // 얘만 알면됨

		if (b2)
			System.out.println("b2는 true다.");
		if (b3)
			System.out.println("b3는 true다.");

		String s = "13223"; // 반드시 숫자형식인 문자열만 가능하다.
		System.out.println(s + 4);
		// Integer i = new Integer(s); //1234
		// int x = i.intValue();
		int x = Integer.parseInt(s);
		System.out.println(x + 4); // 127

		s = "123.45";
		double d = Double.parseDouble(s);
		System.out.println(d + 4);

		Integer i2 = new Integer(3);
		int y = i2; // unboxing : 이게 가능한 이유는 이게 wrapper class 여서이다.

	}

}
