package com.kh.star;

public class Print5 {
	public static void main(String[] args) {
		int line = 3;

		for (int i = 0; i < line; i++) {
			for (int j = 0; j < 2 * line - 1; j++) {
				if(j<i*2)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
}
