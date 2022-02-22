package com.exception.charcheck;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {

		Run hw = new Run();
		hw.test1();
	}

	public void test1() {

		Scanner sc = new Scanner(System.in);
		CharacterProcess cp = new CharacterProcess();
		System.out.print("문자열 입력: ");
		String s = "";
		try {
			s = sc.nextLine();
			int count = cp.countAlpha(s);
			System.out.printf("%s에 알파벳은 %d개 있습니다.", s, count);
		} catch (CharCheckException e) {
			System.err.println(e.getMessage());
		}
		
	}
}
