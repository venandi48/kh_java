package com.kh.test.condition;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Test5 hw = new Test5();
		hw.test();
	}
	
	public void test() {
		double height;
		double Weight;
		double bmi;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("키 입력(cm): ");
		height = 0.01 * sc.nextDouble();
		System.out.print("몸무게 입력: ");
		Weight = sc.nextDouble();
		
		bmi = Weight / (height * height);
		
		if( bmi < 18.5 ) {
			System.out.println("저체중(18.5미만)");
		}
		else if( bmi < 23 ) {
			System.out.println("정상체중(18.5이상 23미만)");
		}
		else if( bmi < 25 ) {
			System.out.println("과체중(23이상 25미만)");
		}
		else if( bmi < 30 ) {
			System.out.println("비만(25이상 30미만)");
		}
		else if( bmi >= 30 ) {
			System.out.println("고도비만(30이상)");
		}
	}
}
