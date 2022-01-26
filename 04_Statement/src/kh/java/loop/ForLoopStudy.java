package kh.java.loop;

import java.util.Scanner;

/**
 * 
 * for
 * 
 * 
 * 
 * while
 * 
 */
public class ForLoopStudy {
	public static void main(String[] args) {
		ForLoopStudy study = new ForLoopStudy();
//		study.test1();
//		study.test2();
//		study.test3();
		study.test4();
//		study.test5();
	}
	
	/**
	 * 1~100 사이 정수의 합
	 */
	public void test5() {
		int sum=0; //변수 선언 위치를 이해해야한다.
		
		for(int i = 1 ; i <= 100 ; i++) {
			sum += i; 
			System.out.printf("i = %d, sum = %d%n", i, sum);
		}
		System.out.println("합: "+sum);
	}
	
	/**
	 * 반복횟수를 동적으로 결정하기
	 * 1. limit변수를 지정
	 * 	- 반복의 마지막을 변수로 지정하여 사용
	 * 2. 무한반복을 이용하여 사용자가 반복 중지 결정
	 * 
	 * 무한반복
	 * 	- for(;;) :초기식, 조건식, 증감식을 모두 비워 무한반복
	 * 
	 */
	public void test4() {
		Scanner sc = new Scanner(System.in);
		String menu = "============\n"
					+ "1. 떡볶이(3000)\n"
					+ "2. 순대(3500)\n"
					+ "3. 튀김(2500)\n"
					+ "------------\n"
					+ "입력: ";
		
		int total = 0;
		
		for(;;) {
			//메뉴출력
			System.out.print(menu);

			//메뉴선택
			int choice = sc.nextInt();
			System.out.printf("%d 번을 선택하셨습니다.%n", choice);
			
			switch(choice) {
			case 1: total += 3000; break;
			case 2: total += 3500; break;
			case 3: total += 2500; break;
			default: System.out.println("잘못 누르셨습니다.");
			}
			
			//계속여부 선택
			System.out.print("주문을 계속 하시겠습니까? (y/n): ");
			char yn = sc.next().charAt(0);
			if(yn=='n') 
				break; //for블럭 중지 및 탈출
		}
		System.out.printf("주문종료. 결제금액은 %d원입니다.%n", total);
	}
	
	/**
	 * 사용자 이름과 반복횟수를 입력받아서 출력
	 *  - 이름: 홍길동
	 *  - 횟수: 3
	 *  
	 *  홍길동
	 *  홍길동
	 *  홍길동
	 */
	public void test3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름: ");
		String name = sc.next();
		System.out.print("횟수: ");
		int cnt = sc.nextInt();
		
		
		for(int i=0; i<cnt; i++) {
			System.out.println(name);
		}
	}
	
	public void test2() {
		//10 9 8 7 6 5 4 3 2 1
		for(int i = 10 ; i > 0 ; i--) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		//20 18 16 14 12 10 8 6 4 2
		for(int i = 20 ; i > 0 ; i-=2) {
			System.out.print(i+" ");
			
		}
		System.out.println();
		
		//구구단 8단
		for(int i = 1 ; i < 10 ; i++) {
			System.out.printf("8 * %d = %d%n", i, 8*i);
		}
	}
	
	
	
	/**
	 * for(초기식; 조건식; 증감식) { ... }
	 *  - 초기식: for문 실행 시 처음에 한 번만 실행. 증감변수의 초기화를 주로 사용.
	 *  - 조건식: boolean으로 평가 가능한 연산.
	 *  		true일 경우 블럭 실행, false일 경우 반복문 탈출
	 *  - 증감식: 블럭실행 이후 증감변수에 대한 증감식. 반복문의 마지막에 실행.
	 *  
	 * 반복문의 핵심
	 *  - n번 반복 할 것인가?
	 *  - 증감변수는 어떻게 변해가는가?
	 */
	public void test1() {
		// 1 3 5 7 9 11 13 15 17 19
		for( int i = 1 ; i <= 20 ; i++ ) {
			if( i % 2 == 1)
				System.out.println("Hello world " + i);
		}
	}
}
