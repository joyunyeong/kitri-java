package com.kitri.lang;

public class StringBufferTest1 {
	public static void main(String[] args) {
//		StringBuffer sb1 = new StringBuffer(64); // �Ϲ������� 8�� ����� ��°� ����� ��
		StringBuffer sb1 = new StringBuffer("hello "); // ���������� �׻� 16ĭ(�⺻��) ���� + 6ĭ = 22ĭ
		System.out.println("1. sb1 == " + sb1);
		int cap = sb1.capacity();
		System.out.println("�ʱ� ũ�� : " + cap + "\t���ڿ� �� : " + sb1.length()); // 16ĭ�� �ӽ���������� ����
		sb1.append("java");
		System.out.println("2. sb1 == " + sb1); // string�̶� �ٸ����� ���̰� �Һ��ϴ°��� �ƴ϶�� ��
		sb1.append(" !!!!!");
		System.out.println("3. sb1 == " + sb1); // string�̶� �ٸ����� ���̰� �Һ��ϴ°��� �ƴ϶�� ��
		cap = sb1.capacity();
		System.out.println("ũ�� : " + cap + "\t���ڿ� �� : " + sb1.length());
		// ũ��:22, ���ڿ� : 16 why? ũ��� 22�� �Ҵ������� �� �ȿ� ���� : ������ �þ�°�
		sb1.append(" !!!!!!");
		System.out.println("4. sb1 == " + sb1);
		cap = sb1.capacity();
		System.out.println("ũ�� : " + cap + "\t���ڿ� �� : " + sb1.length());
		System.out.println("---------------------------------");

		sb1.insert(10, "@@@"); // 10��°���� @@@�� �����ض�
		System.out.println("5. sb1 == " + sb1);

		sb1.delete(10, 12); // 10���� 12������ �����ض�
		System.out.println("6. sb1 == " + sb1);

		sb1.deleteCharAt(10);
		System.out.println("7. sb1 == " + sb1);

		sb1.replace(6, 10, "�ڹ�"); // ������ ������ ��ġ�ض�
		System.out.println("8. sb1 == " + sb1);

		sb1.reverse(); // �����̵� �ѱ��̵� ���� �˾Ƽ� �Ųٷ� �ٲ���
		System.out.println("9. sb1 == " + sb1);
		
		sb1.setCharAt(9, '@'); //���°�� �ִ� �ϳ��� ���ڸ� �̰ɷ� �ٲ��~
		System.out.println("10. sb1 == " + sb1);

		String s1 = new String(sb1); // StringBuffer�� ������ �� ������ �̰� �Ἥ String���� �����.
		String s2 = sb1.toString();
		System.out.println("---------------------------------");
		
		String str = "hello �ڹ� !!!";
		String findStr = "�ڹ�";
		String replaceStr = "java";
		
		StringBuffer str2 = new StringBuffer(str);
		str2.delete(6, 12);
		
		if(findStr.equals("�ڹ�")) {
			str2.insert(6, replaceStr);
			str2.insert(10, " !!!");
			System.out.println(str2);
		}
		else
			System.out.println(findStr + "�� �����ϴ�.");
		
	/*	int start =str.indexOf(findStr);
	 * 
	 * 	if(start != -1) {
	 * 		StringBuffer sb = new StringBuffer(str);
	 * 		int end =start + findStr.length();
	 *		 sb.replace(start, end, replaceStr);
	 * 		System.out.println(sb.toString());
	 * 	} else{
	 * 		System.out.println(findStr + "�� �����ϴ�.");
	 * }
	 */
		
		
	}
}
























