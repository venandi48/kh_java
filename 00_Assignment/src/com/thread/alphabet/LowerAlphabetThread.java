package com.thread.alphabet;

public class LowerAlphabetThread implements Runnable {

	@Override
	public void run() {
		char ch = 'a';
		for (int i = 0; i < 26; i++) {
			System.out.print((char) (ch + i) + ", ");
		}
	}
}