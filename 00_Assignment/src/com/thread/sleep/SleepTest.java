package com.thread.sleep;

public class SleepTest {
	public static void main(String[] args) {
		SleepTest hw = new SleepTest();
		hw.sendAphorism();
	}
	
	public void sendAphorism() {
		String[] proverb = {"낮 말은 새가 듣고 밤 말은 쥐가 듣는다",
				"가는 날이 장날이다",
				"등잔 밑이 어둡다",
				"세 살 버릇 여든까지 간다",
				"팔은 안으로 굽는다",
				"내 코가 석자",
				"보기 좋은 떡이 먹기도 좋다",
				"먹고 죽은 귀신이 때깔도 좋다",
				"마른 하늘에 날벼락",
				"밑 빠진 독에 물 붓기"};
		
		for (int i = 0; i < 10; i++) {
			int n = (int) (Math.random() * 10 + 1);
			System.out.println(proverb[n]);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
