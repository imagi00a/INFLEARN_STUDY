package study;

import java.util.Scanner;

public class Study6 {
	
public static void main(String[] args) {
	
		int[] arr1 = new int[5]; //배열 선언 단계
		
		arr1[0] = 100;
		arr1[1] = 200;
		arr1[2] = 300;
		arr1[3] = 400;
		arr1[4] = 500;
		
		System.out.println("arr[0] : " + arr1[0]);
		System.out.println("arr[1] : " + arr1[1]);
		System.out.println("arr[2] : " + arr1[2]);
	
		int[] arr2 = {10, 20, 30};
		
		System.out.println("arr[0] : " + arr2[0]);
		System.out.println("arr[1] : " + arr2[1]);
		System.out.println("arr[2] : " + arr2[2]);

		//자바에서의 배열은 한번 선언하면 크기를 변경할 수 없다.
		
		//배열을 이용한 학사관리
		
		String[] name = {"가렌", "다리우스", "티모", "애쉬", "케이틀린"};
		
		int[] score = new int[5];
		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("%s의 점수를 입력하시오. : ", name[0]);
		score[0] = scan.nextInt();
		System.out.printf("%s의 점수를 입력하시오. : ", name[1]);
		score[1] = scan.nextInt();
		System.out.printf("%s의 점수를 입력하시오. : ", name[2]);
		score[2] = scan.nextInt();
		System.out.printf("%s의 점수를 입력하시오. : ", name[3]);
		score[3] = scan.nextInt();
		System.out.printf("%s의 점수를 입력하시오. : ", name[4]);
		score[4] = scan.nextInt();
		
		System.out.printf("%s 점수 : %.2f\n", name[0], (double)score[0]);
		System.out.printf("%s 점수 : %.2f\n", name[1], (double)score[1]);
		System.out.printf("%s 점수 : %.2f\n", name[2], (double)score[2]);
		System.out.printf("%s 점수 : %.2f\n", name[3], (double)score[3]);
		System.out.printf("%s 점수 : %.2f\n", name[4], (double)score[4]);
		
		double ave = (double)(score[0] + score[1] + score[2] + score[3] + score[4] ) / 5;
		System.out.printf("--------------------\n평 점 : %.2f" , ave);
		
		scan.close();
		
		System.out.println();
		
	}
}
