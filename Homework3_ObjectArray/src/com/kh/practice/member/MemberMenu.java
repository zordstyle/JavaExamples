package com.kh.practice.member;

import java.util.Scanner;

public class MemberMenu {

	// ��ü
	Scanner sc = new Scanner(System.in);
	MemberController mc = new MemberController();

	// ������
	// �޼ҵ�
	public void mainMenu() {
		while(true) {			
			System.out.println("�ִ� ��� ������ ȸ������ "+mc.SIZE+"�� �Դϴ�.");
			System.out.println("���� ��ϵ� ȸ�� ���� "+mc.existMemberNum()+"�� �Դϴ�.");
			if(mc.existMemberNum()==10) {
				System.out.println("ȸ�� ���� ��� �� á�� ������ �Ϻ� �޴��� ���µ˴ϴ�.");
				System.out.println("2. ȸ�� �˻�");
				System.out.println("3. ȸ�� ���� ����");
				System.out.println("4. ȸ�� ����");
				System.out.println("5. ��� ���");
				System.out.println("9. ������");						
				System.out.print("�޴� ��ȣ : ");
				int select = sc.nextInt();
				switch(select) {
				case 2 :
					searchMember();
					break;
				case 3 :
					updateMember();
					break;
				case 4 :
					deleteMember();
					break;
				case 5 : 
					printAll();
					break;
				case 9 :
					System.out.println("���α׷��� �����մϴ�.");
					return;
				default : 
					System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				}
			} else {
				System.out.println("1. �� ȸ�� ���");		
				System.out.println("2. ȸ�� �˻�");
				System.out.println("3. ȸ�� ���� ����");
				System.out.println("4. ȸ�� ����");
				System.out.println("5. ��� ���");
				System.out.println("9. ������");
				System.out.print("�޴� ��ȣ : ");
				int select = sc.nextInt();
				switch(select) {
				case 1 : insertMember();
				break;
				case 2 :
					searchMember();
					break;
				case 3 :
					updateMember();
					break;
				case 4 :
					deleteMember();
					break;
				case 5 : 
					printAll();
					break;
				case 9 :
					System.out.println("���α׷��� �����մϴ�.");
					return;
				default : 
					System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���.");
				}
			}		
		}
	}
	public void insertMember() {
		System.out.println("�� ȸ���� ����մϴ�.");
		String id;
		char gender;
		while(true) {
			System.out.print("���̵� : ");
			id = sc.next();
			if(mc.checkId(id)) {
				break;
			} else {
				System.out.println("�ߺ��� ���̵��Դϴ�. �ٽ� �Է����ּ���.");
			}			
		}
		System.out.print("�̸� : ");
		String name = sc.next();
		System.out.print("��й�ȣ : ");
		String password = sc.next();
		System.out.print("�̸��� : ");
		String email = sc.next();
		while(true) {
			System.out.print("����(M/F) : ");
			gender = sc.next().charAt(0);
			if(gender=='M' || gender=='m' || gender=='f' || gender=='F') {
				break;
			} else {
				System.out.println("������ �ٽ� �Է��ϼ���.");
			}
		}
		System.out.print("���� : ");
		int age = sc.nextInt();
		mc.insertMember(id, name, password, email, gender, age);	
	}
	public void searchMember() {
		System.out.println("1. ���̵�� �˻��ϱ�");
		System.out.println("2. �̸����� �˻��ϱ�");
		System.out.println("3. �̸��Ϸ� �˻��ϱ�");
		System.out.println("9. �������� ���ư���");
		System.out.print("�޴� ��ȣ : ");
		int select = sc.nextInt();
		switch(select) {
		case 1:
			searchId();
			break;
		case 2:
			searchName();
			break;
		case 3:
			searchEmail();
			break;
		case 9:
			System.out.println("�������� ���ư��ϴ�.");
			return;
		default :
			System.out.println("�߸� �Է��ϼ̽��ϴ�. ���θ޴��� ���ư��ϴ�.");
			return;
		}
	}
	public void searchId() {
		System.out.print("�˻��� ���̵� : ");
		String id = sc.next();
		System.out.println(mc.searchId(id));
	}
	public void searchName() {
		System.out.print("�˻��� �̸� : ");
		String name = sc.next();
		if(!mc.searchName(name).equals("")) {
			System.out.println(mc.searchName(name));
		} 		
		return;		
	}
	public void searchEmail() {
		System.out.print("�˻��� �̸��� : ");
		String email = sc.next();		
		if(!mc.searchEmail(email).equals("")) {
			System.out.println((mc.searchEmail(email)));
		} 		
		return;
	}
	public void updateMember() {
		System.out.println("1. ��й�ȣ �����ϱ�");
		System.out.println("2. �̸� �����ϱ�");
		System.out.println("3. �̸��� �����ϱ�");
		System.out.println("9. �������� ���ư���");
		System.out.print("�޴� ��ȣ : ");
		int select = sc.nextInt();
		switch(select) {
		case 1 :
			updatePassword();
			break;
		case 2 :
			updateName();
			break;
		case 3 :
			updateEmail();
			break;
		case 9 :
			System.out.println("�������� ���ư��ϴ�.");
			return;
		default :
			System.out.println("�߸� �Է��ϼ̽��ϴ�. ���θ޴��� ���ư��ϴ�.");
			return;
		}
	}
	public void updatePassword() {
		System.out.print("������ ȸ���� ���̵� : ");
		String id = sc.next();
		System.out.print("������ ��й�ȣ : ");
		String password = sc.next();
		if(mc.updatePassword(id, password)) {
			System.out.println("������ ���������� �Ǿ����ϴ�.");
		} else
			System.out.println("�������� �ʴ� ���̵��Դϴ�.");
	}
	public void updateName() {
		System.out.print("������ ȸ���� ���̵� : ");
		String id = sc.next();
		System.out.print("������ �̸� : ");
		String name = sc.next();
		if(mc.updateName(id, name)) {
			System.out.println("������ ���������� �Ǿ����ϴ�.");
		} else
			System.out.println("�������� �ʴ� ���̵��Դϴ�.");
	}
	public void updateEmail() {
		System.out.print("������ ȸ���� ���̵� : ");
		String id = sc.next();
		System.out.print("������ �̸��� : ");
		String email = sc.next();
		if(mc.updateEmail(id, email)) {
			System.out.println("������ ���������� �Ǿ����ϴ�.");
		} else
			System.out.println("�������� �ʴ� ���̵��Դϴ�.");
	}
	public void deleteMember() {
		System.out.println("1. Ư��ȸ�� �����ϱ�");
		System.out.println("2. ���ȸ�� �����ϱ�");
		System.out.println("9. �������� ���ư���");
		System.out.print("�޴� ���� : ");
		int select = sc.nextInt();
		switch(select) {
		case 1 : 
			deleteOne();
			break;
		case 2 : 
			deleteAll();
			break;
		case 9 : 
			System.out.println("�������� ���ư��ϴ�.");
			return;
		default : 
			System.out.println("�߸� �Է��ϼ̽��ϴ�. �������� ���ư��ϴ�.");
			return;
		}
	}
	public void deleteOne() {
		System.out.print("������ ȸ���� ���̵� : ");
		String id = sc.next();
		String delete;
		while(true) {
			System.out.print("���� �����Ͻðڽ��ϱ�?(y/n) : ");
			delete = sc.next();
			if((delete.equals("y") || delete.equals("Y"))) {
				if(mc.delete(id)) {
					System.out.println("���������� �����Ͽ����ϴ�.");
					return;
				} else {
					System.out.println("�������� �ʴ� ���̵��Դϴ�.");
					break;
				}
			} else if(delete.equals("n") || delete.equals("N")) {
				System.out.println("���� �޴��� ���ư��ϴ�.");
				return;
			} else {
				System.out.println("y �Ǵ� n�� �Է����ּ���.");			
			}			
		}
	}
	public void deleteAll() {
		System.out.print("���� �����Ͻðڽ��ϱ�?(y/n) : ");
		String delete = sc.next();
		if(delete.equals("y") || delete.equals("Y")) {
			mc.delete();
			System.out.println("���������� �����Ͽ����ϴ�.");
		} else if(delete.equals("n") || delete.equals("N")) {
			System.out.println("���� �޴��� ���ư��ϴ�.");
		} 
	}
	public void printAll() {		
		Member[] mb = mc.printAll();
		if(mc.existMemberNum()==0) {
			System.out.println("����� ȸ���� �����ϴ�.");			
		} else {
			for(int i=0; i<mb.length; i++) {
				if(mb[i] != null) {
					System.out.println(mb[i].inform());
				} 
			}				
		}
	}
}

