package com.kh.test.condition;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Test4 hw = new Test4();
		hw.test();
	}
	
	public void test() {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.print("1~10 사이의 정수를 입력하세요: ");
		a = sc.nextInt();
		
		if( a<1 || a>10 ) {
			System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
		}
		else if( a%2 == 0) {
			System.out.println("짝수다");
		}
		else if( a%2 == 1) {
			System.out.println("홀수다");
		}
		
	}
}
