package kh.java.oop.method;

/**
 * 변수 별 생명주기
 * 1. 클래스변수 :  프로그램시작 시 생성(프로그램 최초 사용 시 - 동적로딩) ~ 프로그램종료 시 소멸
 * 2. 인스턴스변수 : 객체 생성(new연산자 사용 시) ~ 객체 소멸(참조가 끊어졌을 때, garbage collecter에 의한 반환 시)
 * 3. 지역변수 : 메소드호출 시 생성 ~ 메소드반환 시 소멸
 * 
 * 
 */
public class MethodSample {
	private int a; // 멤버변수
	public static final int b = 10; // 클래스변수

	/**
	 * non-static메소드에서는 static, non-static필드를 모두 참조할 수 있다.
	 */
	public void x() {
		System.out.println("a=" + a);
		System.out.println("b=" + b);
	}

	/**
	 * static메소드 또한 공유의 성격을 가지고 있고, 객체생성 없이 클래스명으로 직접호출 가능
	 * 
	 * static메소드에서는 non-static필드를 참조할 수 없다.
	 * 오직 static필드만 참조가능하다.
	 * 
	 * static메소드 안에는 this참조가 없다.
	 */
	public static void y() {
//		System.out.println("a=" + a);//non-static필드 참조 불가 
		System.out.println("b=" + b);
	}
}
