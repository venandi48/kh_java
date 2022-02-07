package kh.java.oop.account;

/**
 * 캡슐화
 *  - 필드의 접근제한자를 private처리
 *  - 필드를 제어하는 메소드를 public으로 지적
 *  - 필드오 메소드를 묶어서 클래스로 지정
 */
public class Account {
	private String name;
	private long balance; // 잔액

	// setter
	// 변수명이 같은 경우 가까운 유효범위에 선언된 변수가 사용된다.
	public void setName(String _name) {
		name = _name;
	}

	public void setBalance(long _balance) {
		balance = _balance;
	}

	// getter
	public String getName() {
		return name;
	}

	public long getBalance() {
		return balance;
	}
	
	/**
	 * 입금메소드
	 *  - 입금액 유효성검사
	 *  - 적절한 입금연산 처리
	 */
	public void deposit(long money) {
		if (money > 0) {
			balance += money;
			System.out.println("입금처리 되었습니다.");
		} else
			System.err.println("잘못된 금액이 입력되었습니다.");
	}
	
	/**
	 * 출금메소드
	 *  - 출금액 유효성검사
	 *  - 적절한 출금연산 처리
	 */
	public void withdraw(long money) {
		if (money <= 0) {
			System.err.println("유효한 금액을 입력하세요.");
			return;
		}
		if (money > balance) {
			System.err.println("출금액이 잔액보다 많습니다.");
			return;
		}

		balance -= money;
		System.out.println("출금처리 되었습니다.");
	}
}
