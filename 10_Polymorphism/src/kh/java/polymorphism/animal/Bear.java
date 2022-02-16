package kh.java.polymorphism.animal;

public class Bear extends Animal implements Runnable {

	/**
	 * 메소드 재작성 (Method Overriding, Method Implementation)
	 */
	@Override
	public void say() {
		System.out.println("안녕하세요, 곰입니다.");
	}

	@Override
	public void attack() {
		bump();
	}

	public void bump() {
		System.out.println("곰 몸통박치기!");
	}

	@Override
	public void run() {
		System.out.println("곰이 " + Runnable.LEG_NUM + "발로 달립니다.");
	}

	@Override
	public String getSound() {
		return "우어엉";
	}

}
