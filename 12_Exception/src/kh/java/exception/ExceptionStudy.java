package kh.java.exception;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * 
 * Exception
 *  - 프로그램 오류 중 적절한 코드에 의해서 정상적인 처리흐름으로 수습가능한 미약한 오류
 * 
 * 처리방법
 *  - 1. 예외처리 try ~ catch
 *  - 2. 예외던지기 throws
 *  
 * 예외의 종류
 *  - 1. Unchecked Exception
 *  	: 예외처리강제화X, RuntimeException하위 클래스 전체.
 *  - 2. Checked Exception
 *  	: 예외처리강제화O, RuntimeException하위 클래스를 제외한 모든 클래스.
 *
 */
public class ExceptionStudy {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ExceptionStudy study = new ExceptionStudy();
//		study.test1();
//		study.test2();
//		study.test3();
//		study.test4();
		study.test5();
		System.out.println("----- 프로그램 정상 종료 -----");
	}
	
	/**
	 * try .. catch블럭
	 *  변수 유효범위
	 */
	public void test5() {
		int a = 0;
		
		try {
			a = 10;
			int b = 10;
			
		} catch(Exception e) {
			System.out.println(a); 
//			System.out.println(b); // 에러
		} finally {
			System.out.println(a); 
//			System.out.println(b); // 에러
		}
		System.out.println(a); 
//		System.out.println(b); // 에러
	}
	
	/**
	 * 사용자로부터 정수 2개를 입력받아 합을 출력하세요.
	 *  - 예외가 발생할 수 있는 상황을 고려해 예외처리도 작성
	 */
	public void test4() {
		int a = 0;
		int b =0;
		while(true) {
			try {
				System.out.print("정수1 입력: ");
				a = sc.nextInt();
				System.out.print("정수2 입력: ");
				b = sc.nextInt();

				break;
			} catch (InputMismatchException e) {
				System.out.println("정수를 입력하세요.");
				sc.next(); // 버퍼 비우기
			}
		}
		System.out.printf("%d + %d = %d%n", a, b, a + b);
	}
	
	/**
	 * catch절 작성순서
	 *  - 상속관계가 없을 때는 작성 순서는 상관없음
	 *  - 다형성을 적용할 수 있다.
	 *  - 부모/자식클래스 catch블럭을 모두 작성해야 한다면, 자식->부모 순서로 작성해야함. 
	 */
	public void test3() {
		try {
			System.out.print("정수입력: ");
			int n = sc.nextInt();
			
			System.out.println(100/0); // ArithmeticException
			
			String s = null;
			System.out.println(s.hashCode()); // NullPointException

			int[] arr = new int[3];
			System.out.println(arr[100]); // ArrayIndexOutOfBoundsException
		} catch (NullPointerException e) {
			System.out.println("NullPointerException!!");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException!!");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException!!");
		} catch (RuntimeException e) {
			System.out.println("RuntimeException");
			System.out.println(e);
		} catch (Exception e) {
			System.out.println("Exception!");
		}
	}
	
	/**
	 * try .. catch 흐름
	 * 
	 * finally 블럭
	 *  - 예외발생 여부에 관계없이 무조건 실행되는 블럭
	 *  - try에서 사용한 자원반납 코드 등을 작성
	 */
	public void test2() {
		System.out.println(1);
		try {
			System.out.println(2);

			System.out.println(100 / 10); // ArithmeticException 유발 코드

			System.out.println(3);

		} catch (ArithmeticException e) {
			// 예외객체가 던져진다
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();

			System.out.println(4);
		} finally {
			System.out.println(5);

		}
		System.out.println(6);
	}

	/**
	 * try.. catch 예외처리
	 *  - try 예외가 발생할 수 있는 구문 작성
	 *  - catch 예외가 밸상했을 때 처리할 구문 작성
	 */
	public void test1() {
		while (true) {
			try {
				String s = null;
				if(new Random().nextBoolean())
					s = "hello";
				System.out.println(s.length());
				
				System.out.print("정수1 입력: ");
				int a = sc.nextInt();
				System.out.print("정수2 입력: ");
				int b = sc.nextInt();

				System.out.printf("%d / %d = %d%n", a, b, a / b);
				// java.lang.ArithmeticException: / by zero

				break;
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다.");
			} catch (InputMismatchException e) {
				System.out.println("정수만 입력하세요.");
				
				sc.next(); // 오류로 인해 입력버퍼에 잔여데이터가 남아있는 것을 방지
			} catch (NullPointerException e) {
				System.out.println("NPE가 발생했습니다!");
				break;
			}
			
			System.out.println("반복문 끝!");
		}
	}
}
