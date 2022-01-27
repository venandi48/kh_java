package kh.java.loop;

import java.util.Scanner;

import kh.java.condition.SwitchStudy;
import kh.java.random.number.RandomStudy;

public class WhileStudy {
	public static void main(String[] args) {
		WhileStudy study = new WhileStudy();
//		study.test1();
//		study.test2();
//		study.test3();
//		study.test3_();
//		study.test4();
//		study.test5();
		study.test6();
	}
	
	public void test6() {
		Scanner sc = new Scanner(System.in);
		String menu = "=======메인메뉴=======\n"
					+ "1. 음식주문\n"
					+ "2. 게임\n"
					+ "0. 종료\n"
					+ "-------------------\n"
					+ "입력: ";
		
		do {
			System.out.print(menu);
			String choice = sc.next();
			
			switch(choice) {
			case "1": foodMenu(); break;
			case "2": gameMenu(); break;
			case "0": System.out.println("이용해주셔서 감사합니다."); return;
			default: System.out.println("잘못입력하셨습니다.");
			}
		}while(true);
	}
	
	/**
	 * 1.한식 SwitchStudy#test2
	 * 2.분식 ForLoopStudy#test4
	 */
	public void foodMenu() {
		Scanner sc = new Scanner(System.in);
		String menu = "------- 음식메뉴 -------\n"
					+ "1. 한식\n"
					+ "2. 분식\n"
					+ "0. 종료\n"
					+ "----------------------\n"
					+ "입력: ";
		
		do {
			System.out.print(menu);
			String choice = sc.next();
			
			switch(choice) {
			case "1":
				SwitchStudy sw = new SwitchStudy();
				sw.test2();
				break;
			case "2":
				ForLoopStudy fl = new ForLoopStudy();
				fl.test4();
				break;
			case "0": return;
			default: System.out.println("잘못입력하셨습니다.");
			}
		} while(true);
	}
	
	/**
	 * 1.가위바위보
	 * 2.동전게임
	 */
	public void gameMenu() {
		Scanner sc = new Scanner(System.in);
		String menu = "------- 게임메뉴 -------\n"
					+ "1. 가위바위보\n"
					+ "2. 동전게임\n"
					+ "0. 게임종료\n"
					+ "----------------------\n"
					+ "입력: ";
		do {
			System.out.print(menu);
			String choice = sc.next();
			
			switch(choice) {
			case "1": 
				GameTest gt = new GameTest();
				gt.test1();
				break;
			case "2": 
				RandomStudy rdS = new RandomStudy();
				rdS.test3();
				break;
			case "0": return;
			default: System.out.println("잘못 입력하셨습니다.");
			}
			
		}while(true);
	}
	
	
	/**
	 * do ... while문
	 * 	- while문 실행순서: 조건식->실행코드
	 * 	- do while문 실행순서: 실행코드->조건식
	 */
	public void test5() {
		Scanner sc = new Scanner(System.in);
		RandomStudy rdS = new RandomStudy();
		char user;
		
		boolean bool = false;
		do {
			rdS.test3();
			
			System.out.print("계속하시겠습니까?(y/n) : ");
			user = sc.next().charAt(0);
			if(user=='n') break;
		}while(user == 'y');
		System.out.println("이용해주셔서 감사합니다.");
	}
	
	
	/**
	 * while문을 무한반복하고 실행시 동적으로 종료
	 */
	public void test4() {
		Scanner sc = new Scanner(System.in);
		RandomStudy rdS = new RandomStudy();
		
		boolean bool = false;
		while(bool) {
			rdS.test3();
			
			System.out.print("계속하시겠습니까?(y/n) : ");
			char user = sc.next().charAt(0);
			if(user=='n') break;
		}
		System.out.println("이용해주셔서 감사합니다.");
	}
	
	
	public void test3_() {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력: ");
		int num = sc.nextInt();
		int tmp = num; //값복사
		
		//증감변수 i없이 while문을 활용할 수도 있다.
		while(num > 0) {
			sum += num--;
		}
		System.out.printf("%d까지의 합계: %d%n", tmp, sum);
	}
	
	/**
	 * 1부터 사용자입력 정수까지의 합
	 */
	public void test3() {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력: ");
		int num = sc.nextInt();
		
		int i = 1;
		while(i <= num) {
			sum += i;
			i++;
		}
		System.out.printf("합계: %d%n", sum);
	}
	
	public void test2() {
		int i = 1;
		
		while(i < 6) {
			System.out.print(i+" ");
			i++;
		}		
		System.out.println();
		
		while(i > 1) {
			i--;
			System.out.print(i+" ");
		}
		System.out.println();
		
		while(i < 20) {
			if(i % 2 == 1) System.out.print(i+" ");
			i++;
		}
		System.out.println();
		
		i = 1;
		while(i <= 20) {
			if(i % 2 != 1) System.out.print(i+" ");
			i++;
		}
		System.out.println();
		
		//구구단 7단
		final int DAN = 7; //실수로 변경되지 않게 해줌
		int j = 1;
		while(j < 10) {
			System.out.printf("%d * %d = %d%n", DAN, j, DAN*j);
			j++;
		}
	}
	
	/**
	 * 초기식 while(조건식){ ...//실행코드와 증감식 }
	 * 	- 초기식 -> 조건식 -> 블럭 내 실행코드 -> 블럭 내 증감식 -> 조건식 -> ...
	 *  - ... -> 조건식false -> 탈출
	 * 
	 * 
	 * for(초기식; 조건식; 증감식){ ... }
	 */
	public void test1() {
		int i = 0; //초기식
		
		while(i<3) { //조건식
			//실행코드
			System.out.println("Hello world " + i);
			
			i++; //증감식
		}
		System.out.println(i);
	}
}
