package com.kh.practice.list.music.view;

import java.util.Scanner;

import com.kh.practice.list.music.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

public class MusicView {
	
	// Field
	private Scanner sc = new Scanner(System.in);
	private MusicController mc = new MusicController();

	// Constructor
	
	// Method
	public void mainMenu() {
		System.out.println("=====***** 메인 메뉴 *****=====");
		System.out.println("1. 마지막 위치에 곡 추가");
		System.out.println("2. 첫 위치에 곡 추가");
		System.out.println("3. 전체 곡 목록 출력");
		System.out.println("4. 특정 곡 검색");
		System.out.println("5. 특정 곡 삭제");
		System.out.println("6. 특정 곡 정보 수정");
		System.out.println("7. 곡명 오름차순 정렬");
		System.out.println("8. 가수명 내림차순 정렬");
		System.out.println("9. 종료");
		System.out.print("메뉴 번호 선택 : ");
		String select = sc.next();
		switch(select) {
		case "1" : 
			addList();
			break;
		case "2" : 
			addAtZero();
			break;
		case "3" : 
			printAll();
			break;
		case "4" : 
			searchMusic();
			break;
		case "5" : 
			removeMusic();
			break;
		case "6" : 
			setMusic();
			break;
		case "7" : 
			ascTitle();
			break;
		case "8" :
			descSinger();
			break;
		case "9" : 
			System.out.println("종료");
			return;
		}
	}
	public void addList() {
		System.out.println("******* 마지막 위치에 곡 추가 ******");
		System.out.println("곡 명 : ");
		String title = sc.nextLine();
		System.out.println("가수 명 : ");
		String singer = sc.nextLine();
		Music music = new Music(title, singer);
		if(mc.addList(music)==1) {
			System.out.println("추가 성공");
		} else {
			System.out.println("추가 실패");
		}		
	}
	public void addAtZero() {
		System.out.println("****** 첫 위치에 곡 추가 ******");
		System.out.println("곡 명 : ");
		String title = sc.nextLine();
		System.out.println("가수 명 : ");
		String singer = sc.nextLine();
		Music music = new Music(title, singer);
		if(mc.addAtZero(music)==1) {
			System.out.println("추가 성공");
		} else {
			System.out.println("추가 실패");
		}
	}
	public void printAll() {
		
	}
	public void searchMusic() {
		
	}
	public void removeMusic() {
		
	}
	public void setMusic() {
		
	}
	public void ascTitle() {
		
	}
	public void descSinger() {
		
	}
	
}
