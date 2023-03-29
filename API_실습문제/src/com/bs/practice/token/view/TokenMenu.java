package com.bs.practice.token.view;

import java.util.Scanner;

import com.bs.practice.token.controller.TokenController;

public class TokenMenu {
	public TokenController tc = new TokenController();
	Scanner sc = new Scanner(System.in);
	
	public void mainMenu() {
		
		while(true) {
			System.out.println("1. 지정 문자열 ");
			System.out.println("2. 입력 문자열 ");
			System.out.println("9. 프로그램 끝내기 ");
			System.out.print("메뉴 번호 : ");
			int number = sc.nextInt();
			
			switch(number) {
				case 1 : tokenMenu(); break;
				case 2 : inputMenu(); break;
				case 9 : System.out.println("프로그램을 종료합니다."); return;
				default : System.out.println("잘못 입력하셨습니다. 다시 입력하세요."); break;
			}
		}
	}
	
	
	public void tokenMenu() {
		String str = "J a v a P r o g r a m";

		System.out.println("토큰 처리 전 글자 : "+ str);
		System.out.println("토큰 처리 전 개수 : " + str.length());
		String afterStr = tc.afterToken(str);
		
		System.out.println("토큰 처리 후 글자 : "+ afterStr);
		System.out.println("토큰 처리 후 개수 : "+ afterStr.length());
		System.out.println("모두 대문자로 변환 : "+ afterStr.toUpperCase());

	}
	
	
	
	public void inputMenu() {
		System.out.print("문자열을 입력하세요 : ");
		sc.nextLine();
		String str = sc.nextLine();
		
		System.out.println("첫 글자 대문자 : "+tc.firstCap(str));
		System.out.print("찾을 문자 하나를 입력하세요 : ");
		char ch = sc.next().charAt(0);
		
		System.out.println(ch+"문자가 들어간 개수 "+tc.findChar(str, ch));
		
	}
	
}
