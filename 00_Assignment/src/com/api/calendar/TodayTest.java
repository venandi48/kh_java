package com.api.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class TodayTest {
	public static void main(String[] args) {
		
		Calendar today = new GregorianCalendar();

		String[] weeks = { "일", "월", "화", "수", "목", "금", "토" };
		
		System.out.printf("오늘은 %d년 %d월 %d일 %s요일%n",
				today.get(Calendar.YEAR), today.get(Calendar.MONTH)+1,
				today.get(Calendar.DATE),
				weeks[today.get(Calendar.DAY_OF_WEEK) -1]);
	}
}
