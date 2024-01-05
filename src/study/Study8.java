package study;

import java.util.Scanner;

public class Study8 {

	public static void main(String[] args) {

	int num1 = 10;
	int num2 = 20;
	
	// if(조건식)
	if(num1 < num2) {
		System.out.println("num1는 num2보다 작다.");
	}
		System.out.println();
		
	// if(조건식) else
		if(num1 < num2) {
			System.out.println("num1는 num2보다 작다.");
		} else {
			System.out.println("num1는 num2보다 크거나 같다.");
		}
		System.out.println();
		
		// if(조건식) else if(조건식)
		if(num1 < num2) {
			System.out.println("num1는 num2보다 작다.");
		} else if(num1 > num2) {
			System.out.println("num1는 num2보다 크다.");
		} else {
			System.out.println("num1는 num2와 같다.");
		}
	
	
	// swich문
		System.out.println("점수를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		
		switch (score) {
			case 100:
			case 90:
			System.out.println("수");
			break;
			
			case 80:
			System.out.println("우");
			break;
				
			case 70:
			System.out.println("미");
			break;

			default:
			System.out.println("try again!!");
			break;
		}
		scan.close(); 
	}

}
