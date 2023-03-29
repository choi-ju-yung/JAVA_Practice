package com.bs.practice.chap01;
import java.util.Scanner;

public class ControlPractice {
	public void practice1() {
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("1. 입력");
		 System.out.println("2. 수정");
		 System.out.println("3. 조회");
		 System.out.println("4. 삭제");
		 System.out.println("7. 종료");
		 
		 System.out.print("메뉴 번호를 입력하세요 : ");
		 int num = sc.nextInt();
		 
		 switch(num) {
		 	case 1: System.out.println("입력 메뉴입니다."); break;
		 	case 2: System.out.println("수정 메뉴입니다."); break;
		 	case 3: System.out.println("조회 메뉴입니다."); break;
		 	case 4: System.out.println("삭제 메뉴입니다."); break;
		 	case 7: System.out.println("프로그램이 종료됩니다."); break;
		 }
	 }
	 
	 
	 
	 
	 
	 public void practice2(){
		 Scanner sc = new Scanner(System.in);
		 System.out.print("숫자를 한개 입력하세요 : ");
		 int num = sc.nextInt();
		 
		 if(num > 0) {
			 if(num % 2 == 0) {
				 System.out.println("짝수다");
			 }
			 else {
				 System.out.println("홀수다");
			 }
		 }else {
			 System.out.println("양수만 입력해주세요");
		 }
	 }
	 
	 
	 
	
	 
	 public void practice3() {
		Scanner sc = new Scanner(System.in);

		System.out.print("국어 점수 : ");
		int korean = sc.nextInt();
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();
		System.out.print("영어 점수 : ");
		int english = sc.nextInt();
		
		if((korean >= 40) && (math >= 40) && (english >= 40) 
				&& ((korean + math + english) / 3.0) >= 60) {
			System.out.println("국어 : "+korean);
			System.out.println("수학 : "+math);
			System.out.println("영어 : "+english);
			System.out.println("합계 : "+(korean + math + english));
			System.out.println("평균 : "+(korean + math + english)/3.0);
			System.out.println("축하합니다, 합격입니다!");
		}else {
			System.out.println("불합격입니다.");
		}
	 }
	 
	 
	 
	 
	 public void practice4(){
		 Scanner sc = new Scanner(System.in);
		 System.out.print("1~12 사이의 정수 입력 : ");
		 int month = sc.nextInt();
		 
		 switch(month) {
		 	case 12:
		 	case 1:
		 	case 2: 
		 	    System.out.println(month+"월은 겨울입니다."); 
		 	    break;
		 	case 3:
		 	case 4:
		 	case 5:
		 		System.out.println(month+"월은 봄입니다.");
		 	    break;
		 	case 6:
		 	case 7:
		 	case 8:
		 		System.out.println(month+"월은 여름입니다.");
		 	    break;
		 	case 9:
		 	case 10:
		 	case 11:
		 		System.out.println(month+"월은 가을입니다.");
		 	    break;
		 	default:
		 		System.out.println(month+"월은 잘못 입력된 달입니다.");
		 }
	 }
	 
	 
	 
	 
	 public void practice5(){
		 Scanner sc = new Scanner(System.in);
		 String id = "myId";
		 String pass = "myPassword12";
		 
		 System.out.print("아이디 : ");
		 String inputId = sc.next();
		 System.out.print("비밀번호 : ");
		 String inputPW = sc.next();
		 
		 if(inputId.equals("myId")) {
			 if(inputPW.equals("myPassword12")) {
				 System.out.println("로그인 성공");
			 }
			 else {
				 System.out.println("비밀번호가 틀렸습니다.");
			 }
		 }
		 else if(inputPW.equals("myPassword12")){
			 System.out.println("아이디가 틀렸습니다.");
		 }
		 else {
			 System.out.println("아이디와 비밀번호 모두 틀렸습니다.");
		 }
	 }

	 
	 
	 
	 public void practice6() {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		 String grade = sc.next();
		 
		 switch(grade) {
		 	case "관리자" : System.out.println("회원관리, 게시글관리 게시글작성, "
		 			+ "댓글 작성 게시글 조회"); break;
		 	case "회원" : System.out.println("게시글 작성, 게시글 조회, 댓글작성"); break;
		 	case "비회원" : System.out.println("게시글 조회"); break;
		 	default: System.out.println("관리자, 회원, 비회원 중 하나만 입력하세요");
		 }
	 }
	 
	 
	 
	 public void practice7() {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("키(m)를 입력해 주세요 : ");
		 double height = sc.nextDouble();
		 System.out.print("몸무게(kg)를 입력해 주세요 : ");
		 double weight = sc.nextDouble();
		 
		 Double BMI = weight / (height * height);
		 
		 System.out.println("BMI 지수 : "+BMI);
		 
		 if(BMI >= 30.0) {
			 System.out.println("고도 비만");
		 }
		 else if(BMI >= 25.0) {
			 System.out.println("비만");
		 }
		 else if(BMI >= 23.0) {
			 System.out.println("과체중");
		 }
		 else if(BMI >= 18.5) {
			 System.out.println("정상체중");
		 }
		 else {
			 System.out.println("저체중");
		 }
	 }
	 
	 
	 
	 public void practice8(){
		 Scanner sc = new Scanner(System.in);
		 System.out.print("피연산자1 입력 : ");
		 int num1 = sc.nextInt();
		 System.out.print("피연산자2 입력 : ");
		 int num2 = sc.nextInt();

		 if(num1 > 0 && num2 > 0) {
			 System.out.print("연산자를 입력(+,-,*,/,%) : ");
			 char Op = sc.next().charAt(0);
			 switch(Op) {
			 case '+' : System.out.println(num1+ " "+ Op + " " 
					 + num2 + " = " + (num1+num2)); break;
		 	 case '-' : System.out.println(num1+ " "+ Op + " " 
				 + num2 + " = " + (num1-num2)); break;
		 	 case '*' : System.out.println(num1+ " "+ Op + " " 
					 + num2 + " = " + (num1*num2)); break;
		 	 case '/' : System.out.println(num1+ " "+ Op + " " 
					 + num2 + " = " + (num1/(double)num2)); break;
		 	 case '%' : System.out.println(num1+ " "+ Op + " " 
					 + num2 + " = " + (num1%num2)); break;
			 default: System.out.println("(+,-,*,/,%) 만 입력하세요");
			 }
		 	}
		 else {
			 System.out.println("두개의 정수 모두 양수를 입력하세요!");
		 }
	 }
	 
	 
	 
	 public void practice9(){
	
		 Scanner sc = new Scanner(System.in);
		 System.out.print("중간 고사 점수 : ");
		 int middleExam = sc.nextInt();
		 System.out.print("기말 고사 점수 : ");
		 int finalExam = sc.nextInt();
		 System.out.print("과제 점수 : ");
		 int homeworkScore = sc.nextInt();
		 System.out.print("출석 점수 : ");
		 int attend = sc.nextInt();
		 
		 double total = (middleExam * 0.2) + (finalExam * 0.3)
				 + (homeworkScore * 0.3) + (attend * 1.0);

		 if(total >= 70) {
			 if(attend >= 15) {
				 System.out.println("================결과================");
				 System.out.println("중간 고사 점수(20) : "+(middleExam * 0.2));
				 System.out.println("기말 고사 점수(30) : "+(finalExam * 0.3));
				 System.out.println("과제 점수	  (30) : "+(homeworkScore * 0.3));
				 System.out.println("출석 점수	  (20) : "+(attend * 1.0));
				 System.out.println("총점 : "+total);
				 System.out.println("PASS");
		   }
			 else {
				 System.out.println("Fail [출석 회수 부족 (" +attend+"/20)]");
			 }
			 
		 }
		 else {
			 if(attend >= 15) {
				 System.out.println("================결과================");
				 System.out.println("중간 고사 점수(20) : "+(middleExam * 0.2));
				 System.out.println("기말 고사 점수(30) : "+(finalExam * 0.3));
				 System.out.println("과제 점수	  (30) : "+(homeworkScore * 0.3));
				 System.out.println("출석 점수	  (20) : "+(attend * 1.0));
				 System.out.println("총점 : "+total);
				 System.out.println("Fail [점수미달]");
			 }
			 else {
				 System.out.println("Fail [출석 회수 부족 (" + attend + "/20)]");
			 }
		 }
	 }
	 
	 
	 
	 public void practice10() {
		    Scanner sc = new Scanner(System.in);
			System.out.println("실행할 기능을 선택하세요.");
			System.out.println("1. 메뉴 출력");
			System.out.println("2. 짝수/홀수");
			System.out.println("3. 합격/불합격");
			System.out.println("4. 계절");
			System.out.println("5. 로그인");
			System.out.println("6. 권한 확인");
			System.out.println("7. BMI");
			System.out.println("8. 계산기");
			System.out.println("9. P/F");
			
			System.out.print("선택 : ");
			int num = sc.nextInt();
			System.out.print("(실습문제"+num+"실행)");
			System.out.println();
			switch(num) {
				case 1:practice1(); break;
				case 2:practice2(); break;
				case 3:practice3(); break;
				case 4:practice4(); break;
				case 5:practice5(); break;
				case 6:practice6(); break;
				case 7:practice7(); break;
				case 8:practice8(); break;
				case 9:practice9(); break;
				default:System.out.println("1~9번 수 중에서만 입력하시오");
			}
		}
	 
	 
	 
	 
	 
	 
	 
	 public void practice11() {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("비밀번호 입력(1000~9999) : ");
			int num = sc.nextInt();
			int tempNum = num;
			int a = tempNum % 10;  tempNum /= 10;
			int b = tempNum % 10;  tempNum /= 10;
			int c = tempNum % 10;  tempNum /= 10;
			int d = tempNum % 10;
	
	
			if(num>999 && num<10000) {
				if(a==b || a==c || a==d || b==c || b==d || c==d) {
					System.out.println("중복값 있음(실패)");
				}else {
					System.out.println("생성 성공");
				}
			}else {
				System.out.println("자리수 안맞음");
			}
	 }

	 
}
