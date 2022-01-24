package kh.java.operator;

import java.util.Scanner;

public class OperatorStudy {

	public static void main(String[] args) {
		OperatorStudy study =new OperatorStudy();
		//study.test1();
		//study.test2();
		//study.test3();
		//study.test4();
		//study.test5();
		study.test6();

		
	}
	
	/**
	 * 복합대입연산자
	 * 	+=, -=, *= /=, %=
	 */
	public void test6() {
		int a = 5;
		
		a += 5; //a = a + 5와 동일
		System.out.println(a);
		
		a -= 3;
		System.out.println(a);
		
		a *= 2;
		System.out.println(a);
		
		a /= 5;
		System.out.println(a);
		
		a %= 2;
		System.out.println(a);
		
	}
	
	/**
	 * 삼항연산자
	 * 	(조건식) ? (참일때 값) : (거짓일때 값) ;
	 * 	 - 조건식: boolean 또는 boolean으로 평가되는 연산식
	 * 
	 */
	public void test5() {
		int a = 100;
		
		String s = (a < 50) ? "a는 50보다 크다" : "a는 50보다 작다";
		System.out.println(s);
		System.out.println();
		
		
		//사용자에게 입력받은 정수가 홀수/짝수인지 출력
		Scanner sc =new Scanner(System.in);
		System.out.print("정수입력: ");
		int num = sc.nextInt();
		String result = (num % 2 == 0) ? "짝수" : "홀수";
		System.out.printf("%d은 %s입니다.%n",num,result);
	}
	
	/**
	 * 이항연산자
	 * 	&& and연산자
	 * 	 - a && b
	 * 	 - a b 모두 참일 때 true 리턴
	 * 	true && true -> t
	 *  true && false -> f
	 *  false && true -> f (우항검사 생략)
	 *  false && false -> f (우항검사 생략)
	 * 
	 * 	|| or연산자
	 * 	 - a || b
	 * 	 - a와 b 중에 하나라도 참이면 true 리턴
	 * 	true && true -> t
	 *  true && false -> t
	 *  false && true -> t (우항검사 생략)
	 *  false && false -> f (우항검사 생략)
	 */
	public void test4() {
		int a = 10;
		int b = 7;
		System.out.println(a > 7 && b == 7);
		System.out.println(a==10 && b<5);
		System.out.println(a>100 && b>=0);
		System.out.println(a-b==500 && b==3);
		System.out.println();
		
		System.out.println(a%3==1 || a*b<999);
		System.out.println(a<=20 || b<=0);
		System.out.println(a/b==1 || a-b<5);
		System.out.println(a==b || ++a<=3);
		
		
		int x = 1;
		int y = 1;
		//System.out.println(x!=1 && ++y==2);
		System.out.println(x==1 || ++y==2);		
		System.out.printf("x = %d, y = %d%n", x, y);
	}
	
	/**
	 * 이항연산자
	 * 		+, -, *, /, %
	 */
	public void test3() {
		int a = 10;
		int b = 3;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b); //몫을 구하는 연산
		System.out.println(a % b); //나머지값을 구하는 연산
		
		//나머지 연산의 활용 예시
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int n = sc.nextInt();
		System.out.println("짝수인가? " + (n % 2 == 0));
		
	}
	
	
	
	public void test2() {
		
		int x = 10;
		int y = 10;
		int z = ++x;
	
		System.out.println(z); //11
		System.out.println(x); //11
		
		z = y++;
		System.out.println(z); //10
		System.out.println(y); //11
		
		x = 20;
		z = x++ + --y;
		System.out.println(x); //21
		System.out.println(y); //10
		System.out.println(z); //30
		
		int m = 20;
		int n = m++ + m;
		System.out.println(m); //21
		System.out.println(n); //41	
		
	}
	
	
	/**
	 * 1. 단항연산자
	 * 		+, -
	 * 		++, --
	 * 
	 */
	public void test1() {
//		int a = +3;
//		int b = -3;
//		System.out.println(a);
//		System.out.println(b);
		
		// 증감연산자
		// 1. 전위증감연산자(++c, --c) : 먼저 1 증감한 뒤에 인접연산을 처리
		// 2. 후위증감연산자(c++, c--) : 먼저 인접연산을 처리 한 뒤에 1증감
//		int c = 10;
//		++c; // c = c + 1
//		System.out.println(c);
		
		
		int k = 1;
		System.out.println(k++ + 1);
		System.out.println(k);
		
		int m = 3;
		int n = m++;
		System.out.println(m);
		System.out.println(n);
		
	}
}


