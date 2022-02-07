package kh.java.oop.access.modifier.member;

public class FooMain1 {
	public static void main(String[] args) {
		Foo foo = new Foo();

		foo.a = 100;
		foo.b = 100;
		foo.c = 100;
		//foo.d = 100; // 오류: The field Foo.d is not visible
	}
}
