package kh.java.polymorphism.animal;

/**
 * 인터페이스
 *  - 인터페이스도 하나의 클래스
 *  - 컴파일된 결과는 .class로 일반클래스와 동일
 *  - 일반 필드/메소드를 가질 수 없음
 *  - 객체를 생성할 수 없음 > new Runnable() (X)
 *  - 상수/추상메소드만 가질 수 있음
 *  	: 오롯이 규격제공용 클래스의 기능만을 수행
 *  - jdk8부터 default/static 메소드를 사용할 수 있음
 *  	- default 메소드 : 일반메소드처럼 사용가능. 자식객체에서 호출가능
 *  	- static 메소드 : 
 *  
 *  - 자식클래스(구현클래스)에서 implements 키워드 사용
 *  - 다중구현을 지원
 */
public interface Runnable {

	// 상수
	public static final int LEG_NUM = 4;
	int L_N = 4; // public static final 생략해도 상수로 처리되어 위와 동일한 역할

	// 추상메소드
	public abstract void run();
//	void run2(); // abstract 생략해도 추상메소드로 처리되어 위와 동일한 역할
	
	/**
	 * 인터페이스의 default메소드
	 *  - 인터페이스의 일반메소드
	 */
	public default void walk() {
		System.out.println("뛰는 놈은 걷기도 한다~");
	}
	
	/**
	 * static메소드
	 */
	public static void warmup() {
		System.out.println("뛰기 전 몸풀기");
	}
}
