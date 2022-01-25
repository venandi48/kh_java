package com.kh.test.condition;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Test3 hw = new Test3();
		hw.test();
	}
	
	public void test() {
		int a;
		int b;
		char op;
		double rst = 0 ;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수입력: ");
		a = sc.nextInt();
		System.out.print("두번째 정수입력: ");
		b = sc.nextInt();
		System.out.print("연산자입력: ");
		op = sc.next().charAt(0);
		
		if ( a>0 && b>0 && op=='+' ) {
			rst = a + b;
			System.out.printf("%d %c %d = %.2f", a, op, b, rst);
		}
		else if ( a>0 && b>0 && op=='-' ) {
			rst = a - b;
			System.out.printf("%d %c %d = %.2f", a, op, b, rst);

		}
		else if ( a>0 && b>0 && op=='*' ) {
			rst = a * b;
			System.out.printf("%d %c %d = %.2f", a, op, b, rst);
		}
		else if ( a>0 && b>0 && op=='/' ) {
			rst = a / b;
			System.out.printf("%d %c %d = %.2f", a, op, b, rst);
}
		else
			System.out.println("잘못 입력 하셨습니다. 프로그램을 종료합니다.");

	}
}
