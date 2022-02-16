package member.abstractClass.controller;

import member.abstractClass.model.vo.Member;

public class MemberManager {	
	private static final int ARRAY_MAX = 40;

	private Member[] members = new Member[ARRAY_MAX];
	private int memberIndex = 0;
	
	// 회원별 구매내역 출력
	public void printBuyInfo(int price) {
		System.out.println("-------------------------------------------------------");
		for (int i = 0; i < memberIndex; i++) {
			System.out.printf("%s등급회원 %s는 %d원 상품을 %d원에 구매합니다.\n",
					members[i].getGrade(), members[i].getName(), price, members[i].buy(price));
		}
		System.out.println("-------------------------------------------------------");
	}
	
	public void insertMember(Member m) {
		if (memberIndex == ARRAY_MAX) {
			System.out.println("최대 입력치 도달");
			return;
		}
		
		members[memberIndex++] = m;
	}
	
	public void printData() {
		String top = "----------------------<<회원정보>>----------------------\n"
				+ "이름\t등급\t포인트\t이자포인트\n"
				+ "-------------------------------------------------------\n";

		System.out.print(top);

		// 등급 출력
		for (int i = 0; i < memberIndex; i++) {
			System.out.printf("%-7s%-8s%-5d\t%.2f\n", members[i].getName(), members[i].getGrade(), members[i].getPoint(),
					members[i].getInterestPoint());
		}

	}

}
