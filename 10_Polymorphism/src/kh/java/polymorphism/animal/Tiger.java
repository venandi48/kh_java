package kh.java.polymorphism.animal;

public class Tiger extends Animal {

	public void punch() {
		System.out.println("호랑이 펀치!");
	}
	
	@Override
	public void attack() {
		punch();
	}
	
	@Override
	public void say() {
		System.out.println("안녕하세요, 타이거입니다.");
	}
}
