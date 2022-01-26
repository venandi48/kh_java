package com.kh.test.condition;

import java.util.Scanner;

public class SwitchTest1 {
	public static void main(String[] args) {
		SwitchTest1 hw = new SwitchTest1();
		hw.taxCal();
	}
	
	public void taxCal() {
		int purpose; //용도
		String purposeName; //용도명
		int price; //용도별 가격
		int usage; //사용량
		int fee; //사용요금
		double tax; //수도세
		
		Scanner sc = new Scanner(System.in);
		
		String menu = "---------menu---------\n"
					+ "1. 가정용 (50원/liter)\n"
					+ "2. 상업용 (45원/liter)\n"
					+ "3. 공업용 (30원/liter)\n"
					+ "-----------------------\n"
					+ "메뉴번호를 선택하세요. ==> ";		
		
		System.out.print(menu);
		purpose = sc.nextInt();
		
		switch(purpose) {
		case 1:
			purposeName = "1. 가정용";
			price = 50;
			break;
		case 2:
			purposeName = "2. 상업용";
			price = 45;
			break;
		case 3:
			purposeName = "3. 공업용";
			price = 30;
			break;
		default:
			System.out.println("메뉴번호는 1,2,3만 가능합니다.");
			return;
		}
		
		System.out.print("물 사용량을 입력하세요. ==> ");
		usage = sc.nextInt();
		
		fee = price * usage;
		tax = fee * 0.05;
		
		//결과출력
		System.out.println("--------<<수도세>>--------");
		System.out.printf("선택 메뉴번호: %s을 선택하셨습니다.%n사용요금: %d%n수도세: %.0f%n총수도요금: %.0f%n", purposeName, fee, tax, fee+tax);
		
	}
}
