package kh.firstmini.view;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import kh.firstmini.manager.MenuManager;
import kh.firstmini.vo.Cart;
import kh.firstmini.vo.Store;

public class ChoiceView {

	private Scanner sc = new Scanner(System.in);
	private Cart myCart = new Cart();
	private Map<String, Store> storeMap = new HashMap<>(); // key = storeID

	public ChoiceView() {
		super();

		storeMap.put("1234", new Store("1234", "메가커피", "02-1111-3333", 2000, 3000, "삼성2동", "10:00~20:00"));
		storeMap.put("1200", new Store("1200", "커피빈", "02-1234-56783", 2500, 10000, "역삼2동", "10:00~20:00"));
		storeMap.put("5678", new Store("5678", "엽기떡볶이", "02-5555-7777", 3000, 14000, "역삼1동", "11:00~21:00"));
	}

	public void ChoiceViewMain() {

		Out: while (true) {

			// 선택지 출력
			printView();
			System.out.print("선택 > ");
			String viewChoice = sc.nextLine();

			switch (viewChoice) {
			case "1":
				while (true) {
					allStorePrint();
					String storeID = chooseStore();
					if (storeID.equals("exit")) {
						continue Out;
					}

					if (storeID != "") {
						MenuManager mm = new MenuManager(storeID, myCart, storeMap);

						// 주문완료 해서 장바구니 털었을 때
						if (mm.menuChoice() == true)
							continue Out;
						else // 단순 뒤로가기로 돌아왔을 때
							break;
					} else {
						System.out.println("입력하신 이름의 점포를 찾을 수 없습니다.");
					}
				}
				break;
			case "2":
				while (true) {
					// 검색
					if (searchStore() == false)
						continue Out;

					// 검색 후 선택
					String storeID = chooseStore();
					if (storeID.equals("exit")) {
						continue Out;
					}

					if (storeID != "") {
						MenuManager mm = new MenuManager(storeID, myCart, storeMap);

						// 주문완료 해서 장바구니 털었을 때
						if (mm.menuChoice() == true)
							continue Out;
						else // 단순 뒤로가기로 돌아왔을 때
							break;
					} else {
						System.out.println("입력하신 이름의 점포를 찾을 수 없습니다.");
					}
				}
				break;
			case "3":
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("다시 입력해주세요.");
			}

		}

	}

	private void allStorePrint() {

		System.out.println("-------------------------------------------------------------------------\n");

		Set<Map.Entry<String, Store>> entrySet = storeMap.entrySet();
		for (Map.Entry<String, Store> entry : entrySet) {
			Store value = entry.getValue();

			String storeName = value.getStoreName();
			String storeTel = value.getStoreTel();
			int riderTip = value.getRiderTip();
			int minOrderPrice = value.getMinOrderPrice();
			String address = value.getAddress();
			String runTime = value.getRunTime();

			System.out.printf("❤ %s (%s)%n   최소주문 %,d원, 배달팁 %,d원%n", storeName, storeTel, minOrderPrice, riderTip);

			System.out.println();
		}
		System.out.println("-------------------------------------------------------------------------");

	}

	/**
	 * 사용자로부터 입력받은 뒤, 전체 매장 목록에서 탐색하여 storeID리턴.
	 * 전체 매장 목록에 입력받은 매장이름이 없을 경우 null 리턴
	 * 사용자가 뒤로가기 선택 시 exit 리턴
	 */
	public String chooseStore() {
		System.out.print("[뒤로가기 : exit]\t주문 할 점포명 > ");
		String userChoice = sc.nextLine();
		if (userChoice.equals("exit"))
			return "exit";

		Set<Map.Entry<String, Store>> entrySet = storeMap.entrySet();
		for (Map.Entry<String, Store> entry : entrySet) {
			String storeId = entry.getKey();
			String entryStoreName = entry.getValue().getStoreName();

			if (userChoice.equals(entryStoreName)) {
				return storeId;
			}
		}
		return "";
	}

	public boolean searchStore() {
		System.out.print("[뒤로가기 : exit]\t검색어 입력 > ");
		String searchName = sc.nextLine();
		if (searchName.equals("exit"))
			return false;

		System.out.println("-------------------------------------------------------------------------");
		boolean isContain = false;

		Set<Map.Entry<String, Store>> entrySet = storeMap.entrySet();
		for (Map.Entry<String, Store> entry : entrySet) {
			Store value = entry.getValue();
			String storeName = value.getStoreName();

			if (storeName.contains(searchName)) {
				isContain = true;
				String storeTel = value.getStoreTel();
				int riderTip = value.getRiderTip();
				int minOrderPrice = value.getMinOrderPrice();

				System.out.printf("❤ %s (%s)%n   최소주문 %,d원, 배달팁%,d원%n", storeName, storeTel, minOrderPrice, riderTip);
				System.out.println();
			}
		}
		if (isContain != true) {
			System.out.println("검색 결과가 없습니다.");
			return false;
		}
		System.out.println("-------------------------------------------------------------------------");
		return true;
	}

	public void printView() {
		String topStr = "============================ 🛵 배달의 라이더 🛵 ============================\n\n"
					  + "\t\t\t    세상은 넓고 맛집은 많다!\n\n"
					  + "-------------------------------------------------------------------------\n"
					  + "1. 점포둘러보기\t\t2. 점포검색하기\t\t3. 종료하기\n"
					  + "=========================================================================";
		System.out.println(topStr);
	}

}