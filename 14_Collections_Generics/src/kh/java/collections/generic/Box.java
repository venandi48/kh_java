package kh.java.collections.generic;

/**
 * 제네릭 타입 변수
 *  - T : type
 *  - E : element
 *  - K : key
 *  - V : value
 */
public class Box<T> {

	private T elem;

	public void setElem(T elem) {
		this.elem = elem;
	}
	
	public T getElem() {
		return elem;
	}

	@Override
	public String toString() {
		return "Box [elem=" + elem + "]";
	}
	
	/**
	 * static자원(필드/메소드)에는 클래스레벨의 제네릭 타입변수 사용불가
	 *  - 객체 생성 전 타입변수의 타입을 지정할 수 없기 때문
	 *  	= <T>는 객체를 생성할 때(new사용을 통해) 결정되기때문에 static으로 쓸 수 없음
	 * 
	 * 제네릭 메소드로 처리하면 가능(static메소드는 제네릭 메소드만 사용가능)
	 *  - 리턴타입 앞에 타입변수 선언
	 *  - class레벨의 타입변수 <T>와는 다른 지역타입변수(메소드 안에서만 사용가능)
	 * 
	 * 요소를 인자로 받아서 Box객체를 생성, 필드설정 후 리턴
	 */
	public static <T> Box<T> getBoxInstance(T elem){
		Box<T> box = new Box<>();
		box.setElem(elem);
		return box;
	}
}
