package com.bs.practice.student.view;

import com.bs.practice.student.controller.StudentController;
import com.bs.practice.student.model.vo.Student;

public class StudentMenu {
	private StudentController ssm = new StudentController();
	
	public StudentMenu() {
		System.out.println("============ 학생 정보 출력 ============");
		Student[] s = ssm.printStudent();
		for(int i=0; i<s.length; i++) {
			System.out.println("이름 : "+s[i].getName()+" / "+
							"과목 : "+s[i].getSubject()+" / "+
							"점수 : "+s[i].getScore());
		}
		
		System.out.println();
		System.out.println("============ 학생 성적 출력 ============");
		double[] d = ssm.avgScore();
		System.out.println("학생 점수 합계 : "+d[0]);
		System.out.println("학생 점수 평균 : "+d[1]);
		System.out.println();
		
		System.out.println("============ 성적 결과 출력 ============");
		boolean flag = false;
		
		for(int i=0; i<s.length; i++) {
			System.out.print(s[i].getName()+"학생은 ");
			if(s[i].getScore()>=ssm.CUT_LINE) {
				System.out.println("통과입니다.");
			}else {
				System.out.println("재시험 대상입니다.");
			}
		}
		
	}
	
}
