package com.kitry.array;

public class ArrayTest2 {

	public static void main(String[] args) {
		Car car[] = new Car[6];
		car[0] = new Car("쏘나타", "검정색", "현대");
		car[1] = new Car("K5", "흰색", "기아");
		car[2] = new Car("SM5", "은색", "삼성");
		car[3] = new Car("C500", "흰색", "벤츠");
		car[4] = new Car("니어로", "비둘기색", "기아"); //
		car[5] = new Car("싼타페", "검정색", "현대");

		int len = car.length;
		for (int i = 0; i < len; i++)
			System.out.println(i + 1 + "번째구역 : " + car[i]);
		System.out.println("---------------------------");

//		비둘기색 니어로(기아)는 5번째에 있습니다.
//		String name = "니어로";
		String name = "QM5";
		boolean b1 = false;
//		QM5는 없습니다.

		for (int i = 0; i < len; i++)
			if (name.equals(car[i].getCarName())) {
				System.out.println(car[i].getColor() + " " + car[i].getCarName() + "(" 
			+ car[i].getMaker() + ")는 " + (i + 1) + "번째 구역에 있습니다.");
				b1 = true;
				break;
			}
		if (b1 != true)
			System.out.println(name + "은 없습니다.");
		
//		Car findCar = null;
//		for (int i = 0; i < len; i++) { 
//			if (name.equals(car[i].getCarName())) {
//				findcar = car[i];
//		    	 count = i+1;
//				break; 
//					}
//				}
//		if(findCar != null) {
//			System.out.println(car[i].getColor() + " " + car[i].getCarName() + "(" 
//						+ car[i].getMaker() + ")는 "
//			+ (i + 1) + "번째 구역에 있습니다.");
//			} else {
//				System.out.println(name + "은 없습니다.");
//					}
//				}
	}
}
