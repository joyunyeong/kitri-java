package com.kitri.thread;

public class RunnableTest {
	public static void main(String[] args) {
		//ThreadEXT랑 다른건 상속받음의 여부 > implements를 더 많이 쓴다.(RunnableImpl)
		
		Thread t1 = new Thread(new RunnableImpl("퐁"));
		Thread t2 = new Thread(new RunnableImpl("당"));
		Thread t3 = new Thread(new RunnableImpl("!!!"));
		
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("프로그램 종료!!"); 
	}
}
