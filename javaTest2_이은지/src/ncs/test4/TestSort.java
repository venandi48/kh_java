package ncs.test4;

public class TestSort {
	public static void main(String[] args) {
		int[] arr = new int[10];

		System.out.print("befor: [");
		// 난수 생성 및 출력
		for (int i = 0; i < arr.length; i++) {
			// 생성
			arr[i] = (int) (Math.random() * 50) + 51;

			// 출력
			if (i == arr.length - 1)
				System.out.println(arr[i] + "]");
			else
				System.out.print(arr[i] + ", ");
		}

		// 선택정렬
		for (int i = 0; i < arr.length - 1; i++) {
			int max = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[max] < arr[j])
					max = j;
			}

			int temp = arr[max];
			arr[max] = arr[i];
			arr[i] = temp;
		}

		// 정렬결과 출력
		System.out.print("after: [");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1)
				System.out.println(arr[i] + "]");
			else
				System.out.print(arr[i] + ", ");
		}

	}
}
