package com.kitri.awt.event;

import java.awt.event.*;

//������ �������� ����� �̰� ȣ��
//����� �̰� ȣ�� �ϴ� ���Ҹ� ��(���񽺰� ó��)

public class BaseBallController extends WindowAdapter implements ActionListener, AdjustmentListener{
	//windowAdapter why? : implements windowListener�� �ϸ� ���� �������̵� �ؾ��ϱ� ������ �츮�� �ؾ� �� ���� closing �ϳ����� �׷��� windowAdapter���

	BaseBall baseBall;

	BaseBallService baseBallService;
	
	public BaseBallController(BaseBall baseBall) {
		this.baseBall = baseBall;
		baseBallService = new BaseBallService(this); //��ü���� //���񽺿��� �� �� �ְ�this�� 
	}

	@Override
	public void windowClosing(WindowEvent e) {
		baseBallService.exit();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		if(ob == baseBall.newG) {
			baseBallService.newGame();
		}else if(ob == baseBall.clear) {
			baseBallService.clear();
		}else if(ob == baseBall.dap) {
			baseBallService.showDap();
		}else if(ob == baseBall.fontC) {
			baseBallService.fontColorChange();
		}else if(ob == baseBall.exit) {
			baseBallService.exit();
		}else if(ob == baseBall.tf) {
			baseBallService.game();
		}else if(ob == baseBall.fontColorChooser.ok) {
			baseBallService.selectColor();
		}
	}
	
	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {	
		baseBallService.changeColor();	
	}
}

/*package com.kitri.awt.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BaseBallController implements ActionListener { // logic�� ���⿡��

	BaseBall baseBall;
	BaseBallService baseBallService;
	
	public BaseBallController(BaseBall baseBall) {
		this.baseBall = baseBall;
		baseBallService = new BaseBallService(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob = e.getSource();
		if (ob == baseBall.newG) {
			baseBallService.newGame();
		} else if (ob == baseBall.clear) {
			baseBallService.clear();
		} else if (ob == baseBall.dap) {
			baseBallService.showDap();
		} else if (ob == baseBall.fontC) {
			baseBallService.fontColorChange();
		} else if (ob == baseBall.exit) {
			
		} else if (ob == baseBall.tf) {
			baseBallService.game();
		} else if (ob == baseBall.fontColorChooser.ok) {
			baseBallService.selectColor();
		}
	}
	
}*/