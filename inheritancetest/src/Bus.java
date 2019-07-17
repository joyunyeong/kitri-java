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
			if(seats==45) { //탑승객이 45명보다 많다면
			System.out.println("더 이상 탈 수 없습니다. 탑승가능 인원 > " + seats);
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
		return seats; // 탄 사람만큼 줄어든다.
	}

	// 2.
	int getOff(int getOff) {
		return seats += getOff; // 탄 사람만큼 줄어든다.
	}

	// 3.

	
	
}
