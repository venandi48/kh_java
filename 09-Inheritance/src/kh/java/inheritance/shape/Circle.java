package kh.java.inheritance.shape;

/**
 * 
 * has a 포함관계 : Circle has a Point
 * 	- Circle --(실선)--> Point (연관관계)
 * 
 * is a 상속관계 : Circle is a Shape
 * 	- Circle --(실선)--▷ Shape (일반화관계)
 * 	- 상속받은 기능을 내것처럼 사용가능
 * 
 * 의존관계 
 * 	- Main --(점선)--> Circle (의존관계)
 * 
 * 
 * Override
 *  - 메소드 시그니쳐가 동일해야한다. (메소드명, 매개변수타입/개수/순서, 리턴타입) -> @Override로 정확하게 관리가능
 *  - 접근제한자는 부모메소드보다 넓은 범위로 변경 가능 : protected메소드를 public메소드로 재작성가능
 *  - private final메소드는 오버라이드 불가능
 *  - 부모메소드가 던지는 예외를 제거하거나 한정할 수 있다.
 * 
 * 	- 오버라이드 한 부모메소드는 super키워드를 통해 호출가능
 *
 */
public class Circle extends Shape {

	private Point center;
	private int r;

	public Circle() {
		super();
	}

	public Circle(Point center, int r) {
		super();
		this.center = center;
		this.r = r;

		calcArea();
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	
	/**
	 * @Override Annotation
	 *  - 부가적인 기능을 수행하는 문법요소
	 *  - 부모메소드를 정말 재작성해주는지 검증. 메소드 시그니처가 다를때 컴파일오류 발생시킴.
	 */
	@Override
	public void draw() {
		System.out.println("원을 그린다.");
	}

	@Override
	public void calcArea() {
		setArea(r * r * Math.PI);
	}

	// 작성 안하면 shape의 toString 출력
	@Override
	public String toString() {
		return "center = " + center + ", r = " + r + ", " + super.toString();
	}
}
