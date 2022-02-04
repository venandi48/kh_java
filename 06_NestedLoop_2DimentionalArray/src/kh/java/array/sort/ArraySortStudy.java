package kh.java.array.sort;

import java.util.Arrays;

/**
 * 배열정렬 알고리즘
 *  - 좋은 알고리즘: 문제를 해결하는데 있어서 시간적(처리시간)/공간적(메모리사용량) 효율이 좋은 방법
 *  
 *  종류
 *   - 순차정렬
 *   - 선택정렬
 *   - 버블정렬
 *   - 삽입정렬
 *   
 *   - 퀵정렬
 *   - 합병정렬
 *   - ...
 */
public class ArraySortStudy {
	public static void main(String[] args) {
		ArraySortStudy study = new ArraySortStudy();
		study.test1();
//		study.test2();
//		study.test3();
	}
	
	/**
	 * 선택정렬 Selection Sort
	 *  - 각 회차에 최소값을 가진 인덱스를 찾고, 마지막에 한번만 값교환 수행
	 */
	public void test3() {
		int[] arr = { 5, 4, 1, 3, 2 };

		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[min] > arr[j])
					min = j;
				print(i, min, arr);
			}
			swap(arr, min, i);
		}
		System.out.println("결과 : " + Arrays.toString(arr));
	}

	/**
	 * 순차정렬 Sequential Sort
	 * 
	 * 각 회차에 해당하는 인덱스에 알맞는 수를 찾음
	 */
	public void test2() {
		int[] arr = { 5, 4, 1, 3, 2 };
		System.out.println("시작 : " + Arrays.toString(arr));

		
		// 마지막 인덱스까지 갈 필요 없음( i = 0, 1, 2, 3)
		for (int i = 0; i < arr.length - 1; i++) {
			//비교대상이 될 인덱스번호이기때문에 초기식, 조건식 수정
			for (int j = i+1 ; j < arr.length; j++) {
				if (arr[i] > arr[j])
					swap(arr, i, j);
				print(i, j, arr);
			}
		}
		
		System.out.println("결과 : " + Arrays.toString(arr));
	}
	public void print(int i, int j, int[] arr) {
		System.out.printf("%d %d : %s%n", i , j , Arrays.toString(arr));
	}
	
	
	/**
	 * arr 값교환할 배열
	 * i, j 변경할 인덱스
	 */
	public void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	/**
	 * 변수의 값교환
	 */
	public void test1() {
		int a = 10;			
		int b = 20;
		
		int temp = b;
		b = a;
		a = temp;

		System.out.printf("a = %d, b = %d%n", a, b);
		
		
		int[] arr = {1, 3, 2};

		swap(arr, 1, 2);
		
		for(int n : arr)
			System.out.print(n + " ");
		
	}
}
