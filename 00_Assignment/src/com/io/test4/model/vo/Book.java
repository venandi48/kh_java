package com.io.test4.model.vo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Book implements Serializable {

	private static final long serialVersionUID = 1L;

	private String title;
	private String author;
	private int price;
	private Calendar dates;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String title, String author, int price, Calendar dates) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.dates = dates;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Calendar getDates() {
		return dates;
	}

	public void setDates(Calendar dates) {
		this.dates = dates;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 출간");
		String formattedDate = sdf.format(dates.getTimeInMillis());

		return "Book [title=" + title + ", author=" + author + ", price=" + price + ", dates=" + formattedDate + "]";
	}
	
	
}
