package com.io.test4.controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.GregorianCalendar;
import java.util.Scanner;

import com.io.test4.model.vo.Book;

public class BookManager {
	Scanner sc = new Scanner(System.in);

	public BookManager() {
		super();
		// TODO Auto-generated constructor stub
	}

	// 파일로 객체 출력 메소드
	public void fileSave() {
		Book[] books = new Book[5];
		books[0] = new Book("오만과 편견", "제인 오스틴", 10_000, new GregorianCalendar(2003, 3 - 1, 5));
		books[1] = new Book("아몬드", "손원평", 10_800, new GregorianCalendar(2017, 3 - 1, 31));
		books[2] = new Book("총균쇠", "재레드 다이아몬드", 31_500, new GregorianCalendar(2005, 12 - 1, 19));
		books[3] = new Book("듄", "프랭크 허버트", 22_500, new GregorianCalendar(2021, 1 - 1, 22));
		books[4] = new Book("사피엔스", "유발 하라리", 22_000, new GregorianCalendar(2015, 11 - 1, 23));

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("books.dat"))) {
			oos.writeObject(books);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("books.dat 에 저장 완료!");
	}

	// 프로그램으로 객체 입력 메소드
	public void fileRead() {
		Book[] books;

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("books.dat"))) {
			books = (Book[]) ois.readObject();
			
			for(Book b : books)
				System.out.println(b.toString());

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("books.dat 읽기 완료!");
		
	}
}
