package com.thread.alphabet;

public class UpperAlphabetThread implements Runnable {

	@Override
	public void run() {
		char ch = 'A';
		for (int i = 0; i < 26; i++) {
			System.out.print((char) (ch + i) + ", ");
		}
	}
}
