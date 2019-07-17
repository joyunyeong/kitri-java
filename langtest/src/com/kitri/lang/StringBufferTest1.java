package com.kitri.lang;

public class StringBufferTest1 {
	public static void main(String[] args) {
//		StringBuffer sb1 = new StringBuffer(64); // 일반적으로 8의 배수를 잡는게 좋기는 함
		StringBuffer sb1 = new StringBuffer("hello "); // 여유공간은 항상 16칸(기본값) 정도 + 6칸 = 22칸
		System.out.println("1. sb1 == " + sb1);
		int cap = sb1.capacity();
		System.out.println("초기 크기 : " + cap + "\t문자열 수 : " + sb1.length()); // 16칸의 임시저장공간이 생김
		sb1.append("java");
		System.out.println("2. sb1 == " + sb1); // string이랑 다른점은 길이가 불변하는것이 아니라는 것
		sb1.append(" !!!!!");
		System.out.println("3. sb1 == " + sb1); // string이랑 다른점은 길이가 불변하는것이 아니라는 것
		cap = sb1.capacity();
		System.out.println("크기 : " + cap + "\t문자열 수 : " + sb1.length());
		// 크기:22, 문자열 : 16 why? 크기는 22를 할당했지만 그 안에 들어간것 : 꽉차야 늘어나는것
		sb1.append(" !!!!!!");
		System.out.println("4. sb1 == " + sb1);
		cap = sb1.capacity();
		System.out.println("크기 : " + cap + "\t문자열 수 : " + sb1.length());
		System.out.println("---------------------------------");

		sb1.insert(10, "@@@"); // 10번째에다 @@@를 삽입해라
		System.out.println("5. sb1 == " + sb1);

		sb1.delete(10, 12); // 10부터 12전까지 삭제해라
		System.out.println("6. sb1 == " + sb1);

		sb1.deleteCharAt(10);
		System.out.println("7. sb1 == " + sb1);

		sb1.replace(6, 10, "자바"); // 어디부터 어디까지 대치해라
		System.out.println("8. sb1 == " + sb1);

		sb1.reverse(); // 영문이든 한글이든 지가 알아서 거꾸로 바꿔줌
		System.out.println("9. sb1 == " + sb1);
		
		sb1.setCharAt(9, '@'); //몇번째에 있는 하나의 문자를 이걸로 바꿔라~
		System.out.println("10. sb1 == " + sb1);

		String s1 = new String(sb1); // StringBuffer를 가져갈 수 있으니 이걸 써서 String으로 만든다.
		String s2 = sb1.toString();
		System.out.println("---------------------------------");
		
		String str = "hello 자바 !!!";
		String findStr = "자바";
		String replaceStr = "java";
		
		StringBuffer str2 = new StringBuffer(str);
		str2.delete(6, 12);
		
		if(findStr.equals("자바")) {
			str2.insert(6, replaceStr);
			str2.insert(10, " !!!");
			System.out.println(str2);
		}
		else
			System.out.println(findStr + "은 없습니다.");
		
	/*	int start =str.indexOf(findStr);
	 * 
	 * 	if(start != -1) {
	 * 		StringBuffer sb = new StringBuffer(str);
	 * 		int end =start + findStr.length();
	 *		 sb.replace(start, end, replaceStr);
	 * 		System.out.println(sb.toString());
	 * 	} else{
	 * 		System.out.println(findStr + "은 없습니다.");
	 * }
	 */
		
		
	}
}
























