package member.controller;

import member.model.vo.Gold;
import member.model.vo.Silver;
import member.model.vo.Vip;
import member.model.vo.VVip;

public class MemberManager {
	private static final int ARRAY_MAX = 10;

	private Silver[] silvers = new Silver[ARRAY_MAX];
	private Gold[] golds = new Gold[ARRAY_MAX];
	private Vip[] vips = new Vip[ARRAY_MAX];
	private VVip[] vvips = new VVip[ARRAY_MAX];

	private int silverIndex = 0;
	private int goldIndex = 0;
	private int vipIndex = 0;
	private int vvipIndex = 0;

	public void silverInsert(Silver s) {
		silvers[silverIndex++] = s;
	}

	public void goldInsert(Gold g) {
		golds[goldIndex++] = g;
	}

	public void vipInsert(Vip v) {
		vips[vipIndex++] = v;
	}

	public void vvipInsert(VVip vv) {
		vvips[vvipIndex++] = vv;
	}

	public void printData() {
		String top = "----------------------<<회원정보>>----------------------\n" + "이름\t등급\t포인트\t이자포인트\n"
				+ "-------------------------------------------------------\n";

		System.out.print(top);

		// silver등급 출력
		for (int i = 0; i < silverIndex; i++) {
			System.out.printf("%s\t%s\t%d\t%.2f\n", silvers[i].getName(), silvers[i].getGrade(), silvers[i].getPoint(),
					silvers[i].getInterestPoint());
		}

		// gold등급 출력
		for (int i = 0; i < goldIndex; i++) {
			System.out.printf("%s\t%s\t%d\t%.2f\n", golds[i].getName(), golds[i].getGrade(), golds[i].getPoint(),
					golds[i].getInterestPoint());
		}

		// vip등급 출력
		for (int i = 0; i < vipIndex; i++) {
			System.out.printf("%s\t%s\t%d\t%.2f\n", vips[i].getName(), vips[i].getGrade(), vips[i].getPoint(),
					vips[i].getInterestPoint());
		}

		// vvip등급 출력
		for (int i = 0; i < vvipIndex; i++) {
			System.out.printf("%s\t%s\t%d\t%.2f\n", vvips[i].getName(), vvips[i].getGrade(), vvips[i].getPoint(),
					vvips[i].getInterestPoint());
		}
	}

}
