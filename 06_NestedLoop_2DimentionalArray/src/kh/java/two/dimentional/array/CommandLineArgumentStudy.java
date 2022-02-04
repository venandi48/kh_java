package kh.java.two.dimentional.array;

public class CommandLineArgumentStudy {
	/**
	 * 프로그램 실행시에 사용자 입력값 받아서 처리
	 *  - 하나의 문자열 형태로 입력
	 *  - 공백을 기준으로 나누어 String[]형태로 main메소드의 매개인자로 전달
	 * 
	 */
	public static void main(String[] args) {

//		// CSV(Comma Separated Value)
//		String data = "안녕 잘가 123 abc";
//
//		// " "을 구분자로 지정하여 나눔
//		String[] arr = data.split(" ");
//		for (int i = 0; i < arr.length; i++)
//			System.out.println(i + " : [" + arr[i] + "]");
		
//		System.out.println(args);
//		System.out.println(args.length);
//		for (int i = 0; i < args.length; i++)
//			System.out.println(i + " : [" + args[i] + "]");
		
		CommandLineArgumentStudy study = new CommandLineArgumentStudy();
		study.test1(args);
		
	}
	
	/**
	 * 사용자 정보 출력
	 *  - 이름 나이 성별 키
	 *  - 홍길동 33 남 177.5
	 */
	public void test1(String[] args) {
		String name = "";
		int age = 0;
		char gender = ' ';
		double height = 0.0;
		
		//Sting으로 입력된 값들을 적절하게 형변환 하여 대입
		name = args[0];
		age = Integer.parseInt(args[1]);
		gender = args[2].charAt(0);
		height = Double.parseDouble(args[3]);
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "세");
		System.out.println("성별 : " + gender + "자");
		System.out.println("키 : " + height + "cm");
	}
}
