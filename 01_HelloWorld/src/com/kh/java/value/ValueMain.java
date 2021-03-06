package com.kh.java.value;

public class ValueMain {
	
	/**
	 * 
	 * 자바프로그램은 클래스에 선언된 메소드를 연달아 호출하며 실행된다.
	 * jvm이 main 메소드를 호출한다
	 * main 메소드가 프로그램의 시작이자 끝이다.
	 * 	: main 메소드의 모든 코드를 실행하면 프로그램이 종료된다.
	 * 
	 */
	
	public static void main(String[] args) {
		System.out.println("시작");
		
		ValueMain main = new ValueMain();
		
		main.test1();
		main.test2();
		
		System.out.println("끝");
		
	}
	
	/**
	 * 
	 * literal(자바의 값)은 숫자, 실수, 문자가 될 수 있다.
	 * 
	 */
	public void test1() {
		System.out.println(123); //숫자
		System.out.println(123.45); //실수
		System.out.println(1+2+3); //연산
		System.out.println('A'); //문자(char)
		System.out.println('김');
		System.out.println(true); //논리값 참
		System.out.println(false); //논리값 거짓
	}
	
	public void test2() {
		System.out.println("이름"); //문자열(Strin, 문자 0개 이상)
	}

}
