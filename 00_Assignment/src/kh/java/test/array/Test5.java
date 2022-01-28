package kh.java.test.array;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Test5 hw =new Test5();
		hw.test();
	}
	public void test() {
		int idSize = 13;
		String idNum;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호 입력 (숫자만 입력하세요) : ");
		idNum = sc.next();

		char[] originArr = new char[idNum.length()];
		char[] safeArr = new char[idNum.length()];
		
		//배열에 원본데이터 저장
		for (int i = 0; i < idNum.length(); i++) {
			originArr[i] = idNum.charAt(i);
		}
		//다른 배열에 복사
		safeArr = originArr.clone();
		for (int i = 0; i < idNum.length(); i++) {

			if (i < 6) // 앞자리 출력
				System.out.print(safeArr[i]);
			else if (i == 6) // 성별자리 앞에 구분자 추가하여 출력
				System.out.print("-" + safeArr[i]);
			else { // 뒷자리 배열값 변경 후 출력
				safeArr[i] = '*';
				System.out.print(safeArr[i]);
			}
		}
		
	}
}
