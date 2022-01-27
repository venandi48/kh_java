package com.kh.test.loop;

import java.util.Scanner;

public class Test8 {

	public static void main(String[] args) {
		Test8 hw = new Test8();
		hw.test();
	}
	
	public void test() {
		Scanner sc = new Scanner(System.in);
		
		String menu = "* 메뉴 *\n"
					+ "김밥류 ==================\n"
					+ "1.원조김밥 -------- 1500원\n"
					+ "2.치즈김밥 -------- 2000원\n"
					+ "3.참치김밥 -------- 2300원\n"
					+ "라면류 ==================\n"
					+ "4.그냥라면 -------- 3000원\n"
					+ "5.치즈라면 -------- 3500원\n"
					+ "6.짬뽕라면 -------- 4000원\n"
					+ "분식류 ==================\n"
					+ "7.떡볶이 -------- 2500원\n"
					+ "8.순대 --------- 2500원\n"
					+ "9.오뎅 --------- 1000원\n"
					+ "기타 ===================\n"
					+ "10.음료수 -------- 1000원\n"
					+ "\n메뉴선택 > ";
		String rstTxt = "-----------------------\n"; //결과 출력내용
		
		
		String choice; //사용자선택 메뉴
		String orderName = "";
		int orderCount = 0; //단일 메뉴의 주문수량
		char orderContinue = 'y'; //주문계속여부
		int sumPrice = 0; //금액총합
		int price = 0; //메뉴 단가
		
		
		do {			
			//메뉴선택
			System.out.print(menu);
			choice = sc.next();
			
			//선택에 따라 메뉴이름, 메뉴가격 저장
			switch(choice) {
			case "1":
				orderName = "원조김밥";
				price = 1500;	
				break;
				
			case "2":
				orderName = "치즈김밥";
				price = 2000;	
				break;
				
			case "3":
				orderName = "참치김밥";
				price = 2300;	
				break;
				
			case "4":
				orderName = "그냥라면";
				price = 3000;	
				break;
				
			case "5":
				orderName = "치즈라면";
				price = 3500;	
				break;
				
			case "6":
				orderName = "짬뽕라면";
				price = 4000;	
				break;
				
			case "7":
				orderName = "떡볶이";
				price = 2500;	
				break;
				
			case "8":
				orderName = "순대";
				price = 2500;	
				break;
				
			case "9":
				orderName = "오뎅";
				price = 1000;	
				break;
				
			case "10":
				orderName = "음료수";
				price = 1000;	
				break;

			default: 
				System.out.println("잘못 입력하셨습니다.");
				continue; //반복문의 처음으로 복귀
			}
			
			
			//수량선택
			System.out.print("주문수량 > ");
			orderCount = sc.nextInt(); //주문수량 선택
			sumPrice += orderCount*price; //금액총합 업데이트
			
			//결과출력 문구 업데이트
			rstTxt += orderName + ": " + orderCount + "개 - " 
					+ orderCount*price + "원\n";
			
			//추가주문선택
			System.out.print("추가 주문 하시겠습니까?(y/n) > ");
			orderContinue = sc.next().charAt(0);
						
		}while(orderContinue!='n'); //사용자가 n 입력하지 않으면 계속 실행
		
		
		System.out.println("\n주문하신 정보는 다음과 같습니다.");
		System.out.print(rstTxt);
		System.out.printf("-----------------------%n합계: %d원%n", sumPrice);
	}
	
}
