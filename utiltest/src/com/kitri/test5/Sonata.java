package com.kitri.test5;

public class Sonata extends Car{
	
	private String series;
	private String use;
	
	
	public Sonata(String color, int account, String series, String use) {
		super(color, account);
		Car car1 = new Car("흰색", 5000);//, "승용", "NF");
		Car car2 = new Car("은색", 7000);//, "업무", "Brilliant");
		Car car3 = new Car("감홍색", 4000);//, "택시", "EF");
		Car car4 = new Car("검정색", 6000);//, "승용", "Hybrid");
	}

	@Override
	public String toString() {
		return "[용도] " + use + "\t[시리즈] " + series;
	}
	
}
