package study.withoutcode.algorithm.array;

public class MoveZeroesStudy {
	public static void main(String[] args) {
		MoveZeroesStudy study = new MoveZeroesStudy();
		study.run();
	}

	public void run() {
		int[] numArr = { 1, 5, 0, 8, 0, 0, 12, 7, 15 };
		System.out.print("Before: [");
		for (int i = 0; i < numArr.length; i++) {
			if (i == numArr.length - 1)
				System.out.print(numArr[i] + "]");
			else
				System.out.print(numArr[i] + ", ");
		}
		System.out.println();

		moveZeroes(numArr);
		System.out.print("After: [");
		for (int i = 0; i < numArr.length; i++) {
			if (i == numArr.length - 1)
				System.out.print(numArr[i] + "]");
			else
				System.out.print(numArr[i] + ", ");
		}

	}

	public void moveZeroes(int[] arr) {
		int zeroIndex = 0;

		for (int searchIndex = 0; searchIndex < arr.length; searchIndex++) {
			if (arr[searchIndex] != 0) { // 탐색 위치의 배열값이 0이 아닐 때
				swap(arr, searchIndex, zeroIndex);
				zeroIndex++;
			}
		}
	}

	public void swap(int[] arr, int indexA, int indexB) {
		int temp = arr[indexA];
		arr[indexA] = arr[indexB];
		arr[indexB] = temp;
	}
}
