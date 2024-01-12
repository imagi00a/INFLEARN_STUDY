package study.study18;

public class FirstChildClass extends ParentClass {

	int openYear = 2000;
	
	public FirstChildClass() {
		System.out.println("FirstChildClass Constructor");
	}
	@Override
	public void makeJJajang() {
		System.out.println(" -- FirstChildClass makeJJajang()-- ");
}
	public void getOpenYear() {
		System.out.println("ChildClass's Open year : " + this.openYear);
		System.out.println("ChildClass's Open year : " + super.openYear);
		
	}
	
}
