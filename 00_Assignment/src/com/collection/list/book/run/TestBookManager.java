package com.collection.list.book.run;

import java.util.Scanner;

import com.collection.list.book.controller.BookManager;
import com.collection.list.book.model.vo.Book;

public class TestBookManager {
	
	private Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		TestBookManager hw = new TestBookManager();
		hw.menu();
	}
	
	public void menu() {
		String menu = "*** 도서 관리 프로그램 ***\n"
				+ "1. 새 도서 추가\n"
				+ "2. 도서정보 정렬 후 출력\n"
				+ "3. 도서 삭제\n"
				+ "4. 도서 검색출력\n"
				+ "5. 전체 출력\n"
				+ "6. 끝내기\n"
				+ "------------------------\n"
				+ "메뉴선택 > ";
		BookManager bm = new BookManager();

		while (true) {
			System.out.print(menu);
			int choice = sc.nextInt();
			sc.nextLine(); //버퍼비우기
			int index;

			switch (choice) {
			case 1:
				Book book = inputBook();
				bm.addBook(book);
				break;
			case 2:
				bm.printBookList(bm.sortedBookList());
				break;
			case 3:
				index = bm.searchBook(inputBookTitle());
				if(index==-1)
					System.out.println("도서를 찾을 수 없습니다.");
				else
					bm.deleteBook(index);
				break;
			case 4:
				index = bm.searchBook(inputBookTitle());
				if(index==-1)
					System.out.println("도서를 찾을 수 없습니다.");
				else
					bm.printBook(index);
				break;
			case 5:
				bm.printAll();
				break;
			case 6:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
	
	public Book inputBook() {
		System.out.print("도서번호 : ");
		String bNo = sc.nextLine();

		System.out.print("도서분류코드(1.인문/2.자연과학/3.의료/4.기타) : ");
		int category = sc.nextInt();
		sc.nextLine(); // 버퍼비우기
		
		System.out.print("도서명 : ");
		String title = sc.nextLine();
		
		System.out.print("저자 : ");
		String author = sc.nextLine();

		return new Book(bNo, category, title, author);
	}
	
	public String inputBookTitle() {
		System.out.print("도서명: ");
		return sc.nextLine();
	}
}
