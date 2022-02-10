package kh.java.oop.constructor;

import java.util.Date;

public class UserMain {
	public static void main(String[] args) {

		// 클래스명 객체명 = new 생성자(Constructor Method)
		User user1 = new User();
		user1.setId("20142501");
		user1.setPassword("1234");
		user1.setName("홍길동");
		user1.setEnrollDate(new Date());
		System.out.println(user1.getUserInfo());
		
		User user2 = new User("심사임당", "12345");
		System.out.println(user2.getUserInfo());
		
		User user3 = new User("001122", "asd123", "이회장", new Date());
		System.out.println(user3.getUserInfo());

	}
}
