package net.kh.member.run;

import net.kh.member.model.Member;

public class Run {
	public static void main(String[] args) {
		Member m1 = new Member();
		m1.setMemberId("220207_ej");
		m1.setMemberPwd("asd1234");
		m1.setMemberName("이은지");
		m1.setAge(28);
		m1.setGender('여');
		m1.setPhone("01011112222");
		m1.setEmail("asd123@naver.com");
		
		System.out.printf("멤버이름: %s%n아이디: %s%n비밀번호: %s%n나이: %d%n성별: %c자%n연락처: %s%n메일: %s%n"
				, m1.getMemberName(), m1.getMemberId(), m1.getMemberPwd(), m1.getAge(), m1.getGender(), m1.getPhone(),
				m1.getEmail());
	}
}
