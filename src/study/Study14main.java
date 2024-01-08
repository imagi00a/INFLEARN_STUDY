package study;

public class Study14main {

	public static void main(String[] args) {
		
		//디폴트 생성자
		Study14 obj1 = new Study14();

		//사용자 정의 생성자
		int[] iArr = {10, 20, 30};
		Study14 obj2 = new Study14("Hello", iArr);
		
		//소멸자
		Study14 obj3;
		
		obj3 = new Study14();
		obj3 = new Study14();
		
		System.gc();
		
		//this 키워드
		Study14 obj4 = new Study14(10, 20);
		
		obj4.getInfo();
		
	}
	
		
	

}
