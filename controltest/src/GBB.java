/*
가위바위보 게임
1. 0(가위), 1(바위), 2(보)
2. 컴 : 난수(0, 1, 2)
3. 결과 Logic (이, 지, 비)
4. 결과 출력
	나 : 보, 컴 : 바위 결과 : 이겼다.
	나 : 보, 컴 : 가위 결과 : 겼다.
	나 : 보, 컴 : 보 결과 : 비겼다.
*/
public class GBB { //묵찌빠
	public static void main(String[] args) {
		int my = 0; //나는 묵
		int com = (int) (Math.random() * 3); // random : 0<ran<1
		String resultStr; 
		int result = (my - com + 2) % 3; //3으로 나누는 이유는 2까지 더한 값이 4까지 나올수가 있어서
		String my_kor, com_kor, res;

		if ((my == 0 && com == 1) || (my==1 && com == 2) || (my==2 && com == 0)) {
			res = "이겼다."; //(0,1) (1, 2) (2,0)
		}	else if ((my == 0 && com == 2) || (my==1 && com == 0) || (my==2 && com == 1)) {
			res = "졌다.";  // (0, 2), (1,0) (2, 1)
		}	else {
			res = "비겼다.";
		}


		// 가위,바위,보 나, 컴퓨터 → 국어
		switch(my) {
			case 0 : my_kor = "주먹"; break;
			case 1 : my_kor = "가위"; break;
			 default : my_kor = "보";
		}

		switch(com) {
			case 0 : com_kor = "주먹"; break;
			case 1 : com_kor = "가위"; break;
			 default : com_kor = "보";
		}
/*

		if (my==0 || com==0) {
			my_kor = "주먹";
			com_kor = "주먹";
			}	else if (my==1 || com==1) {
				my_kor = "가위";
				com_kor = "가위";
			}	else {
				my_kor = "보";
				com_kor = "보";
			}
	} */
				System.out.println("나 : " + my_kor +", 컴 : " + com_kor);
				System.out.println(res);

	}
}








/*	강사님 version.	

		if (result == 0) {
			resultStr = "졌다.";
		}	else if (result == 1) {
			resultStr = "이겼다.";		
		}	else {
			resultStr = "비겼다.";
		}

		switch(my) {
			case 0 : my_kor = "주먹"; break;
			case 1 : my_kor = "가위"; break;
			 default : my_kor = "보";
		}

		switch(com) {
			case 0 : com_kor = "주먹"; break;
			case 1 : com_kor = "가위"; break;
			 default : com_kor = "보";
		}
				System.out.println("나 : " + my_kor +", 컴 : " + com_kor);
				System.out.println(resultStr);
	}
}

*/