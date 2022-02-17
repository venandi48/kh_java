package com.api.math;

import java.text.DecimalFormat;

public class MathTest {
	public static void main(String[] args) {
		double[] numArr = { 3456.5324, 577.26784, 552.2987, -845.215, 324456.24497 };
		String result;

		// 1
		DecimalFormat df = new DecimalFormat("0.0");
		result = df.format(Math.ceil(numArr[0] * 10) / 10.0);
		System.out.print("올림하여 소수점 첫째자리까지 표현: ");
		System.out.println(numArr[0] + " => " + result);

		// 2
		df = new DecimalFormat("0.00");
		result = df.format(Math.round(numArr[1] * 100) / 100.0);
		System.out.print("반올림하여 소수점 둘째자리까지 표현: ");
		System.out.println(numArr[1] + " => " + result);

		// 3
		df = new DecimalFormat("0.000");
		result = df.format(Math.ceil(numArr[2] * 1000) / 1000.0);
		System.out.print("올림하여 소수점 셋째자리까지 표현: ");
		System.out.println(numArr[2] + " => " + result);

		// 4
		df = new DecimalFormat("0.0");
		result = df.format(Math.floor(numArr[3] * 10) / 10.0);
		System.out.print("내림하여 소수점 첫째자리까지 표현: ");
		System.out.println(numArr[3] + " => " + result);

		// 5
		df = new DecimalFormat("0.00");
		result = df.format(Math.ceil(numArr[4] * 100) / 100.0);
		System.out.print("올림하여 소수점 둘째자리까지 표현: ");
		System.out.println(numArr[4] + " => " + result);

	}
}