package kh.java.oop.method;

public class MethodSampleMain {
	int a = 100;

	public static void main(String[] args) {
		
		// static에서는 non-static을 참조할 수 없기때문에 오류
		// 1. a를 static필드로 변경
		// 2. 객체를 만들어 참조
//		System.out.println(a);

		// 2번 방법
		MethodSampleMain msm = new MethodSampleMain();
		System.out.println(msm.a);
		
		
		// non-static메소드 호출
		MethodSample sample = new MethodSample();
		sample.x();

		// static메소드 호출
		MethodSample.y();
	}
}
