package com.api.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalcYourDays {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year, month, day;

		System.out.print("생년월일입력(ex. 19950408) : ");
		String input = sc.next();
		// 사용자 입력값 분리 후 저장
		year = Integer.parseInt(input.substring(0, 4));
		month = Integer.parseInt(input.substring(4, 6)) - 1; // month는 0 base
		day = Integer.parseInt(input.substring(6, 8));

		Calendar birthday = new GregorianCalendar(year, month, day);
		Calendar today = new GregorianCalendar();
		long milli_birthday = birthday.getTimeInMillis();
		long milli_today = today.getTimeInMillis();

		// 차이 계산
		double diff = ((double) milli_today - milli_birthday) / 1000 / 60 / 60 / 24;

		// 태어난 날은 0일, 다음날은 1일 된 것으로 계산
		System.out.println("태어난지 " + (int) Math.floor(diff) + "일 되었습니다.");
	}
}
