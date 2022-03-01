package study.withoutcode.algorithm.array;

import java.util.Scanner;

public class BinarySearchStudy {
	public static void main(String[] args) {
		BinarySearchStudy study = new BinarySearchStudy();
		study.run();
	}

	public void run() {
		int[] numArr = { 1, 5, 7, 8, 19, 22, 30 };

		Scanner sc = new Scanner(System.in);
		System.out.print("찾고자 하는 값 입력 > ");
		int target = sc.nextInt();

		int targetIndex = binarySearch(numArr, target);
		if (targetIndex < 0)
			System.out.printf("%d는 배열의 인덱스에 없습니다.%n", target);
		else
			System.out.printf("%d는 배열의 인덱스[%d]에 있습니다.%n", target, targetIndex);

		System.out.print("배열: [");
		for (int i = 0; i < numArr.length; i++) {
			if (i == numArr.length - 1)
				System.out.print(numArr[i] + "]");
			else
				System.out.print(numArr[i] + ", ");
		}
	}

	public int binarySearch(int[] arr, int target) {
		int leftIndex = 0; // 배열의 좌측 끝단에서 시작
		int rightIndex = arr.length - 1; // 배열의 우측 끝단에서 시작
		int pivot = updatePivot(leftIndex, rightIndex);

		while (leftIndex < rightIndex) {
			if (target == arr[pivot]) { // 피봇에 목표값이 있을 경우
				return pivot;
			} else if (target > arr[pivot]) { // 목표값이 피봇 위치의 값보다 클 경우
				leftIndex = pivot + 1;
				pivot = updatePivot(leftIndex, rightIndex);
			} else if (target < arr[pivot]) { // 목표값이 피봇 위치의 값보다 작을 경우
				rightIndex = pivot - 1;
				pivot = updatePivot(leftIndex, rightIndex);
			}
		}
		return -1; // 배열 내에 목표값이 없을 경우
	}

	public int updatePivot(int leftIndex, int rightIndex) {
		return (leftIndex + rightIndex) / 2;
	}
}
