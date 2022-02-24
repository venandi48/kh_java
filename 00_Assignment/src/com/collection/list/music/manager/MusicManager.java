package com.collection.list.music.manager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.collection.list.music.vo.Music;

/**
 * 
 * Music관리자 클래스
 *
 */
public class MusicManager {

	private List<Music> musicList;
	
	public MusicManager() {
		musicList = new ArrayList<>();
		musicList.add(new Music("TT", "TWICE"));
		musicList.add(new Music("Y", "프리스타일"));
		musicList.add(new Music("Easy On Me", "Adele"));
		musicList.add(new Music("honesty", "Pink Sweat$"));
		musicList.add(new Music("Next Level", "aespa"));
	}
	
	// 1. 음악리스트 리턴
	public List<Music> selectList(){
		return this.musicList;
	}
	
	// 2. 마지막에 음악추가
	public void addList(Music m) {
		musicList.add(m);
	}

	// 3. 맨처음에 음악추가
	public void addAtZero(Music m) {
		musicList.add(0, m);
	}
	
	// 4. 특정곡 삭제
	public boolean removeMusic(String name) {
		for (Music m : musicList) {
			if (name.compareTo(m.getTitle()) == 0) {
				return musicList.remove(m);
			}
		}
		return false;
	}

	// 5. 특정곡 교체
	public boolean replaceMusic(Music oldMusic, Music newMusic) {
		for (Music m : musicList) {
			// 타이틀이 일치하는지 검사하여 교체
			if (oldMusic.getTitle().compareTo(m.getTitle()) == 0) {
				int index = musicList.indexOf(m);
				musicList.set(index, newMusic);
				System.out.println("교체완료!");
				return true;
			}
		}
		System.out.println("교체할 곡을 찾을 수 없습니다.");
		return false;
	}
	
	// 6. 특정곡이 있는지 검사
	public List<Music> searchMusicByTitle(String title) {
		List<Music> result = new ArrayList<>();
		
		for (Music m : musicList) {
			if (m.getTitle().contains(title))
				result.add(m);
		}
		
		if(result.isEmpty())
			System.out.println("검색결과가 없습니다.");

		return result;
	}
	
	// 7. 가수명으로 검색
	public List<Music> searchMusicBySinger(String singer) {
		List<Music> result = new ArrayList<>();

		for (Music m : musicList) {
			if (m.getSiger().contains(singer))
				result.add(m);
		}

		if (result.isEmpty())
			System.out.println("검색결과가 없습니다.");

		return result;
	}
	
	// 8. 서브메뉴
	public List<Music> orderBy(Comparator<Music> c){
		Collections.sort(musicList, c);
		return musicList;
	}
}
