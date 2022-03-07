	package kh.firstmini.manager;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import kh.firstmini.vo.Cart;
import kh.firstmini.vo.Menu;
import kh.firstmini.vo.Store;

public class MenuManager {
    
	Scanner sc = new Scanner(System.in);
	private String choice;
	private Cart myCart;
	private CartManager cm;
	private Menu menu;
	private List<Menu> list = new ArrayList<>();
	private Map<String, Store> storeMap; // 프로그램이 관리하는 전체 매장
	private String storeID;

	// 생성자
	public MenuManager(String ID, Cart cart, Map<String, Store> storeMap) {
		addMenu();
		storeID = ID;
		this.storeMap = storeMap;
		this.myCart = cart;
		this.storeMap = storeMap;
	}	
	
	public void addMenu() {
		list.add(new Menu("1234", "메가리카노", 3000));
        list.add(new Menu("1234", "카페라떼", 3500));
        list.add(new Menu("1234", "딸기라떼", 4000));
        list.add(new Menu("5678", "엽기떡볶이", 14000));
        list.add(new Menu("5678", "엽기닭볶음탕", 24000));
        list.add(new Menu("5678", "주먹김밥", 2000));		
	}
	
	// 매장의 모든 메뉴 출력
	public void allMenuPrint() {
		int i = 1;
		for (Menu m : list) {
			if (storeID.equals(m.getStoreID()))
				System.out.println((i++) + ". " + m.getMenuName() + " ------- " + m.getPrice() + "원");
		}
		i = 1;
	}

	// cart의 addCartList로 추가
	public void addCart(String name) {

		// 사용자가 입력한 이름이 현재 선택 점포의 메뉴인지 검사
		for (Menu m : list) {
			if (m.getStoreID().equals(storeID) && m.getMenuName().equals(name)) {
				myCart.addCartList(m);
				return;
			}
		}
		System.out.println("선택한 점포의 메뉴가 아닙니다.");
	}

	public boolean menuChoice() {
		while(true) {			
			String str = "-------------------------\n"
					   + "0. 주문완료\n"
					   + "9. 처음으로	\n"
					   + "-------------------------";		   
			
			System.out.println("---------- 메뉴 ----------");
			allMenuPrint();
			System.out.println(str);
			
			System.out.print("0이나 9 or 메뉴이름을 입력하세요. : ");
			choice = sc.nextLine();
	
			 if(choice.equals("0")) {
	                CartManager cm = new CartManager(myCart, storeMap);
	                if(cm.cartManagerStart()==true) {
	                    return true;
	                } else {
	                    continue;
	                }
	         }
			else if(choice.equals("9")) {
				System.out.println("처음으로 돌아갑니다.");
				return false;
			}
			else{
				addCart(choice);
			}
			
		}	
	}
	
 }