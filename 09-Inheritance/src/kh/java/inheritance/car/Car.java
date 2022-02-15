package kh.java.inheritance.car;

import java.util.Objects;

public class Car {
	private String brand;
	private String name;
	private int doorNum;

	public Car() {
		super();
	}

	public Car(String brand, String name, int doorNum) {
		super();
		this.brand = brand;
		this.name = name;
		this.doorNum = doorNum;
	}
	
	/**
	 * 복사생성자
	 */
	public Car(Car src) {
		this.brand = src.brand;
		this.name = src.name;
		this.doorNum = src.doorNum;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDoorNum() {
		return doorNum;
	}

	public void setDoorNum(int doorNum) {
		this.doorNum = doorNum;
	}
	
	@Override
	public String toString() {
		return "Car[" + brand + ", " + name + ", " + doorNum + "]";
	}
	
	/**
	 * 객체 동등성 비교
	 *  - 지정한 필드값이 동일하면 true리턴
	 *  - 필드값이 하나라도 다르면 false리턴
	 * 
	 * equals와 hashCode는 동시에 Override해야한다.
	 *  - equals 결과가 true이면 동일한 hashCode를 가져야한다.
	 *  - 두 메소드에서 동일한 컬럼을 사용해야 한다.
	 */
	@Override
	public boolean equals(Object obj) { // 매개변수 타입 'Object'임
		Car other = (Car) obj; // 형변환
		
		if(this.brand.equals(other.brand) && this.name.equals(other.name))
			return true;
		else
			return false;
	}
	
	@Override
	public int hashCode() {
		// 지정한 컬럼값을 가지고 hashCode 재생성
		return Objects.hash(brand, name);
	}
	
	/**
	 * Override
	 *  - 메소드 시그니쳐가 동일해야한다. (메소드명, 매개변수타입/개수/순서, 리턴타입) -> @Override로 정확하게 관리가능
	 *  - 접근제한자는 부모메소드보다 넓은 범위로 변경 가능 : protected메소드를 public메소드로 재작성가능
	 *  - private final메소드는 오버라이드 불가능
	 *  - 부모메소드가 던지는 예외를 제거하거나 한정할 수 있다.
	 * 
	 * 	- 오버라이드 한 부모메소드는 super키워드를 통해 호출가능
	 * 
	 * 공변반환타입(covariant Return Type)
	 *  - 부모메소드의 반환타입의 자식클래스로 변환가능
	 *  - ex) Object리턴 -> Car리턴
	 */
	@Override
	public Car clone() {
		return new Car(this);
	}
}
