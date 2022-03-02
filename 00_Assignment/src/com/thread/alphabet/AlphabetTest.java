package com.thread.alphabet;

public class AlphabetTest {
	public static void main(String[] args) {
		Thread upperThread = new Thread(new UpperAlphabetThread());
		Thread lowerThread = new Thread(new LowerAlphabetThread());

		upperThread.start();
		lowerThread.start();
	}
}
