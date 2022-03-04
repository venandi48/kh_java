package kh.firstmini.vo;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	private int totalPrice;
	private List<Menu> menuList = new ArrayList<>();
	
	public void addCartList(Menu m) {
		menuList.add(m);
	}

	public List<Menu> getMenuList() {
		return menuList;
	}

	public void setMenuList(List<Menu> menuList) {
		this.menuList = menuList;
	}

	
	
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cart(int totalPrice) {
		super();
		this.totalPrice = totalPrice;
		menuList = new ArrayList<Menu>();
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