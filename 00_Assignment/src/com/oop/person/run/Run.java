package com.oop.person.run;

import com.oop.person.controller.PersonController;

public class Run {
	public static void main(String[] args) {
		PersonController pc = new PersonController();
		pc.inputData();
		pc.printPerson();
		pc.printAvg();
	}
}
