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
		System.out.println("=====***** ���� �޴� *****=====");
		System.out.println("1. ������ ��ġ�� �� �߰�");
		System.out.println("2. ù ��ġ�� �� �߰�");
		System.out.println("3. ��ü �� ��� ���");
		System.out.println("4. Ư�� �� �˻�");
		System.out.println("5. Ư�� �� ����");
		System.out.println("6. Ư�� �� ���� ����");
		System.out.println("7. ��� �������� ����");
		System.out.println("8. ������ �������� ����");
		System.out.println("9. ����");
		System.out.print("�޴� ��ȣ ���� : ");
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
			System.out.println("����");
			return;
		}
	}
	public void addList() {
		System.out.println("******* ������ ��ġ�� �� �߰� ******");
		System.out.println("�� �� : ");
		String title = sc.nextLine();
		System.out.println("���� �� : ");
		String singer = sc.nextLine();
		Music music = new Music(title, singer);
		if(mc.addList(music)==1) {
			System.out.println("�߰� ����");
		} else {
			System.out.println("�߰� ����");
		}		
	}
	public void addAtZero() {
		System.out.println("****** ù ��ġ�� �� �߰� ******");
		System.out.println("�� �� : ");
		String title = sc.nextLine();
		System.out.println("���� �� : ");
		String singer = sc.nextLine();
		Music music = new Music(title, singer);
		if(mc.addAtZero(music)==1) {
			System.out.println("�߰� ����");
		} else {
			System.out.println("�߰� ����");
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
