package ncs.test8;

import ncs.test7.Book;

public class BookStore {
	public static void main(String[] args) {

		// Book 객체 생성
		Book bookdata = new Book("IT", "HTML5", 30_000, 0.15);

		// Book 객체 기본 정보 출력
		System.out.println("기본정보");
		System.out.printf("%s\t%.1f\n", bookdata.getBookName(), bookdata.getBookPrice());

		// BookUpdate 객체 생성 ( 생성시 Book 객체를 생성자를 통해 셋팅 )
		BookUpdater bookupdate = new BookUpdater(bookdata);

		// updateBookPrice 함수를 통해 Book 객체의 할인율을 적용시켜 가격 변경
		bookupdate.updateBookPrice();

		// Book 객체의 변경된 정보 출력
		System.out.println("변경된 정보");
		System.out.printf("%s\t%.1f\n", bookdata.getBookName(), bookdata.getBookPrice());

	}
}
