/*
score(����)�� 
	90 �̻��̸� ������ A
	80 �̻��̸� ������ B
	70 �̻��̸� ������ C
	60 �̻��̸� ������ D
	60 �̸��̸� ������ F
x5 �̻��̸� X+
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

		System.out.println("������ " + score + "���̹Ƿ� " + grade + "�����Դϴ�.");
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

		System.out.println("������ " + x + "���̹Ƿ� " + score + "�����Դϴ�.");
	}
}*/
