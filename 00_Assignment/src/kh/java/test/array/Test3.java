package kh.java.test.array;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Test3 hw = new Test3();
		hw.test();
	}

	public void test() {
		Scanner sc = new Scanner(System.in);

		System.out.print("입력값: ");
		String user = sc.nextLine(); // 문자열 변수에 저장
		char[] arr = new char[user.length()]; // 문자열 길이만큼 배열 할당

		// 문자배열에 문자열의 문자 대입
		for (int i = 0; i < user.length(); i++) {
			arr[i] = user.charAt(i);
		}

		System.out.print("검색값: ");
		char find = sc.next().charAt(0);

		int total = 0; // 탐색문자 개수
		for (int i : arr) {
			if (i == find)
				total++;
		}
		System.out.printf("입력하신 문자열 [%s]에서 찾으시는 문자 [%c]은/는 %d개 입니다.%n", user, find, total);
		

	}
}
