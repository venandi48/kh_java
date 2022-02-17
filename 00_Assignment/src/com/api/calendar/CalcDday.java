package com.api.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class CalcDday {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int year, month, day;

		System.out.print("D-Day입력(ex. 20220305) : ");
		String input = sc.next();
		// 사용자 입력값 분리 후 저장
		year = Integer.parseInt(input.substring(0, 4));
		month = Integer.parseInt(input.substring(4, 6)) - 1; // month는 0 base
		day = Integer.parseInt(input.substring(6, 8));

		Calendar dDay = new GregorianCalendar(year, month, day);
		Calendar today = new GregorianCalendar();
		long milli_dDay = dDay.getTimeInMillis();
		long milli_today = today.getTimeInMillis();

		// 차이 계산
		double diff = ((double) milli_dDay - milli_today) / 1000 / 60 / 60 / 24;
		// 소수점 이하 올림처리
		int diffCount = (int) Math.ceil(diff);

		if (diffCount > 0)
			System.out.println(diffCount + "일 남았습니다.");
		else if (diffCount == 0)
			System.out.println("D-DAY입니다.");
		else
			System.out.println((diffCount * -1) + "일 지났습니다."); // 남은 일수 양수로 출력
	}
}
