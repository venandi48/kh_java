package kh.java.polymorphism.animal;

/**
 * 추상클래스
 *  - 미완성클래스
 *  - 객체생성 불가 > new Animal() (X)
 *  - 필드/메소드를 가질 수 있는 일반 클래스
 *  - 0개 이상의 추상메소드를 가질수 있다. (단, 추상메소드는 반드시 추상클래스 안에 있어야함)
 *  - 규격제공
 *  	:자식클래스는 반드시 추상메소드를 재작성해야한다.
 * 
 * 추상메소드
 *  - abstract키워드를 가진다.
 *  - 메소드 몸통은 구현하지 않는다.
 *  	: 자식 클래스의 재작성 메소드에서 구현예정
 *  - 자식클래스 간의 표준화된 규격을 제공하고 이를 활용할 수 있게함
 * 
 * 
 * - 추상클래스(Animal)는 부모의 추상메소드(Soundable#getSound)를 구현하지 않아도 됨
 * - 해당 추상메소드는 자식클래스(Lion, Tiger, Bear, Eagle)가 반드시 구현해야 함
 */
public abstract class Animal implements Soundable{
//	public void say() {
//		System.out.println("안녕하세요, 동물입니다.");
//	}
	
	/**
	 * 추상메소드
	 *  - abstract 키워드를 사용
	 *  - 메소드 몸통이 없음
	 *  - 추상클래스 안에서만 정의될 수 있다.
	 */
	public abstract void say();
	
	public abstract void attack();
	
	
}
