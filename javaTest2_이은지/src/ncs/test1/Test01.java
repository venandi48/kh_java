package ncs.test1;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = 0;
		String[] arrInput;
		double factor1 = 0, factor2 = 0, factor3 = 0; // 평가단위 초기화
		double result; // 평가점수
		String gradeName; // 평가등급명

		// 사용자 입력
		do {
			System.out.print("점수입력: ");
			String input = sc.nextLine();
			// 공백을 구분자로 입력값 분리
			arrInput = input.split(" ");
			size = arrInput.length;
			if (size != 5)
				System.out.println("다시 입력 하세요");
		} while (size != 5);

		// 문자열->숫자
		int[] arrNum = new int[size];
		for (int i = 0; i < arrInput.length; i++) {
			arrNum[i] = Integer.parseInt(arrInput[i]);

			if (arrNum[i] < 10 || 99 < arrNum[i]) {
				System.out.println("다시 입력 하세요");
				return;
			}
		}

		// 평가점수 도출
		factor1 = (arrNum[0] + arrNum[1]) / 2;
		factor2 = (arrNum[2] + arrNum[3]) / 2;
		factor3 = arrNum[4];
		result = factor1 * 0.6 + factor2 * 0.2 + factor3 * 0.2;
		System.out.println("평가점수: " + result);

		// 평가등급 구분
		if (result >= 90)
			gradeName = "Gold Class";
		else if (result >= 80)
			gradeName = "Silver Class";
		else if (result >= 70)
			gradeName = "Bronze Class";
		else
			gradeName = "Normal Class";
		System.out.println("Class: " + gradeName);

	}
}
