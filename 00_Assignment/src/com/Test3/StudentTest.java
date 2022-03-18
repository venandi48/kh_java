package com.Test3;

public class StudentTest {

	public static void main(String[] args) {

		Student[] studentArr = new Student[3];

		// Student 객체를 3개 생성하여 배열에 넣는다
		studentArr[0] = new Student("홍길동", 15, 170, 80);
		studentArr[1] = new Student("한사람", 13, 180, 70);
		studentArr[2] = new Student("임걱정", 16, 175, 65);

		int sumHeight = 0;
		int sumWeight = 0;
		int sumAge = 0;

		int maxH = Integer.MIN_VALUE, maxW = Integer.MIN_VALUE, maxA = Integer.MIN_VALUE;
		int minH = Integer.MAX_VALUE, minW = Integer.MAX_VALUE, minA = Integer.MAX_VALUE;
		int idxMaxH = 0, idxMaxW = 0, idxMaxA = 0, idxMinH = 0, idxMinW = 0, idxMinA = 0;

		System.out.println("이름\t나이\t신장\t몸무게");
		for (int i = 0; i < studentArr.length; i++) {

			// 배열에 있는 객체 정보를 모두 출력 한다
			System.out.println(studentArr[i].studentInfo());

			sumHeight += studentArr[i].getHeight();
			sumWeight += studentArr[i].getWeight();
			sumAge += studentArr[i].getAge();

			int height = studentArr[i].getHeight();
			int weight = studentArr[i].getWeight();
			int age = studentArr[i].getAge();

			// 키
			if (maxH < height) {
				idxMaxH = i;
				maxH = height;
			}
			if (minH > height) {
				idxMinH = i;
				minH = height;
			}
			// 몸무게
			if (maxW < weight) {
				idxMaxW = i;
				maxW = weight;
			}
			if (minW > weight) {
				idxMinW = i;
				minW = weight;
			}
			// 나이
			if (maxA < age) {
				idxMaxA = i;
				maxA = age;
			}
			if (minA > age) {
				idxMinA = i;
				minA = age;
			}

		}
		System.out.println();

		double avgHeight = (double) sumHeight / studentArr.length;
		double avgWeight = (double) sumWeight / studentArr.length;
		double avgAge = (double) sumAge / studentArr.length;

		// Student 객체들의 나이, 신장, 몸무게의 평균 출력
		System.out.printf("나이평균: %.3f%n신장평균: %.3f%n몸무게평균: %.3f%n%n", avgAge, avgHeight, avgWeight);

		System.out.println("나이가 가장 많은 학생: " + studentArr[idxMaxA].getName());
		System.out.println("나이가 가장 적은 학생: " + studentArr[idxMinA].getName());

		// 학생들 중 신장이 가장 적은 학생과 큰 학생 출력
		System.out.println("신장이 가장 큰 학생: " + studentArr[idxMaxH].getName());
		System.out.println("신장이 가장 작은 학생: " + studentArr[idxMinH].getName());

		// 학생들 중 몸무게가 가장 적은 학생과 많이 나가는 학생 출력
		System.out.println("몸무게가 가장 많이 나가는 학생: " + studentArr[idxMaxW].getName());
		System.out.println("몸무게가 가장 적게 나가는 학생: " + studentArr[idxMinW].getName());
		// 학생들 중 나이가 가장 적은 학생과 많은 학생 출력

	}

}
