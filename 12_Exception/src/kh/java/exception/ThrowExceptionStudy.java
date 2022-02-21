package kh.java.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

/**
 * 
 * main메소드에서 throws예외구문을 작성하는 것은 예외처리를 안하는 것과 같음
 *  - 예외발생 시 비정상종료
 *
 */
public class ThrowExceptionStudy {
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		ThrowExceptionStudy study = new ThrowExceptionStudy();
//		study.test1();
//		study.test2();
//		study.test3();
		study.test4();
	
		
		System.out.println("----- 프로그램 정상 종료 -----");
	}
	
	/**
	 * 1. 예외처리
	 * 2. 예외던지기
	 * 
	 * - Checked Exception은 예외처리 후(선처리)에 예외를 다시 던짐
	 * - 프로그램 흐름을 분기할 수 있는 메소드까지 던짐
	 */
	public void test4() {
		// 프로그램 프름을 분기하는 곳일 경우
		try {
			a();
			normalFlow();
		} catch(Exception e) {
			errorFlow();
		}
	}
	
	public void normalFlow() {
		System.out.println("정상흐름~");
	}
	public void errorFlow() {
		System.out.println("오류발생 흐름~");
	}

	public void a() throws FileNotFoundException {
		System.out.println("---- a 시작 ----");
		b();
		System.out.println("---- a 끝 ----");
	}

	public void b() throws FileNotFoundException {
		System.out.println("---- b 시작 ----");
		// 메소드 호출부에 예외처리 책임을 전가
		try {
			FileReader fr = new FileReader("not-exist.txt");
		} catch (Exception e) {
			System.out.println("선처리");
			throw e; // 예외 다시 던지기 -> 프로그램 흐름을 분기할 수 있는 곳까지 던져야함
		}
		System.out.println("---- b 끝 ----");
	}
	
	/**
	 * Checked Exception
	 *  - 예외처리 강제 O
	 * 
	 * Unchecked Exception
	 *  - RuntimeException의 후손클래스
	 *  - 예외처리 강제 X
	 */
	public void test3() {
		
//		String s = null;
//		System.out.println(s.length()); // 예외 발생하지만 컴파일 오류 유발X
		
		try {
			// 해당 경로의 파일을 읽어내는 객체
			// FileNotFoundException은 Checked예외 -> 예외처리 필수
			FileReader fr = new FileReader("helloworld.txt");
			System.out.println("파일이 존재합니다.");

			int n = sc.nextInt();
		} catch (FileNotFoundException e) {
			// 파일이 존재하지 않을 경우 후처리 코드
			e.printStackTrace();
		}
	}
	
	/**
	 * exception을 통한 분기처리
	 */
	public void test2() {
		try {
			checkAge2(); // 사용자 연령검사
			startGame();
		} catch (Exception e) {
			System.out.println("게임을 즐길 수 없는 연령입니다. 종료합니다.");
			e.printStackTrace(); // 콘솔 상에서 확인하는 용도(사용자 측에 노출되지않는다고 가정)
			System.out.println(e.getMessage());
		}
	}
	
	/**
	 * 연령검사 후 20세 미만일 경우 예외를 던짐
	 *  - 현재 메소드를 호출한 쪽으로 예외를 던짐
	 * 
	 * 커스텀 예외클래스 작성 가능
	 *  - ex) UnderAgeException : 현재 오류상황을 잘 설명할 수 있는 예외클래스 작성
	 */
	public void checkAge2() {
		System.out.print("나이 입력: ");
		int age = sc.nextInt();
		if (age < 20)
			// 매개인자는 예외메세지
			throw new UnderAgeException("미성년자 : " + age);
	}
	
	
	/**
	 * if .. else를 통한 분기처리
	 */
	public void test1() {
		boolean bool = checkAge1();
		
		if(bool) {
			startGame();
		}else {
			System.out.println("게임을 즐길 수 없는 연령입니다. 종료합니다.");
		}
	}
	
	public boolean checkAge1() {
		System.out.print("나이 입력: ");
		int age = sc.nextInt();
		if (age >= 20)
			return true;
		else
			return false;
	}
	
	/**
	 * 성인만 즐길 수 있는 게임
	 */
	public void startGame() {
		System.out.println("게임시작 ...");
	}
}
