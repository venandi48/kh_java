package com.kh.java._import;

import java.util.Date; //java built-in class

import com.kh.java._import.other.Bar;
import a.b.c.ABC;


public class ImportMain {

	public static void main(String[] args) {
	
		
		// A. 같은 package인 경우
		// 1. 객체생성: 클래스->객체
		// 객체 recipe	
		//클래스명 변수명 = new 생성자;
		ImportMain main = new ImportMain();		
		// 2. 메소드 호출
		main.test1();
		
		
		// 1. 객체생성
		Foo foo = new Foo();
		// 2. 메소드호출
		foo.test2();
		
		
		// B. 다른 package인 경우, import문이 필요
		Bar bar = new Bar();
		bar.test3();
		
		
		//java API 활용하기
		//java api의 다른 클래스도 import문 작성 후 사용가능
		Date date = new Date();
		System.out.println(date);
		
		
		//다른 package 메소드 사용하기 실습
		ABC abc = new ABC();
		abc.hello();
		
		
		
		// C. 예외
		// 문자열 객체 생성
		String str = new String("자바");
		System.out.println(str);
		
	}
	
	public void test1() {
		System.out.println("안녕");
	}
}
