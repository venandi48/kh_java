package kh.java.random.number;

import java.util.Random;
import java.util.Scanner;

public class RandomStudy {
	
	public static void main(String[] args) {
		RandomStudy study = new RandomStudy();
		
		//study.test1();
		//study.test2();
		study.test3();
		
	}
	
	/**
	 * 동전 앞뒤 맞히기 게임
	 *  - 사용자입력값 (앞/뒤)
	 *  - 컴퓨터난수값 (앞/뒤)
	 */
	public void test3() {
				
		Scanner sc = new Scanner(System.in);
		System.out.print("동전 1.앞 2.뒤 : ");
		int userCoin = sc.nextInt();
		
		int comCoin = (int)(Math.random() * 2) + 1;
		//int conCoin = rnd.nextBoolean() ? 1 : 2; 도 가능
		System.out.printf( "%s%n", comCoin==userCoin ? "당신이 이겼습니다." : "컴퓨터가 이겼습니다." );
		//System.out.println(answer+" 고르고, "+rst+"나옴");
	}
	

	/**
	 * 1. java.util.Random
	 *  - import 필요
	 */
	public void test1() {
		Random rnd = new Random();
		System.out.println(rnd.nextInt()); //int범위 내의 난수를 반환
		System.out.println();
		
		// 일정 범위 내의 난수 생성하기
		// nextInt(경우의 수) + 범위시작값
		System.out.println(rnd.nextInt(10)); //0~9의 범위에서 반환
		System.out.println(rnd.nextInt(10)+1); //1~10의 범위에서 반환
		System.out.println(rnd.nextInt(6)+5); //5~10의 범위에서 반환
		System.out.println();
		
		System.out.println(rnd.nextDouble()); //0.0이상 1.0미만의 실수 반환
		System.out.println(rnd.nextBoolean() ? "안녕" : "잘가"); //t/f 중 하나 반환
		
		// 임의의 알파벳 대문자 출력하기
		System.out.println((char)(rnd.nextInt(26)+65)); //printf(“%c”,rnd.nextInt(26)+65)도 가능
	}

	/**
	 * 2. Math.random(): double 리턴
	 * 	- 0.0이상 1.0미만의 실수 반환
	 *  - import없이 사용 가능
	 */
	public void test2() {
	
		//System.out.println(Math.random());
		double n = Math.random();
		System.out.println(n);
		
		
		// 일정 범위 내의 난수 생성하기
		// (int)( Math.random() * 경우의 수 ) + 범위시작값
		System.out.println((int)(n*10)); //0~9내로 반환
		System.out.println((int)(n*10)+1); //1~10내로 반환
		
		// 임의의 알파벳 대문자 출력하기
		System.out.println((char)((int)(n*26)+65));
		System.out.printf("%c%n", (int)(Math.random()*26)+'A');
	}	
}
