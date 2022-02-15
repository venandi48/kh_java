package kh.java.polymorphism.animal;

import java.util.Random;

public class AnimalMain {
	public static void main(String[] args) {
		AnimalMain main = new AnimalMain();
//		main.test1();
//		main.test2();
//		main.test3();
//		main.test4();
//		main.test5();
		main.test6();
		
	}
	
	/**
	 * 정적바인딩
	 *  - CompileTime에 결정
	 *  - 호출한 메소드의 실행타입별로 실행할 메소드 결정 
	 * 
	 * 동적바인딩
	 *  - 조건 : 상속, 오버라이드, 다형성
	 *  - RunTime에 결정
	 *  - 다형성을 적용하여 부모타입으로 메소드를 실행하면 자식클래스의 오버라이드된 메소드 호출
	 */
	public void test6() {
		
		// 정적 바인딩
//		Animal animal = new Animal();
//		Tiger tiger = new Tiger();
//		
//		animal.say();
//		tiger.say();
//		
//		System.out.println();
//		
//		// 동적 바인딩
//		Animal animal2 = new Tiger();
//		animal2.say();
//		
//		System.out.println();
		
		// 동적 바인딩
		Animal[] arr = new Animal[3];
		arr[0] = new Tiger();
		arr[1] = new Lion();
		arr[2] = new Lion();
		for (int i = 0; i < arr.length; i++) {
			arr[i].attack();
		}
	}
	
	/**
	 * 다형성의 활용2 - 리턴타입
	 */
	public void test5() {

		Animal animal = generateAnimal();
		System.out.println(animal);
	}

	public Animal generateAnimal() {
		Random rnd = new Random();
		if (rnd.nextBoolean())
			return new Tiger();
		else
			return new Lion();
	}
	
	/**
	 * 다형성의 활용1 - 매개변수선언부
	 */
	public void test4() {
		Tiger tiger = new Tiger();
		Lion lion = new Lion();
		
		action(tiger);
		action(lion);
	}
	public void action(Animal animal) {
		if (animal instanceof Tiger)
			((Tiger) animal).punch();
		else if (animal instanceof Lion)
			((Lion) animal).kick();
	}
//	public void action(Tiger t) {}
//	public void action(Lion l) {}
	
	
	
	/**
	 * 부모타입의 변수로 모든 자식타입객체를 다룰 수 있다.
	 *  -> 부모타입의 배열을 만들어 여러 자식객체를 제어가능
	 */
	public void test3() {

		// 변수 a에는 Animal 또는 Animal의 자식클래스는 모두 대입 가능
		Animal a = null;
		a = new Tiger();
		a = new Lion();

		Animal[] arr = new Animal[3];
		arr[0] = new Tiger();
		arr[1] = new Lion();
		arr[2] = new Tiger();

		for (Animal animal : arr) {
			System.out.println(animal);
			
			// 객체 instanceof 클래스 : 객체가 해당클래스 타입이면 true반환
			if (animal instanceof Tiger)
				((Tiger) animal).punch();
			else if (animal instanceof Lion)
				((Lion) animal).kick();
		}
		
		// instanceof : 해당 타입으로 형변환 가능한가?
		Tiger tiger = new Tiger();
		System.out.println(tiger instanceof Tiger);
		System.out.println(tiger instanceof Animal);
		System.out.println(tiger instanceof Object);
	}
	
	/**
	 * Object
	 * 	Animal
	 * 	 Tiger
	 */
	public void test2() {

		Tiger t1 = new Tiger();
		Animal animal = t1;
		Object object = t1;
		
		t1.punch(); // Tiger#punch
		t1.say(); // Animal#say
		System.out.println(t1.hashCode()); // Object#hashCode
		
//		t2.punch(); // Tiger#punch 에러!
		animal.say(); // Animal#say
		System.out.println(animal.hashCode()); // Object#hashCode

//		t3.punch(); // Tiger#punch 에러!
//		t3.say(); // Animal#say 에러!
		System.out.println(object.hashCode()); // Object#hashCode
	}

	/**
	 * 다형성
	 *  - 자식객체를 부모타입의 변수에 담아 제어가능
	 *  - 부모타입의 변수에 담게되면 부모클래스에 선언된 필드/메소드만 사용가능
	 */
	public void test1() {
		Tiger tiger = new Tiger();
		Animal animal1 = tiger; // 자동으로 UpCasting

		Lion lion = new Lion();
		Animal animal2 = lion;
		
		// 자식객체를 자식타입 변수에 대입한 경우
		tiger.say();
		tiger.punch();
		
		// 자식객체를 부모타입 변수에 대입한 경우
		//	: 자식클래스에 선언한 필드/메소드에 접근할 수 없다.
		animal1.say();
		//animal1.punch();
		
		// 자식클래스의 메소드를 사용하고싶다면, 다시 자식타입으로 형변환해야한다. 명시적 DownCasting
		((Tiger)animal1).punch(); // 소괄호로 우선순위 분명히해야함
		
		System.out.println();
		
		lion.say();
		lion.kick();
		animal2.say();
		((Lion)animal2).kick();
	}
}
