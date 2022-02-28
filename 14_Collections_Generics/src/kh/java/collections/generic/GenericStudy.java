package kh.java.collections.generic;

public class GenericStudy {
	public static void main(String[] args) {
		GenericStudy study = new GenericStudy();
//		study.test1();
		study.test2();
	}

	/**
	 * - Generic Class : 클래스 레벨에 타입변수 사용
	 * - Generic Method : 메소드 레벨에 타입변수 사용
	 */
	private void test2() {

		// 명시적으로 지역타입변수 선언
		Box<Integer> iBox = Box.<Integer>getBoxInstance(123);
		System.out.println(iBox);
		
		// 암묵적으로 지역타입변수 추론
		// 지역타입변수(<String>) 입력없이도 인자를 통해 <String>으로 유추 및 처리
		Box<String> strBox = Box.getBoxInstance("고양이"); 
		System.out.println(strBox);
	}

	/**
	 * Generic의 Type safety(타입안정성)
	 *  - 요소가 추가될 때 해당 타입의 요소만 추가가능
	 *  - 꺼내올 때 해당 타입을 리턴(자동형변환) 
	 */
	public void test1() {
		Box<Integer> iBox = new Box<>();
		iBox.setElem(123); // Integer 타입만 매개인자로 받을 수 있다.
		Integer elem = iBox.getElem();
		System.out.println(iBox);

		Box<String> strBox = new Box<>();
		strBox.setElem("고양이");
		String strElem = strBox.getElem();
		System.out.println(strBox);
	}
}
