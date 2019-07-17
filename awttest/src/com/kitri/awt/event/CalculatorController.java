package com.kitri.awt.event;

import java.awt.event.*;

public class CalculatorController implements ActionListener {
	
	Calculator calculator;
	CalculatorService calculatorService;
	
	String[] s = new String[16];

	public CalculatorController(Calculator calculator) {
		this.calculator = calculator;
		calculatorService = new CalculatorService(this);
//		calculator.numL.setText(" >> 계산할 내용을 입력하세요");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		
		 if(ob == calculator.exit) 
			calculatorService.exit();
			 
		 for (int i = 0; i < calculator.btn.length; i++) {
			 if(ob == calculator.btn[i]) {
				 System.out.println(calculator.btn[i].getLabel());
				 calculatorService.press();	 
			 }
		 }	
		
	}
}
