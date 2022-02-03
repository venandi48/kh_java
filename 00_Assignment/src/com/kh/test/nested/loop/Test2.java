package com.kh.test.nested.loop;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Test2 hw = new Test2();
		hw.test();
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		int num;
		
		//사용자 입력
		do {
			System.out.print("정수 하나 입력 : ");
			num = sc.nextInt();
			
			if (num <= 0) 
				System.out.println("양수가 아닙니다.");
		} while (num <= 0);
		
		//출력
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
