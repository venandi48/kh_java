package kh.java.scanner;

import java.util.Scanner; //스캐너 클래스 사용

public class ScannerStudy {
	
	public static void main(String[] args) {
		
		ScannerStudy study = new ScannerStudy();
		study.test1();
	}


	/**
	 * 1. next, nextInt, nextDouble, nextBoolean ...
	 * 	 	- 자료형 변환기능이 있는 메소드 전체
	 * 		- 입력버퍼에서 실제 문자열 이전에 만나는 공백/개행문자는 무시하고
	 * 		  실제 문자열 이후 공백/개행문자 전까지 읽어서 반환
	 * 
	 * 2. nextLine
	 * 		- 입력버퍼에서 개행문자까지 읽어온 후, 개행문제를 제외하고 반환
	 */
	public void test1() {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next(); //사용자로부터 문자열 입력받음
		
		sc.nextLine(); //개행문자 버리기용(입력버퍼 비우기)
		System.out.print("주소를 입력하세요 : ");
		String addr = sc.nextLine();
		

		System.out.printf("반갑습니다 %s님!%n", name);
		System.out.printf("당신의 주소는 [%s]입니다.", addr);

		/*
		
		//사용자입력값은 무조건 문자열이다. (숫자를 입력해도 문자열로 반영)
		//Scanner는 적절한 타입으로 변환하여 값을 반환한다.
		System.out.print("나이 : ");
		int age = sc.nextInt(); //사용자의 숫자 입력을 int로 변환하여 리턴하는 메소드
		
		System.out.print("키(예: 165.5) : ");
		double height = sc.nextDouble();
		
		System.out.print("결혼여부(true|false) : ");
		boolean married = sc.nextBoolean();
		
		System.out.print("성별(남|여) : ");
		String tmp = sc.next();
		char gender = tmp.charAt(0); //문자열 메소드 charAt(인덱스번호)
		
		
		System.out.printf("당신은 %d세 입니다.%n", age);
		System.out.printf("당신의 키는 %.2fcm 입니다.%n", height);
		System.out.printf("당신의 결혼여부는 %b 입니다.%n", married);
		System.out.printf("당신은 %c자 입니다.%n", gender);
		*/
	}
}
