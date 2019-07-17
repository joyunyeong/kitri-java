package com.kitri.thread;

public class ThreadTest {
	
	public static void main(String[] args) {
		Thread t1 = new ThreadExt("홍");
		Thread t2 = new ThreadExt("당");
		Thread t3 = new ThreadExt("!!!");
		
//		t1.run();
//		t2.run();
//		t3.run();
		
		t1.start(); // scheduler에 의해서 동시자발적으로 생성됨 : 즉 섞여서 보임
		t2.start();
		t3.start();
		
		System.out.println("프로그램 종료!!!");
	}
}
