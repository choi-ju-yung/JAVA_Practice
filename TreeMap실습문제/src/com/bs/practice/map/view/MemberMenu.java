package com.bs.practice.map.view;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

import com.bs.practice.map.controller.MemberController;
import com.bs.practice.map.model.vo.Member;

public class MemberMenu {
	Scanner sc = new Scanner(System.in);
	MemberController mc = new MemberController();
	
	
	public void mainMenu() {
		System.out.println("==========BS 사이트==========");

		while (true) {
			System.out.println("=====*******메인 메뉴*******=====");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 같은 이름 회원 찾기");
			System.out.println("9. 종료");

			System.out.print("메뉴 번호 선택 : ");
			int number = sc.nextInt();

			switch (number) {
			case 1:
				joinMembership();
				break;
			case 2:
				logIn();
				break;
			case 3:
				sameName();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다. ");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시입력해주세요");
			}
		}
	}
	
	
	public void memberMenu() {
		while(true) {
			System.out.println("=====*******회원 메뉴*******=====");
			System.out.println("1. 비밀번호 바꾸기");
			System.out.println("2. 이름 바꾸기");
			System.out.println("3. 로그아웃");

			System.out.print("메뉴 번호 선택 : ");
			int number = sc.nextInt();

			switch (number) {
			case 1:
				changePassword();
				break;
			case 2:
				changeName();
				break;
			case 3:
				System.out.println("로그아웃 되었습니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시입력해주세요");
			}
		}
	}
	
	
	public void joinMembership() {
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("비밀번호 : ");
		String pass = sc.next();
		System.out.print("이름 : ");
		String name = sc.next();
		
		if(mc.joinMembership(id,new Member(name,pass))) {
			System.out.println("성공적으로 회원가입 완료했습니다.");
		}else {
			System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
		}
	}
	
	
	public void logIn() {
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("비밀번호 : ");
		String pass = sc.next();
		
		String name = mc.logIn(id,pass);
		if(name == null) {
			System.out.println("틀린 아이디 또는 비밀번호 입니다. 다시 입력해주세요");
			logIn(); // 틀렸을 경우 다시 로그인화면으로 가기
		}else {
			System.out.println(name+"님, 환영합니다!");
			memberMenu();
		}
	}
	
	
	public void changePassword() {
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("현재 비밀번호 : ");
		String pass = sc.next();
		System.out.print("새로운 비밀번호 : ");
		String newPass = sc.next();
		if(mc.changePassword(id,pass,newPass)) { // 찾을아이디, 찾을비밀번호, 변경할비밀번호
			System.out.println("비밀번호 변경에 성공했습니다.");
		}else {
			System.out.println("비밀번호 변경에 실패했습니다. 다시 입력해주세요.");
			changePassword();  // 비밀번호 실패하면 다시 입력받기 위해서 다시 함수 호출
		}
		
	}
	
	
	public void changeName() {
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("비밀번호 : ");
		String pass = sc.next();
		
		String name = mc.logIn(id, pass); 
		//mc의 logIn()으로 넘겨 현재 저장되어 있는 이름을 받고 사용자에게 현재 저장되어 있는 이름을 출력
		
		if(name == null) {
			System.out.println("이름 변경에 실패했습니다. 다시 입력해주세요");
			changeName();  // 입력한 정보로 찾은 정보가 없을시 다시 입력
		}else {
			System.out.println("현재 설정된 이름 : "+name);
			System.out.print("변경할 이름 : ");
			String newName = sc.next();
			
			if(mc.changeName(id, newName)) {
				System.out.println("이름 변경에 성공하였습니다.");
			}
		}
	}

	
	
	public void sameName(){
		System.out.print("검색할 이름 : ");
		String name = sc.next();
		TreeMap tm = mc.sameName(name);  // 가져온 새로운 map을
		
		Set st = tm.entrySet();  // entrySet 으로 키랑 값을 꺼낼수 있도록 만듬
		for(Object o : st) {
			Map.Entry all = (Map.Entry)o;
			System.out.println(((Member)all.getValue()).getName()+"-"+all.getKey());
		}
	}

	
}

