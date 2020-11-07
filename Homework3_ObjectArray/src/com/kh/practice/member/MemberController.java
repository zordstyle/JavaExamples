package com.kh.practice.member;

public class MemberController {

	// �ʵ�
	private Member[] m = new Member[SIZE];	
	public final static int SIZE = 10;

	// ������
	// �޼ҵ�
	public int existMemberNum() {
		int sum = 0;
		for(int i=0; i<SIZE; i++) {
			if(m[i] != null) {
				sum++;
			}
		}
		return sum;
	}
	public boolean checkId(String inputId) {
		for(int i=0; i<SIZE; i++) {
			if(m[i] == null) {				
				return true;
			} else if(m[i] != null && m[i].getId().equals(inputId)) {
				return false;
			}				
		} return false;
	}
	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		for(int i=0; i<SIZE; i++) {			
			if(m[i] == null) {					
				m[i] = new Member(id, name, password, email, gender, age);
				return;
			}
		}
	}
	public String searchId(String id) {
		for(int i=0; i<SIZE; i++) {
			if(m[i] != null && m[i].getId().equals(id)) {
				System.out.println("ã���ô� ȸ�� �˻� ����Դϴ�.");
				return m[i].inform();
			}			
		}
		return "�˻� ����� �����ϴ�. ���� �޴��� ���ư��ϴ�.";
	}
	public String searchName(String name) {
		int sum = 0;
		for(int i=0; i<SIZE; i++) {
			if(m[i] != null && m[i].getName().equals(name)) {				
				sum++;
			}
		}
		if(sum==0)
			return "�˻� ����� �����ϴ�. �������� ���ư��ϴ�.";
		else {
			System.out.println("ã���� ȸ����ȸ ����Դϴ�.");
			for(int i=0; i<SIZE; i++) {
				if(m[i] != null && m[i].getName().equals(name)) {
					System.out.println(m[i].inform());
				}
			}
		}
		return "";
	}
	public String searchEmail(String email) {
		int sum = 0;
		for(int i=0; i<SIZE; i++) {
			if(m[i] != null && m[i].getEmail().equals(email)) {				
				sum++;
			}
		}
		if(sum==0)
			return "�˻� ����� �����ϴ�. �������� ���ư��ϴ�.";
		else {
			System.out.println("ã���� ȸ����ȸ ����Դϴ�.");
			for(int i=0; i<SIZE; i++) {
				if(m[i] != null && m[i].getEmail().equals(email)) {
					System.out.println(m[i].inform());
				}
			}
		}
		return "";
	}
	public boolean updatePassword(String id, String password) {
		for(int i=0; i<SIZE; i++) {
			if(m[i] != null && m[i].getId().equals(id)) {
				m[i].setPassword(password);
				return true;
			} 			
		}
		return false;
	}
	public boolean updateName(String id, String name) {
		for(int i=0; i<SIZE; i++) {
			if(m[i] != null && m[i].getId().equals(id)) {
				m[i].setName(name);
				return true;
			} 			
		}
		return false;
	}
	public boolean updateEmail(String id, String email) {
		for(int i=0; i<SIZE; i++) {
			if(m[i] != null && m[i].getId().equals(id)) {
				m[i].setEmail(email);
				return true;
			} 			
		}
		return false;
	}
	public boolean delete(String id) {
		for(int i=0; i<SIZE; i++) {
			if(m[i] != null && m[i].getId().equals(id)) {
				m[i]=null;
				return true;
			} 			
		}
		return false;		
	}
	public void delete() {
		for(int i=0; i<SIZE; i++) {			
			m[i]=null;
		}
	}
	public Member[] printAll() {
		return m;
	}


}
