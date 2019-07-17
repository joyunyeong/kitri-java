package com.kitri.exception.runtime;

public class NumberFormetTest {
	public static void main(String[] args) {
		
		String s = "123";
//		try	{	
//			int x = Integer.parseInt(s);
//			System.out.println(x + 100);
//			} catch(NumberFormatException e) {
//				System.out.println("숫자가 아닙니다.");
//		}
//	}
		if(isNumber(s)) {
			int x = Integer.parseInt(s);
			System.out.println(x+100);
		} else
		System.out.println("숫자가 아닙니다.");
	}
		
	private static boolean isNumber(String str) { //리턴타입이 불린일때는 get보다는 is
		boolean flag = true;
		int len = str.length();
		for (int i = 0; i < len; i++) {
			int num = str.charAt(i) - 48;
			if(num < 0 || num > 9) {
				flag = false;
				break;
			}
		}
		return flag;
	}
}
