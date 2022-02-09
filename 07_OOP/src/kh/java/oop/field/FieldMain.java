package kh.java.oop.field;

public class FieldMain {
	public static void main(String[] args) {
		IPhone13 phone1 = new IPhone13();
		phone1.setOwner("홍길동");
		phone1.setNumber("01011112222");
		phone1.printInfo();
		
		IPhone13 phone2 = new IPhone13();
		phone2.setOwner("신사임당");
		phone2.setNumber("01033334444");
		phone2.printInfo();

		// 클래스변수는 클래스이름.변수명 형태로 사용할것을 권장
		System.out.println(IPhone13.WIDTH);
		System.out.println(IPhone13.HEIGHT);
		
		// 다음과 같이 출력되는 메소드 작성
		// 홍길동(01011112222)님이 신사임당(01033334444)으로 전화를 겁니다...
		phone1.callTo(phone2);
	}
	
	
}
