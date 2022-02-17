package ncs.test3;

public class TvTest {
	public static void main(String[] args) {
		Tv tvArray[] = new Tv[3];
		int maxPriceIndex = 0;
		int minPriceIndex = 0;

		// Tv 객체를 3개 생성하여 배열에 넣는다.
		tvArray[0] = new Tv("INFINIA", 1_500_000, "LED TV");
		tvArray[1] = new Tv("XCANVAS", 1_000_000, "LCD TV");
		tvArray[2] = new Tv("CINEMA", 2_000_000, "3D TV");

		// 배열에 있는 객체 정보를 모두 출력한다.
		for (int i = 0; i < tvArray.length; i++) {
			if (tvArray[i].getPrice() >  tvArray[maxPriceIndex].getPrice())
				maxPriceIndex = i;
			else if(tvArray[i].getPrice() <  tvArray[maxPriceIndex].getPrice())
				minPriceIndex = i;

				System.out.println(tvArray[i].toString());
		}
		
		// 실행결과와 같이 출력
		System.out.printf("가격이 가장 비싼 제품: %s%n",tvArray[maxPriceIndex].getName());
		System.out.printf("가격이 가장 저렴한 제품: %s%n",tvArray[minPriceIndex].getName());

	}
}
