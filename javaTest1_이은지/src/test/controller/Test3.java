package test.controller;

public class Test3 {
	public static void main(String[] args) {
		double sum = 0.0;
		double avg = 0.0;
		int i = 1;
		int max = 100;

		while (i <= max) {
			sum += i;
			if (i == max)
				avg = (double) sum / i;
			i++;
		}
		System.out.printf("합계 : %.0f%n평균 : %.1f%n", sum, avg);
	}
}
