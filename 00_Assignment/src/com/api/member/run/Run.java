package com.api.member.run;

import java.util.Calendar;
import java.util.GregorianCalendar;

import com.api.member.model.vo.Member;

public class Run {
	public static void main(String[] args) {
		String data = "1,김연아,165,47,19900905|2,양세형,167,60,19850818|3,김래원,182,80,19810319";

		// 회원별 데이터 분리 (구분자: |)
		String[] dataArr = data.split("[|]");
		int memberSize = dataArr.length; // 총인원 저장
		Member[] members = new Member[memberSize]; // 총인원 만큼 객체배열 생성

		for (int i = 0; i < memberSize; i++) {
			// 데이터 종류 별 분리 (구분자: ,)
			String[] detailArr = dataArr[i].split(",");

			// 자료형 변환
			int no = Integer.parseInt(detailArr[0]);
			String name = detailArr[1];
			int h = Integer.parseInt(detailArr[2]);
			int w = Integer.parseInt(detailArr[3]);

			int year = Integer.parseInt(detailArr[4].substring(0, 4));
			int month = Integer.parseInt(detailArr[4].substring(4, 6)) - 1; // month는 0 base
			int day = Integer.parseInt(detailArr[4].substring(6, 8));

			// 객체배열 추가
			members[i] = new Member(no, name, h, w, new GregorianCalendar(year, month, day));

			// 출력
			System.out.println(members[i].information());
		}
	}
}
