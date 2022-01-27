package com.kh.test.loop;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Test5 hw = new Test5();
//		hw.test();
		hw.test3();
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
	
	private void test3() {
		Scanner sc = new Scanner(System.in);
		String name = "";
		int age = 0;
		String addr = "";
		int height = 0;
		int weight = 0;
		String phone = "";

		// 기능추가2 : 회원수 지정
		System.out.print("몇명의 회원을 등록할까요? => ");
		int memberCnt = sc.nextInt();

		String result = "=================== 저장회원 ==================\n";

		// 기능추가1 : 총합/평균구하기
		int sumAge = 0;
		int sumHeight = 0;
		int sumWeight = 0;

		double avgAge = 0;
		double avgHeight = 0;
		double avgWeight = 0;

		for (int i = 0; i < memberCnt; i++) {
			System.out.println("-------------- " + (i + 1) + " -----------------");

			System.out.print("이름을 입력하세요 : ");
			name = sc.next();

			System.out.print("나이를 입력하세요 : ");
			age = sc.nextInt();

			sc.nextLine();
			System.out.print("주소를 입력하세요 : ");
			addr = sc.nextLine();

			System.out.print("키를 입력하세요 : ");
			height = sc.nextInt();

			System.out.print("몸무게를 입력하세요 : ");
			weight = sc.nextInt();

			System.out.print("연락처를 입력하세요 : ");
			phone = sc.next();

			result += (i + 1) + "\t" + name + "\t" + age + "\t" + addr + "\t" + height + "cm\t" + weight + "kg\t"
					+ phone + "\n";

			// 기능추가1 : 총합/평균구하기
			sumAge += age;
			sumHeight += height;
			sumWeight += weight;
		}

		avgAge = (double) sumAge / memberCnt;
		avgHeight = (double) sumHeight / memberCnt;
		avgWeight = (double) sumWeight / memberCnt;

		result += "===========================================\n";

		System.out.println(result);
		System.out.printf("평균나이 : %.1f세 | 평균신장 : %.1fcm | 평균몸무게 : %.1fkg", avgAge, avgHeight, avgWeight);

	}

	
	

}
