package study;

import java.util.Scanner;

public class Study9 {
	
	public static void main(String[] args) {
		
		// for문
		System.out.println("INPUT NUMBER : ");
		Scanner scan = new Scanner(System.in);
		int inputNum = scan.nextInt();
		
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d * %d = %d\n", inputNum, i, (inputNum * i));
		}
		
		// while문
		System.out.println("INPUT NUMBER : ");
		int num = scan.nextInt();
		int i = 1;
		while (i < 10) {
			System.out.printf("%d * %d = %d\n", num, i, (num * i));
			i++;
		}
		
		//do while문
		do {
			System.out.println("무조건 1번은 실행");
		} while (false);
	}

}
