package kh.java.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListStudy {
	public static void main(String[] args) {
		ArrayListStudy study = new ArrayListStudy();
//		study.test0();
//		study.test1();
//		study.test2();
//		study.test3();
//		study.test4();
//		study.test5();
		study.test6();
//		study.test7();
	}
	
	
	/**
	 * LinkedList
	 *  - 중간에 요소 추가/삭제가 빈번히 일어나는 데이터를 관리한다면 LinkedList를 사용하자.
	 */
	public void test7() {
		List<Integer> list = new LinkedList<>();
		list.add(3);
		list.add(2);
		list.add(4);
		list.add(5);
		list.add(1);
		System.out.println(list);
	}
	
	/**
	 * 커스텀 객체 정렬하기
	 *  - 기본정렬기준(1개) 
	 *  	: 해당 클래스(Student)가 Comparable인터페이스 구현
	 *  - 그외정렬기준(n개)
	 *  	: 별도의 Comparator구현클래스 생성(정렬기준당 1개)
	 *  
	 *  - no 오름차순 (기본정렬로 선택)
	 *  - no 내림차순
	 *  - name 오름차순
	 *  - name 내림차순
	 */
	public void test6() {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student(3, "세종대왕"));
		studentList.add(new Student(2, "신사임당"));
		studentList.add(new Student(5, "장영실"));
		studentList.add(new Student(1, "홍길동"));
		studentList.add(new Student(4, "이순신"));

		for (int i = 0; i < studentList.size(); i++)
			System.out.println(i + " " + studentList.get(i)); // 저장 순서대로 출력
		System.out.println();

		// Student가 Comparable인터페이스 구현하지 않으면 오류
//		Collections.sort(studentList);
//		for (int i = 0; i < studentList.size(); i++)
//			System.out.println(i + " " + studentList.get(i)); // no 오름차순 정렬 출력
//		System.out.println();
//
//		Comparator<Student> cp = Collections.reverseOrder();
//		Collections.sort(studentList, cp);
//		for (int i = 0; i < studentList.size(); i++)
//			System.out.println(i + " " + studentList.get(i)); // no 내림차순 정렬 출력
		
		// 기타정렬 & 기타정렬 역순
		Comparator<Student> cp = new StudentNameComparator();
		Collections.sort(studentList, cp);
		for (int i = 0; i < studentList.size(); i++)
			System.out.println(i + " " + studentList.get(i)); // name 오름차순 정렬 출력
		System.out.println();

		cp = Collections.reverseOrder(new StudentNameComparator());
		Collections.sort(studentList, cp);
		for (int i = 0; i < studentList.size(); i++)
			System.out.println(i + " " + studentList.get(i)); // name 내림차순 정렬 출력
	}
	
	/**
	 * 정렬하기
	 */
	public void test5() {
		// 숫자 리스트
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(2);
		list.add(5);
		list.add(4);
		list.add(1);
		System.out.println(list);

		// 정렬
		Collections.sort(list); // 기본정렬(오름차순)
		System.out.println(list);

		Comparator<Integer> comparator = Collections.reverseOrder(); // Comparator란 비교객체이다.
		Collections.sort(list, comparator); // 역순정렬(내림차순)
		System.out.println(list);

		// 이름정렬
		List<String> names = Arrays.asList("홍길동", "신사임당", "고주몽", "장영실"); // List<Generic>반환
		Collections.sort(names);
		System.out.println(names); // 오름차순 출력
		Comparator<String> cp = Collections.reverseOrder();
		Collections.sort(names, cp);
		System.out.println(names); // 내림차순 출력
	}
	
	/**
	 * list api
	 */
	public void test4() {
		List<Integer> list = new ArrayList<>();
		list.add(3);
		list.add(25);
		list.add(77);
		list.add(77);
		list.add(77);
		list.add(100);
		
		// 삭제
		Integer removed = list.remove(0);
		System.out.println(removed);
//		list.remove(77); // 인덱스or요소 중 어느것을 의미하는지 모름 > 인덱스로 처리됨
		// 중복된 요소가 있을 경우, 첫번째 요소만 삭제
		boolean isRemoved = list.remove(Integer.valueOf(77)); // 첫번째 77이 지워짐
		System.out.println(isRemoved);

		// 요소 포함 여부
		boolean isContained = list.contains(100);
		System.out.println("100이 포함되어있는가? > " + isContained);

		int index = list.indexOf(77);
		System.out.println("77의 번지수: " + index);
		index = list.indexOf(777); // 존재하지않으면 -1 리턴
		System.out.println("777의 번지수: " + index);
		index = list.lastIndexOf(77); // 뒤에서부터 조회
		System.out.println("77의 마지막 번지수: " + index);

		// 다른 list 합치기
		List<Integer> other = new ArrayList<>();
		other.add(9);
		other.add(99);
		list.addAll(other);
		list.addAll(2, other); // 해당 인덱스 위치에 추가
		
		System.out.println("-----iter-----");
		// 개별요소확인
		// 1. 일반 for문 index
		// 2. for each문
		// 3. Iterator 객체(목록화 기능) - 순차적 접근 가능
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext()) {
			Integer i = iter.next();
			System.out.print(i + ", ");
		}
		System.out.println();
		
		// clear : 모든 요소 제거
		list.clear();
		
		// isEmpty : 요소가 0개라면 true리턴
		System.out.println(list.isEmpty());
		
		
		System.out.println("-----list-----");
		// toString Override 모든 요소 확인
		System.out.println(list);
	}
	
	/**
	 * List<Student> 관리하기
	 */
	public void test3() {
		// 학생 3명 관리
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student(1, "홍길동"));
		studentList.add(new Student(2, "신사임당"));
		studentList.add(new Student(3, "세종대왕"));
		
		// 학생 2명 추가
		studentList.add(new Student(4, "이순신"));
		studentList.add(new Student(5, "장영실"));
		
		// 2번지 학생 제거
		studentList.remove(2);
		
		// 2번지 학생 추가
		studentList.add(2, new Student(6,"논개"));
		
		// 2번지에 학생 대체
		studentList.set(2, new Student(10, "유관순"));
		
		for (int i = 0; i < studentList.size(); i++)
			System.out.println(i + " " + studentList.get(i));
	}
	
	/**
	 * Generics
	 *  - 컬렉션 요소의 타입을 제한하는 기능
	 *  - 지정한 타입만 추가 가능(그 외의 타입은 컴파일 오류 처리)
	 *  - getter사용 시 리턴타입을 한정할 수 있음(형변환 불필요)
	 *  - generics에 기본형을 가질 수 없음
	 */
	public void test2() {
		List list_raw = new ArrayList(); // 다양한 타입의 데이터를 제한없이 담을 수 있음
		list_raw.add("홍길동");
		list_raw.add("신사임당");
		list_raw.add(123); // 요소추가 시 타입검사X
		
		// generic사용하지 않으면 요소를 Object로 처리 및 리턴
		String name0 = (String) list_raw.get(0);
		String name1 = (String) list_raw.get(1);
		System.out.println(name0);
		System.out.println(name1);
		
		System.out.println();

		List<String> list = new ArrayList<String>(); // String만 요소로 삼는 list
		list.add("홍길동");
		list.add("신사임당");
//		list.add(123); // 요소추가 시 타입검사하여 오류발생

		// generic사용하지 않으면 요소를 Object로 처리 및 리턴
		name0 = list.get(0); // getter 이용 시 generic타입으로 바로 리턴
		name1 = list.get(1);
		System.out.println(name0);
		System.out.println(name1);

		System.out.println();

//		List<int> intList = new ArrayList<int>(); //기본형 불가
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(3); // autoboxing(int->Integer)처리 후 추가
		intList.add(Integer.valueOf(3));
		Integer i0 = intList.get(0);
		int i1 = intList.get(1); // autoboxing(int->Integer)
		System.out.println(i0);
		System.out.println(i1);
		
		// 객체 생성부의 generic 생략가능 (1.7~)
		List<Double> dList = new ArrayList<>();
	}
	
	/**
	 * List
	 *  - ArrayList
	 *  - LinkedList
	 */
	public void test1() {
		
		// list 다형성 적용
		ArrayList list1 = new ArrayList();
		List list2 = list1;
		Collection list3 = list1;
		
		// 요소추가
		list1.add("apple");
		list1.add(123);
		// auto boxing으로 기본형이 아닌 Wrapper 객체 Integer.valueOf(123)전달
		list1.add(Double.valueOf(34.56)); // 기본형이 아닌 Wrapper 객체 전달 가능
		list1.add(true);
		list1.add(new Date());
		list1.add(true); // 중복요소 추가 가능
		
		// 중간의 추가 : add(index, 요소)
		list1.add(3, false); // 3번지 이후는 하나씩 뒤로 이동

		// 중간의 삭제
		list1.remove(0); // 뒷 순서의 요소가 자동으로 당겨지게됨
		
		// 요소가져오기(인덱스)
		System.out.println("size = " + list1.size() + "\n"); // size() : 저장된 요소의 갯수
		for (int i = 0; i < list1.size(); i++)
			System.out.println(i + " " + list1.get(i));
	}

	/**
	 * 배열의 단점
	 *  - 크기변경 불가능
	 *  - 중간 위치에 요소의 추가/삭제 불편함
	 */
	public void test0() {
		Student[] students = new Student[3];
		students[0] = new Student(1, "홍길동");
		students[1] = new Student(2, "신사임당");
		students[2] = new Student(3, "세종대왕");

		// 학생 2명 추가
		Student[] students2 = new Student[10];
		System.arraycopy(students, 0, students2, 0, students.length);
		students2[3] = new Student(4, "이순신");
		students2[4] = new Student(5, "장영실");
		
		// 학생 1명 제거 - 2번지 요소 제거
		for (int i = 2; i < students2.length-1; i++) {
			students2[i] = students2[i+1]; // 반복적으로 데이터를 하나씩 당겨와서 저장
		}
		students2[students2.length-1] = null; // 마지막 데이터 null 처리
		
		// 학생 1명 추가 - 2번지 요소 추가
		for(int i = students2.length-1 ; i >= 2 ; i--) {
			students2[i] = students2[i-1]; // 기존 데이터를 옮겨놓고
		}
		students2[2] = new Student(6, "논개"); // 중간 위치에 신규 데이터 추가
		

		for (int i = 0; i < students2.length; i++)
			System.out.println(i + " " + students2[i]);
	}
}
