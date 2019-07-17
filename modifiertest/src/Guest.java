public class Guest {
	static int cnt; // class변수 : 클래스당 하나 만들어지는 변수 : 걍 class로 해도됨
	String name; // instance 변수 : 객체.변수 

	public Guest(String name) {
		this.name = name;
	}

	public static int visit() {
		cnt++;
		return cnt;
	} 
}