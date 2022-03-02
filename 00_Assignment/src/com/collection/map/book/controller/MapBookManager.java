package com.collection.map.book.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.collection.list.book.model.compare.AscCategory;
import com.collection.list.book.model.vo.Book;

public class MapBookManager {
	private HashMap<String, Book> bookMap;

	public MapBookManager() {
		super();
		bookMap = new HashMap<>();
		bookMap.put("400", new Book("200", 2, "오만과 편견", "제인 오스틴"));
		bookMap.put("201", new Book("401", 4, "아몬드", "손원평"));
		bookMap.put("100", new Book("100", 1, "사피엔스", "유발 하라리"));
		bookMap.put("130", new Book("130", 2, "Apple", "김뫄뫄"));
	}

	public MapBookManager(HashMap<String, Book> bookMap) {
		super();
		this.bookMap = bookMap;
	}

	// 맵에 객체 추가, 도서번호를 키로 사용함
	public void putBook(Book book) {
		bookMap.put(book.getbNo(), book);
	}

	// 맵에서 객체 제거
	public void deleteBook(String key) {
		bookMap.remove(key);
	}

	// 도서명이 일치하는 객체의 도서번호를 리턴
	// 도서명이 객체가 맵에 없으면, null 리턴함
	public String searchBook(String title) {
		Set<Map.Entry<String, Book>> entrySet = bookMap.entrySet();
		for (Map.Entry<String, Book> entry : entrySet) {
			Book b = (Book) entry.getValue();

			// 대소문자 구분없이 검색 가능
			String titleFromBook = b.getTitle().toUpperCase();
			title = title.toUpperCase();
			if (titleFromBook.contains(title))
				return entry.getKey();
//			if (b.getTitle().contains(title))
//				return entry.getKey();
		}
		return null;
	}

	// 맵정보 모두 출력 : keySet() 사용
	public void displayAll() {
		Set<String> keySet = bookMap.keySet();
		for (String keyNo : keySet) {
			System.out.println(bookMap.get(keyNo).toString());
		}

		// Iterator를 이용한 Map 출력
//		Iterator<String> iter = keySet.iterator();
//		while (iter.hasNext()) {
//			String key = iter.next();
//			Book value = bookMap.get(key);
//			System.out.println(value);
//		}
	}

	// 해당 도서명순으로 오름차순정렬해서 객체배열 리턴함
	public Book[] sortedBookMap() {
		Book[] bookArr = new Book[bookMap.size()];

		// Map의 value값을 List 객체로 생성
		List<Book> valueList = new ArrayList<>(bookMap.values());
		Comparator<Book> cp = new AscCategory();
		Collections.sort(valueList, cp);

		for (int i = 0; i < valueList.size(); i++) {
			Book b = valueList.get(i);
			bookArr[i] = new Book(b.getbNo(), b.getCategory(), b.getTitle(), b.getAuthor());
		}

		// Iterator를 이용한 풀이
//		Iterator<Map.Entry<String, Book>> it = bookMap.entrySet().iterator();
//		int index = 0;
//		while (it.hasNext()) {
//			Map.Entry<String, Book> entry = (Map.Entry<String, Book>) it.next();
//			bookArr[index++] = (Book) entry.getValue();
//		}
		// 배열정렬에 배열과 배열기준객체를 제공한다
		// <Book> void java.util.Arrays.sort(Book[] a, Comparator<? super Book> c)
		//Arrays.sort(bookArr, new AscCategory());

		return bookArr;
	}

	// 객체 배열 출력, for each 문 사용
	public void printBookMap(Book[] book) {
		for (Book b : book) {
			System.out.println(b.toString());
		}
	}

	public void printBook(String key) {
		System.out.println(bookMap.get(key));
	}

}
