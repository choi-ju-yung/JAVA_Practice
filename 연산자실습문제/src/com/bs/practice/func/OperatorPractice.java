package com.bs.practice.func;

import java.util.Scanner;

public class OperatorPractice {

	
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		System.out.println(num > 0 ? "양수다" : "양수가 아니다");
	}
	
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		System.out.println(num > 0 ? "양수다" : num == 0 ? "0이다" : "음수다");
	}

	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		System.out.println(num % 2 == 0 ? "짝수다" : "홀수다");
	}
	
	
	public void practice4() {
		int count = 3;
		Scanner sc = new Scanner(System.in);
		System.out.print("인원 수 : ");
		int people = sc.nextInt();
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		
		System.out.println("1인당 사탕 개수 : "+count);
		int result = (100 - (people * count));
		System.out.println("남은 사탕 개수 : "+  result);
	}
	
	
	public void practice5() {

		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("학년(숫자만) : ");
		int age = sc.nextInt();
		System.out.print("반(숫자만) : ");
		int clss = sc.nextInt();
		System.out.print("번호(숫자만) : ");
		int number = sc.nextInt();
		System.out.print("성별(M/F) : ");
		char gender = sc.next().charAt(0);
		System.out.print("성적(소수점 아래 둘째자리까지) : ");
		double score = sc.nextDouble();
		System.out.println();
		System.out.println(age+"학년 "+clss+"반 "+number+"번 "+name+" "+gender+"학생의 성적은 "+score+"이다.");
	}
	
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		System.out.println((age <= 13) ? "어린이" : (age> 13 && age <= 19) ? "청소년" : "성인");
		
	}
	
	
	
	public void practice7() {
		int sum;
		double avg;
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 : ");
		int korean = sc.nextInt();
		System.out.print("영어 : ");
		int english = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		sum = korean  + english + math;
		avg = sum / 3.0;
		
		System.out.println("합계 : " + sum);
		System.out.println("합계 : " + avg);
		
		
		System.out.println((korean >= 40) && (english >= 40) && (math >= 40)
				&&(avg >= 60) ? "합격" : "불합격");
	}
	
	
	
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호를 입력하세요(- 포함) : ");
		String realkey = sc.nextLine();
		char key = realkey.charAt(7);
		
		System.out.println((key == '1') || (key == '3')  ? "남자" : "여자");
		
	}
	
	
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수2 : ");
		int num2 = sc.nextInt();
		System.out.print("입력 : ");
		int num3 = sc.nextInt();
		
		System.out.println((num3 <= num1) || (num3 > num2) ? "true" : "false");
	}
	
	
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		int num1,num2,num3;
		
		System.out.print("입력1 : ");
		num1 = sc.nextInt();
		System.out.print("입력2 : ");
		num2 = sc.nextInt();
		System.out.print("입력3 : ");
		num3 = sc.nextInt();
		
		System.out.println((num1 == num2) && (num2 == num3) ? "true" : "false");
		
	}
	
	
	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		System.out.print("A사원의 연봉 : ");
		int sallay1 = sc.nextInt();
		System.out.print("B사원의 연봉 : ");
		int sallay2 = sc.nextInt();
		System.out.print("C사원의 연봉 : ");
		int sallay3 = sc.nextInt();
		
		System.out.println("A사원의 연봉/연봉+a : "+sallay1+'/'+(sallay1*1.4));
		System.out.println((sallay1*1.4) > 3000 ? "3000 이상" : "3000 미만");
		System.out.println("B사원의 연봉/연봉+a : "+sallay2+'/'+(sallay2*1.0));
		System.out.println((sallay2) > 3000 ? "3000 이상" : "3000 미만");
		System.out.println("C사원의 연봉/연봉+a : "+sallay3+'/'+(sallay3*1.15));
		System.out.println((sallay3*1.15) > 3000 ? "3000 이상" : "3000 미만");
		
	}
	
	
	
}



