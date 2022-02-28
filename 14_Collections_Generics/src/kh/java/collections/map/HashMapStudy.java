package kh.java.collections.map;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import kh.java.collections.list.Student;

public class HashMapStudy {
	public static void main(String[] args) {
		HashMapStudy study = new HashMapStudy();
//		study.test1();
//		study.test2();
//		study.test3();
		study.test4();
//		study.test5();
	}

	/**
	 * containsKey
	 * containsValue
	 */
	private void test5() {
		Map<Integer, Student> studentMap = new HashMap();
		studentMap.put(1, new Student(1, "홍길동"));
		studentMap.put(2, new Student(2, "신사임당"));
		studentMap.put(3, new Student(3, "논개"));

		// 해당 객체가 equals/hashCode 오버라이드를 통해 동등성 비교가 가능 한 경우
		// 특정 key값 검사
		System.out.println("key 1 : " + studentMap.containsKey(1)); // key값에 1이 있는가
		System.out.println("key 100 : " + studentMap.containsKey(100)); // key값에 100이 있는가

		// 특정 value값 검사
		System.out.println("3, 논개 : " + studentMap.containsValue(new Student(3, "논개")));

		System.out.println(studentMap);
	}

	/**
	 * 학생객체 관리
	 *  - Map<Integer, Student>
	 *  - value의 고유값을 꺼내어 key값으로 사용
	 *  - Studetn#no가 int이지만 제네릭으로 쓰기위해선 wrapper클래스 Integer사용
	 */
	private void test4() {
		Map<Integer, Student> map = new HashMap<>();
		map.put(1, new Student(1, "홍길동"));
		map.put(2, new Student(2, "신사임당"));
		map.put(3, new Student(3, "이순신"));

		System.out.println(map);

		// 출력: 학생번호 1번, 이름은 []학생입니다.
		// 1. ketSet
		Set<Integer> keySet = map.keySet();
		// 1.1 for each
		for (Integer k : keySet) {
			Student value = map.get(k);
			System.out.printf("학생번호 %d번, 이름은 [%s]학생입니다.%n", value.getNo(), value.getName());
		}
		// 1.2 iterator
		Iterator<Integer> keyIter = keySet.iterator();
		while(keyIter.hasNext()) {
			Integer key = keyIter.next();
			Student value = map.get(key);
			System.out.printf("학생번호 %d번, 이름은 [%s]학생입니다.%n", value.getNo(), value.getName());
		}
		System.out.println();
		
		// 2. entrySet
		Set<Map.Entry<Integer, Student>> entrySet = map.entrySet();
		// 2.1 for each
		for (Map.Entry<Integer, Student> e : entrySet) {
			int no = e.getValue().getNo();
			String name = e.getValue().getName();
			System.out.printf("학생번호 %d번, 이름은 [%s]학생입니다.%n", no, name);
		}
		// 2.2 iterator
		Iterator<Map.Entry<Integer, Student>> entryIter = entrySet.iterator();
		while (entryIter.hasNext()) {
			Map.Entry<Integer, Student> entry = entryIter.next();
			Student value = entry.getValue();
			System.out.printf("학생번호 %d번, 이름은 [%s]학생입니다.%n", value.getNo(), value.getName());
		}
	}

	/**
	 * Map요소를 순회열람
	 *  - 1. keySet 이용 : Key를 별도의 Set으로 반환
	 *  - 2. entrySet 이용 : entry(key, value)를 별도의 Set으로 반환
	 */
	public void test3() {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "홍길동");
		map.put(2, "신사임당");
		map.put(3, "세종대왕");

		// 1. keySet
		Set<Integer> keySet = map.keySet(); // map의 Key타입에 맞춰 set 제네릭 지정
		// 1.1 for each
		for (Integer key : keySet) {
			String value = map.get(key);
			System.out.println(key + " = " + value);
		}
		// 1.2 iterator
		Iterator<Integer> iter = keySet.iterator();
		while (iter.hasNext()) {
			Integer key = iter.next();
			String value = map.get(key);
			System.out.println(key + " = " + value);
		}
		System.out.println();

		// 2. entrySet
		// entry : [key-value] 한쌍의 요소
		Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
		// 2.1 for each
		for (Map.Entry<Integer, String> entry : entrySet) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " = " + value);
		}
		// 2.2 iterator
		Iterator<Map.Entry<Integer, String>> entryIter = entrySet.iterator();
		while (entryIter.hasNext()) {
			Map.Entry<Integer, String> entry = entryIter.next();
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " = " + value);
		}
	}
	
	/**
	 * 다른 맵 병합
	 */
	public void test2() {
		Map<Integer, String> map1 = new HashMap<>();
		map1.put(1, "홍길동");
		map1.put(2, "신사임당");
		map1.put(3, "세종대왕");

		Map<Integer, String> map2 = new HashMap<>();
		map2.put(3, "논개");
		map2.put(4, "안창호");
		map2.put(5, "유관순");

		System.out.println("map1 = " + map1);
		System.out.println("map2 = " + map2);

		// map1에 map2내용을 추가
		map1.putAll(map2);
		System.out.println("map1 = " + map1);

		// 다른 Map을 인자로 하는 생성자
		Map<Integer, String> map3 = new HashMap<>(map2);
		System.out.println("map3 = " + map3);
	}
	
	/**
	 * Map<K, V>
	 *  - K : key타입
	 *  - V : Value타입
	 */
	public void test1() {
		Map<String, Object> map = new HashMap<String, Object>();

		// 요소추가 put
		// 기존요소가 있다면, 삭제된 요소를 반환
		map.put("hello", "안녕하세요");
		map.put("num", 123);
		map.put("today", new Date());
		System.out.println(map.put("name", "홍길동"));
		System.out.println(map.put("name", "신사임당")); // 동일한 Key값인 경우, 기존값을 치환

		// toString Override되어있음
		System.out.println(map);
		System.out.println();

		// 요소 가져오기 get(K) -> Value타입 리턴
		System.out.println(map.get("num"));
		System.out.println(map.get("hello"));
		System.out.println(map.get("today"));
		System.out.println(map.get("name"));
		System.out.println();
		
		// 요소 삭제 remove(k)
		System.out.println("remove : " + map.remove("num"));
		System.out.println(map); // 삭제 후 map
		
		// 요소 전체 개수
		System.out.println("요소 갯수 : " + map.size());
	}
}
