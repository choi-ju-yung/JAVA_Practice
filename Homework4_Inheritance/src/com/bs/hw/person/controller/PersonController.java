package com.bs.hw.person.controller;

import com.bs.hw.person.model.vo.Employee;
import com.bs.hw.person.model.vo.Student;

public class PersonController {
	private Student[] s = new Student[3];
	private Employee[] e = new Employee[10];
	
	
	
//	public int[] personCount() {
//		int[] ss = new int[2];
//		
//		int i=0;
//		int j=0;
//		for(i=0; i<s.length; i++) {
//			if(s[i] == null) {
//				break;
//			}
//		}
//		
//		for(j=0; j<e.length; i++) {
//			if(s[j] == null) {
//				break;
//			}
//		}
//		
//		ss[0] = i;  // 학생 수
//		ss[1] = j;  // 직원 수
//
//		return ss;
//	}
	
	public int pcnt() {
		int cnt = 0;
		for(int i=0; i<s.length; i++) {
			if(s[i] == null) {
				break;
			}
			cnt++;
		}
		return cnt;
	}
	
	
	public int ecnt() {
		int cnt = 0;
		for(int i=0; i<e.length; i++) {
			if(e[i] == null) {
				break;
			}
			cnt++;
		}
		return cnt;
	}
	
	
	
	
	
	public void insertStudent(String name, int age, double height, double weight
			,int grade, String major) {
		for(int i=0; i<s.length; i++) {
			if(s[i] == null) {
				s[i] = new Student();  // .연산자 사용할 때 null값이면 널포인터 오류뜸
				s[i].setName(name);
				s[i].setAge(age);
				s[i].setHeight(height);
				s[i].setWeight(weight);
				s[i].setGrade(grade);
				s[i].setMajor(major);
				break;  // 하나의 객체만 추가하고 멈춤
			}
		}
	}
	
	
	public Student[] printStudent() {
		return s;
	}
	
	
	
	public void insertEmployee(String name, int age, double height, double weight
			,int salary, String dept) {
		
		for(int i=0; i<e.length; i++) {
			if(e[i] == null) {
				e[i] = new Employee();
				e[i].setName(name);
				e[i].setAge(age);
				e[i].setHeight(height);
				e[i].setWeight(weight);
				e[i].setSalary(salary);
				e[i].setDept(dept);
				break;  // 하나의 객체만 추가하고 멈춤
			}
		}
		
	}
	
	
	
	public Employee[] printEmployee() {
		return e;
	}
	
	
}
