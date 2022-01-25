package com.kh.test.condition;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Test1 hw = new Test1();
		hw.test();
	}
	
	public void test() {
		String tmp;
		char user;
		String typeRst;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자입력: ");
		tmp = sc.next();
		user = tmp.charAt(0);
		
		if ( user >= 48 && user <= 57) {
			typeRst = "숫자";
		}
		else if ( (user >= 65 && user <= 90) || (user >= 97 && user <= 122)) {
			typeRst = "알파벳";
		}
		else
			typeRst = "특수문자";

		System.out.printf("입력하신 문자 %c 은/는 %s입니다.%n", user, typeRst);

		
		
	}
}
