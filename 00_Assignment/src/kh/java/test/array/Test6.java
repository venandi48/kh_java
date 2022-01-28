package kh.java.test.array;

import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {
		Test6 hw = new Test6();
		hw.test();
	}

	public void test() {
		Scanner sc = new Scanner(System.in);
		int size; // 사용자입력을 받을 배열크기
		boolean bool = true;

		// 올바른 값 입력받기
		do {
			System.out.print("홀수인 양의정수를 하나 입력하세요 : ");
			size = sc.nextInt();

			if (size > 0 && size % 2 == 1)
				break;
			else
				System.out.println("잘못 입력하셨습니다.");
		} while (bool);

		int[] arr = new int[size];
		int center = size / 2; // 중간위치 인덱스번호
		int num = 1; // 배열 내 저장할 값

		// 배열에 값 저장 및 출력
		for (int i = 0; i < size; i++) {
			if (i < center) {
				arr[i] = num++;
				System.out.print(arr[i] + ", ");
			} else if (i == size - 1) {
				arr[i] = num;
				System.out.print(arr[i]);
			} else {
				arr[i] = num--;
				System.out.print(arr[i] + ", ");
			}
		}

	}
}
