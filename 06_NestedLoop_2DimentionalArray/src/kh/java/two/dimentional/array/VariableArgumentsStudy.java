package kh.java.two.dimentional.array;

public class VariableArgumentsStudy {
	public static void main(String[] args) {
		VariableArgumentsStudy study = new VariableArgumentsStudy();
		System.out.println(args);
		System.out.println(args.length);
//		study.test1(args);
		study.test2("안녕", 1, 2, 3);
		study.test2("안녕", 30, 35);
		study.test2("안녕", 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		study.test2("안녕");
		
		int[] arr = { 1, 2, 3 };
		study.test2("안녕", arr);
	}
	/**
	 * 가변인자
	 *  - 매개변수 선언부에서 동일한 타입에 개수제한 없는 매개변수
	 *  - 매개변수가 여러개일때 마지막에 한번만 사용가능
	 *  - 가변인자를 처리 할 매개변수는 배열로 사용가능
	 */
	public void test2(String hi, int... arr) {
		for(int i =  0; i<arr.length; i++)
			System.out.printf("%d ", arr[i]);
		System.out.println();
	}
	
	
	
	/**
	 * 사용자 입력정수값들을 더해 출력하세요.
	 * 
	 */
	public void test1(String[] args) {
		int sum = 0;
		for(String s : args)
			sum += Integer.parseInt(s);
		
//		for (int i = 0; i < args.length; i++)
//			sum += Integer.parseInt(args[i]);

		System.out.println(sum);
	}
}
