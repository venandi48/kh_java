package kh.firstmini.manager;

import java.util.Scanner;

import kh.firstmini.vo.Cart;
import kh.firstmini.vo.Menu;

/**
 * 
 * @author ej_lee
 * 
 * 실행방법 
 *  1. 객체 생성
 *  	- 생성자 : CartManager(Cart c)
 *  2. cartManagerStart() 메소드 호출
 *
 */

public class CartManager {

	Cart myCart;
	Scanner sc = new Scanner(System.in);
	String inputLine = "";

	public CartManager(Cart c) {
		super();
		myCart = c; // 프로그램 공통으로 쓰일 카트 객체
	}

	// CartManager기능들 실행하는 메소드
	public void cartManagerStart() {

		Out: while (true) {

			// 현재 장바구니 상태 출력
			printCart();

			System.out.print("선택 > ");
			String cartMenuChoice = sc.nextLine();

			// 사용자 입력에 따른 분기
			switch (cartMenuChoice) {
			case "1":
				removeCartMenu(); // 메뉴제외
				break;
			case "2":
				// 주문수량
				break;
			case "3":
				// 주문확정
				break;
			case "4":
				break Out; // 뒤로가기 =MenuManager로 복귀
			default:
				System.out.println("스위치디폴트");
			}
		}
		System.out.println("out탈출");
		return;
	}

	// 현재 장바구니 출력
	public void printCart() {
		String topStr = "============================== 당신의 장바구니 ==============================\n";
		String underStr = "-------------------------------------------------------------------------\n"
				+ "1. 메뉴제외\t\t2.주문량 수정\t\t3.주문확정\t\t4.뒤로가기\n"
				+ "=========================================================================\n";

		System.out.print(topStr);

		if (isCartEmpty() != true) {
			for (Menu m : myCart.getMenuList())
				System.out.println(m);
		}
		System.out.print(underStr);
	}

	// 메뉴제외 기능
	public void removeCartMenu() {
		// 카트가 비어있으면
		if (isCartEmpty() == true)
			return;

		while (true) {
			System.out.print("[뒤로가기 : exit]\t제외할 메뉴 이름 > ");
			inputLine = sc.nextLine();

			if (inputLine.equals("exit"))
				return;

			// 사용자가 입력한 메뉴가 카트 내에 있을 경우
			if (removeMenu(inputLine) !=false) {
				return;
			} else {
				// 사용자가 입력한 메뉴가 없을 경우
				System.out.println("메뉴를 찾을 수 없습니다. 다시 입력하세요.");
				continue;
			}
		}
	}

	// 선택메뉴 삭제 : 삭제 성공하면 t리턴, 아니면 f리턴
	// - 조건식 searchMenu(String) 으로 바꿔야함
	private boolean removeMenu(String removeName) {

		for (Menu m : myCart.getMenuList()) {
			// 제외할 메뉴를 찾으면 카트목록에서 제거 && true리턴
			if ((m.getMenuName().equals(removeName)) != false) {
				myCart.getMenuList().remove(m);
				System.out.println("장바구니에서 제외 되었습니다.");
				return true;
			}
		}
		// 제외할 메뉴가 카트에 없으면 false
		return false;
	}

	// 메뉴수량 증가 (=주문량 수정)
	public void addMenu() {

		// 장바구니에 아무것도 없으면 탈출
		if (isCartEmpty() == true)
			return;

		while (true) {
			System.out.print("[뒤로가기 : exit]\t수정할 메뉴 이름 > ");
			inputLine = sc.nextLine();
			
			if (inputLine.equals("exit"))
				return;
			
			//미완성
			if (addMenuCount(inputLine)!=false) {
				
			}
		}

	}

	// 선택메뉴 수량 정정 : 성공하면 t리턴, 아니면 f리턴
	// - 조건식 searchMenu(String) 으로 바꿔야함
	public boolean addMenuCount(String updateName) {
		for (Menu m : myCart.getMenuList()) {
			if ((m.getMenuName().equals(updateName)) != false) {
				
			}
		}
		return true;
	}

	// 주문확정
	// 주문내역(메뉴금액+배달팁+총액) 보여주고 주문
	public void orderCheck() {

	}

	// 장바구니 비어있으면 출력 & t리턴
	// 장바구니에 뭔가 있으면 f리턴
	public boolean isCartEmpty() {
		if (myCart.getMenuList().size() <= 0) {
			System.out.println("장바구니가 비어있습니다.");
			return true;
		} else
			return false;
	}

}
