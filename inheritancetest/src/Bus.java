public class Bus extends Car{
	int passenger;
	int seats;
	boolean available;
	int gibonMoney = 1000;
	int money;
	int totalMoney;

	public Bus() {
		seats = 45;
		money = 0;
	}
	
	// 1.
	int getOn(int getOn) {
		if(seats<getOn) { 
			if(seats==45) { //ž�°��� 45���� ���ٸ�
			System.out.println("�� �̻� Ż �� �����ϴ�. ž�°��� �ο� > " + seats);
			seats -= seats;//80 45
			available = false;
			money = getOn*gibonMoney;
			totalMoney += money;
			} else {
				seats -= passenger;
				available = false;
				money = getOn*gibonMoney;
				totalMoney += money;
			}
		} else {
			seats -= getOn;
			available = true;
			money = getOn*gibonMoney;
			totalMoney += money;
		}
		return seats; // ź �����ŭ �پ���.
	}

	// 2.
	int getOff(int getOff) {
		return seats += getOff; // ź �����ŭ �پ���.
	}

	// 3.

	
	
}
