package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {
	
	// Fields
	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];
	
	// Constructors
	// Methods
	public int[] personCount() {
		int[] pc = new int[2];
		pc[0] = 0;
		for(int i=0; i<3; i++) {
			if(s[i] != null) {
				pc[0]++;
			}
		}
		pc[1] = 0;
		for(int i=0; i<10; i++) {
			if(e[i] != null) {
				pc[1]++;
			}
		}
		return pc;		
	}
	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		for(int i=0; i<3; i++) {
			if(s[i] == null) {
				s[i] = new Student(name, age, height, weight, grade, major);
				return;
			}
		}
	}
	public Student[] printStudent() {
		return s;
	}
	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		for(int i=0; i<10; i++) {
			if(e[i] == null) {
				e[i] = new Employee(name, age, height, weight, salary, dept);
				return;
			}
		}
	}
	public Employee[] printEmployee() {
		return e;
	}


}
