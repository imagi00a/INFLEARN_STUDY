package study;

public class Study13main {

	public static void main(String[] args) {

		Study13 study1 = new Study13();
		Study13 study2 = new Study13();
		Study13 study3 = new Study13();
		//똑같은 클래스에서 객체를 생성 했지만 겍체가 엄연히 다른 메모리 공간에 존재
		System.out.println("study1 : " + study1 );
		System.out.println("study2 : " + study2 );
		System.out.println("study3 : " + study3 );
		
		if(study1 == study2) {
			System.out.println("study1과 study2는 같다");
		}else {
			System.out.println("study1과 study2는 같지않다");
		}
		
		if(study3 == study2) {
			System.out.println("study3과 study2는 같다");
		}else {
			System.out.println("study3과 study2는 같지않다");
		}
		
		if(study1 == study3) {
			System.out.println("study1과 study3는 같다");
		}else {
			System.out.println("study1과 study3는 같지않다");
		}
		study1.getInfo();
		
		study1 = null; //레퍼런스X
//		study1.getInfo(); // Null Point Exception 발생
		
		study2.getInfo();
	}

}
