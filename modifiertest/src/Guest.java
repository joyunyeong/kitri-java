public class Guest {
	static int cnt; // class���� : Ŭ������ �ϳ� ��������� ���� : �� class�� �ص���
	String name; // instance ���� : ��ü.���� 

	public Guest(String name) {
		this.name = name;
	}

	public static int visit() {
		cnt++;
		return cnt;
	} 
}