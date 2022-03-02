package kh.java.thread.synchronization;

public class ATMThread implements Runnable {

	private Account acc;

	public ATMThread(Account acc) {
		super();
		this.acc = acc;
	}

	@Override
	public void run() {
		// 잔액이 없을 대 까지 출금시도
		while (acc.getBalance() > 0) {
			int money = (int) (Math.random() * 3 + 1) * 100;
			acc.withdraw(money); // 출금
		}
		System.out.println("[" + Thread.currentThread().getName() + "종료]");
	}

}
