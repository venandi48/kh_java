package com.kh.test.loop;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Test3 hw = new Test3();
		hw.test();
	}
	
	public void test() {
		int num;
		Scanner sc= new Scanner(System.in);
		System.out.print("정수입력: ");
		num = sc.nextInt();
		
		if(num < 1 && num > 9) {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			return;
		}
		
		for(int i = 1 ; i < 10 ; i++) {
			System.out.println(num + "X" + i + "=" + num*i);
		}
	}
}
