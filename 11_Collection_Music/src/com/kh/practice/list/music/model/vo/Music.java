package com.kh.practice.list.music.model.vo;

public class Music {
	
	// Field
	private String title;
	private String singer;
	
	// Constructor
	public Music() {}
	public Music(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}
	
	// Method
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String toString() {
		return singer+" - "+title;
	}
	public int hashCode() {
		return 0;
	}
	public boolean equals(Object obj) {
		return false;
	}
	public int compareTo(Object o) {
		return 0;
	}

}
