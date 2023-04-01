package com.bs.practice.set.view;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import com.bs.practice.set.controller.LotteryController;
import com.bs.practice.set.model.vo.Lottery;

public class LotteryMenu {
	Scanner sc = new Scanner(System.in);
	LotteryController lc = new LotteryController();

	public void mainMenu() {
		System.out.println("==========BS 추천 프로그램==========");

		while (true) {
			System.out.println("=====*******메인 메뉴*******=====");
			System.out.println("1. 추첨 대상 추가");
			System.out.println("2. 추첨 대상 삭제");
			System.out.println("3. 당첨 대상 확인");
			System.out.println("4. 정렬된 당첨 대상 확인");
			System.out.println("5. 당첨 대상 검색");
			System.out.println("9. 종료");

			System.out.print("메뉴 번호 선택 : ");
			int number = sc.nextInt();

			switch (number) {
			case 1:
				insertObject();
				break;
			case 2:
				deleteObject();
				break;
			case 3:
				winObject();
				break;
			case 4:
				sortedWinObject();
				break;
			case 5:
				searchWinner();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다. ");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시입력해주세요");
			}
		}
	}

	public void insertObject() { // 1. 추첨 대상 추가용 view 메소드
		System.out.print("추가할 추첨 대상 수 : ");
		int add = sc.nextInt();

		for (int i = 0; i < add; i++) {
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("핸드폰 번호('-'빼고) : ");
			String phone = sc.next();

			// 매개변수 생성자를 이용해서 Lottery 객체에 추첨자 정보 저장하고 전달
			// 결과는 boolean 형으로나와서 바로 if문에 넣음
			if (lc.insertObject(new Lottery(name, phone))) {

			} else {
				System.out.println("중복된 대상입니다. 다시 입력하세요.");
				i--;
			}
		}
		System.out.println(add+"명 추가 완료되었습니다.");
	}

	
	public void deleteObject() {// 2. 추첨 대상 삭제용 view 메소드
		System.out.println("삭제할 대상의 이름과 핸드폰 번호를 입력하세요 : ");

			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("핸드폰 번호('-'빼고) : ");
			String phone = sc.next();
			
			if(lc.deleteObject(new Lottery(name,phone))) {
				System.out.println("삭제 완료되었습니다");
			}else {
				System.out.println("존재하지 않는 대상입니다.");
			}
	}

	
	
	public void winObject() { // 3. 당첨 대상 확인용 view 메소드
		HashSet hs = lc.winObject();
		ArrayList al = new ArrayList(hs);
		System.out.print("[");
		for(int i=0; i<al.size(); i++) {
			Lottery lt = (Lottery)al.get(i);
			
			System.out.print(lt.getName()+"("+lt.getPhone()+")");
			if(i != al.size()-1) {
				System.out.print(",");
			}
		}
		System.out.println("]");
	}

	
	public void sortedWinObject() { // 4. 정렬된 당첨 대상 확인
		Set hs = lc.sortedWinObject();
		
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			Lottery lt = (Lottery)it.next();
			System.out.println(lt);
		}
	}

	
	public void searchWinner() { // 5. 당첨 대상 검색용 view 메소드
		System.out.println("검색할 대상의 이름과 핸드폰 번호를 입력하세요.");
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("핸드폰 번호('-'빼고) : ");
		String phone = sc.next();
		
		if(lc.searchWinner(new Lottery(name,phone))) {
			System.out.println("축하합니다. 당첨 목록에 존재합니다.");
		}else {
			System.out.println("안타깝지만 당첨 목록에 존재하지 않습니다.");
		}
		
	
		
	}

}
