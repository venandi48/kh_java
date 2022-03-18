package workshop02;

public class Test01 {

	public static void main(String[] args) {

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		if (args.length != 3) {
			System.out.println("3개의 정수를 입력하세요.");
			return;
		}

		for (String s : args) {
			try {
				if (Integer.parseInt(s) > 10 || Integer.parseInt(s) < 0) {
					System.out.println("입력 가능한 정수 범위는 1~9 입니다.");
					return;
				}
			} catch (NumberFormatException e) {
				System.out.println("입력 값이 정수가 아닙니다.");
				return;
			}
		}

		for (int i = 0; i < args.length; i++) {
			if (Integer.parseInt(args[i]) > max)
				max = Integer.parseInt(args[i]);
			if (Integer.parseInt(args[i]) < min)
				min = Integer.parseInt(args[i]);
		}

		System.out.printf("최대값: %d%n최소값: %d%n", max, min);

	}

}
