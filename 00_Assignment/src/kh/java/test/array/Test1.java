package kh.java.test.array;

public class Test1 {
	public static void main(String[] args) {
		Test1 hw = new Test1();
		hw.test();
	}

	public void test() {
		int[] arr = new int[100];

		for (int i = 0; i < arr.length; i++)
			arr[i] = i + 1;

		for (int i : arr)
			System.out.println(i);
	}
}
