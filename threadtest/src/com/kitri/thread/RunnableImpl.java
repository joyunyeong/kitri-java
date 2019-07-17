package com.kitri.thread;

public class RunnableImpl implements Runnable { //extends로 못하고 implements를 쓸 경우 runnable을 써야함
	String msg;
	
	public RunnableImpl(String msg) {
		this.msg = msg;
	}
	
	@Override
	public void run() {
		for(int i=0; i<500; i++) 
			System.out.println(msg);
	}
}
