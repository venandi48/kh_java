package kh.java.polymorphism.animal;

public class Eagle extends Animal implements Flyable {

	@Override
	public void say() {
		System.out.println("안녕하세요, 이글입니다.");
	}

	@Override
	public void attack() {
		drop();
	}

	public void drop() {
		System.out.println("독수리 내려찍기!");
	}

	@Override
	public void fly() {
		System.out.println("독수리가 " + Flyable.WING_NUM + "날개로 날아갑니다.");
	}

	@Override
	public String getSound() {
		return "캬아앙";
	}
}
