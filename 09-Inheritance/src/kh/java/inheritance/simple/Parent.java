package kh.java.inheritance.simple;

public class Parent {

	String name;
	int age;
	
	public void say() {
		System.out.println("내가 부모다");
	}
	
	public String info() {
		return "name = " + name + ", age = " + age;
	}
}
