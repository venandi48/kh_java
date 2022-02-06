package array;

import java.util.ArrayList;

public class Test10 {
	public static void main(String[] args) {
		int[][] array = { { 12, 41, 36, 56 }, { 82, 10, 12, 61 }, { 14, 16, 18, 78 }, { 45, 26, 72, 23 } };

		int[] copyAr = new int[array.length * array[0].length];
		int num = 0;

		// 1차원 배열에 3의 배수만 기록
		for (int i = 0; i < array.length; i++) {
			inner: for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] % 3 == 0) {

					for (int k = 0; k < copyAr.length; k++)
						if (array[i][j] == copyAr[k])
							continue inner;

					copyAr[num++] = array[i][j];
				}
			}
		}

		// 0 제외하고 출력
		System.out.print("copyAr : ");
		for (int n : copyAr) {
			if (n != 0)
				System.out.print(n + " ");
		}

	}
}
