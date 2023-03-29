package com.bs.example.practice4.model.vo;

public class Student {
	private static int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	public Student() {} // 기본생성자
	
	{  // 초기화블록
		Student.grade = 3;
		this.classroom = 5;
		this.name = "최주영";
		this.height = 175.6;
		this.gender = '남';
	}

	public void information() {
		System.out.println(name+"은 "+Student.grade+"학년 "+classroom+"반 "+
				gender+"자이며 키는 "+height+"입니다.");
	}
	
}
