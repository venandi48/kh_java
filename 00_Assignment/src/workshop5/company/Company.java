package workshop5.company;

public class Company {
	private double salary;
	private double annualIncome;
	private double bonus;
	private double afterTaxBonus;

	public Company() {
		super();
	}

	public Company(double salary) {
		super();
		this.salary = salary;
		setBonus(salary * 0.2); 
	}

	// 연 기본급의 합을 계산하여 리턴
	public double getIncome() {
		return getSalary() * 12;
	}

	// 연 기본급의 합에서 세금을 공제한 금액 리턴
	public double getAfterTaxIncome() {
		return getIncome() - getIncome() * 0.1;
	}

	// 연 보너스의 합을 계산하여 리턴
	public double getBonus() {
		setAfterTaxBonus(bonus - bonus * 0.055);
		return bonus * 4;
	}

	// 연 보너스의 합에서 세금을 공제한 금액을 리턴
	public double getAfterTaxBonus() {
		return afterTaxBonus * 4;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public void setAfterTaxBonus(double afterTaxBonus) {
		this.afterTaxBonus = afterTaxBonus;
	}

}
