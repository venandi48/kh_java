package kh.java.oop.constructor;

import java.util.Date;

/**
 * 생성자
 *  - new 연산자와 함께 호출하는 메소드
 *  - 객체생성 시 필드값 초기화를 담당
 *  - 리턴타입 없음
 *  - 클래스명과 생성자명은 동일해야함
 *  - 기본생성자(파라미터x), 파라미터생성자로 구분
 *  - 생성자 오버로딩을 지원함
 *  
 *  - 어떠한 생성자도 만들지 않은 경우, JVM은 기본생성자를 자동생성
 *  - 파라미터생성자를 하나라도 만들면, 기본생성자의 자동생성은 이루어지지 않음
 *  - 파라미터생성자를 만들 때 기본생성자 반드시 작성하는 습관을 들이자
 * 
 * 기본생성자는 꼭 필요하다.
 *  - 상속시에 자식클래스가 부모클래스의 기본생성자를 자동호출
 *  - jsp/springframework의 bean객체 생성시에 기본생성자를 호출
 *
 */
public class User {
	// 필드
	private String id;
	private String password;
	private String name;
	private Date enrollDate;
	
	// 기본 생성자
	public User() {
		System.out.println("User 생성자 호출!");
	}
	
	/**
	 * this() : 생성자 this
	 *  - 다른 생성자를 호출해서 반복된 코드를 제거 가능
	 *  - 생성자 코드 몸통 첫 줄에 딱 한번 사용가능
	 */
	
	public User(String id, String password) {
		this.id = id;
		this.password = password;
	}

	public User(String id, String password, String name, Date enrollDate) {
		this(id, password);
//		this.id = id;
//		this.password = password;
		this.name = name;
		this.enrollDate = enrollDate;
	}
	
	
	// 메소드
	public void setId(String id) {
		this.id = id;
	}
	public void setPassword(String pw) {
		id = pw;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEnrollDate(Date enrollDate) {
		this.enrollDate = enrollDate;
	}
	public String getId() {
		return id;
	}
	public String getPassword() {
		return password;
	}
	public String getName() {
		return name;
	}
	public Date getEnrollDate() {
		return enrollDate;
	}
	
	public String getUserInfo() {
		return "id = " + id + ", password = " + password 
				+ ", name = " + name + ", enrollDate = " + enrollDate;
	}
}
