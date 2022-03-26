package workshop5;

public class Test01 {

	public static void main(String[] args) {
		if (args.length == 1) {
			char[] arr_ch = args[0].toCharArray();

			for (int i = arr_ch.length - 1; i >= 0; i--)
				System.out.print(arr_ch[i]);

		} else
			System.out.println("공백없이 입력하세요.");
	}

}
