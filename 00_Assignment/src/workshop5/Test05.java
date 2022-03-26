package workshop5;

public class Test05 {

	public static void main(String[] args) {
		String str = "LGcns";

		System.out.println(str.toUpperCase()); // LGCNS

		System.out.println(str.toLowerCase()); // lgcns

		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i)) == true)
				System.out.print(str.charAt(i)); // LG
		}
		System.out.println();

		for (int i = 0; i < str.length(); i++) {
			if (Character.isLowerCase(str.charAt(i)) == true)
				System.out.print(str.charAt(i)); // cns
		}
	}

}
