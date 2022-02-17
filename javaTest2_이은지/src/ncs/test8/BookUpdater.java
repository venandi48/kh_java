package ncs.test8;

import ncs.test7.Book;

public class BookUpdater {
	private Book bookData;

	public BookUpdater() {
		super();
	}

	public BookUpdater(Book bookData) {
		super();
		this.bookData = bookData;
	}

	public Book getBookData() {
		return bookData;
	}

	public void setBookData(Book bookData) {
		this.bookData = bookData;
	}

	public void updateBookPrice() {
		double price = bookData.getBookPrice();
		double rate = bookData.getBookDiscountRate();

		bookData.setBookPrice(price - price * rate);
	}
}
