package study;

public class Study15 {

	String name;
	
	//static 키워드가 붙은 변수는 서로 데이터를 공유해서 쓸수 있다.
	//너무 많은 데이터를 스새틱 처리하면 오히려 메모리에 부하를 줄 수 있다.
	static int amount =0;
	
	public Study15(String name) {
		this.name = name;
	}
	
	
	public void saveMoney(int money) {
		
		amount += money;
		System.out.println("amount : " + amount);
	}
	
	public void spendMoney(int money) {
		
		amount -= money;
		System.out.println("amount : " + amount);
	}
	
	public void getBankInfo() {
		
		System.out.println("Employee name : " + this.name);
		System.out.println("amount : " + amount);
	}
	
}
