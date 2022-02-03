package com.kh.test.nested.loop;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Test3 hw = new Test3();
		hw.test();
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		int num;
		int star = 1;
		
		//사용자 입력
		do {
			System.out.print("정수 하나 입력 : ");
			num = sc.nextInt();
			
			if (num <= 0) 
				System.out.println("양수가 아닙니다.");
		} while (num <= 0);

		
		//상단부 출력
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < star; j++) {
				System.out.print("*");
			}
			star++;
			System.out.println();
		}
		
		//하단부 출력
		star = num - 1;
		for (int i = 0; i < num - 1; i++) {
			//여백출력
			for (int j = 0; j < num - star; j++) {
				System.out.print(" ");
			}
			//별 출력
			for (int j = 0; j < star; j++) {
				System.out.print("*");
			}
			star--;
			System.out.println();
		}
		
	}
}
