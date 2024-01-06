package study;
//클래스 이름은 일반적으로 첫글자는 대문자로 한다.
public class Study10_1 {

	public String color;
	public String gear;
	public int price;
	
	public Study10_1() {
		System.out.println("Study10_1 constructor");
	}
	
	public void start() {
		System.out.println("---start---");
	}
	
	public void stop() {
		System.out.println("---stop---");
	}
	
	public void info() {
		System.out.println(" ---info--- ");
		System.out.println("color : " + color);
		System.out.println("gear : " + gear);
		System.out.println("price : " + price);
	}
	
		
	

}
