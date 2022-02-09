package kh.java.oop.init.block;

import java.util.Arrays;

public class InitBlockSampleMain {
	public static void main(String[] args) {

		System.out.println("프로그램 시작!");

		// static변수가 초기화되는 시점은 프로그램에서 해당 클래스를 처음 사용하는 시점이다.
		// 동적로딩 - 프로그램에 필요한 모든 클래스를 준비하지않고, 최초 사용할 때 메모리에 적재
		InitBlockSample sample = new InitBlockSample();
		System.out.println(sample.x);
		System.out.println(sample.y);
		System.out.println(Arrays.toString(sample.lotto));

		System.out.println(InitBlockSample.x2);
		System.out.println(InitBlockSample.y2);

	}
}
