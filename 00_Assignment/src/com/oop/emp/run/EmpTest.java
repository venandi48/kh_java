package com.oop.emp.run;

import java.util.Scanner;

import com.oop.emp.model.Employee;

public class EmpTest {

	public static void main(String[] args) {
		EmpTest hw = new EmpTest();
		hw.mainMenu();
	}

	public void mainMenu() {
		String topMenu = "************** 사원 정보 관리 프로그램 **************\n"
				+ "1. 새 사원 정보 입력\n"
				+ "2. 사원 정보 수정\n"
				+ "3. 사원 정보 삭제\n"
				+ "4. 사원 정보 출력\n"
				+ "9. 끝내기\n"
				+ "***********************************************";
		int choice = 0;

		Employee e1 = new Employee();

		do {
			System.out.println(topMenu);

			Scanner sc = new Scanner(System.in);
			System.out.print("메뉴선택: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				e1.empInput();
				break;
			case 2:
				modifyMenu(e1); // 부메뉴 호출
				break;
			case 3:
				e1 = null;
				break;
			case 4:
				if (e1 == null) {
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
	
	public void modifyMenu(Employee e) {
		String modifyMenu = "********** 사원 정보 관리 프로그램 **********\n"
				+ "1. 이름 변경\n"
				+ "2. 급여 변경\n"
				+ "3. 부서 변경\n"
				+ "4. 직급 변경\n"
				+ "5. 이전 메뉴로 이동\n"
				+ "***************************************";
		int choice = 0;

		do {
			System.out.println(modifyMenu);

			Scanner sc = new Scanner(System.in);
			System.out.print("메뉴선택: ");
			choice = sc.nextInt();

			sc.nextLine();
			switch (choice) {
			case 1:
				System.out.print("이름변경: ");
				e.setEmpName(sc.nextLine());
				break;
			case 2:
				System.out.print("급여변경: ");
				e.setSalary(sc.nextInt());
				sc.nextLine(); // 버퍼초기화
				break;
			case 3:
				System.out.print("부서변경: ");
				e.setDept(sc.nextLine());
				break;
			case 4:
				System.out.print("직급변경: ");
				e.setJob(sc.nextLine());
				break;
			case 5:
				System.out.println("이전 메뉴로 돌아갑니다.");
				return;
			default:
				System.out.println("올바른 메뉴를 선택하세요.");
			}

		} while (choice != 5);

	}
}
