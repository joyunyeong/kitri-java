/*
1. 요금
   기본요금(basicPrice) : 일반 3800, 심야 5000
   요금합 totalPrice
   요금(price) : 일반 100/km, 심야 150/km
2. 요금계산 (calcPrice())
3. 심야할증 : 0시 ~ 6시 할증요금 적용
*/
import java.util.*;
public class Taxi extends Car {
	int basicPrice;
	int totalPrice;
	int price;
	int pricePer;
	String gubun;

	Calendar calendar = Calendar.getInstance();
	int hour = calendar.get(Calendar.HOUR_OF_DAY); //24시간 기준의 시간
		

	public Taxi() {
		basicPrice = 3800;
	}

	public Taxi(String carName, String color, String maker) {
		super(carName, color, maker);
		if(hour>=0 && hour<7){
			basicPrice = 5000;
			gubun = "(심야요금)";
			pricePer = 150;
				} else {
				basicPrice = 3800;
				gubun = "(일반요금)";
				pricePer = 100;
			}
	}

	int calcPrice(int km) {
		price = basicPrice + (pricePer*km);
		totalPrice += price;
		return price;
	}

	//method 2개
	int initPrice() { //가격 초기화 : 처음에 손님탔을때
	 if (price != 0)
		price = 0;
	 return price;	 
	}

	int sumPrice() {	
		return totalPrice;
	}
	
	@Override //annotation : 주석, 그 뒤에 무슨 의미가 나오느냐에 따라 주석의 의미가 달라짐
	int speedUp(int speed) { //오버라이드 하려면 메소드 대소문자 구분해서 잘쳐야함 안그러면 그대로 결과값 출력X
		speed = super.speedUp(speed);//상위클래스가 가지고 있는 speedUp을 호출해라
		if (speed > 150) //따라서 앞에 this를 붙일 필요가 사라짐
			this.speed = 150;
		return this.speed;
	}



}

