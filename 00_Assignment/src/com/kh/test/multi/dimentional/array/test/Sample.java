package com.kh.test.multi.dimentional.array.test;

public class Sample {
	public static void main(String[] args) {
		Sample hw = new Sample();
//		hw.exercise1();
		hw.exercise2();
		
	}
	
	public void exercise2() {
		int[][] arr = new int[3][4];
		
		//배열 내 임의의 정수 기록
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length; j++) {
				arr[i][j] = (int)(Math.random()*100);
			}
		}
		
		int sum = 0;
		System.out.println("\t0열\t1열\t2열\t3열");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(i+"행\t");
			for(int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]+"\t");
				sum += arr[i][j];
			}
			System.out.println("행 합계: "+sum);
			sum = 0;
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
		
		//배열에서 열이 5의 배수인 경우만 출력
		for(int i=0; i< arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (j % 5 == 0)
					System.out.printf("%d(%d,%d) ", arr[i][j], i, j);
			}
			System.out.println();

		}
		
	}
}
