package kh.java.inheritance.shape;

public class Shape {

	private double area; // 도형의 넓이

	public Shape() {
		super();
	}

	public Shape(double area) {
		super();
		this.area = area;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public void draw() {
		System.out.println("도형을 그린다.");
	}
	
	public void calcArea() {
		// 도형별 넓이를 구해서 area필드에 대입할것
	}
	
	/**
	 * Object의 toString메소드 Override
	 *  - 객체정보(필드정보)를 문자열로 리턴
	 */
	@Override
	public String toString() {
		return "area = " + area;
	}

}
