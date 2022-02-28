package com.collection.list.book.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.collection.list.book.model.compare.AscCategory;
import com.collection.list.book.model.vo.Book;

public class BookManager {
	private ArrayList<Book> bookList;

	public BookManager() {
		super();
		bookList = new ArrayList<>();
	}

	public BookManager(ArrayList<Book> bookList) {
		super();
		this.bookList = bookList;
	}

	// 리스트에 객체 추가
	public void addBook(Book book) {
		bookList.add(book);
	}

	// 리스트에서 객체 제거
	public void deleteBook(int index) {
		bookList.remove(index);
	}

	// 도서명이 일치하는 객체를 찾아 해당 인덱스를 리턴
	// 도서명이 일치하는 객체가 리스트에 없으면, -1 리턴함
	public int searchBook(String title) {
		for (Book b : bookList) {
			if (b.getTitle().contains(title))
				return bookList.indexOf(b);
		}
		return -1;
	}

	// 인덱스 위치의 객체의 정보를 출력함
	public void printBook(int index) {
		System.out.println(bookList.get(index).toString());
	}

	// 목록정보 모두 출력
	public void printAll() {
		for (Book b : bookList)
			System.out.println(b.toString());
	}

	// 해당 카테고리순 오름차순정렬해서 객체배열 리턴
	public Book[] sortedBookList() {
		Book[] bookArr = new Book[bookList.size()];

		// 원본 List에 영향 없이 정렬
		List<Book> cloneList = (List<Book>) ((ArrayList<Book>) bookList).clone();

		Comparator<Book> cp = new AscCategory();
		Collections.sort(cloneList, cp);

		for (int i = 0; i < cloneList.size(); i++) {
			Book b = cloneList.get(i);
			bookArr[i] = new Book(b.getbNo(), b.getCategory(), b.getTitle(), b.getAuthor());
		}

		return bookArr;
	}

	// 객체 배열 출력, for each 문 사용
	public void printBookList(Book[] br) {
		for (Book b : br) {
			System.out.println(b.toString());
		}
	}
}
