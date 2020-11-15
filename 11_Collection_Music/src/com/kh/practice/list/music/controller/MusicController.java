package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.list.music.model.vo.Music;

public class MusicController {
	
	// Field
	private List<Music> list = new ArrayList();
	
	// Constructor
	
	// Method
	public int addList(Music music) {
		list.add(music);
		return 1;
	}
	public int addAtZero(Music music) {
		list.add(music);
		list.set(0, music);
		return 1;
	}
	public List printAll() {
		return list;
	}
	public Music searchMusic(String title) {
		return; 
	}
	public Music removeMusic(String title) {
		return;
	}
	public Music setMusic(String title, Music music) {
		return;
	}
	public int ascTtile() {
		return 0;
	}
	public int descSinger() {
		return 0;
	}
}
