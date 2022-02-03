package kh.java.nested.loop;

import java.util.Scanner;

public class NestedLoopStudy {

	public static void main(String[] args) {
		NestedLoopStudy study = new NestedLoopStudy();
//		study.test1();
//		study.test2();
//		study.test3();
//		study.test4();
//		study.test5();
//		study.test6();
//		study.test7();
//		study.test8();
		study.test9();
		
	}

	/**
	 * E모양으로 출력하기
	 */
	public void test9() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("□");
				if (i % 2 == 0)
					break;
			}
			System.out.println();
		}
	}
	
	/**
	 * 계단식 ★찍기
	 */
	public void test8() {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
	}

	/**
	 * 라벨이 있는 반복문 continue
	 *  - 각 단에서 단과 n이 같을때까지만 출력
	 */
	public void test7() {
		abc: //반복문 이름 지정
		for (int i = 1; i < 10; i++) {
			System.out.println("=== " + i + "단 ===");
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d * %d = %d%n", i, j, i * j);
				if (i == j) {
					System.out.println(); //개행 위치 변경
					continue abc; //탈출할 반복문 지정
				}
			}
		}
	}
	
	/**
	 * 라벨이 있는 반복문 break
	 *  - 단*n의 결과가 50미만까지만 출력
	 */
	public void test6() {
		outer: //반복문의 이름(라벨) 지정
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if (i * j > 50)
					break outer; //탈출할 반복문 지정
				System.out.printf("%d * %d = %d%n", i, j, i * j);
			}
			System.out.println();
		}
	}
	
	/**
	 * 2~9단 구구단 출력
	 */
	public void test5() {
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				if (j == 1)
					System.out.println("=== " + i + "단 ===");
				System.out.printf("%d * %d = %d%n", i, j, i * j);
				if (j == 9)
					System.out.println();
			}
			
		}
	}
	
	/**
	 * 별★찍기
	 * ★★★★★
	 * ★★★★★
	 * ★★★★★
	 * 
	 * 사용자로부터 행, 열, 문자를 입력받아 출력
	 * 
	 */
	public void test4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("행: ");
		int row = sc.nextInt();
		System.out.print("열: ");
		int col = sc.nextInt();
		System.out.print("문자: ");
		char ch = sc.next().charAt(0);

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.printf("%c", ch);
			}
			System.out.println();
		}
	}
	
	/**
	 * 5행 7열 표의 좌표를 출력하세요.
	 * 사용자로부터 행과 열을 입력받아 표의 좌표 출력하기
	 */
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("행 입력: ");
		int row = sc.nextInt();

		System.out.print("열 입력: ");
		int col = sc.nextInt();

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.printf("(%d, %d) ", i, j);
			}
			System.out.println();
		}
	}

	/**
	 * 행(가로) - 바깥반복문
	 * 열(세로) - 안쪽반복문
	 */
	public void test2() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print("(" + i + ", " + j + ") ");
			}
			System.out.println();
		}
	}

	/**
	 * 중첩반복문 Nested Loop
	 *  - 바깥반복문 한 번에 안쪽반복문 n번이 처리되는 구조
	 *  - 행렬 표현에 적합: 바깥반복문=행, 안쪽반복문=열
	 */
	public void test1() {

		for (int i = 0; i < 3; i++) {
			System.out.println(i);
			
			for (int j = 0; j < 2; j++) {
				System.out.println("  " + j);
			}
		}
	}

}
