package com.opp.person.controller;

import java.util.Scanner;

import com.opp.person.model.Person;

public class PersonController {
	private Scanner sc = new Scanner(System.in);
	private static final int ARRAY_SIZE = 1;
	private Person[] person = new Person[ARRAY_SIZE];
	private int index = 0;

	private int sumAge = 0;
	private int sumHeight = 0;
	private int sumWeight = 0;
	private int sumProperty = 0;

	public void inputData() {
		if (index == ARRAY_SIZE)
			return;

		else {
			for (int i = 0; i < ARRAY_SIZE; i++) {
				System.out.println("------------ " + (i + 1) + "번 입력------------");

				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("나이 : ");
				int age = sc.nextInt();
				System.out.print("키(cm) : ");
				int height = sc.nextInt();
				System.out.print("몸무게(kg) : ");
				int weight = sc.nextInt();
				System.out.print("재산 : ");
				int property = sc.nextInt();

				person[index++] = new Person(name, age, height, weight, property);
			}
		}
	}

	public void printPerson() {
		
		String top = "-------------------인물정보-------------------\n"
				+"이름\t나이\t키\t\t몸무게\t재산\n"
				+ "-------------------------------------------\n";

		System.out.print(top);
		for (int i = 0; i < ARRAY_SIZE; i++) {

			sumAge += person[i].getAge();
			sumHeight += person[i].getHeight();
			sumWeight += person[i].getWeight();
			sumProperty += person[i].getProperty();

			person[i].information();
		}

	}
	
	public void printAvg() {
		System.out.println("-------------------------------------------\n");

		double avgAge = sumAge / ARRAY_SIZE;
		double avgHeight = sumHeight / ARRAY_SIZE;
		double avgWeight = sumWeight / ARRAY_SIZE;
		double avgProperty = sumProperty / ARRAY_SIZE;

		System.out.printf("평균\t%.2f세\t%.2fcm\t%.2fkg\t%.2f\n", avgAge, avgHeight, avgWeight, avgProperty);
	}
}
