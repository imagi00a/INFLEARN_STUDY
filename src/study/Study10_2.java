package study;

public class Study10_2 {

	public String color;
	public int price;
	
	public Study10_2(String c, int p) {
		System.out.println(" Study10_2 constructor ");
		color = c;
		price = p;		
	}
	
	public void info() {
		System.out.println(" -- info() -- ");
		System.out.println("color : " + color);
		System.out.println("price : " + price);
	}
	
}
