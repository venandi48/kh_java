package com.collection.list.music.vo;

/**
 * 
 * VO클래스
 *
 */
public class Music implements Comparable<Music> {
	private String title;
	private String singer;

	public Music() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String siger) {
		this.singer = siger;
	}

	@Override
	public String toString() {
		return "Music [title=" + title + ", singer=" + singer + "]";
	}

	@Override
	public int compareTo(Music o) {
		return this.singer.compareTo(o.singer);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		// 같은 타입여부 검사
		if (getClass() != obj.getClass()) // if(obj instanceof Music)과 같다
			return false;
		
		// this와 obj는 메모리상 다른 객체이다.
		// obj는 null이 아니며, Music타입이다. 따라서 Music으로 형변환이 가능하다.
		Music other = (Music) obj;
		if (singer == null) {
			if (other.singer != null)
				return false;
		} else if (!singer.equals(other.singer))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
}
