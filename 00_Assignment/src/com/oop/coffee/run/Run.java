package com.opp.coffee.run;

import com.opp.coffee.controller.CoffeeManager;

public class Run {
	public static void main(String[] args) {
		CoffeeManager cm = new CoffeeManager();
		cm.InputData();
		cm.printTop3Coffee();
	}
}
