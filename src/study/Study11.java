package study;

public class Study11 {

		public String name;
		public String gender;
		public int age;
	
	public Study11() {
		System.out.println(" --Study11Class constructor-- ");
	}
	
	public void setInfo(String n, String g, int a) {
		System.out.println(" --setInfo() START-- ");
		
		name = n;
		gender = g;
		age = a;
	}
	
	public void getInfo() {
		System.out.println(" --genInfo() START-- ");
		
		System.out.println("name : " + name);
		System.out.println("gender : " + gender);
		System.out.println("age : " + age);
		
		//객체 내부에서만 사용할 수 있다.
		mySecret();
	}
	//접근제한자
	private void mySecret() {
		System.out.println(" --mySecret()-- ");
	}
	
}
