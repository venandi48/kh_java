package com.kh.test;

public class Test {
	public static void main(String[] args) {
		int line = 5;

		for (int i = 0; i < line; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		int num = 10 ;

		System.out.println(num++);

		System.out.println(++num);
	}
}
