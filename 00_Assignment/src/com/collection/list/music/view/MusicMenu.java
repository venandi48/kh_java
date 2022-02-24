package com.collection.list.music.view;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.collection.list.music.manager.MusicManager;
import com.collection.list.music.vo.Music;
import com.collection.list.music.vo.MusicSingerComparator;
import com.collection.list.music.vo.MusicTitleComparator;

/**
 * 
 * View단 클래스 : 사용자가 보게될 화면 담당
 *  - 사용자에게 메뉴 시각화
 *  - 사용자 입력값 처리
 *  - manager객체의 메소드를 호출
 *  - 결과 출력
 *
 */
public class MusicMenu {

	private Scanner sc = new Scanner(System.in);
	
	private MusicManager manager = new MusicManager();
	
	private String menu = "================ Music Playlist Menu ================\r\n"
			+ "1.목록보기\r\n"
			+ "2.마지막에 음악추가\r\n"
			+ "3.맨처음에 음악추가\r\n"
			+ "4.곡삭제\r\n"
			+ "5.곡변경\r\n"
			+ "6.곡명검색\r\n"
			+ "7.가수검색\r\n"
			+ "8.목록정렬(곡명오름차순)\r\n"
			+ "0.종료\r\n"
			+ "=======================================================\r\n"
			+ ">> 메뉴선택 : ";
	

	public void mainMenu() {
		while (true) {
			System.out.print(menu);
			String choice = sc.next();
			sc.nextLine(); // 버퍼비우기
			
			List<Music> musicList = null;
			String song = "";
			String singer = "";
			

			switch (choice) {
			case "1":
				musicList = manager.selectList(); // List<Music> 가져오기
				printList(musicList); // List<Music> 출력하기
				break;
			case "2":
				manager.addList(inputMusic());
				break;
			case "3":
				manager.addAtZero(inputMusic());
				break;
			case "4":
				manager.removeMusic(inputTitle());
				break;
			case "5":
				System.out.println("[교체할 곡 선택]");
				Music old = new Music(inputTitle(), "");
				System.out.println("[신규 곡 입력]");
				manager.replaceMusic(old, inputMusic());
				break;
			case "6":
				printList(manager.searchMusicByTitle(inputTitle()));
				break;
			case "7":
				printList(manager.searchMusicBySinger(inputSinger()));
				break;
			case "8":
				sortMenu();
				break;
			case "0":
				return; // 현재 메소드를 호출한 위치로 return
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}

	private void printList(List<Music> musicList) {
		for(Music music : musicList)
			System.out.println(music.getTitle()+"-"+music.getSiger());
	}
	
	public String inputTitle() {
		System.out.print("곡명 > ");
		return sc.nextLine();
	}
	
	public String inputSinger() {
		System.out.print("가수명 > ");
		return sc.nextLine();
	}
	
	public Music inputMusic() {
		String song = inputTitle();
		String singer = inputSinger();
		return new Music(song,singer);
	}
	
	public void sortMenu() {
		String menu = "================== 정렬 메뉴 ===================\r\n"
				+ "1. 가수명 오름차순\r\n"
				+ "2. 가수명 내림차순\r\n"
				+ "3. 곡명 오름차순\r\n"
				+ "4. 곡명 내림차순\r\n"
				+ "5. 메인메뉴 돌아가기\r\n"
				+ "================================================\r\n"
				+ ">> 메뉴선택 : ";
		
		
		while (true) {
			System.out.print(menu);
			String choice = sc.next();
			sc.nextLine(); // 버퍼비우기
			
			switch(choice) {
			case "1":
				manager.orderBy(new MusicSingerComparator());
				break;
			case "2":
				manager.orderBy(Collections.reverseOrder(new MusicSingerComparator()));
				break;
			case "3":
				manager.orderBy(new MusicTitleComparator());
				break;
			case "4":
				manager.orderBy(Collections.reverseOrder(new MusicTitleComparator()));
				break;
			case "5":
				return;
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
}
