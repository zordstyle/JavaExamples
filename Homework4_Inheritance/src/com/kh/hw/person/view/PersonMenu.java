package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;
import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonMenu {
	
	// Fields
	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();
	// Constructors
	// Methods
	public void mainMenu() {
		// TODO ���θ޴����� ���� �Ϸ�
		while(true) {
			System.out.println("�л��� �ִ� 3����� ������ �� �ֽ��ϴ�.");
			System.out.println("���� ����� �л��� "+pc.personCount()[0]+"���Դϴ�.");
			System.out.println("����� �ִ� 10����� ������ �� �ֽ��ϴ�.");
			System.out.println("���� ����� ����� "+pc.personCount()[1]+"���Դϴ�.");
			System.out.println("1. �л� �޴�");
			System.out.println("2. ��� �޴�");
			System.out.println("9. ������");
			System.out.print("�޴� ��ȣ : ");
			String select = sc.next();
			switch(select) {
			case "1" : 
				studentMenu();
				break;
			case "2" :
				employeeMenu();
				break;
			case "9" : 
				System.out.println("�����մϴ�.");
				return;
			default :
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
				System.out.println();
				break;
			}
		}
	}
	public void studentMenu() {
		while(true) {
			if(pc.personCount()[0]==3) {
				System.out.println("1. �л� �߰�");
				System.out.println("2. �л� ����");
				System.out.println("9. ��������");
				System.out.println("�л��� ���� �� �ִ� ������ �� á�� ������ �л� �߰� �޴��� �� �̻� Ȱ��ȭ ���� �ʽ��ϴ�.");
				System.out.print("�޴� ��ȣ : ");
				String select = sc.next();
				switch(select) {
				case "2" : 
					printStudent();
					break;
				case "9" : 
					System.out.println("�������� ���ư��ϴ�.");
					System.out.println();
					return;				
				default :
					System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
					System.out.println();
					break;
				}				
			} else {
				System.out.println("1. �л� �߰�");
				System.out.println("2. �л� ����");
				System.out.println("9. ��������");				
				System.out.print("�޴� ��ȣ : ");
				String select = sc.next();
				switch(select) {
				case "1" : 
					insertStudent();
					break;
				case "2" : 
					printStudent();
					break;
				case "9" : 
					System.out.println("�������� ���ư��ϴ�.");
					System.out.println();
					return;
				default :
					System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
					System.out.println();
					break;
				}				
			}
		}
	}
	public void employeeMenu() {
		while(true) {
			if(pc.personCount()[1]==10) {
				System.out.println("1. ��� �߰�");
				System.out.println("2. ��� ����");
				System.out.println("9. ��������");
				System.out.println("����� ���� �� �ִ� ������ �� á�� ������ ��� �߰� �޴��� �� �̻� Ȱ��ȭ ���� �ʽ��ϴ�.");
				System.out.print("�޴� ��ȣ : ");
				String select = sc.next();
				switch(select) {
				case "2" : 
					printEmployee();
					break;
				case "9" : 
					System.out.println("�������� ���ư��ϴ�.");
					return;				
				default :
					System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
					System.out.println();
					break;
				}				
			} else {
				System.out.println("1. ��� �߰�");
				System.out.println("2. ��� ����");
				System.out.println("9. ��������");
				System.out.print("�޴� ��ȣ : ");
				String select = sc.next();
				switch(select) {
				case "1" : 
					insertEmployee();
					break;
				case "2" : 
					printEmployee();
					break;
				case "9" : 
					System.out.println("�������� ���ư��ϴ�.");
					return;
				default :
					System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���");
					System.out.println();
					break;
				}
			}
		}
	}
	public void insertStudent() {
		while(true) {
			System.out.print("�л� �̸� : ");
			String name = sc.next();
			System.out.print("�л� ���� : ");
			int age = sc.nextInt();
			System.out.print("�л� Ű : ");
			double height = sc.nextDouble();
			System.out.print("�л� ������ : ");
			double weight = sc.nextDouble();
			System.out.print("�л� �г� : ");
			int grade = sc.nextInt();
			System.out.print("�л� ���� : ");
			String major = sc.next();
			pc.insertStudent(name, age, height, weight, grade, major);
			if(pc.personCount()[0]<3) {
				System.out.print("�׸� �Ͻ÷��� N(�Ǵ� n), �̾��Ͻ÷��� �ƹ� Ű�� �������� : ");
				String select = sc.next();
				if(select.equals("N") || select.equals("n")) {
					System.out.println();
					return;
				} 
			} else {
				System.out.println("�л��� ���� �� �ִ� ������ �� á�� ������ �л� �߰��� �����ϰ� �л� �޴��� ���ư��ϴ�.");
				System.out.println();
				return;
			}			
		}		
	}
	public void printStudent() {
		Student[] ps = pc.printStudent();
		for(int i=0; i<3; i++) {
			if(ps[i] != null ) {
				System.out.println(ps[i].toString());
			}
		}
		System.out.println();
	}
	public void insertEmployee() {
		while(true) {
			System.out.print("��� �̸� : ");
			String name = sc.next();
			System.out.print("��� ���� : ");
			int age = sc.nextInt();
			System.out.print("��� Ű : ");
			double height = sc.nextDouble();
			System.out.print("��� ������ : ");
			double weight = sc.nextDouble();
			System.out.print("��� �޿� : ");
			int grade = sc.nextInt();
			System.out.print("��� �μ� : ");
			String major = sc.next();
			pc.insertEmployee(name, age, height, weight, grade, major);
			if(pc.personCount()[1]<10) {
				System.out.print("�׸� �Ͻ÷��� N(�Ǵ� n), �̾��Ͻ÷��� �ƹ� Ű�� �������� : ");
				String select = sc.next();
				if(select.equals("N") || select.equals("n")) {
					System.out.println();
					return;
				} 
			} else {
				System.out.println("����� ���� �� �ִ� ������ �� á�� ������ ��� �߰��� �����ϰ� ��� �޴��� ���ư��ϴ�.");
				System.out.println();
				return;
			}			
		}
	}
	public void printEmployee() {
		Employee[] pe = pc.printEmployee();
		for(int i=0; i<10; i++) {
			if(pe[i] != null ) {
				System.out.println(pe[i].toString());
			}
		}
		System.out.println();
	}


}
