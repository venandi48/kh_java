package kh.firstmini.manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import kh.firstmini.vo.Cart;
import kh.firstmini.vo.Menu;
import kh.firstmini.vo.Store;

public class MenuManager {

	Scanner sc = new Scanner(System.in);
	String choice;
	Cart myCart;   
	Menu menu;
	private List<Menu> list = new ArrayList<>();// 프로그램이 관리하는 메뉴 전체
	String storeID;
	private Map<String, Store> storeMap; // 프로그램이 관리하는 매장 전체

	public void menuManagerMenu() {
		allMenuPrint();


		myCart.addCartList(new Menu("1234", "아메리카노", 1_500));
		myCart.addCartList(new Menu("1234", "아메리카노", 1_500));
		myCart.addCartList(new Menu("1234", "큐브라떼", 3_900));
		myCart.addCartList(new Menu("5678", "엽기메뉴", 14_000));
		
		System.out.println("~ 0번 주문완료 눌렀다고치고 ~");

		// 주문완료 기능
		CartManager cm = new CartManager(myCart, storeMap); // 카트매니저 생성해서 지금까지 담은 카트 전달
		boolean result = cm.cartManagerStart();
		if (result == true) {
			System.out.println("주문완료 -> 홈으로 리턴할거임");
			return;
		} else {
			System.out.println("뒤로가기 눌러서 메뉴선택으로 돌아왓습니다~");
		}
		
	}

	// 생성자
	public MenuManager() {
	}

	// 생성자
	public MenuManager(String ID, Cart cart, Map<String, Store> storeMap) {
		// 임의로 추가한 데이터입니다 -이은지
		list.add(new Menu("1234", "아메리카노", 1_500));
		list.add(new Menu("1234", "큐브라떼", 3_900));
		list.add(new Menu("5678", "엽기메뉴", 14_000));

		storeID = ID;
		myCart = cart;
		this.storeMap = storeMap;
		
		
	}

	public void allMenuPrint() {
		System.out.println("~ 선택점포 전체메뉴 출력했다치고 ~");
	}

	public void addCart(Menu m) {
		myCart.addCartList(m);
	}
}
