package study;

public class Study14 {
	
	public int x;
	public int y;

	 public Study14() {
		 System.out.println(" --Default constructor-- ");
	 }
	 public Study14(String s, int[] iArr) {
		 System.out.println(" --UserDefined constructor-- " );
		 
		 System.out.println("s --> " + s);
		 System.out.println("iArr --> " + iArr);
	 }
	 @Override
		protected void finalize() throws Throwable {
			
			System.out.println(" --finalize() method-- ");
			
			super.finalize();
		}
	 
	 public Study14(int x, int y) {
		 this.x = x;//this.전역변수 = 매개변수;
		 this.y = y;
	 }
	 public void getInfo() {
		 System.out.println("x --> " + x);//전역변수
		 System.out.println("y --> " + y);
		 
	 }
}
