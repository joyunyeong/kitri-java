package com.kitri.test5;

public class Sonata extends Car{
	
	private String series;
	private String use;
	
	
	public Sonata(String color, int account, String series, String use) {
		super(color, account);
		Car car1 = new Car("���", 5000);//, "�¿�", "NF");
		Car car2 = new Car("����", 7000);//, "����", "Brilliant");
		Car car3 = new Car("��ȫ��", 4000);//, "�ý�", "EF");
		Car car4 = new Car("������", 6000);//, "�¿�", "Hybrid");
	}

	@Override
	public String toString() {
		return "[�뵵] " + use + "\t[�ø���] " + series;
	}
	
}
