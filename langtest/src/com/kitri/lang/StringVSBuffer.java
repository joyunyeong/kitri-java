package com.kitri.lang;

public class StringVSBuffer {
	public static void main(String[] args) {
		long st = System.nanoTime();
//		String str = "hello ";
//		for (int i = 0; i < 500; i++) 
//			str += i;
		
		StringBuffer sb = new StringBuffer("hello");
		for (int i = 0; i < 500; i++) 
			sb.append(i);
		
		
		System.out.println(System.nanoTime() - st);
		//976326 1000702 856049
		//233497 232535
	}
}
