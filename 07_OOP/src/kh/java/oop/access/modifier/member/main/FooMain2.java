package kh.java.oop.access.modifier.member.main;

import kh.java.oop.access.modifier.member.Foo;

public class FooMain2 {
	public static void main(String[] args) {
		Foo foo = new Foo();

		foo.a = 100;
		
//		// 오류: The field Foo.d is not visible
//		foo.b = 100; // protected 필드는 다른 패키지에서 접근불가
//		foo.c = 100; // default 필드는 다른 패키지에서 접근불가
//		foo.d = 100; // private 필드는 다른 패키지에서 접근불가
	}
}
