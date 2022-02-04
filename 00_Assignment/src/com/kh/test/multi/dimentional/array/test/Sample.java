package com.kh.test.multi.dimentional.array.test;

public class Sample {
	public static void main(String[] args) {
		Sample hw = new Sample();
//		hw.exercise1();
		hw.exercise2();
		
	}
	
	public void exercise2() {
		int[][] arr = new int[4][4];

		//배열 내 임의의 정수 기록
		for(int i=0; i<arr.length-1; i++) {
			int sumRow = 0;
			
			for(int j=0; j<arr[0].length; j++) {
				if(j<arr[0].length-1) {
					arr[i][j] = (int)(Math.random()*100);
					sumRow += arr[i][j];
				}
				else arr[i][j] = sumRow;
				arr[arr.length-1][j] += arr[i][j];
			}
		}
		
		System.out.println("\t0열\t1열\t2열\t3열");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i+"행\t");
			for(int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
	
	public void exercise1() {
		int[][] arr = new int[3][5];
		
		//배열 내 임의의 정수 기록
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				arr[i][j] = (int)(Math.random()*100);
			}
		}
		
		//배열에서 값이 5의 배수인 경우만 출력
		for(int i=0; i< arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] % 5 == 0)
					System.out.printf("%d(%d,%d) ", arr[i][j], i, j);
			}
			System.out.println();

		}
		
	}
}
