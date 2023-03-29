package com.bs.practice.student.controller;

import com.bs.practice.student.model.vo.Student;

public class StudentController {
	
	private Student[] sArr = new Student[5];
	public static int CUT_LINE = 60;	
	
	public StudentController() {
		
		sArr[0] = new Student("김길동","자바",100);
		sArr[1] = new Student("박길동","디비",50);
		sArr[2] = new Student("이길동","화면",85);
		sArr[3] = new Student("정길동","서버",60);
		sArr[4] = new Student("홍길동","자바",20);
	}
	
	
	public Student[] printStudent() {
		return sArr;
}

	
	
	public int sumScore() {
		int sum = 0;
		for(int i=0; i<sArr.length; i++) {
			sum += sArr[i].getScore();
		}
		return sum;
	}
	
	public void print() {
		for(int i=0; i<sArr.length; i++) {
			System.out.println(sArr[i].getScore());
		}
	}
	
	
	
	public double[] avgScore() {
		double[] d = new double[2];
		int total = sumScore();
		d[0] = total;
		
		d[1] = total / 5.0;
		
		return d;
	}
	
	
	
}
	
	

	



