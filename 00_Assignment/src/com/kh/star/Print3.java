package com.kh.star;

public class Print3 {
	public static void main(String[] args) {
		int line = 5;

		for (int i = 0; i < line; i++) {
			int blank = line - i - 1; //각 열의 공백 수

			for (int j = 0; j < line; j++) {
				if (j < blank)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();

		}
	}
}
