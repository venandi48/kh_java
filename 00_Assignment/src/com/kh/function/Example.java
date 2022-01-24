package com.kh.function;

import java.util.Scanner;

public class Example {

	public void opSample1() {
		int kr;
		int eng;
		int mt;
		int total = 0;
		double avg;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("국어점수 입력: ");
		kr = sc.nextInt();
		
		System.out.print("영어점수 입력: ");
		eng = sc.nextInt();
		
		System.out.print("수학점수 입력: ");
		mt = sc.nextInt();
		
		total = kr + eng + mt;
		avg = total / 3.0;
		
		String result = kr >= 40 && eng >= 40 && mt >= 40 && avg >= 60 ? "합격" : "불합격";
		System.out.printf("%s입니다.%n", result);		
	
	}
	
	public void opSample2() {
		String name;
		int year;
		int classNum;
		int stNum;
		char gender;
		double grade;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름입력: ");
		name = sc.nextLine();
		
		System.out.print("학년입력: ");
		year = sc.nextInt();
		
		System.out.print("반입력: ");
		classNum = sc.nextInt();
		
		System.out.print("번호입력: ");
		stNum = sc.nextInt();
		
		sc.nextLine(); //버퍼비우기
		System.out.print("성별입력(Male|Female): ");
		String tmp = sc.nextLine();
		gender = tmp.charAt(0);
		
		System.out.print("성적입력: ");
		grade = sc.nextDouble();
		
		System.out.printf("%d학년 %d반 %d번 ", year, classNum, stNum);
		System.out.print(gender=='M'?"남학생":"여학생");
		System.out.printf(" %s는 성적이 %.2f이다.%n", name, grade);
	}
	
	public void opSample3() {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력: ");
		a = sc.nextInt();
		System.out.println( a >= 0 ? "양수다." : "양수가 아니다.");
	}
	
	public void opSample4() {
		int x;
		String result;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력: ");
		x = sc.nextInt();
		result = x%2 == 0 ? "짝수다" : "홀수다";
		System.out.println(result);
	}
}
