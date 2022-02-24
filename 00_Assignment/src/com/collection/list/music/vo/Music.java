package com.collection.list.music.vo;

/**
 * 
 * VO클래스
 *
 */
public class Music implements Comparable<Music> {
	private String title;
	private String siger;

	public Music() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Music(String title, String siger) {
		super();
		this.title = title;
		this.siger = siger;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSiger() {
		return siger;
	}

	public void setSiger(String siger) {
		this.siger = siger;
	}

	@Override
	public String toString() {
		return "Music [title=" + title + ", siger=" + siger + "]";
	}

	@Override
	public int compareTo(Music o) {
		return 0;
	}

}
