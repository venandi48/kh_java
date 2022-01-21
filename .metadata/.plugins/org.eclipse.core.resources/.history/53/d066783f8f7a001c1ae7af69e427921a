package kh.java.type;


/**
 * 
 * bit : 0 또는 1 저장
 * byte : 1byte = 8bit
 * kilo-byte : 1kb = 1024byte
 * mega-byte : 1mb = 1024kb
 * giga-byte : 1gb = 1024mb
 * tera-byte : 1tb = 1024gb
 * peta-byte 
 * exa-byte
 * zetta-byte
 * yotta-byte
 * 
 * 자료형
 * 1. 기본형(원시형) : 변수에 실제값(literal)을 보관
 * 		ex) 10, 3.14, a, true ...
 * 		문자형 : 한글자를 담음	char (2byte)
 * 		논리형 : true/false	boolean (1byte)
 * 		정수형 : 숫자			byte (1byte)
 * 							short (2byte)
 * 							int (4byte)
 * 							long (8byte)
 * 		실수형 : 소수점 있는 수	float (4byte)
 * 							double (8byte)
 * 
 * 2. 참조형(클래스도 참조형에 포함) : 변수에 객체에 대한 주소값을 보관
 * 
 */

public class PrimitiveTypeStudy {

	public static void main(String[] args) {
		
		PrimitiveTypeStudy pts = new PrimitiveTypeStudy();
		//pts.test1();
		//pts.test2();
		pts.test3();
	}
	
	/**
	 * 
	 * Data Overflow
	 *  - 자료형 별 최대크기를 넘어서는 연산이 이루어지면 다시 최소값으로 돌아간다.
	 * 
	 */
	public void test3() {
		int i = Integer.MAX_VALUE;
		i = i + 1;
		System.out.println(i);
	}
	
	/**
	 * 
	 * 초기화 : 변수 선언과 값대입을 동시에 처리
	 * 
	 * 상수 : Constant Variable (항상 같은 값을 지니는 변수)
	 * 	- 초기화 이후 값 변경을 할 수 없는 변수
	 * 	- 반드시 초기화가 필요
	 * 
	 */
	
	public void test2() {
		
		//변수 선언과 동시에 값 대입
		int num = 500;
		//System.out.println(num);
		
		num = num + 100; //좌항(num)공간에 기존 num값에 100을 더한 값(우항값)을 대입
		//System.out.println(num);
		
		
		//상수
		final int AGE = 28;
		System.out.println(AGE);
		
		//AGE = AGE + 1;
		
		//jdk api에 선언된 상수
		System.out.println(Byte.MIN_VALUE + " ~ " + Byte.MAX_VALUE); //숫자 + 문자열 = 문자열
		System.out.println(Short.MIN_VALUE + " ~ " + Short.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
		System.out.println(Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
		
		
	}
	
	public void test1() {
		
		int n;
		n = 10;
		System.out.println(n);
		
		char c;
		c='김';
		System.out.println(c);
		
		boolean b;
		b = true;
		System.out.println(b);
		
		double dnum;
		dnum = 0.123456789123456789123456789;
		System.out.println(dnum);
		
		long lnum;
		lnum = 123_456L; //해당 값을 long타입으로 명시
		System.out.println(lnum);
		
		float fnum;
		fnum = 123.456f; //해당 값을 float타입으로 명시
		System.out.println(fnum);
		
	}
}
