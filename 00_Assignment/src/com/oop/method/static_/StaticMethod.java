package com.oop.method.static_;

public class StaticMethod {

	// static method
	// 1. 전달한 문자열을 모두 대문자로 바꾸는 static 메소드
	// 메소드명 : toUpper(String) : String
	public static String toUpper(String str) {
		int size = str.length();
		String rst = "";

		for (int i = 0; i < size; i++) {
			char ch = str.charAt(i);

			if ('A' <= ch || ch >= 'Z')
				rst += ch;
			else if ('a' <= ch || ch >= 'z')
				rst += (char) (ch - 32);
		}
		return rst;
	}

	// 2. 문자열(1)에서 전달받은 인덱스(2)의 문자를 전달받은 문자(3)로 변경하는 static 메소드
	// 메소드명 : setChar(String, int, char) : String
	public static String setChar(String str, int index, char ch) {
		String rst = "";

		for (int i = 0; i < str.length(); i++) {
			if (i != index)
				rst += str.charAt(i);
			else
				rst += ch;
		}
		return rst;
	}

	// 3. 전달한 문자열에서 영문자의 개수를 리턴하는 static 메소드
	// 메소드명 : getAlphabetLength(String) : int
	public static int getAlphabetLength(String str) {
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (('A' <= str.charAt(i) && str.charAt(i) <= 'Z') || ('a' <= str.charAt(i) && str.charAt(i) <= 'z')) {
				count++;
			}
		}
		return count;
	}

	// 4. 전달한 문자열값을 하나로 합쳐서 리턴
	// 메소드명 : concat(String, String) : String
	public static String concat(String s1, String s2) {
		String rst = s1 + s2;

		return rst;
	}
}
