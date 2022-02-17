package ncs.test7;

public class BookTest {
	public static void main(String[] args) {
		Book bookArray[] = new Book[5];

		// Book 객체를 5개 생성하여 배열에 넣는다
		bookArray[0] = new Book("IT", "SQL Plus", 50_000, 0.05);
		bookArray[1] = new Book("IT", "Java 2.0", 40_000, 0.03);
		bookArray[2] = new Book("IT", "JSP Servlet", 60_000, 0.06);
		bookArray[3] = new Book("Nobel", "davincicode", 30_000, 0.1);
		bookArray[4] = new Book("Nobel", "cloven hoof", 50_000, 0.15);

		double total = 0;
		// 배열에 있는 객체 정보를 실행결과 형식으로 모두 출력한다. – for loop를 이용할 것
		for (int i = 0; i < bookArray.length; i++) {
			System.out.printf("%s\t%s\t%.1f원\t%.1f%%\n",
					bookArray[i].getCategory(), bookArray[i].getBookName(),
					bookArray[i].getBookPrice(), bookArray[i].getBookDiscountRate()*100);
			total += bookArray[i].getBookPrice();
			
		}

		// 합계를 출력한다
		System.out.println();
		System.out.println("책 가격의 합: " + total);
	}
}
