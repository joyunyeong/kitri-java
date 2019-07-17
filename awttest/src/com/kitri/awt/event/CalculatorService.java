package com.kitri.awt.event;

import java.awt.Label;

public class CalculatorService {
	CalculatorController calculatorController;
	Calculator c;
	
	
	public CalculatorService(CalculatorController calculatorController) { // »ý¼ºÀÚ
		this.calculatorController = calculatorController;
		
	}
	
	public void exit() {
		System.exit(0);
	}

	public void press() {
// System.out.println(calculator.btn[1].getLabel());	
//		 for (int i = 0; i < c.btn.length; i++) {
			 System.out.println(c.btn[1].getLabel());
//			 }
//				 String s = c.btn[i].
//				 c.numL.setText(s);
//		 }
//			c.numL.setText(c.s);
//			 }
//		System.exit(0);
//		System.out.println(btn[0].getLabel());
//		c.numL.setText(text());
	}
	
//	public String text() {
//		for (int i = 0; i < c.btn.length; i++) 
//		c.btn[0].setLabel("1");
		
//		String s = c.btn[0].getLabel();
//		System.out.println(s);
//		return s;
//	}
	
}
