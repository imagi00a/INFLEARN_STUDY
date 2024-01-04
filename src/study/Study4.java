package study;

public class Study4 {

	public static void main(String[] args) {

		// 특수문자

		System.out.println("Good Morning");
		System.out.println("Good\tMorning");
		System.out.println("Good\nMorning");
		System.out.println("Good\'Morning\'");
		System.out.println("Good\"Morning\"");
		System.out.println("Good\\Morning\\");

		// 서식문자

		System.out.println("오늘의 기온은 10도 입니다.");
		System.out.printf("오늘의 기온은 %d도 입니다.\n", 10);

		int num1 = 20;
		System.out.println("오늘의 기온은 " + num1 + "도 입니다.");
		System.out.printf("오늘의 기온은 %d도 입니다.\n", num1);

		System.out.printf("홍길동's Info. : %d학년 %d반 %d번\n", 6, 2, 10);
		
		//정수
		
		int num2 = 30;
		System.out.printf("num2(10진수) : %d\n", num2);
		System.out.printf("num2(10진수) : %o\n", num2);
		System.out.printf("num2(10진수) : %x\n", num2);
		
		//문자
		
		System.out.printf("소문자 \'%c\'의 대문자는 \'%c\'입니다.\n", 'a', 'A');
		
		//문자열
		System.out.printf("\'%s\'을 대문자로 바꾸면 \'%s\'입니다.\n", "java", "JAVA");
		
		//실수
		float f = 1.23f;
		System.out.printf("f = %f\n",f);
		
		double d = 1.23456d;
		System.out.printf("d = %f\n",d);
		
		//서식문자 정렬 기능
		System.out.printf("%d\n", 123);
		System.out.printf("%d\n", 1234);
		System.out.printf("%d\n", 12345);
		
		System.out.println();
		
		System.out.printf("%5d\n", 123);
		System.out.printf("%5d\n", 1234);
		System.out.printf("%5d\n", 12345);
		
		System.out.println();
		
		//서식문자 소수점제한 기능
		
		System.out.printf("%f\n", 1.23);
		System.out.printf("%.0f\n", 1.23);
		System.out.printf("%.1f\n", 1.23);
		System.out.printf("%.2f\n", 1.23);
		System.out.printf("%.3f\n", 1.23);
	}

}
