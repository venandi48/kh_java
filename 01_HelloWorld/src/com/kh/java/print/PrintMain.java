package com.kh.java.print;

public class PrintMain {

	public static void main(String[] args) {
	
		PrintMain main = new PrintMain();
		main.test1();
	}
	
	/**
	 * 
	 * System.out.println() : 출력 후 개행
	 * System.out.print() : 개행 없는 출력
	 * 
	 * escaping문자: 인쇄되지않고 키보드로 표현불가한 문자
	 * '\+문자'의 조합으로 구성
	 * ex) \n 개행, \t 탭추가, \\ 역슬래시문자출력, \" 쌍따옴표출력, \' 따옴표출력
	 * 
	 */
	public void test1() {
		System.out.print("안녕");
		System.out.println("잘가");
		System.out.print("배고파\n");
		System.out.print("뭐\t먹지");
		System.out.println("\n");
		System.out.println("\"와구와구\" 먹고싶다");
		
		System.out.println("C:\\Users\\ej_lee\\Desktop\\새 폴더\\game\\스듀\\호감도템.xlsx");
	}
	
	public void test2() {
		System.out.print("\t\t\"ShakeIt 알람\"\n---------------------------------------------------------------\n\t흔들기\t쏴리질러 터치하기 원터치\n---------------------------------------------------------------\n\n홍길동\n\t\"신사임당\"\n\t\t세종대왕");
	}
}
