package kh.java.api.format;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDateNumberStudy {
	public static void main(String[] args) throws ParseException {
		FormatDateNumberStudy study = new FormatDateNumberStudy();
//		study.test1();
		study.test2();
	}
	
	/**
	 * 숫자
	 *  - 세자리마다 콤마찍기
	 *  - 소수점이하 n번째까지 표현
	 * 
	 *  - 0 : 자리수가 비어있으면 0으로 처리
	 *  - # : 자리수가 비어있으면 공란처리(비워둠)
	 *  - 숫자를 잘라서 표현해야하는 경우 반올림처리 됨
	 */
	public void test2() {

		double n = 123.456;
		DecimalFormat df = new DecimalFormat("0.##");
		String result = df.format(n);
		System.out.println(result);

		DecimalFormat df2 = new DecimalFormat("0.#####");
		String result2 = df2.format(n);
		System.out.println(result2);

		DecimalFormat df3 = new DecimalFormat("0.00000");
		String result3 = df3.format(n);
		System.out.println(result3);
		System.out.println();

		// 세자리마다 콤마
		df.applyPattern("#,###");
		System.out.println(df.format(1234567890));
		df.applyPattern("#,###.00원");
		System.out.println(df.format(1234567890));
	}
	
	/**
	 * SimpleDateFormat
	 *  1. SimpleDateFormat 포맷형식지정
	 *  2. SimpleDateFormat#format에 Date객체 전달
	 *  
	 * 예외처리는 다음에 학습
	 * @throws ParseException 
	 */
	public void test1() throws ParseException {
		SimpleDateFormat  sdf = new SimpleDateFormat("yyyy-MM-dd E hh시 mm분 ss초");
		String formattedDate = sdf.format(new Date());
		System.out.println(formattedDate);
		
		Date date = sdf.parse(formattedDate);
		System.out.println(date);
	}
}
