package array;

import java.util.ArrayList;

public class Test10 {
	public static void main(String[] args) {
		int[][] array = { { 12, 41, 36, 56 }, { 82, 10, 12, 61 }, { 14, 16, 18, 78 }, { 45, 26, 72, 23 } };

		int[] copyAr = new int[array.length * array[0].length];
		int num = 0;

		// 1차원 배열에 3의 배수만 기록
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] % 3 == 0) {
					copyAr[num++] = array[i][j];
				}
			}
		}

		// 중복값 제거
		ArrayList<Integer> list = new ArrayList<>();
		for (int n : copyAr) {
			if (!list.contains(n)) //list 내부에 n값이 없을 때
				list.add(n); //list에 해당 n값 삽입
		}

		// copyAr배열 0으로 초기화
		for (int i = 0; i < copyAr.length; i++) {
			copyAr[i] = 0;
		}

		// 배열 copyAr에 list값 저장
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) != 0)
				copyAr[i] = list.get(i);
		}

		// 0 제외하고 출력
		System.out.print("copyAr : ");
		for (int n : copyAr) {
			if (n != 0)
				System.out.print(n + " ");
		}

	}
}
