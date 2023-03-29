package com.ex.controller;

import java.util.Scanner;

public class ExController {

	public void ex1() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 1 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("정수 2 입력 : ");
		int num2 = sc.nextInt();

		System.out.println("두 수의 합 : " + (num1 + num2));
		System.out.println("두 수의 차 : " + (num1 - num2));
		System.out.println("두 수의 곱 : " + num1 * num2);
		System.out.println("두 수의 나누기한 몫 : " + num1 / num2);
	}

	public void ex2() {
		Scanner sc = new Scanner(System.in);

		System.out.print("문자 입력 : ");
		char ch = sc.next().charAt(0);
		System.out.println("문자 " + ch + "의 유니코드 값은 : " + (int) ch + " 입니다.");
	}

	public void ex3() {
		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();

		System.out.print("입력한 " + str + " 문자열 앞에 3개 : ");
		for (int i = 0; i <= 2; i++) {
			System.out.print(str.charAt(i) + " ");
		}
		System.out.println();
	}

	public void ex4() {
		Scanner sc = new Scanner(System.in);

		System.out.print("인원 수 입력 : ");
		int people = sc.nextInt();
		System.out.print("초콜릿 개수 입력 : ");
		int choco = sc.nextInt();

		System.out.println("1인당 동일하게 나눠가진 초콜릿 개수 : " + people / choco);
		System.out.println("남은 초콜릿 개수 : " + people % choco);
	}

	public void ex5() {
		Scanner sc = new Scanner(System.in);
		double avg = 0.0;
		System.out.print("국어 점수 입력 : ");
		int korean = sc.nextInt();
		System.out.print("영어 점수 입력 : ");
		int english = sc.nextInt();
		System.out.print("수학 점수 입력 : ");
		int math = sc.nextInt();

		avg = (korean + english + math) / 3.0;
		System.out.println("세 과목에 대한 합계 : " + (korean + english + math));
		System.out.println("세 과목 평균 : " + avg);

		if ((korean >= 40) && (english >= 40) && (math >= 40) && (avg >= 60)) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
	}

	public void ex6() {
		Scanner sc = new Scanner(System.in);
		System.out.print("중간 고사 점수 : ");
		int middleExam = sc.nextInt();
		System.out.print("기말 고사 점수 : ");
		int finalExam = sc.nextInt();
		System.out.print("과제 점수 : ");
		int homeworkScore = sc.nextInt();
		System.out.print("출석 회수 : ");
		int attend = sc.nextInt();

		double total = (middleExam * 0.2) + (finalExam * 0.3) + (homeworkScore * 0.3) + (attend * 1.0);

		if (total >= 70) {
			if (attend >= 15) {
				System.out.println("================결과================");
				System.out.println("중간 고사 점수(20) : " + (middleExam * 0.2));
				System.out.println("기말 고사 점수(30) : " + (finalExam * 0.3));
				System.out.println("과제 점수	  (30) : " + (homeworkScore * 0.3));
				System.out.println("출석 점수	  (20) : " + (attend * 1.0));
				System.out.println("총점 : " + total);
				System.out.println("PASS");
			} else {
				System.out.println("Fail [출석 회수 부족 (" + attend + "/20)]");
			}

		} else {
			if (attend >= 15) {
				System.out.println("================결과================");
				System.out.println("중간 고사 점수(20) : " + (middleExam * 0.2));
				System.out.println("기말 고사 점수(30) : " + (finalExam * 0.3));
				System.out.println("과제 점수	  (30) : " + (homeworkScore * 0.3));
				System.out.println("출석 점수	  (20) : " + (attend * 1.0));
				System.out.println("총점 : " + total);
				System.out.println("Fail [점수미달]");
			} else {
				System.out.println("Fail [점수미달] + [출석 회수 부족 (" + attend + "/20)]");
			}
		}
	}

	public void ex7() {
		for (int i = 3; i >= 0; i--) {
			for (int j = i; j <= 3; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public void menu() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			
			boolean menuFlag = false; // menu 상단 무한 루프 플래그
			System.out.println("========================================원하는 기능====================");
			System.out.println("1. 두개의 수  입력받아 사칙연산 하는 기능");
			System.out.println("2. 키보드로 문자 하나를 입력 받아 그 문자의 유니코드를 출력하는 기능");
			System.out.println("3. 영어 문자열 값을 키보드로 입력 받아 문자에서 앞에서 세 개를 출력하는 기능");
			System.out.println("4. 초콜릿개수와 나눠주고 남은 초콜릿의 개수를 출력하는 기능");
			System.out.println("5. 합계와 평균을 구하는 기능 + 세 과목의 점수와 평균을 가지고 합격 여부 처리기능 ");
			System.out.println("6. 중간고사, 기말고사, 과제점수, 출석회수를 입력하고 Pass 또는 Fail을 출력하는기능.");
			System.out.println("7. 별을 출력하는 기능");

			while (true) { // 
				boolean flag = false; // switch 문 예외처리 플래그
				System.out.println("====================================================================");
				System.out.print("번호를 입력하세요 : ");
				int num = sc.nextInt();
				System.out.println("====================================================================");
				switch (num) {
				case 1:
					ex1();
					break;
				case 2:
					ex2();
					break;
				case 3:
					ex3();
					break;
				case 4:
					ex4();
					break;
				case 5:
					ex5();
					break;
				case 6:
					ex6();
					break;
				case 7:
					ex7();
					break;
				case 9:
					System.out.println("프로그램을 종료합니다.");
					menuFlag = true;
					break;
				default:
					System.out.println("1~7번과 9번만 입력해주세요!");
					flag = true;
					break;
				}
				if (flag == false) {
					break;
				}

			}
			if (menuFlag == true) {
				break;
			}
		}

	}

}
