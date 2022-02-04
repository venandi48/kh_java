package com.kh.star;

public class Print2 {
	public static void main(String[] args) {
		int line = 5;
		
		for (int i = 0; i < line; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
