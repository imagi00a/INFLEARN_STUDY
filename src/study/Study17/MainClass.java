package study.Study17;

public class MainClass {
	
	public static void main(String[] args) {
	
	
		 ChildClass childClass = new ChildClass();
		 childClass.childFun();
		 childClass.parentFun();
//		 private 메소드는 상속할 수 없다.
//		 childClass.privateFun();
	}

}