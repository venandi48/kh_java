package kh.java.collections.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class HashSetStudy {
	public static void main(String[] args) {
		HashSetStudy study = new HashSetStudy();
//		study.test1();
//		study.test2();
//		study.test3();
		study.test4();
//		study.test5();
//		study.test6_1();
//		study.test6();
	}
	
	/**
	 * 로또번호 생성
	 *  - 1~45 사이의 중복없는 난수
	 *  - 오름차순 정렬해서 관리
	 */
	public void test6() {
		Set<Integer> set = new TreeSet<>();
		int count = 0;
		while (count != 6) {
			int num = (int) (Math.random() * 45) + 1;
			if ((!set.contains(num))) {
				set.add(num);
				count++;
			}
		}
		System.out.println(set);
	}
	// 다르게 풀어버린... 문제...
	public void test6_1() {
		int count = 0;
		List<Integer> list = new ArrayList<>();
		while (count != 6) {
			int num = (int) (Math.random() * 45) + 1;
			list.add(num);

			Set<Integer> set = new HashSet<>(list); // 중복제거
			list = new ArrayList<>(set);
			Collections.sort(list); // 정렬
			count = list.size();
		}
		System.out.println(list);
	}
	
	/**
	 * LinkedHashSet
	 *  - 저장된 순서 기억
	 * 
	 * TreeSet
	 *  - 오름차순 정렬
	 *  - 요소로 사용된 클래스는 Comparable인터페이스 구현 필수
	 */
	public void test5() {
		Set<Student> set_hash = new HashSet<>();
		set_hash.add(new Student(3, "이순신"));
		set_hash.add(new Student(2, "신사임당"));
		set_hash.add(new Student(1, "홍길동"));
		for (Student s : set_hash)
			System.out.println(s); // 저장순서에 관계없이 출력
		System.out.println();
		
		Set<Student> setLinked = new LinkedHashSet<>();
		setLinked.add(new Student(1, "홍길동"));
		setLinked.add(new Student(2, "신사임당"));
		setLinked.add(new Student(3, "이순신"));
		for (Student s : setLinked)
			System.out.println(s);
		System.out.println();
		
		Set<Student> setTree = new TreeSet<>();
		setTree.add(new Student(1, "홍길동"));
		setTree.add(new Student(2, "신사임당"));
		setTree.add(new Student(3, "이순신"));
		for (Student s : setTree)
			System.out.println(s);
	}
	
	/**
	 * 커스텀 객체 Set으로 관리하기
	 *  - 동일한 데이터를 가진 객체를 중복처리하기
	 *  - equals & hashCode 오버라이드 필요
	 */
	public void test4() {
		Set<Student> set = new HashSet<>();
		set.add(new Student(1, "홍길동"));
		set.add(new Student(2, "신사임당"));
		set.add(new Student(3, "이순신"));
		set.add(new Student(1, "홍길동"));
		set.add(new Student(1, "김길동")); // 학생번호 중복, 이름 중복X
		set.add(new Student(4, new String("홍길동"))); // 학생번호 중복X, 이름 중복

		// 오버라이드 전: 동일한 요소값이여도 다른객체로 파악하여 제거X
		// 오버라이드 후: 요소의 내용이 같으면 같은 객체로 파악하여 제거
		for (Student s : set)
			System.out.println(s);
		System.out.println();
	}
	
	/**
	 * List -> Set
	 *  - 목적 : 중복제거
	 * 
	 * Set -> List
	 *  - 목적 : 순서적용(하나씩 접근, 정렬 ..)
	 */
	public void test3() {
		List<Integer> list = Arrays.asList(2, 3, 4, 5, 2, 3, 4, 1, 3);
		System.out.println(list);

		// Set으로 변환
		Set<Integer> set = new HashSet<>(list);
		System.out.println("List > Set : " + set);

		// List로 변환
		List<Integer> newList = new ArrayList<>(set);
		System.out.println("Set > List : " + newList);
	}
	
	/*
	 * Set API
	 */
	public void test2() {
		Set<String> set = new HashSet<>(); // 타입추론에 의한 생략(1.7~)
		set.add("홍길동");
		set.add("고길동");
		set.add("마길동");
		System.out.println(set);

		// 포함여부
		System.out.println("홍길동 있나요? " + set.contains("홍길동"));
		System.out.println("최길동 있나요? " + set.contains("최길동"));

		// inEmpty()
		System.out.println("비어있나요? " + set.isEmpty());

		// 다른 set과 병합
		Set<String> other = new HashSet<>();
		other.add("조길동");
		other.add("하길동");
		other.add("홍길동");
		set.addAll(other);
		System.out.println("병합결과 : " + set); // 중복 요소는 추가되지 않음

		// 요소 전체 제거
		set.clear();
		System.out.println("clear 후 비어있나요? " + set.isEmpty());
	}
	
	/**
	 * Collection
	 *  ㄴ Set
	 *   ㄴ HashSet
	 * 
	 * 중복허용X
	 * 저장된 순서 관리X (LinkedSet제외)
	 */
	public void test1() {
		
		// Generics
		// - 지정한 타입만 추가 가능(그 외의 타입은 컴파일 오류 처리)
		// - getter사용 시 리턴타입을 한정할 수 있음(형변환 불필요)
		HashSet<Integer> set1 = new HashSet<>();
		Set<Double> set2 = new HashSet<>();
		Collection<String> set3 = new HashSet<>();

		// 요소 추가 : 저장 순서 무시
		// * 기본형 정렬처리되는 것은 무시할 것
		System.out.println(set1.add(3));
		System.out.println(set1.add(2));
		System.out.println(set1.add(1));
		System.out.println(set1.add(2)); // 중복데이터 저장안됨
		System.out.println(set1.add(2));

		// get(index)없음 > 단일 요소를 가져 올 수 없음
		// 모든 요소를 순차열람
		// 일반 for문 사용 불가
		// 1. for each 가능
		// 2. iterator 가능
		Iterator<Integer> iter = set1.iterator();
		while (iter.hasNext()) {
			Integer i = iter.next();
			System.out.print(i + " ");
		}
		System.out.println();

		for (Integer i : set1)
			System.out.print(i + " ");
		System.out.println();

		// 요소 제거 : 인덱스 이용 불가, 일치 요소 제거
		set1.remove(2); // 매개인자의 int는 Integer로 auto boxing됨

		// 요소 갯수
		System.out.println("요소 갯수 = " + set1.size()); // 중복비허용으로 3 출력

		System.out.println(set1); // 저장 순서에 관계없이 출력
	}
}
