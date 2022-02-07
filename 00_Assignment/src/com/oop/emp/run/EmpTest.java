package com.oop.emp.run;

import java.util.Scanner;

import com.oop.emp.model.Employee;

public class EmpTest {
	public static void main(String[] args) {
		String topMenu = "************** 사원 정보 관리 프로그램 **************\n"
				+ "1. 새 사원 정보 입력\n"
				+ "2. 사원 정보 삭제\n"
				+ "3. 사원 정보 출력\n"
				+ "9. 끝내기\n"
				+ "***********************************************";
		int choice = 0;
		EmpTest hw = new EmpTest();
		Employee e1 = new Employee();
		
		do {
			System.out.println(topMenu);
			choice = hw.chooseMenu();
			
			switch (choice) {
			case 1:
				e1.empInput();
				break;
			case 2:
				e1 = null;
				break;
			case 3:
				if(e1==null) {
					System.out.println("입력된 사원 정보가 없습니다.");
					break;
				}
				e1.empOutput();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("올바른 메뉴를 선택하세요.");
			}
		} while (choice != 9);
	}
	
	public int chooseMenu() {
		
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("메뉴선택: ");
		choice = sc.nextInt();

		return choice;
	}
}
