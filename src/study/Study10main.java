package study;

public class Study10main {

	public static void main(String[] args) {

		Study10_1 myCar1 = new Study10_1();
		myCar1.color = "red";
		myCar1.gear = "auto";
		myCar1.price = 100;
		
		myCar1.start();
		myCar1.stop();
		myCar1.info();
		
		System.out.println();
		
		Study10_1 myCar2 = new Study10_1();
		myCar2.color = "blue";
		myCar2.gear = "auto";
		myCar2.price = 200;
		
		myCar2.start();
		myCar2.stop();
		myCar2.info();
		
		System.out.println();
		
		Study10_2 myBicycle = new Study10_2("red", 100);
		myBicycle.info();
		
		myBicycle.color = "green";
		myBicycle.info();
	}
 
}
