package kh.java.condition;

import java.util.Scanner;

/**
 * switch문 - 값에 따라 분기처리하는 제어문
 * 
 * 	- 괄호 안에는 값으로 처리될 변수 또는 계산식이 들어가야 한다.
 *  - byte, short, int , char, String(jdk 1.7부터 추가됨), enum 타입이 들어갈 수 있다.
 *  - long, float, double, boolean 타입은 들어갈 수 없다.
 *  
 *  - 위에서 아래로 case문을 검사 -> 해당하는 case구문 실행.
 *  - break를 만나면 실행중지, switch문을 탈출.
 *  - 제시한 case문이 실행되지 않으면 default구문 실행.
 */
public class SwitchStudy {
	public static void main(String[] args) {
		SwitchStudy study = new SwitchStudy();
//		study.test1();
//		study.test2();
//		study.test3();
		study.test4();
	}
	
	/**
	 * 회원관리
	 * 1. Gold	 - 스마트TV, 전자렌지, 전기다리미
	 * 2. Silver - 전자렌지, 전기다리미
	 * 3. Bronze - 전기다리미
	 */
	public void test4() {
		String menu = "회원등급을 입력하세요.\n"
					+ "1. Gold	2.Silver	3.Bronze\n"
					+ "입력: ";
		
		System.out.print(menu);
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		String present = "";
		
		switch(num) {
		case 1: present += "스마트TV, ";  
		case 2: present += "전자렌지, ";  
		case 3: present += "전기다리미"; break; 
		default: System.out.println("잘못 입력하셨습니다."); return;
		}
		
		System.out.printf("축하합니다. [%s]를 드립니다.", present);
	}
	
	
	public void test3() {
		int n = 100;
		char grade = 'F'; //char의 기본값은 ' '이다.
		
		switch(n/10) {
		case 10: 
		case 9: grade = 'B'; break;
		case 8: grade = 'C'; break;
		case 7: grade = 'D'; break;
		}
		
		System.out.printf("점수: %d, 학점: %c%n", n, grade);
	}
	
	
	public void test2() {
		String menu = "==========================\n"
					+ "1. 된장찌개 --------- 5000원\n"
					+ "2. 김치찌개 --------- 6000원\n"
					+ "3. 순대국 ----------- 7000원\n"
					+ "--------------------------\n"
					+ "선택 : ";
		
		System.out.println(menu);
		Scanner sc = new Scanner(System.in);
		int user = sc.nextInt();
		String name = "";
		int price = 0;
		
		switch(user) {
		case 1:
			name = "된장찌개";
			price = 5000;
			break;
		case 2:
			name = "김치찌개";
			price = 6000;
			break;
		case 3:
			name = "순대국";
			price = 7000;
			break;
		default:
			System.out.println("잘못된 번호입니다.");
			return;
		}
		
		System.out.printf("선택하신 메뉴는 %s, 가격은 %d원 입니다.%n", name, price);
	
	}
	
	public void test1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("과일을 선택하세요 (1.사과(500) 2.바나나(700) 3.키위(600) 4.아보카도(1000))\n > ");
		int num = sc.nextInt();
		String name = "";
		int price = 0;
		
		switch(num) {
		case 1:
			name = "사과";
			price = 500;
			break;
		case 2: 
			name = "바나나";
			price = 700;
			break;
		case 3: 
			name = "키위";
			price = 600;
			break;
		case 4: 
			name = "아보카도";
			price = 1000;
			break;
		default: 
			System.out.println("잘못된 번호입니다.");
			return; //조기리턴 -> main으로 돌아감
		}
		//문자열 값 비교는 equals메소드를 사용해야한다.
		//if( price != 0 && "".equals(name))
		
		System.out.printf("%s를 선택하셨네요~ %n", name);
		System.out.printf("%d원입니다.%n", price);
	}
}
