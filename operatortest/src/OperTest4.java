public class OperTest4 {
	public static void main(String[] args) {
		int jumin = 1;
		String gender = jumin % 2 == 0 ? "여자" : "남자";
		System.out.println("주민번호가 " + jumin + "인 당신은 " + gender + "입니다.");

		// 점수가 80 이상이면 합격, 80 미만이면 불합격
		// 당신의 점수는 xx이므로 xx입니다.
		int score = 80;
		String pn = score >= 80 ? "합격" : "불합격";
		System.out.println("당신의 점수는 " + score + "이므로 " + pn + "입니다.");

	}
}
