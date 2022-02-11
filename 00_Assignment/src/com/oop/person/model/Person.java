package com.oop.person.model;

public class Person {
	private String name;
	private int age;
	private int height;
	private int weight;
	private int property;

	public Person() {
	}

	public Person(String name, int age, int height, int weight, int property) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.property = property;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getProperty() {
		return property;
	}

	public void setProperty(int property) {
		this.property = property;
	}

	public void information() {
		System.out.printf("%s\t%d세\t%dcm\t\t%dkg\t%d\n",
				name, age, height, weight, property);
	}
}
