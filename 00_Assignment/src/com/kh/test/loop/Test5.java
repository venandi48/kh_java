package com.kh.test.loop;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Test5 hw = new Test5();
		hw.test();
	}
	
	public void test() {
		int memberCount;
		
		int sumAge = 0;
		int sumHeight = 0;
		int sumWeight = 0;
		double avgAge;
		double avgHeight;
		double avgWeight;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정보를 입력할 회원 수: ");
		memberCount = sc.nextInt();
		sc.nextLine(); //버퍼초기화
		
		//회원수 만큼의 갯수를 가진 변수들을 선언
		String[] name = new String[memberCount];
		int[] age = new int[memberCount];
		String[] addr = new String[memberCount];
		int[] height = new int[memberCount];
		int[] weight =new int[memberCount];
		String[] call = new String[memberCount];
		
		//회원정보입력
		for(int i = 0 ; i < memberCount ; i++) {
			System.out.print((i+1) + "번 회원 이름 입력: ");
			name[i] = sc.nextLine();
			
			System.out.print((i+1) + "번 회원 나이 입력: ");
			age[i] = sc.nextInt();
			sumAge += age[i];
			sc.nextLine(); //버퍼초기화
			
			System.out.print((i+1) + "번 회원 주소 입력: ");
			addr[i] = sc.nextLine();
			
			System.out.print((i+1) + "번 회원 키 입력: ");
			height[i] = sc.nextInt();
			sumHeight += height[i];

			System.out.print((i+1) + "번 회원 몸무게 입력: ");
			weight[i] = sc.nextInt();
			sumWeight += weight[i];
			sc.nextLine(); //버퍼초기화			
			
			System.out.print((i+1) + "번 회원 연락처 입력: ");
			call[i] = sc.nextLine();
			
			System.out.println();
		}
		avgAge = sumAge/memberCount;
		avgHeight = sumHeight/memberCount;
		avgWeight = sumWeight/memberCount;
		
		//회원정보 출력
		System.out.println("======================== 저장회원 ========================");
		for(int i = 0 ; i < memberCount ; i++) {
			System.out.printf("%d %s\t%d세\t%s\t%dcm\t%dkg\t%s%n",
					i+1, name[i], age[i], addr[i], height[i], weight[i], call[i]);
		}
		System.out.println("========================================================");
		System.out.printf("평균나이 %.1f세 / 평균 키 : %.1fcm / 평균 몸무게 : %.1fkg%n", avgAge, avgHeight, avgWeight);
		
	}

}
