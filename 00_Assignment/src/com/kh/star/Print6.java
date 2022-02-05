package com.kh.star;

public class Print6 {
	public static void main(String[] args) {
		int line = 5;
		int underBlank = 2; //하단부 시작열의 공백수로 초기화
		
		
		for (int i = 0; i < line; i++) {
			
			
			// 상단부
			if (i <= line / 2) {
				for (int j = 0; j < line; j++) {
					if (j < line - 2 * i - 1)
						System.out.print(" ");
					else
						System.out.print("*");
				}
			}

			// 하단부
			else {
				for (int j = 0; j < line; j++) {
					if (j < underBlank)
						System.out.print(" ");
					else
						System.out.print("*");
				}
				underBlank += 2;
			}
			System.out.println();
		}
	}
}
