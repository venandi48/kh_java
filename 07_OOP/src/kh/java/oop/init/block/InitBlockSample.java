package kh.java.oop.init.block;

import java.util.Random;

/**
 * 초기화 블럭 : 필드값 세팅을 위한 코드 작성 구간 
 *
 * 멤버변수 값대입 순서
 *  1. 타입별 기본값 (선언부에 값대입 하지 않은 경우)
 *  2. 초기값 (선언부에 초기화한 경우)
 *  3. 초기화블럭 설정값
 *  4. 생성자에서 설정값
 *  
 * 클래스변수의 값대입 순서
 *  1. 타입별 기본값
 *  2. 초기값
 *  3. static 초기화블럭 설정값
 *  
 */
public class InitBlockSample {
	
	static int x2;
	static double y2 = 7;

	//클래스변수 초기화 블럭
	static {
		System.out.println("static초기화블럭 y2 = " + y2);
		y2 = 77;
	}	
	

	int x;
	int y = 100;
	int[] lotto; //복잡한 초기값 설정을 가진 변수

	// 멤버변수의 초기화 블럭
	{
		System.out.println("초기화블럭 전 y = " + y);
		y = 200;
		
		
		lotto = new int[6];
		Random rnd = new Random();
		int i = 0;
		while(true) {
			int n = rnd.nextInt(45)+1;
			lotto[i++] = n;
			if( i == lotto.length)
				break;
		}
	}
	
	/**
	 * 생성자
	 *  - 리턴타입 없음
	 *  - 클래스명과 생성자 메소드명은 동일
	 */
	public InitBlockSample() {
		System.out.println("생성자 전 y = " + y);
		y = 300;
	}
}
