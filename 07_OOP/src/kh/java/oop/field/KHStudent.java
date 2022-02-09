package kh.java.oop.field;

/**
 * 
 * KH정보교육원 학생정보관리
 * 
 *  - 교육원 이름
 *  - 학생 이름
 *  - 전화번호
 *  
 *   출력메소드 printKHStudent를 통해
 *   - KH정보교육원 - 홍길동(01012341234) 
 * 
 */

public class KHStudent {
	
	public static String KHNAME = "kh정보교육원";
	private String studentName;
	private String studentPhone;
	
	public void setStudentName(String name) {
		studentName = name;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentPhone(String phone) {
		studentPhone = phone;
	}
	public String getStudentPhone() {
		return studentPhone;
	}
	
	public void printKHStudent(KHStudent s) {
		System.out.printf("%s - %s(%s)%n", KHNAME, s.studentName, s.studentPhone);
	}
	
}
