package com.kh.test.loop;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Test2 hw = new Test2();
		hw.test();
	}
	
	public void test() {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.printf("정수입력: ");
		num = sc.nextInt();
		
		for(int i = 1 ; i <= num ; i++) {
			if (i % 2 == 1) System.out.print("수");
			else System.out.print("박");
		}
		System.out.println();
	}
}
