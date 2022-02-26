package com.kh.test;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		new Test().count();
	}
	
	public void count() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("문자열 입력:");
			String str = sc.nextLine();
			if (str.equals("exit"))
				break;
			else
				System.out.println(str.length() + "글자임");
		}
		System.out.println("프로그램종료");
	}
}
