package com.exception.number;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		Run hw = new Run();
		hw.test();
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 입력: ");
		int a = sc.nextInt();
		System.out.print("정수2 입력: ");
		int b = sc.nextInt();
		
		NumberProcess np = new NumberProcess();
		if(np.checkDouble(a, b)==true)
			System.out.printf("%d는 %d의 배수이다.", a, b);
		else
			System.out.printf("%d는 %d의 배수가 아니다.", a, b);
			
	}
}
