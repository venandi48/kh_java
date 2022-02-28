package com.collection.list.book.model.compare;

import java.util.Comparator;

import com.collection.list.book.model.vo.Book;

public class AscCategory implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return o1.getCategory() - o2.getCategory();
	}

}
