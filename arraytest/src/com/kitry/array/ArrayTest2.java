package com.kitry.array;

public class ArrayTest2 {

	public static void main(String[] args) {
		Car car[] = new Car[6];
		car[0] = new Car("�Ÿ", "������", "����");
		car[1] = new Car("K5", "���", "���");
		car[2] = new Car("SM5", "����", "�Ｚ");
		car[3] = new Car("C500", "���", "����");
		car[4] = new Car("�Ͼ��", "��ѱ��", "���"); //
		car[5] = new Car("��Ÿ��", "������", "����");

		int len = car.length;
		for (int i = 0; i < len; i++)
			System.out.println(i + 1 + "��°���� : " + car[i]);
		System.out.println("---------------------------");

//		��ѱ�� �Ͼ��(���)�� 5��°�� �ֽ��ϴ�.
//		String name = "�Ͼ��";
		String name = "QM5";
		boolean b1 = false;
//		QM5�� �����ϴ�.

		for (int i = 0; i < len; i++)
			if (name.equals(car[i].getCarName())) {
				System.out.println(car[i].getColor() + " " + car[i].getCarName() + "(" 
			+ car[i].getMaker() + ")�� " + (i + 1) + "��° ������ �ֽ��ϴ�.");
				b1 = true;
				break;
			}
		if (b1 != true)
			System.out.println(name + "�� �����ϴ�.");
		
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
//						+ car[i].getMaker() + ")�� "
//			+ (i + 1) + "��° ������ �ֽ��ϴ�.");
//			} else {
//				System.out.println(name + "�� �����ϴ�.");
//					}
//				}
	}
}
