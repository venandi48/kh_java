package com.kh.star;

public class Print7 {
	public static void main(String[] args) {
		int line = 5;
		int blank = line / 2;

		for (int i = 0; i < line; i++) {

			// 상단부
			if (i < line / 2 + 1) {
				for (int j = 0; j < line - blank; j++) {
					if (j < blank) {
						System.out.print(" ");
					} else
						System.out.print("*");
				}
				System.out.println();
				blank--;
			}

			// 하단부
			else {
				if (blank < 0)
					blank = 1;

				for (int j = 0; j < line - blank; j++) {
					if (j < blank)
						System.out.print(" ");
					else
						System.out.print("*");
				}
				System.out.println();
				blank++;
			}
		}
	}
}