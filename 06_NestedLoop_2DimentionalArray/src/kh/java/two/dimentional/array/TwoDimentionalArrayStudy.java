package kh.java.two.dimentional.array;

public class TwoDimentionalArrayStudy {
	public static void main(String[] args) {
		TwoDimentionalArrayStudy study = new TwoDimentionalArrayStudy();
//		study.test1();
//		study.test2();
		study.test3();
	}
	
	/**
	 * 2차원배열 초기화
	 *  - 배열할당 + 번지수별 초기화
	 */
	public void test3() {
		//두 방법 모두 사용 가능
		int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 } };
		int[][] arr2 = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };

//		for (int i = 0; i < arr1.length; i++) {
//			for (int j = 0; j < arr1[0].length; j++) {
//				System.out.print(arr1[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		
		//for each문
		for (int[] a : arr1) {
			for (int b : a) {
				System.out.print(b + " ");
			}
			System.out.println();
		}
	}
	
	/**
	 * 알파벳 배열 char[2][26]
	 * - 0행 대문자
	 * - 1행 소문자
	 */
	public void test2() {
		char[][] alphabet = new char[2][26];
		
		System.out.println(alphabet.length);
		System.out.println(alphabet[0].length);

		for (int i = 0; i < alphabet.length; i++) {
			for (int j = 0; j < alphabet[0].length; j++) {
				if (i == 0)
					alphabet[i][j] = (char) (65 + j);
				else
					alphabet[i][j] = (char) (97 + j);
			}
		}
		for (int i = 0; i < alphabet.length; i++) {
			for (int j = 0; j < alphabet[0].length; j++) {
				System.out.print(alphabet[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	/**
	 * 2차원배열
	 */
	public void test1() {
		//1. 배열 참조변수 선언
		int[][] arr;
		
		//2. 배열 할당 - 자료형의 기본값으로 초기화
		arr = new int[3][2]; // 3행2열

		//3. 값대입 & 사용
		// 배열요소 간 규칙성이 발견되는 경우 중첩반복문과 별도의 증감변수를 이용해 값대입 가능
		int k = 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				arr[i][j] = k++;
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.printf("arr[%d][%d] : %d%n", i, j, arr[i][j]);
			}
		}
	}
}
