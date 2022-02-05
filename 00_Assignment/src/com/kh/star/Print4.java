package com.kh.star;

public class Print4 {
	public static void main(String[] args) {
		int line = 5;

		for (int i = 0; i < line; i++) {
			for (int j = 0; j < line + i; j++) {
				if (j < line - i - 1)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
}
