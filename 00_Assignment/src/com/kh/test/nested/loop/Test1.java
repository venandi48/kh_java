package com.kh.test.nested.loop;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Test1 hw = new Test1();
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
			for (int j = 0; j <= i; j++) {
				System.out.print(j+1);
			}
			System.out.println();
		}
	}
}
