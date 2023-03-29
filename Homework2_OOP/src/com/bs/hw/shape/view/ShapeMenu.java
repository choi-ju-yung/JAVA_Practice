package com.bs.hw.shape.view;
import java.util.Scanner;

import com.bs.hw.shape.controller.SquareController;
import com.bs.hw.shape.controller.TriangleController;


public class ShapeMenu {
	
	SquareController scr = new SquareController();
	TriangleController tc = new TriangleController();
	public void inputMenu() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("===== 도형 프로그램 =====");
			System.out.println("3. 삼각형");
			System.out.println("4. 사각형");
			System.out.println("9. 프로그램종료");
			System.out.print("메뉴 번호 : ");
			int number = sc.nextInt();
			
			switch(number) {
				case 3 : triangleMenu();break;
				case 4 : squareMenu();break;
				case 9 : System.out.println("프로그램을 종료합니다."); return; // 함수종료
				default : System.out.println("잘못된 번호입니다. 다시 입력해주세요.");break;
			}
		}
	}
	
	
	
	public void triangleMenu() {
		while(true) {
			Scanner sc = new Scanner(System.in);
			int i = 1;
			System.out.println("===== 삼각형 =====");
			System.out.println("1. 삼각형 면적 ");
			System.out.println("2. 삼각형 색칠 ");
			System.out.println("3. 삼각형 정보 ");
			System.out.println("9. 메인으로 ");
			System.out.print("메뉴 번호 : ");
			int number = sc.nextInt();
			
			// 1 삼각형
			switch(number) {
				case 1 : inputSize(i,number);break;
				case 2 : inputSize(i,number);break;
				case 3 : printInformation(i);break;
				case 9 : System.out.println("메인으로 돌아갑니다."); return; // 함수종료
				default : System.out.println("잘못된 번호입니다. 다시 입력해주세요."); break;
			}
		}
	}
	
	
	
	public void squareMenu() {
		int i = 2;
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("===== 사각형 =====");
			System.out.println("1. 사각형 둘레 "); 
			System.out.println("2. 사각형 면적 "); 
			System.out.println("3. 사각형 색칠 "); 
			System.out.println("4. 사각형 정보 ");
			System.out.println("9. 메인으로 ");
			System.out.print("메뉴 번호 : ");
			int number = sc.nextInt();
			
			switch(number) {
				case 1 : inputSize(i,number);break;
				case 2 : inputSize(i,number);break;
				case 3 : inputSize(i,number);break;
				case 4 : printInformation(i);break;
				case 9 : System.out.println("메인으로 돌아갑니다."); return; // 함수종료
				default : System.out.println("잘못된 번호입니다. 다시 입력해주세요."); break;
			}
		}
	}
	
	
	
	public void inputSize(int type, int menuNum) {
		Scanner sc = new Scanner(System.in);
		if((type == 1) && (menuNum == 1)) {
			System.out.print("높이 : ");
			double height = sc.nextDouble();
			System.out.print("너비 : ");
			double weight = sc.nextDouble();
			
			double result = tc.calcArea(height, weight);
			System.out.print("삼각형 면적 : "+result);
			System.out.println();
		}
		
		if(type == 1 && menuNum == 2) {
			System.out.print("색깔을 입력하세요 : ");
			String color = sc.nextLine();
			
			tc.paintColor(color);
	
		}
		
		
		if(type==2 && menuNum == 1){
			System.out.print("높이 : ");
			double height = sc.nextDouble();
			System.out.print("너비 : ");
			double weight = sc.nextDouble();
			
		
			double result = scr.calcPerimeter(height, weight);
			System.out.print("사각형 둘레: "+result);
			System.out.println();
		}
		
		if(type==2 && menuNum == 2){
			System.out.print("높이 : ");
			double height = sc.nextDouble();
			System.out.print("너비 : ");
			double weight = sc.nextDouble();
			
		
			double result = scr.calcArea(height, weight);
			System.out.print("사각형 면적: "+result);
			System.out.println();
		}
		
		
		if(type==2 && menuNum == 3){
			System.out.print("색깔을 입력하세요 : ");
			String color = sc.nextLine();
			
			scr.paintColor(color);
			
		}
	}
		
		public void printInformation(int type){
			// int type에 따라 print()메소드를 불러오는 controller가 다름
			// int type이 ‘삼각형’일 경우 tc.print() 출력
			// int type이 ‘사각형’일 경우 scr.print() 출력
			
			if(type == 1) {
				System.out.println(tc.print()); 
			}
			
			if(type == 2) {
				System.out.println(scr.print()); 
			}
		
	}
	
	
	
}
