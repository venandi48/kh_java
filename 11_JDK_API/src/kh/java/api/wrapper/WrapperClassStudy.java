package kh.java.api.wrapper;

import java.util.ArrayList;
import java.util.List;

public class WrapperClassStudy {
	public static void main(String[] args) {
		WrapperClassStudy study = new WrapperClassStudy();
		study.test1();
//		study.test2();
//		study.test3();
	}

	/**
	 * 각 타입의 String변환
	 */
	public void test3() {
		print(String.valueOf(1));
		print(String.valueOf(12.34));
		print(String.valueOf(true));
	}
	public void print(String s) {
		System.out.println(s);
	}


	/**
	 * 문자열값을 해당 Wrapper의 값타입으로 변환
	 * 
	 * parse타입()의 매개인자가 적절한 값이 아니면 오류발생
	 */
	public void test2() {
		System.out.println("123" + 123);
		System.out.println(Integer.parseInt("123") + 123);
		
		System.out.println("12.34" + 4.5);
		System.out.println(Double.parseDouble("12.34") + 4.5);
		
		System.out.println(Boolean.parseBoolean("true") ? 1 : 2);

		System.out.println("abdc".charAt(0)); // Character는 parse메서드 없음
	}

	/**
	 * Wrapper class 
	 *  - java.lang패키지에 존재하는 기본형 8가지에 1:1대응되는 클래스
	 *  - 기본형값을 감싼 클래스
	 *  
	 * Byte(byte)
	 * Short(short)
	 * Integer(int)
	 * Long(long)
	 * Character(char)
	 * Boolean(boolean)
	 * Float(float)
	 * Double(double)
	 * 
	 * - 참조형을 반드시 써야하는 경우
	 * - 부가기능(형변환)
	 * 
	 * - auto-boxing : 자동으로 기본값을 Wrapper객체에 담아 생성
	 * - auto-unboxing : 자동으로 Wrapper객체에서 값을 꺼내어 처리
	 */
	public void test1() {
		int n = 100;
//		Integer m = new Integer(100); // Deprecated
		Integer m = Integer.valueOf(100);
		Integer l = (Integer) 100;

		Integer k = 100; // auto-boxing 자동으로 기본값을 integer객체에 담아 생성
		System.out.println(k);
		k = null;
		System.out.println(k);

		Integer i = 50;
		System.out.println(n + i); // auto-unboxing 자동으로 Integer객체에서 값을 꺼내어 처리
		System.out.println(n + i.intValue());

		System.out.println(n == i); // int==Integer.inValue() -> int==int

		// 기본형이 아닌 참조형을 반드시 써야하는 경우
		// Generics문법 - 기본형을 허용하지 않음
		List<Integer> list = new ArrayList<Integer>(); // <>안에 int가 올 수 없음
	}
}
