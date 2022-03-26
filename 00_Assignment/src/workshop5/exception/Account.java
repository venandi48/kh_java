package workshop5.exception;

public class Account {
	private String account; // 계좌번호
	private double balance; // 잔액
	private double interestRate; // 이율

	public Account() {
		super();
	}

	public Account(String account, double balance, double interestRate) {
		super();
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	// 현재 잔액 기준으로 이자계산
	public double calculateInterest() {
		double result = getBalance() * getInterestRate() / 100;

		return result;
	}

	// 입금을 통해 잔액정보를 증가
	// 입금액이 0보다 적으면 exception발생시킴
	public void deposit(double money) throws Exception {
		if (money < 0)
			throw new Exception();

		setBalance(balance + money);
	}

	// 출금을 통해 잔액정보를 감소
	// 출금액이 0보다 적거나 현재 잔액보다 많으면 exception 발생시킴
	public void withdraw(double money) throws Exception {
		if (money < 0 || money > balance)
			throw new Exception();

		setBalance(balance - money);

	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

}
