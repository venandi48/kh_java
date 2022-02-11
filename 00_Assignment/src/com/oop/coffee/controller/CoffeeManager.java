package com.oop.coffee.controller;

import java.util.Scanner;

import com.oop.coffee.model.dto.Coffee;

public class CoffeeManager {
	private Scanner sc = new Scanner(System.in);
	private static final int ARRAY_SIZE = 3;
	private Coffee[] coffees = new Coffee[ARRAY_SIZE];

	public void InputData() {
		System.out.println("-----<세계3대커피 입력>-----");
		
		for (int i = 0; i < ARRAY_SIZE; i++) {
			System.out.print(i + 1 + "번 원산지 > ");
			String origin = sc.next();
			System.out.print(i + 1 + "번 커피명 > ");
			String coffeeName = sc.next();
			
			coffees[i] = new Coffee(origin, coffeeName);
		}
	}
	
	public void printTop3Coffee() {
		String top = "------<세계3대커피>-------\n"
				+ "원산지\t커피명\n"
				+ "-----------------------\n";
		System.out.print(top);
		
		for (int i = 0; i < ARRAY_SIZE; i++)
			coffees[i].printCofeeInfo();
		System.out.println("-----------------------");
	}
}
