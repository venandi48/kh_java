package com.kh.test.condition;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Test1 hw = new Test1();
		//hw.test();
		hw.charTest();
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
		//범위를 user>='A' 이런식으로도 작성할 수 있다.
		else if ( (user >= 65 && user <= 90) || (user >= 97 && user <= 122)) {
			typeRst = "알파벳";
		}
		else
			typeRst = "특수문자";

		System.out.printf("입력하신 문자 %c 은/는 %s입니다.%n", user, typeRst);
		
	}

	 public void charTest(){
			Scanner sc = new Scanner(System.in);
			System.out.println("0~9, 알파벳, 기타특수문자를 입력하세요.");
			
			char ch = sc.next().charAt(0);

			String result = "";
			
			if (Character.isDigit(ch))
				result = "숫자";
			else if (Character.isUpperCase(ch) || Character.isLowerCase(ch)) //ascii code표를 참고해서 범위를 설정한다. http://d.pr/mI6z
				result = "알파벳";
			else if (Test1.inKoreanCharacter(ch))
				result = "한글";
			else 
				result = "기타특수문자";
			
			System.out.println("입력하신 문자 "+ch + "는 "+ result + "입니다.");
			
		}
	 
	 public static boolean inKoreanCharacter(char ch) {
		 boolean bool = ch >= '가' && ch <='힣';
		 return bool; //두 줄을 하나로 합쳐서 한번에 리턴할 수도 있다
	 }
}
