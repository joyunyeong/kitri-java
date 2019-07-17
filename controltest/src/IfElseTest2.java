/*
score(점수)가 
	90 이상이면 학점은 A
	80 이상이면 학점은 B
	70 이상이면 학점은 C
	60 이상이면 학점은 D
	60 미만이면 학점은 F
x5 이상이면 X+
*/
public class IfElseTest2 {
	public static void main(String[] args) {
		int score = 58;
		//char grade;
		String grade;
		if(score >= 90) {
			grade = "A";
		} else if(score >= 80) {
			grade = "B";
		} else if(score >= 70) {
			grade = "C";
		} else if(score >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}

		if(score > 60 && (score == 100 || score % 10 >= 5)) {
			grade += "+";
		}

		System.out.println("점수가 " + score + "점이므로 " + grade + "학점입니다.");
	}
}


/*public class IfElseTest2 {
	public static void main(String[] args) {
		int x = 96;
		String score;
		if (x>=90) {
			score = "A";
		} else if (x>=80) {
			score = "B";
		} else if (x>=70) {
			score = "C";
		}
		else if (x>=60) {
			score = "D";
		} else {
			score = "F";
		}

		if (score > 60 && (score == 100 || score % 10 >= 5))
		{
			grade += "+";
		}

		System.out.println("점수가 " + x + "점이므로 " + score + "학점입니다.");
	}
}*/
