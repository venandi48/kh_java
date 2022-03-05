package kh.firstmini.manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import kh.firstmini.vo.Cart;
import kh.firstmini.vo.Menu;

public class MenuManager {

	Scanner sc = new Scanner(System.in);
	private String choice;
	private Cart myCart;   
	private Menu menu;
	private List<Menu> list = new ArrayList<>();// 프로그램이 관리하는 메뉴 전체
	private String storeID;

	public void menuManagerMenu() {
		allMenuPrint();


		myCart.addCartList(new Menu("1000", "아메리카노", 1500));
		myCart.addCartList(new Menu("1000", "아메리카노", 1500));
		myCart.addCartList(new Menu("1000", "큐브라떼", 3900));
		
		System.out.println("~ 0번 주문완료 눌렀다고치고 ~");

		// 주문완료 기능
		CartManager cm = new CartManager(myCart); // 카트매니저 생성해서 지금까지 담은 카트 전달
		cm.cartManagerStart();
		System.out.println("복귀");
	}

	// 생성자
	public MenuManager() {
	}

	// 생성자
	public MenuManager(String ID, Cart cart) {
		// 임의로 추가한 데이터입니다 -이은지
		list.add(new Menu("1000", "아메리카노", 1500));
		list.add(new Menu("1000", "큐브라떼", 3900));

		storeID = ID;
		myCart = cart;
		
		
	}

	public void allMenuPrint() {
		System.out.println("~ 선택점포 전체메뉴 출력했다치고 ~");
	}

	public void addCart(Menu m) {
		myCart.addCartList(m);
	}
}
