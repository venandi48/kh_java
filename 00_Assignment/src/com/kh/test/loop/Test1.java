package com.kh.test.loop;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Test1 hw = new Test1();
		hw.test();
	}
	
	public void test() {
		int num;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("범위의 최대값을 입력하세요: ");
		num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			if(i % 2 == 0)
				sum += i;
		}
		System.out.println("정수" + num + "까지의 짝수 합: " + sum);
	}
}
