package com.kitri.exception.runtime;

public class NumberFormetTest {
	public static void main(String[] args) {
		
		String s = "123";
//		try	{	
//			int x = Integer.parseInt(s);
//			System.out.println(x + 100);
//			} catch(NumberFormatException e) {
//				System.out.println("���ڰ� �ƴմϴ�.");
//		}
//	}
		if(isNumber(s)) {
			int x = Integer.parseInt(s);
			System.out.println(x+100);
		} else
		System.out.println("���ڰ� �ƴմϴ�.");
	}
		
	private static boolean isNumber(String str) { //����Ÿ���� �Ҹ��϶��� get���ٴ� is
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