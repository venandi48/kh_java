package kh.java.test.array;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Test4 hw = new Test4();
		hw.test1();
		hw.test2();
	}
	
	public void test1() {
		Scanner sc = new Scanner(System.in);
		char[] numArr = new char[11];
		char[] safeArr = new char[11];

		// 원본입력값 저장
		System.out.print("전화번호 입력: ");
		String user = sc.next();
		for (int i = 0; i < user.length(); i++)
			numArr[i] = user.charAt(i);

		// 복사본 영역에 저장
		for (int i = 0; i < numArr.length; i++) {
			if (i < 3 || i > 6)
				System.arraycopy(numArr, i, safeArr, i, 1);
			else
				safeArr[i] = '*';
		}

		System.out.print("복사된 번호: ");
		for (char i : safeArr)
			System.out.print(i);
		System.out.println();
	}

	
	public void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("전화번호 입력: ");
		String phoneNum1 = sc.nextLine();
		
		// 교체
		int frontLen = 3; // 앞부분 길이
		int backLen = 4; // 뒷부분 길이
		String change = "0000"; // 중앙부 변경내용
		String phoneNum2 = phoneNum1.substring(0, frontLen) + change
				+ phoneNum1.substring(phoneNum1.length() - backLen);
		
		System.out.printf("입력한 번호 [%s]을/를, [%s]로 변경했습니다.%n", phoneNum1, phoneNum2);
		
	}
}
