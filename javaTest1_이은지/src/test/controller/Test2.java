package test.controller;

public class Test2 {
	public static void main(String[] args) {
		int minDan = 2; //구구단의 가장 작은 단
		int maxDan = 5; //구구단의 가장 큰 단
		int minN = 1; //단의 최소 곱값
		int maxN = 9; //단의 최대 곱값
		
		for (int i = minDan; i <= maxDan; i++) {
			for (int j = minN; j <= maxN; j++) {
				if ((i * j) % 2 == 1)
					System.out.printf("%d*%d=%d%n", i, j, i * j);
			}
			System.out.println();
		}
	}
}
