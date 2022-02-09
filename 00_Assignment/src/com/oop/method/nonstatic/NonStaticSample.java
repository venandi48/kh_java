package com.oop.method.nonstatic;

public class NonStaticSample {

	public static void main(String[] args) {
		NonStaticSample hw = new NonStaticSample();
		System.out.println(hw.mySubstring("love you", 100, 5));
	}

	// 1. 반환값 없고 매개변수 없는 메소드
	// 실행 요청시 1~45까지의 임의의 정수 6개 중복되지 않게 발생시켜 출력하는 메소드
	// 메소드명 : printLottoNumbers
	public void printLottoNumbers() {
		int[] lotto = new int[6];
		int i = 0;

		while (true) {
			int num = (int) (Math.random() * 45) + 1;
			lotto[i++] = num;
			System.out.println(num);

			if (i == lotto.length)
				break;
		}
	}

	// 2. 반환값 없고 매개변수 있는 메소드
	// 실행 요청시 정수 하나, 문자 하나를 전달받아 문자를 정수 갯수만큼 출력하는 메소드
	// 메소드명 : outputChar
	public void outputChar(int count, char ch) {
		for (int i = 0; i < count; i++) {
			System.out.print(ch);
		}
	}

	// 3. 반환값 있고 매개변수 없는 메소드
	// 실행 요청시 알파벳 범위의 임의의 영문자를 하나 발생시켜 리턴하는 메소드
	// 메소드명 : alphabet
	public char alphabet() {
		char ch;
		while (true) {
			ch = (char) ((Math.random() * 58) + 'A');
			if (ch > 91 || ch < 96)
				break;
		}
		return ch;
	}

	// 4. 반환값 있고 매개변수 있는 메소드
	// 실행 요청시 문자열과 시작인덱스, 끝인덱스를 전달받아 해당 인덱스 범위의 문자열을
	// 추출하여 리턴하는 메소드. 단 문자열은 반드시 값이 있어야함. 없으면 null 리턴처리
	// 메소드명 : mySubstring
	public String mySubstring(String s, int start, int end) {
		int size = s.length();
		if (size == 0)
			return null;
		if (start > size || size < end)
			return "범위지정이 잘못되었습니다.";

		String rst = "";
		for (int i = start; i <= end; i++) {
			rst += s.charAt(i);
		}
		return rst;
	}
}
