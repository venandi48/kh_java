package ncs.test5;

import java.util.Scanner;

public class TestScore {
	public static void main(String[] args) {

		int studentCount = 3; // 학생 수
		int subCount = 3; // 과목 수
		double[][] arr = new double[studentCount][subCount + 2];

		Scanner sc = new Scanner(System.in);
		
		// 입력
		for (int i = 0; i < arr.length; i++) {
			double sum = 0; // 과목별 점수 합
			System.out.println(i + "열 학생 정보 입력");
			
			for (int j = 0; j < subCount; j++) {
				// 키보드로 점수 입력
				System.out.printf("과목%d 점수> ", j + 1);
				arr[i][j] = sc.nextDouble();

				// 해당 학생 총점
				sum += arr[i][j];
			}
			arr[i][arr[i].length - 2] = sum;
			arr[i][arr[i].length - 1] = sum / subCount;
		}

		// 출력
		System.out.println("index\t과목1\t과목2\t과목3\t총점\t평균");
		for (int i = 0; i < studentCount; i++) {
			System.out.printf("%d\t%.1f\t%.1f\t%.1f\t%.1f\t%.1f\n",
					i, arr[i][0], arr[i][1], arr[i][2], arr[i][3], arr[i][4]);
		}
	}
}
