package com.calc;

//run configurations 설정한 뒤 실행
public class Calculator {
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("정수를 [2개] 입력하세요.");
			return;
		}

		String str1 = args[0];
		String str2 = args[1];
			
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);

		if (num1 < 1 || num1 > 9 || num2 < 1 || num2 > 9) {
			System.out.println("입력범위 오류");
			return;
		}

		System.out.printf("합: %d%n", num1 + num2);
		System.out.printf("차: %d%n", num1 - num2);
		System.out.printf("곱: %d%n", num1 * num2);
		
		if (num2 > num1) {
			int temp = num2;
			num2 = num1;
			num1 = temp;
		}
		if(num2<=0) 
			System.out.printf("나누기: %d%n", 0);
		else
			System.out.printf("나누기: %d%n", num1 / num2);

	}
}
