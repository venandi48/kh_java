package kh.java.array;

import java.util.Scanner;

public class ArrayStudy {
	public static void main(String[] args) {
		ArrayStudy study = new ArrayStudy();
//		study.test1();
//		study.test2();
//		study.test3();
//		study.test4();
//		study.test5();
		study.test6();
	}
	
	
	/***
	 * 배열의 크기는 변경이 불가하다.
	 * 배열(객체)의 주소값을 null로 변경하여 삭제한다. ->Garbage Collector
	 */
	public void test6() {
		double[] arr = new double[3];
		
		//hashCode 객체를 관리하기위한 고유값 key
		System.out.println(arr.hashCode());
		
		//기존 배열의 크기를 변경한 것이 아닌, 크기가 10인 새로운 배열을 할당한 것.
		arr = new double[10];
		System.out.println(arr.hashCode());
		
		//주소값을 null 지정해서 객체 삭제
		double[] temp = arr;
		arr = null;
		//기존 arr이 가지던 주소값을 temp에 대입한 뒤에 arr을 삭제했기때문에 힙영역의 데이터 반환은X
	
		//연결된 배열이 없을 때
//		System.out.println(arr[0]); //에러
//		System.out.println(arr.length); //에러
	}
	
	/**
	 * String[]
	 *  - 참조형 타입의 기본값은 null이다.
	 *  
	 * 사용자에게 친구 세명의 이름을 입력받고, 배열에 저장 후 출력
	 */
	public void test5() {
		String[] names = new String[3];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < names.length; i++) {
			System.out.print("친구이름 입력: ");
			names[i] = sc.next();
		}

		System.out.print("당신의 친구는 ");
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i]);
			if (i != names.length - 1)
				System.out.print(", ");
		}
		System.out.println("입니다.");
	}
	
	/**
	 * 배열 초기화
	 *  - 배열변수선언, 배열할당, 인덱스별 값대입
	 */
	public void test4() {
		//int[] scores = new int[] { 100, 90, 80, 98, 65 };
		int[] scores = { 100, 90, 80, 98, 65 }; 		
		int total = 0;
		double avg;
		
		for (int score : scores) {
			System.out.println(score);
			total += score;
		}
		avg = (double) total/scores.length;
		
		System.out.println("총점: "+total);
		System.out.println("평균: "+ avg);
		
	}
	
	/**
	 * 관리할 데이터의 규칙이 있다면, 값대입도 반복문을 사용 할 수 있다.
	 * 
	 * char[] 
	 */
	public void test3() {
		//배열변수선언 & 배열할당
		char[] alphabet = new char[26];
	
		for (int i = 0; i < alphabet.length; i++) {
			alphabet[i] = (char) ('A' + i);
			System.out.print(alphabet[i] + " ");
		}
		System.out.println();
		
		//foreach: 향상된 for문
		//하나의 요소를 담을 변수 : 반복접근할 배열
		//인덱스를 사용할 수 없다.
		for(char ch : alphabet) {
			System.out.print(ch+ " ");
		}
		
	}
	
	/**
	 * 홍길동 학생 과목별 점수
	 * 100, 90, 80, 98, 65
	 */
	public void test2() {
		final int LENGTH = 5;
		int[] score = new int[LENGTH];

		score[0] = 100;
		score[1] = 90;
		score[2] = 80;
		score[3] = 98;
		score[4] = 65;

		System.out.println("배열 길이 속성: " + score.length);
		for (int i = 0; i < score.length; i++)
			System.out.println(score[i]);

	}
	
	/**
	 * 변수: 값 하나를 보관
	 * 배열: 값 여러개를 보관 
	 * 
	 * 1. 배열선언: stack영역에 변수(공간) 생성
	 * 2. 배열할당: heap영역에 배열을 실제 생성하고, 배열의 주소값을 stack영역 변수에 대입
	 * 3. 사용: 변수와 인덱스를 이용하여 값대입 혹은 사용
	 * 
	 */
	public void test1() {
		//1. 배열변수 선언 - 참조형(4byte)공간 생성
		int[] n;
		
		//2. 배열할당 - heap영역에 배열 생성
		//heap영역에 생성된 int공간 4개는 0으로 초기화된다.
		//stack을 제외한 heap, static영역은 변수생성 시 자동으로 기본값을 초기화된다.
		//
		//타입별 기본값(0)
		// - boolean(false), char(' '), int(0), double(0.0)
		n = new int[4]; //주소값을 대입
		
		//3. 사용
		System.out.print(n[0]+" ");
		System.out.print(n[1]+" ");
		System.out.print(n[2]+" ");
		System.out.print(n[3]+"\n"); //마지막 인덱스: 길이 -1
		
		n[0] = 10;
		n[1] = 20;
		n[2] = 30;
		n[3] = 40;
		System.out.print(n[0]+" ");
		System.out.print(n[1]+" ");
		System.out.print(n[2]+" ");
		System.out.print(n[3]+"\n");
		
	
	}
}
