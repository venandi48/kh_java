package com.kh.test.break_continue;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Test1 hw = new Test1();
		hw.test1();
		hw.test2();
	}
	
	/**
	 * 정수 하나 입력받고
	 * 입력받은 값까지 홀수 곱하기
	 */
	public void test1() {
		Scanner sc = new Scanner(System.in);
		int multiply = 1; //곱셈 결과값 저장변수
		
		System.out.print("정수입력: ");
		int num = sc.nextInt();
		
		int i = 1;
		while(true) {	
			multiply *= i;
			i += 2;

			//곱하는 값이 사용자 입력값보다 크면 탈출
			if(i > num) break;
		}
		System.out.printf("홀수의 곱셈 결과: %d%n", multiply);
	}

	public void test2() {
		Scanner sc = new Scanner(System.in);
		int largeNum;
		int smallNum;
		int sum = 0;
		
		System.out.print("정수를 하나 입력하세요. => ");
		int num1 = sc.nextInt();
		System.out.print("다른 정수를 하나 입력하세요. => ");
		int num2 = sc.nextInt();
		
		if(num1 < num2) {
			largeNum = num2;
			smallNum = num1;
		}
		else {
			largeNum = num1;
			smallNum = num2;
		}
		
		while(true) {
			
			if(smallNum % 2 == 1) sum += smallNum;
			smallNum++; //증감식
			
			if(smallNum > largeNum) break;
		}
		System.out.printf("%d부터 %d까지의 홀수의 합은 %d입니다 %n", num1, num2, sum);
	}
}
