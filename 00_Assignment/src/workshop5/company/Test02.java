package workshop5.company;

public class Test02 {

	public static void main(String[] args) {
		double salary;

		if (args.length == 1) {
			try {
				salary = Integer.parseInt(args[0]);

				Company hw = new Company(salary);
				
				System.out.printf("연 기본급 합: %.1f 세후: %.1f%n연 보너스 합: %.1f 세후: %.1f%n",
						hw.getIncome(), hw.getAfterTaxIncome(), hw.getBonus(), hw.getAfterTaxBonus());
				System.out.println("연 지급액 합: " + (hw.getAfterTaxIncome() + hw.getAfterTaxBonus()));
			} catch (Exception e) {
				System.out.println("정수를 입력하세요.");
			}
		} else
			System.out.println("하나의 정수만 입력하세요.");

	}
}
