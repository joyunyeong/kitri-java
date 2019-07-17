/*
1. ���
   �⺻���(basicPrice) : �Ϲ� 3800, �ɾ� 5000
   ����� totalPrice
   ���(price) : �Ϲ� 100/km, �ɾ� 150/km
2. ��ݰ�� (calcPrice())
3. �ɾ����� : 0�� ~ 6�� ������� ����
*/
import java.util.*;
public class Taxi extends Car {
	int basicPrice;
	int totalPrice;
	int price;
	int pricePer;
	String gubun;

	Calendar calendar = Calendar.getInstance();
	int hour = calendar.get(Calendar.HOUR_OF_DAY); //24�ð� ������ �ð�
		

	public Taxi() {
		basicPrice = 3800;
	}

	public Taxi(String carName, String color, String maker) {
		super(carName, color, maker);
		if(hour>=0 && hour<7){
			basicPrice = 5000;
			gubun = "(�ɾ߿��)";
			pricePer = 150;
				} else {
				basicPrice = 3800;
				gubun = "(�Ϲݿ��)";
				pricePer = 100;
			}
	}

	int calcPrice(int km) {
		price = basicPrice + (pricePer*km);
		totalPrice += price;
		return price;
	}

	//method 2��
	int initPrice() { //���� �ʱ�ȭ : ó���� �մ�������
	 if (price != 0)
		price = 0;
	 return price;	 
	}

	int sumPrice() {	
		return totalPrice;
	}
	
	@Override //annotation : �ּ�, �� �ڿ� ���� �ǹ̰� �������Ŀ� ���� �ּ��� �ǹ̰� �޶���
	int speedUp(int speed) { //�������̵� �Ϸ��� �޼ҵ� ��ҹ��� �����ؼ� ���ľ��� �ȱ׷��� �״�� ����� ���X
		speed = super.speedUp(speed);//����Ŭ������ ������ �ִ� speedUp�� ȣ���ض�
		if (speed > 150) //���� �տ� this�� ���� �ʿ䰡 �����
			this.speed = 150;
		return this.speed;
	}



}

