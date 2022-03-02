package com.thread.alphabet;

public class AlphabetTest {
	public static void main(String[] args) {
		Thread upperThread = new Thread(new UpperAlphabetThread(), "대문자");
		Thread lowerThread = new Thread(new LowerAlphabetThread(), "소문자");

		upperThread.start();
		lowerThread.start();

		System.out.print("[" + Thread.currentThread().getName() + "종료]");
	}
}
