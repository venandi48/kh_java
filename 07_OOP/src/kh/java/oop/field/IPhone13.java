package kh.java.oop.field;

/**
 * 선언 위치에 따른 변수구분
 * a. 전역변수(global variable | field) 
 * : 클래스 영역에 선언, 접근제한자 사용
 *  	1. static field 클래스변수 - 클래스별로 지정하여 객체간 공유
 *  	2. non-static field 멤버변수 인스턴스변수 - 객체별로 지정 
 *  
 * b. 지역변수(lacal variable) 
 * : 메소드 영역에 선언, 접근제한자 없음
 *  	- 매개변수 또한 지역변수에 해당
 * 
 * 변수 별 생명주기
 * 1. 클래스변수 :  프로그램시작 시 생성(프로그램 최초 사용 시 - 동적로딩) ~ 프로그램종료 시 소멸
 * 2. 인스턴스변수 : 객체 생성(new연산자 사용 시) ~ 객체 소멸(참조가 끊어졌을 때, garbage collecter에 의한 반환 시)
 * 3. 지역변수 : 메소드호출 시 생성 ~ 메소드반환 시 소멸
 */
public class IPhone13 {

	// static field - 주로 public으로 작성
	public static final int WIDTH = 5; // 너비
	public static final int HEIGHT = 15; // 높이

	// non-static field
	private String owner;
	private String number;

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getOwner() {
		return owner;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public void printInfo() {
		System.out.printf("%s님의 전화기 : %s%n", owner, number);
	}
	
	/**
	 * this -> other
	 * 
	 * other의 타입이 같은 IPhone13클래스이므로 private필드에도 직접 접근 할 수 있다.
	 */
	public void callTo(IPhone13 phone) {
		System.out.printf("%s(%s)님이 %s(%s)으로 전화를 겁니다...%n", owner, number, phone.owner, phone.number);
	}

}
