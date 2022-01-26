package com.kh.test.loop;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Test4 hw = new Test4();
		hw.test();
	}
	public void test() {
		String input; //사용자 입력 문자열
		char target; //찾을 문자
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력: ");
		input = sc.nextLine();
		System.out.print("검색할 문자 입력: ");
		target = sc.next().charAt(0);

		for(int i = 0; i < input.length() ; i++) {
			if(input.charAt(i) == target)
				count++;
		}
		
		System.out.printf("'%c'가 포함된 갯수: %d 개%n", target, count);
		
	}
}
