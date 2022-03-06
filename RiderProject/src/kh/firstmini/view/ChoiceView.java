package kh.firstmini.view;

import java.util.HashMap;
import java.util.Map;

import kh.firstmini.manager.MenuManager;
import kh.firstmini.vo.Cart;
import kh.firstmini.vo.Store;

public class ChoiceView {

	Cart myCart = new Cart();
	Map<String, Store> storeMap = new HashMap<>(); // key = storeID

	public ChoiceView() {
		super();

		// 임의로 추가한 데이터입니다 -이은지
		storeMap.put("1234", new Store("1234", "메가커피", "0211113333", 2000, 10000, "강남구", "10:00~20:00"));
		storeMap.put("5678", new Store("5678", "엽기떡볶이", "0255557777", 3500, 15000, "용산구", "10:00~20:00"));
	}

	public void ChoiceViewMain() {
		// 선택지 출력

		// 1. 전체매장출력기능
		for (Store s : storeMap.values()) {
			System.out.println("~ 전체매장출력 했다치고 ~");
			
			//사용자가 점포선택하고나면
			
			MenuManager mm = new MenuManager("1000", myCart, storeMap);
			mm.menuManagerMenu();
			System.out.println("홈입니다");
			return;
		}

		// 2. 매장검색기능
	}
}
