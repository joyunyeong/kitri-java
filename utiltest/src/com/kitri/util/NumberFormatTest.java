package com.kitri.util;

import java.text.ChoiceFormat;
import java.text.DecimalFormat;
import java.text.Format;

public class NumberFormatTest {
	public static void main(String[] args) {
		double number = 3242365453.1263;
//		34,563,242,365,453.123
		Format f = new DecimalFormat("##,###,###,###,###.##");
		String numStr = f.format(number);
		System.out.println(numStr);	
	}
}
