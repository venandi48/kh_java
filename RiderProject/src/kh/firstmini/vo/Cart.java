package kh.firstmini.vo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cart {
	private int totalPrice;
	private List<Menu> cartList = new ArrayList<>();
	private Map<Menu, Integer> menuCountMap = new HashMap<>(); // 메뉴 별 수량 저장

	// 수량정정
	public void modifyMenuCountMap(String menuName, int afterNum) {
		for (Menu menu : cartList) {
			// 이미 카트 안에 담겨있는 메뉴
			if (menu.getMenuName().equals(menuName)) {
				int beforeNum = menuCountMap.get(menu);
				int diff = afterNum - beforeNum;

				menuCountMap.put(menu, afterNum);
				totalPrice += diff * menu.getPrice();
				return;
			}
		}
		System.out.println("장바구니에 없는 메뉴입니다.");
	}

	public void addCartList(Menu m) {
		for (Menu menu : cartList) {
			// 이미 카트 안에 담겨있는 메뉴
			if (menu.getMenuName().equals(m.getMenuName())) {
				int afterCount = menuCountMap.get(menu) + 1;
				menuCountMap.put(menu, afterCount);
				totalPrice += menu.getPrice();
				return;
			}
		}

		// 카트 안에 없는 메뉴
		cartList.add(m); // 카트 안에 추가
		menuCountMap.put(m, 1); // 수량 추가
		totalPrice += m.getPrice();

	}

	public Map<Menu, Integer> getMenuCountMap() {
		return menuCountMap;
	}

	public void setMenuCountMap(Map<Menu, Integer> menuCountMap) {
		this.menuCountMap = menuCountMap;
	}

	public List<Menu> getCartList() {
		return cartList;
	}

	public void setCartList(List<Menu> cartList) {
		this.cartList = cartList;
	}

	public Cart() {
		super();
		cartList = new ArrayList<Menu>();
		// TODO Auto-generated constructor stub
	}

	public Cart(int totalPrice) {
		super();
		this.totalPrice = totalPrice;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Override
	public String toString() {
		return "Cart [totalPrice=" + totalPrice + "]";
	}

}