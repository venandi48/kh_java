package kh.java.oop.access.modifier.member;

/**
 * member level 접근제한자
 * 	- field, method를 통칭하는 단어
 * 
 * 접근성 높음
 * 1. public : 모든 패키지에서 접근 가능
 * 2. protected : 동일 패키지에서 접근 가능, 다른 패키지는 상속관계일 경우에 접근 가능
 * 3. default : 동일 패키지에서만 접근 가능
 * 4. private : 현재 클래스에서만 접근 가능
 * 접근성 낮음
 * 
 */
public class Foo {
	public int a;
	protected int b;
	int c; // default키워드는 작성하지 않는다.
	private int d;
	
}
