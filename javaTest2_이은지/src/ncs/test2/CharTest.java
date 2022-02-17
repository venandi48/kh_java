package ncs.test2;

public class CharTest {
	public static void main(String[] args) {

		// 스페이스바 이전까지 저장
		String input = args[0];

		int inputSize = input.length();
		char[] arr = new char[inputSize];

		// 문자배열에 담기
		for (int i = 0; i < inputSize; i++)
			arr[i] = input.charAt(i);

		//출력
		for (int i = 1; i <= inputSize; i++) {
			char ch = arr[inputSize - i];
			
			// 대문자변환
			if(ch>='a' && ch<='z')
				ch -= 32;
			
			System.out.print(ch);
		}
	}
}
