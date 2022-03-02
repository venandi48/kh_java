package kh.java.thread;

import java.util.Scanner;

/**
 * 
 * Thread 상태제어
 *  - 실행/실행대기 RUNNABLE
 *  - 일시정지 WAITING TIME-WAITING BLOCKED
 * 
 * sleep
 * join
 * interrupt
 * 
 * (이런것도 있긴 하다~)
 * wait
 * notify/notifyAll
 * yield
 *
 */
public class ThreadStatusControlStudy {
	public static void main(String[] args) {
		ThreadStatusControlStudy study = new ThreadStatusControlStudy(); 
//		study.test1();
//		study.test2();
//		study.test3();
//		study.test4();
		study.test5();

		System.out.println("[" + Thread.currentThread().getName() + "종료]");
	}
	

	/**
	 * interrupt
	 *  - 특정 스레드를 종료시킬 수 있음
	 */
	private void test5() {
		Thread th = new Thread(new CountDownThread(), "카운트다운");
		th.start();

		System.out.println("엔터 입력 시 카운트다운 종료!");
		new Scanner(System.in).nextLine();
		th.interrupt(); // 특정 스레드 종료(Interrupted Exception 유발시켜 종료)
	}


	/**
	 * join
	 *  - 특정 스레드 종료 시/지정한 시간동안 기다린다
	 */
	private void test4() {
		Thread thread = new Thread(new CountDownThread(), "카운트다운");
		thread.start();
		
		try {
//			thread.join();
			thread.join(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 대몬스레드 daemon thread
	 *  - 백그라운드 스레드
	 *  - 일반 스레드가 종료하면 자동으로 종료 됨
	 */
	private void test3() {
		Thread thread = new Thread(new CountDownThread(), "카운트다운");
		thread.setDaemon(true);
		thread.start();
		
		System.out.println("엔터 입력 시 카운트다운 종료");
		new Scanner(System.in).nextLine();
	}

	/**
	 * 구구단 스레드
	 *  - 사용자입력값 (2~9)
	 *  - 구구단 출력 (스레드) : 각 수 별로 0.7초 간격 출력
	 */
	private void test2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력> ");
		int dan = sc.nextInt();
		System.out.print("몇 초 간격으로 출력 할 것인가> ");
		double sec = sc.nextDouble();

		Thread thread = new Thread(new DanThread(dan, sec));
		thread.start();
	}

	/**
	 * sleep
	 *  - TIMED-WAITING  <->  RUNNABLE
	 */
	private void test1() {
		// new Thread(Runnable)의 형태
		Thread th = new Thread(new SleepThread());
		th.start();
	}
}
