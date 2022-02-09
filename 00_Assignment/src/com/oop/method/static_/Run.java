package com.oop.method.static_;

public class Run {
	public static void main(String[] args) {
		String a = "Haha";
		String b = "pizza 만들기";

		System.out.printf("[%s]의 대문자화 : %s%n", a, StaticMethod.toUpper(a));
		System.out.printf("[%s]의 %d번인덱스 %c로 변경 : %s%n", a, 1, 'i', StaticMethod.setChar(a, 1, 'i'));
		System.out.printf("[%s]의 영문자 개수 : %s%n", b, StaticMethod.getAlphabetLength(b));
		System.out.printf("[%s]와 [%s] 합치기 : %s%n", a, b, StaticMethod.concat(a, b));

	}
}
