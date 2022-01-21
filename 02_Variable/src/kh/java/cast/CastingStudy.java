package kh.java.cast;


/**
 * 컴퓨터 연산원리
 * 1. 값(literal)은 같은 타입의 변수에만 대입 가능
 * 2. 같은 자료형끼리만 연산 가능
 * 3. 같은 자료형 간 연산결과값의 자료형 또한 동일
 * 	ex) int는 int와 연산하고, 연산결과 역시 int이다.
 * 
 */


public class CastingStudy {

	public static void main(String[] args) {
		CastingStudy cs = new CastingStudy();
		//cs.test1();
		cs.test2();
	}
	
	
	/**
	 * 명시적 형변환(강제)
	 * 	형변환에 의해 값이 유실될 수 있다.
	 */
	public void test2() {
		
		// 1. 큰 타입에서 작은 타입으로 형변환
		int num = (int) 3.7; //double값을 int로 강제 형변환
		System.out.println(num);
		
		// 2. 작은 타입에서 큰 타입으로 형변환
		int k = 10;
		int m = 3;
		System.out.println( k / m ); // int간의 연산결과는 int
		
		System.out.println( (double)k / m );
		// k를 double형으로 변환(10.0)하여 연산하면
		// double와 int 간의 연산이 되어 결과 자료형은 double이 된다.
		
		//형변환으로 오버플로우 없이 결과값 출력
		int i = Integer.MAX_VALUE;
		System.out.println( (long)i + 1 );
		
	}
	
	
	/**
	 * 암묵적 형변환(자동)
	 * 	형변환에의해 값이 유실되지 않는 경우
	 *  byte > short/char > int > long > float > double
	 * 		long>float: 실수는 지수표현방식으로 적은 공간에 많은 수 표현가능
	 * 	
	 * 
	 * 명시적 형변환
	 */
	public void test1() {
		
		// 연산대상 변수의 자료형이 상이할 경우, 크기가 큰 타입으로 자동 형변환된다.
		System.out.println(1 + 3.3);
		// int + double 형태이기때문에
		// double + double 형태로 암묵적 형변환이 이루어진다.
		
		// 다른 타입의 변수에 값을 대입하는 경우
		//double 타입의 변수에 int타입을 대입연산
		double d = 3;
		System.out.println(d);
		
		
		char ch = 'a';
		int aNum = ch;
		System.out.println(aNum);

		//char는 정수형과 연산 할 경우 숫자로 연산,
		//문자열과 연산 할 경우 문자열로 연산된다.
		System.out.println(ch + 100);
		System.out.println(ch + "A");
		
		
		
	}
}
