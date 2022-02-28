package com.collection.map.book;

import java.util.Scanner;

import com.collection.list.book.model.vo.Book;
import com.collection.map.book.controller.MapBookManager;

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
		MapBookManager mbm = new MapBookManager();

		while (true) {
			System.out.print(menu);
			int choice = sc.nextInt();
			sc.nextLine(); // 버퍼비우기
			String rst;

			switch (choice) {
			case 1:
				Book book = inputBook();
				mbm.putBook(book);
				break;
			case 2:
				mbm.printBook(mbm.sortedBookMap());
				break;
			case 3:
				rst = mbm.searchBook(inputBookTitle());
				if (rst == null)
					System.out.println("도서를 찾을 수 없습니다.");
				else
					mbm.deleteBook(rst);
				break;
			case 4:
				rst = mbm.searchBook(inputBookTitle());
				if (rst == null)
					System.out.println("도서를 찾을 수 없습니다.");
				else
					mbm.printBook(rst);
				break;
			case 5:
				mbm.displayAll();
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

