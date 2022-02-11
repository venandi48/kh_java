package kh.java.object.array.student;

import java.util.Scanner;

import kh.java.object.array.friend.Friend;

/**
 * Student[] 관리
 * 
 * has a 포함관계
 *  - StudentManager클래스가 필드로 다른 클래스(Student)를 참조
 *  - StudentManager has a Student.
 * 
 * UML상의 연관관계(Assciation)
 *  - StudentManager ㅡㅡ(실선)ㅡㅡ> Student
 * 
 */
public class StudentManager {
	private Scanner sc = new Scanner(System.in);
	private static final int LENGTH = 3;
	private Student[] students;
	private int index = 0;
	
	public StudentManager() {
		students = new Student[LENGTH];
	}
	
	public void menu() {
		String menu = "--- 학생관리 ---\n"
				+ "1. 학생등록\n"
				+ "2. 학생목록 출력\n"
				+ "0. 종료\n"
				+ "-------------\n"
				+ "> ";

		while (true) {
			System.out.print(menu);
			String choice = sc.next();
			switch (choice) {
			case "1":
				insertData();
				break;
			case "2":
				printData();
				break;
			case "0":
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
	
	public void insertData() {
		if (index == LENGTH)
			System.out.println("모든 친구를 입력했습니다.");
		else {
			System.out.println(LENGTH + "명의 학생정보를 입력하세요.");

			while (index < LENGTH) {
				Student s = new Student();

				System.out.print((index + 1) + "번 학생번호 : ");
				s.setIdNum(sc.nextInt());
				System.out.print((index + 1) + "번 학생이름 : ");
				s.setName(sc.next());
				System.out.print((index + 1) + "번 학생 자바점수 : ");
				s.setJavaScore(sc.nextInt());
				students[index++] = s;

				System.out.print("더 입력하시겠습니까? (y/n) > ");
				char yn = sc.next().charAt(0);
				if (yn == 'n')
					break;
			}
			System.out.println("> 입력완료");
		}
	}

	public void printData() {

		for (int i = 0; i < index; i++) {
			Student s = students[i];
			System.out.println((index + 1) + "번 학생번호 : " + s.getIdNum());
			System.out.println((index + 1) + "번 학생이름 : " + s.getName());
			System.out.println((index + 1) + "번 자바점수 : " + s.getJavaScore());
		}
	}
}
