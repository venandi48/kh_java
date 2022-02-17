package kh.java.api.string;

import java.util.StringTokenizer;

public class StringStudy {
	public static void main(String[] args) {
		StringStudy study = new StringStudy();
//		study.test1();
//		study.test2();
//		study.test3();
//		study.test4();
//		study.test5();
		study.test6();
	}
	
	/**
	 * String api
	 */
	public void test6() {
		String str = "application";
		System.out.println(str.indexOf("ca"));
		System.out.println(str.indexOf("kkk")); // 존재하지 않는 경우
		
		long tmp = (int)3.9;
		System.out.println(tmp%2);
	}
	
	/**
	 * 여러문자를 동시처리하기
	 */
	public void test5() {
		String data = "a,1,가\n"
				+ "b,2,나\n"
				+ "c,3,다";
		
		// spilt의 인자는 정규표현식(문자열검색표현식)
		// []는 문자하나의 옵션 - ",\n" : , \n을 구분자로 사용
		String[] result = data.split("[,\n]");
		for (String s : result)
			System.out.println(s);
	}
	
	public void test4() {
		String data = "a,1,가\n"
					+ "b,2,나\n"
					+ "c,3,다";
		System.out.println("[" + data + "]");
		System.out.println();

		// 2차원배열처럼 풀이
		String[] result1 = data.split("\n");
		for (int i = 0; i < result1.length; i++) {
			System.out.println("[" + result1[i] + "]");

			String[] result2 = result1[i].split(",");
			for (int j = 0; j < result2.length; j++)
				System.out.println("[" + result2[j] + "]");
		}
		System.out.println();

		// 1차원배열처럼 풀이
		StringTokenizer tokenizer = new StringTokenizer(data, ",\n");
		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			System.out.println("[" + token + "]");
		}
	}
	
	/**
	 * 문자열 쪼개기
	 *  - "java,oracle,html,css,javascript"
	 *  - CSV comma separated value
	 * 
	 * 1. String#split
	 * 2. StringTokenizer
	 */
	public void test3() {
		String data = "java / oracle / html / css / javascript";
		String[] result1 = data.split(" / "); // 매개인자로 구분자 전달
		System.out.println(result1.length);
		for (int i = 0; i < result1.length; i++)
			System.out.println("[" + result1[i] + "]");
		System.out.println();

		// tokenizer는 문자기준으로 사용. (' ', '/' = " /")
		// 값이 없는 token은 버려짐
		StringTokenizer tokenizer = new StringTokenizer(data, " /");
		System.out.println(tokenizer.countTokens());
		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken(); // 해당 토근을 tokenizer 객체로부터 가져옴(제거)
			System.out.println("[" + token + "]" + tokenizer.countTokens());
		}
	}
	
	/**
	 * 변경되는 String을 메모리상 효율적관리를 위해 mutable한 String클래스
	 *  - StringBuilder : 싱글쓰레드용
	 *  - StringBuffer : 멀티쓰레드용 동기화지원(다중쓰레드에서 공유시 안전한 사용 보장)
	 */
	public void test2() {
		StringBuilder sb = new StringBuilder("java");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		
		sb.append("oracle");
		System.out.println(sb);
		System.out.println(sb.hashCode());
	}
	
	/**
	 * String
	 *  - immutable(변경불가)
	 *  - Heap영역의 Literal저장소 영역에 생성되어 관리
	 */
	public void test1() {
		String s1 = "java";
		String s2 = "java";
		String s3 = new String("java");
		String s4 = new String("java");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		System.out.println();
		
		// 동일성(주소값)비교 ==
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s3 == s4);
		
		System.out.println();
		// 동등성(객체가 가진 정보)비교 equals
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		
		// equals의 결과가 true라면 hashCode결과가 동일해야함
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		System.out.println();
		
		// 문자열은 수정불가
		s1 += "oracle"; // "java"를 수정하는 것이 아닌, "javaoracle"을 추가생성하여 주소값을 새로 가지는 것
		s3 += "oracle";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
	}
}
