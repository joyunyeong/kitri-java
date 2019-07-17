package com.kitri.awt.event;

import java.awt.event.*;

//로직만 만들어놓고 어떨때는 이거 호출
//어떨때는 이거 호출 하는 역할만 함(서비스가 처리)

public class BaseBallController extends WindowAdapter implements ActionListener, AdjustmentListener{
	//windowAdapter why? : implements windowListener로 하면 전부 오버라이드 해야하기 때문에 우리가 해야 할 것은 closing 하나뿐임 그래서 windowAdapter사용

	BaseBall baseBall;

	BaseBallService baseBallService;
	
	public BaseBallController(BaseBall baseBall) {
		this.baseBall = baseBall;
		baseBallService = new BaseBallService(this); //객체생성 //서비스에서 쓸 수 있게this로 
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

public class BaseBallController implements ActionListener { // logic은 여기에다

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