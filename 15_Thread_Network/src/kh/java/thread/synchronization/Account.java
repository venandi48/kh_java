package kh.java.thread.synchronization;

public class Account {
	private int balance = 1_000; // 잔액

	public int getBalance() {
		return balance;
	}

	/**
	 * 출금
	 *  - 여러 스레드에 의해 호출
	 *  - 현재 balance필드에서 전달된 money만큼 차감처리
	 * 
	 * 
	 * 동기화처리
	 *  - 동기화 대상은 '객체' 단위이다
	 *  1. 동기화 메소드 처리 - acc.withdraw() > acc가 동기화 대상이 됨
	 *  2. 동기화블럭을 메소드 안에 생성
	 *  	- 국지적으로 지정가능
	 *  	- 동기화 범위를 최소로 지정 할 경우 성능이 좋음
	 */
	public void withdraw(int money) {
		synchronized (this) {
			String threadName = Thread.currentThread().getName();
			System.out.printf("[%s]출금시도 %d원, 현재잔액: %d원%n", threadName, money, balance);
			if (money <= balance) {
				balance -= money;
				System.out.printf("[%s]출금성공 -> 현재잔액 %d원%n", threadName, balance);
			} else {
				System.out.printf("[%s]출금실패 -> 잔액부족%n", threadName);
			}
		}
	}
}
