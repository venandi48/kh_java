package kh.java.api.datetime;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 
 * Date
 *  - 기본생성자, Long타입생성자를 제외하고는 대부분 Deprecated
 * 
 * Calendar
 * 
 * java.time패키지에서 LocalDate, LocalDateTime ... 제공 
 *
 */
public class CalendarDateStudy {

	public static void main(String[] args) {
		CalendarDateStudy study = new CalendarDateStudy();
//		study.test1();
//		study.test2();
//		study.test3();
		study.test4();
	}
	
	/**
	 * Calendar -> Date
	 * Date -> Calendar
	 */
	public void test4() {
		
		// 1. Calendar -> Date
		Calendar cal = Calendar.getInstance();
		long epochTime = cal.getTimeInMillis();
		Date date = new Date(epochTime);
		
		System.out.println(cal);
		System.out.println();
		System.out.println(date);
		
		System.out.println();
		
		// 2. Date -> Calendar
		Date now = new Date();
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(now);
		printCalendar(calendar);
	}
	
	/**
	 * 날짜 차이 계산하기
	 *  - Epoch Time
	 *  - 1970년 1월 1일 자정 기준으로 누적된 밀리초 반환
	 *  
	 * 올림 : Math.ceil
	 * 반올림 : Math.round
	 * 내림 : Math.floor
	 */
	public void test3() {
		
		// 오늘
		Calendar today = Calendar.getInstance();

		// D-day 2/21자정(00:00)
		Calendar dday = new GregorianCalendar(2022, 2 - 1, 21);
		
		// Calendar 객체간 연산 불가
		// millis초 단위 변환 후 계산
		long _dday = dday.getTimeInMillis();
		System.out.println(_dday);
		long _today = today.getTimeInMillis();
		System.out.println(_today);

		double diff = ((double)_dday - _today) / 1000 / 60 / 60 / 24; // 밀리초>초>분>시>일 변환
		System.out.println(diff);
		
		// 올림처리
		System.out.println("오늘은 D-" + (diff > 0 ? "-" : "+") + (int) Math.ceil(diff) + " 입니다.");
	}
	
	/**
	 * 특정일자를 가리키는 Calendar객체 생성
	 * 
	 * 2022/08/29 수료
	 */
	public void test2() {
		
		// 1. Calendar setter이용
		Calendar dday1 = Calendar.getInstance();
		dday1.set(2022, 8 - 1, 29);
		printCalendar(dday1);
		
		// 2. GregorianCalendar생성자 이용
		Calendar dday2 = new GregorianCalendar(2022, 8 - 1, 29);
		printCalendar(dday2);
		
	}
	public void printCalendar(Calendar cal) {
		System.out.printf("%d년 %d월 %d일 %d시 %d분 %d초%n",
				cal.get(Calendar.YEAR),
				cal.get(Calendar.MONTH)+1,
				cal.get(Calendar.DATE),
				cal.get(Calendar.HOUR_OF_DAY),
				cal.get(Calendar.MINUTE),
				cal.get(Calendar.SECOND));
	}
	

	/**
	 * Calendar
	 */
	public void test1() {
		
		// Calendar객체 생성하기
//		Calendar cal = new Calendar(); // Calendar는 추상클래스
		Calendar cal1 = Calendar.getInstance();
		System.out.println(cal1);
		
		System.out.println();
		
		Calendar cal2 = new GregorianCalendar();
		System.out.println(cal2);

		// 년 월 일 시 분 초
		System.out.println(cal1.get(Calendar.YEAR));
		System.out.println(cal1.get(Calendar.MONTH) + 1); // 0 based value
		System.out.println(cal1.get(Calendar.DATE));
		System.out.println(cal1.get(Calendar.DAY_OF_MONTH));

		System.out.println(cal1.get(Calendar.DAY_OF_WEEK)); // 일(1) 월(2) 화(3) 수(4) 목(5) 금(6) 토(7)
		String[] weeks = { "일", "월", "화", "수", "목", "금", "토" };
		System.out.println(weeks[cal1.get(Calendar.DAY_OF_WEEK) - 1]);
		
		System.out.println(cal1.get(Calendar.HOUR)); // 12시간제
		System.out.println(cal1.get(Calendar.HOUR_OF_DAY)); // 24시간제
		System.out.println(cal1.get(Calendar.MINUTE));
		System.out.println(cal1.get(Calendar.SECOND));
		System.out.println(cal1.get(Calendar.MILLISECOND));
		
		System.out.println(cal1.getActualMaximum(Calendar.MONTH)); // 마지막 월
		System.out.println(cal1.getActualMaximum(Calendar.DATE)); // 마지막 일
		
	}
}
