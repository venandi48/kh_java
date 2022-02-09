package kh.java.oop.field;

public class KHStudentMain {
	public static void main(String[] args) {
		KHStudent s1 = new KHStudent();
		s1.setStudentName("홍길동");
		s1.setStudentPhone("01012341234");
		s1.printKHStudent(s1);
		
		KHStudent s2 = new KHStudent();
		s2.setStudentName("이은지");
		s2.setStudentPhone("01011112222");
		s2.printKHStudent(s2);
		
	}
}
