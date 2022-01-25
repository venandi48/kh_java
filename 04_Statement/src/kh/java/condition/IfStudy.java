package kh.java.condition;

import java.util.Scanner;

/**
 * 조건문
 * 
 * 1. if(조건식){}
 * 2. if(조건식){} else{}
 * 3. if(조건식1){} else if(조건식2){} ...
 * 
 * 조건식 위치는 boolean으로 평가되는 식이 들어와야한다.
 * 
 */
public class IfStudy {

	public static void main(String[] args) {
		IfStudy study =new IfStudy();
		//study.test1();
		study.test2();
//		study.test3();
//		study.test4();
//		study.test5();
//		study.test6();		
	}
	
	/**
	 * 중첩된 if문(nested if문)
	 */
	public void test6() {
		int n = 100;
		String grade = "F"; //char의 기본값은 ' '이다.
		
		if( n >= 90 ) {
			grade = "A";
			if ( n >= 95 ) {
				grade += "+";
			}
		}
		else if( n >= 80 ){
			grade = "A";
			if ( n >= 85 ) {
				grade += "+";
			}
		}
		else if( n >= 70 ){
			grade = "A";
			if ( n >= 75 ) {
				grade += "+";
			}
		}
		else if( n >= 60 ){
			grade = "D";
			if ( n >= 65 ) {
				grade += "+";
			}
		}
		System.out.printf("점수: %d, 학점: %s%n", n, grade);
	}

	/**
	 * 	- if .. else if 블럭
	 * 	- multiple if 블럭
	 */
	public void test5() {
		int n = 100;
		char grade = 'F'; //char의 기본값은 ' '이다.
		
		if( n >= 90 ) {
			grade = 'A';
		}
		if( n < 90 && n >= 80 ){
			grade = 'B';
		}
		if( n < 80 && n >= 70 ){
			grade = 'C';
		}
		if( n < 70 && n >= 60 ){
			grade = 'D';
		}
		System.out.printf("점수: %d, 학점: %c%n", n, grade);
	}
	/**
	 * 나이를 입력받고, 연령대를 출력하세요.
	 * 	- 70~ : 노인
	 * 	- 40~69 : 중년
	 * 	- 20~39 : 청년
	 *  - 14~19 : 청소년
	 *  - ~ 13 : 어린이
	 */
	public void test4() {
		int age;
		String rst;
		Scanner sc = new Scanner(System.in);
		System.out.print("나이입력: ");
		age = sc.nextInt();
		
		if( age >= 70 ) {
			rst = "노인";
		}
		else if ( age >= 40 ){
			rst = "중년";
		}
		else if ( age >= 30 ){
			rst = "젊은이";
		}
		else if ( age >= 10 ){
			rst = "청소년";
		}
		else {
			rst = "어린이";
		}
		System.out.printf("나이: %d세, 분류: %s", age, rst);
	}
	
	/**
	 * if(조건식1){블럭1} else if(조건식2){블럭2} ...
	 * 	- 조건식1이 참인 경우, 블럭1을 실행
	 * 	- 조건식1이 거짓인 경우, 
	 * 		조건식2를 검사하며 조건식2가 참인경우 블럭2 실행
	 * 	- 마지막에 else문의 사용 여부는 선택요소
	 * ...
	 * 
	 * else문의 수에는 제한이 없다.
	 * 
	 */
	public void test3() {
		int n = 100;
		char grade = ' '; //char의 기본값은 ' '이다.
		
		// A=90~100, B=80~89, C=70~79, D=60~69, F= ~59
		if( n >= 90 ) {
			grade = 'A';
		}
		else if( n >= 80 ){
			grade = 'B';
		}
		else if( n >= 70 ){
			grade = 'C';
		}
		else if( n >= 60 ){
			grade = 'D';
		}
		else {
			grade = 'F';
		}
		System.out.printf("점수: %d, 학점: %c%n", n, grade);
	}
	
	/**
	 * if(조건식){} else{}
	 *  - 참인 경우, if블럭 실행
	 *	- 거짓인 경우, else블럭 실행
	 *	- 무조건 둘 중 한 가지는 실행된다
	 */
	public void test2() {
		int a;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력: ");
		a = sc.nextInt();
		
		
		if( a % 2 == 1 ) {
			System.out.println("홀수");
		}
		else {
			System.out.println("짝수");
		}	
	}
	
	/**
	 * if(){}
	 * 	- 참인 경우, if블럭 실행
	 *  - 거짓인 경우, if블럭 통과
	 */
	public void test1() {
		int n;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력: ");
		n = sc.nextInt();
		
		if(n > 0) {
			System.out.println("참참참");
		}
		System.out.println("끝");
	}

}
