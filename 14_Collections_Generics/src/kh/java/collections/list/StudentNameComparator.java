package kh.java.collections.list;

import java.util.Comparator;

/**
 * Student의 기본정렬(no)외에 정렬기준을 만들려면
 * 별도의 Comparator구현클래스를 작성해야함
 */
public class StudentNameComparator implements Comparator<Student>{

	/**
	 * 음수 : 자리교환
	 * 0
	 * 양수
	 */
	@Override
	public int compare(Student o1, Student o2) {
		// Student#name이 String타입이므로, String타입간 정렬기준 메소드(String#compareTo)를 이용
		return o1.getName().compareTo(o2.getName());
	}
}
