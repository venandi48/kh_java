package com.kh.test;

public class Test2 {
	
	public static void main(String[] args) {
		
		//변수 선언 및 초기화
		String name = "홍길동";
		int age = 22;
		char gender = '남';
		String call = "01012341234";
		String email = "hgd@naver.com";
		String address = "경기도 광주시";
		
		
		//상단부 출력
		System.out.println("=======================================================================");
		System.out.println("이름\t나이\t성별\t전화번호\t\t이메일\t\t주소");
		//System.out.printf("%10s%10s%10s%20s%20s%30s%n","이름", "나이", "성별", "전화번호", "이메일", "주소");
		System.out.println("=======================================================================");
		
		
		//변수 출력
		System.out.printf("%s\t%d\t%c\t%s\t%s\t%s\n", name, age, gender, call, email, address);
		
		
		//변수값 새로 대입
		name = "홍길순";
		age = 20;
		gender = '여';
		call = "010123412341";
		email = "hgs@gmail.com";
		address = "전라남도 광주시";
		
		//변수 출력
		System.out.printf("%s\t%d\t%c\t%s\t%s\t%s\n", name, age, gender, call, email, address);

		
	}

}