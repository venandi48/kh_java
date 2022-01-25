package com.kh.test.condition;

import java.util.Scanner;

public class GameTest {
	
	public static void main(String[] args) {
		GameTest hw = new GameTest();
		hw.game();
	}
	
	public void game() {
		int user;
		int computer;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=== 가위 바위 보 게임 ===");
		System.out.print("숫자를 선택하세요(1.가위/2.바위/3.보): ");
		user = sc.nextInt();
		computer = (int)(Math.random() * 3) + 1;

		System.out.println("=========결과=========");
		
		//가위선택
		if( user == 1 && computer == 1) {
			System.out.println("당신은 가위를 냈습니다.");
			System.out.println("컴퓨터는 가위를 냈습니다.");
			System.out.println("=====================");
			System.out.println("비겼습니다!");

		}
		else if( user == 1 && computer == 2) {
			System.out.println("당신은 가위를 냈습니다.");
			System.out.println("컴퓨터는 바위를 냈습니다.");
			System.out.println("=====================");
			System.out.println("당신이 졌습니다!");
		}
		else if( user == 1 && computer == 3) {
			System.out.println("당신은 가위를 냈습니다.");
			System.out.println("컴퓨터는 보를 냈습니다.");
			System.out.println("=====================");
			System.out.println("당신이 이겼습니다. ㅠ.ㅠ");
	}

		//바위선택
		else if( user == 2 && computer == 1) {
			System.out.println("당신은 바위를 냈습니다.");
			System.out.println("컴퓨터는 가위를 냈습니다.");
			System.out.println("=====================");
			System.out.println("당신이 이겼습니다. ㅠ.ㅠ");
}
		else if( user == 2 && computer == 2) {
			System.out.println("당신은 바위를 냈습니다.");
			System.out.println("컴퓨터는 바위를 냈습니다.");
			System.out.println("=====================");
			System.out.println("비겼습니다!");
		}
		else if( user == 2 && computer == 3) {
			System.out.println("당신은 바위를 냈습니다.");
			System.out.println("컴퓨터는 보를 냈습니다.");
			System.out.println("=====================");
			System.out.println("당신이 졌습니다!");
		}
		
		
		else if( user == 3 && computer == 1) {
			System.out.println("당신은 보를 냈습니다.");
			System.out.println("컴퓨터는 가위를 냈습니다.");
			System.out.println("=====================");
			System.out.println("당신이 졌습니다!");
		}
		else if( user == 3 && computer == 2) {
			System.out.println("당신은 보를 냈습니다.");
			System.out.println("컴퓨터는 바위를 냈습니다.");
			System.out.println("=====================");
			System.out.println("당신이 이겼습니다. ㅠ.ㅠ");
		}
		else if( user == 3 && computer == 3) {
			System.out.println("당신은 보를 냈습니다.");
			System.out.println("컴퓨터는 보를 냈습니다.");
			System.out.println("=====================");
			System.out.println("비겼습니다!");
		}
		
		
	}

}
