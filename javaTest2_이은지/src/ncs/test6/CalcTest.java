package ncs.test6;

import java.util.Scanner;

public class CalcTest {
	public static void main(String[] args) {

		// 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 입력> ");
		int num1 = sc.nextInt();
		System.out.print("정수2 입력> ");
		int num2 = sc.nextInt();

		// 입력값 검사
		if (num1 < 1 || 9 < num1 || num2 < 1 || 9 < num2) {
			System.out.println("1~9 내의 정수를 입력하세요.");
			return;
		}

		// 메소드 호출 및 출력
		Calculate calc = new Calculate();
		System.out.println("합: " + calc.sum(num1, num2));
		System.out.println("차: " + calc.subtract(num1, num2));
		System.out.println("곱: " + calc.multiply(num1, num2));
		System.out.println("나누기: " + calc.divide(num1, num2));

	}
}
