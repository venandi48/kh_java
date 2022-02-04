package kh.java.array.sort;

import java.util.Arrays;
import java.util.Random;

public class LottoGenerator {
	/**
	 * 1~45 사이의 랜덤한수 6개 뽑기
	 *  - 중복없는 난수 뽑기
	 *  - 오름차순 정렬
	 *  
	 */
	public static void main(String[] args) {
		LottoGenerator lottoGenerator = new LottoGenerator();
		int[] lotto = lottoGenerator.generate();
		lotto = lottoGenerator.sort(lotto);
		
		
		System.out.println(Arrays.toString(lotto));
	}
	
	public int[] sort(int[] lotto) {
		
		return lotto;
	}
	
	public int[] generate() {
		int[] lotto = new int[6];
		Random rnd = new Random();
		
		//반복문 라벨링
		outer:
		for (int i = 0;;) {
			//난수뽑기
			int n = rnd.nextInt(45) + 1;

			//중복검사
			for (int j = 0; j < i; j++) {
				//중복일때 바깥반복문 다시
				if (lotto[j] == n)
					continue outer;
			}
				
			//증감식은 대입이 일어날 때에 이루어져야함
			lotto[i++] = n;
			
			//조건식
			if(i == lotto.length)
				break;
		}
		
		
		//선택정렬
		for (int i = 0; i < lotto.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < lotto.length; j++) {
				if(lotto[min]>lotto[j]) {
					min = j;
				}
			}
			int temp = lotto[min];
			lotto[min] = lotto[i];
			lotto[i] = temp;	
		}
		
		//반환
		return lotto;
	}
}
