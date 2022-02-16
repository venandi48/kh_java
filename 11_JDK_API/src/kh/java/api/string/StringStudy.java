package kh.java.api.string;

public class StringStudy {
	public static void main(String[] args) {
		StringStudy study = new StringStudy();
//		study.test1();
		study.test2();
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
