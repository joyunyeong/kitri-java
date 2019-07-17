public class  SwitchTest2{
	public static void main(String[] args) {
		int score =96;
		String grade;
		switch(score/10) {
			case 10 : case 9 : grade = "A"; break;
			case 8 : grade = "B"; break;
			case 7 : grade = "C"; break;
			case 6 : grade = "D"; break;
			default : grade = "F"; 
	}

	if(score > 60 && (score == 100 || score % 10 >= 5)) {
		grade += "+";
		}
		System.out.println("점수가 " + score + "점이므로 " + grade + "학점입니다.");
	}
}




/*		String hak;
		int score = 95;
		int score2 = score%10;
		String p;

		if(score>=90) {
			hak = "A";
		} else if (score>=80){
			hak = "B";
		} else if (score>=70){
			hak = "C";
		} else if (score>=60){
			hak = "D";
		} else if (score>=50){
			hak = "F";
		}

		switch (score2)
		{

			case 5 : p = "+";
		
		}

	System.out.println("점수가 " + score + "점이므로 " + score2 + "학점입니다.");



	} */

