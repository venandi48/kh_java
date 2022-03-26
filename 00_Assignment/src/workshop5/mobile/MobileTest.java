package workshop5.mobile;

public class MobileTest {

	public static void main(String[] args) {

		String head = "Mobile\t\tBattery\t\tOS\n" 
					+ "---------------------------------------";

		// 각각의 Mobile 객체 생성
		Mobile ltab = new Ltab("Ltab", 500, "AP-01");
		Mobile otab = new Otab("Otab", 1000, "AND-20");

		// 생성된 객체의 정보 출력
		System.out.println(head);
		System.out.printf("%s\t\t%d\t\t%s%n", ltab.getMobileName(), ltab.getBatterySize(), ltab.getOsType());
		System.out.printf("%s\t\t%d\t\t%s%n", otab.getMobileName(), otab.getBatterySize(), otab.getOsType());
		System.out.println();

		// 각각의 Mobile 객체에 10분씩 충전
		System.out.println("10분 충전");
		ltab.charge(10);
		otab.charge(10);

		// 10분 충전 후 객체 정보 출력
		System.out.println(head);
		System.out.printf("%s\t\t%d\t\t%s%n", ltab.getMobileName(), ltab.getBatterySize(), ltab.getOsType());
		System.out.printf("%s\t\t%d\t\t%s%n", otab.getMobileName(), otab.getBatterySize(), otab.getOsType());
		System.out.println();

		// 각각의 Mobile 객체에 5분씩 통화
		System.out.println("5분 통화");
		ltab.operate(5);
		otab.operate(5);

		// 5분 통화 후 객체 정보 출력
		System.out.println(head);
		System.out.printf("%s\t\t%d\t\t%s%n", ltab.getMobileName(), ltab.getBatterySize(), ltab.getOsType());
		System.out.printf("%s\t\t%d\t\t%s%n", otab.getMobileName(), otab.getBatterySize(), otab.getOsType());

	}
}
