package com.bs.practice.generics.view;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import com.bs.practice.generics.controller.FarmController;
import com.bs.practice.generics.model.vo.Farm;
import com.bs.practice.generics.model.vo.Fruit;
import com.bs.practice.generics.model.vo.Nut;
import com.bs.practice.generics.model.vo.Vegetable;

public class FarmMenu {
	Scanner sc = new Scanner(System.in);
	FarmController fc = new FarmController();
	
	
	public void mainMenu() {
		System.out.println("==========BS 마트==========");

		while (true) {
			System.out.println("=====*******메인 메뉴*******=====");
			System.out.println("1. 직원 메뉴");
			System.out.println("2. 손님 메뉴");
			System.out.println("9. 종료");

			System.out.print("메뉴 번호 선택 : ");
			int number = sc.nextInt();

			switch (number) {
			case 1:
				adminMenu();
				break;
			case 2:
				customerMenu();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다. ");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시입력해주세요");
			}
		}
	}
	
	
	public void adminMenu() {
			while(true) {
			System.out.println("=====*******직원 메뉴*******=====");
			System.out.println("1. 새 농산물 추가");
			System.out.println("2. 종류 삭제");
			System.out.println("3. 수량 수정");
			System.out.println("4. 농산물 목록");
			System.out.println("9. 메인으로 돌아가기");

			
			System.out.print("메뉴 번호 선택 : ");
			int number = sc.nextInt();

			switch (number) {
			case 1:
				addNewKind();
				break;
			case 2:
				removeKind();
				break;
			case 3:
				changeAmount();
				break;
			case 4:
				printFarm();
				break;
			case 9:
				System.out.println("메인화면으로 돌아갑니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시입력해주세요");
			}
		}
	}

	
	public void customerMenu() {
		while(true) {
		System.out.println("현재 BS마트 농산물 수량");
		printFarm();
		System.out.println();
		
		System.out.println("********* 고객 메뉴 *********");
		System.out.println("1. 농산물 사기");
		System.out.println("2. 농산물 빼기");
		System.out.println("3. 구입한 농산물 보기");
		System.out.println("9. 메인으로 돌아가기");

		System.out.print("메뉴 번호 선택 : ");
		int number = sc.nextInt();

		switch (number) {
		case 1:
			buyFarm();
			break;
		case 2:
			removeFarm();
			break;
		case 3:
			printBuyFarm();
			break;
		case 4:
			printFarm();
			break;
		case 9:
			System.out.println("메인화면으로 돌아갑니다.");
			return;
		default:
			System.out.println("잘못 입력하셨습니다. 다시입력해주세요");
			}
		}
	}
	
	
	
	
	
	public void addNewKind() {
		Farm f = new Farm();
		
		System.out.println("1. 과일 / 2. 채소 / 3. 견과");
		System.out.print("추가할 종류 번호 : ");
		int number = sc.nextInt();
		
		while((number != 1) && (number != 2) && (number != 3)) {
			System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			System.out.println("1. 과일 / 2. 채소 / 3. 견과");
			System.out.print("추가할 종류 번호 : ");
			number = sc.nextInt();
		}
				
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("수량 : ");
		int cnt = sc.nextInt();
		
		switch(number)
		{
			case 1 : f = new Fruit("과일",name); break;
			case 2 : f = new Vegetable("채소",name); break;
			case 3 : f = new Nut("견과",name); break;
		}
		

		if(fc.addNewKind(f, cnt)) {
			System.out.println("새 농산물이 추가되었습니다.");
		}else {
			System.out.println("새 농산물 추가에 실패하였습니다.");
		}
	}
	
	
	public void removeKind() {
		Farm f = new Farm();
		System.out.println("1. 과일 / 2. 채소 / 3. 견과");
		System.out.print("삭제할 종류 번호 : ");
		int number = sc.nextInt();
		
		while((number != 1) && (number != 2) && (number != 3)) {
		System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		System.out.println("1. 과일 / 2. 채소 / 3. 견과");
		System.out.print("삭제할 종류 번호 : ");
		number = sc.nextInt();
		}
		
		System.out.print("이름 : ");
		String name = sc.next();
		

		switch(number)
		{
			case 1 : f = new Fruit("과일",name); break;
			case 2 : f = new Vegetable("채소",name); break;
			case 3 : f = new Nut("견과",name); break;
		}
		
		if(fc.removeKind(f)) {
			System.out.println("농산물 삭제에 성공하였습니다.");
		}else {
			System.out.println("농산물 삭제에 실패하였습니다.");
		}
	}
	
	
	
	
	public void changeAmount() {
		Farm f = new Farm();
		System.out.println("1. 과일 / 2. 채소 / 3. 견과");
		System.out.print("수정할 종류 번호 : ");
		int number = sc.nextInt();
		
		while((number != 1) && (number != 2) && (number != 3)) {
		System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		System.out.println("1. 과일 / 2. 채소 / 3. 견과");
		System.out.print("수정할 종류 번호 : ");
		number = sc.nextInt();
		}
		
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("수정할 수량 : ");
		int cnt = sc.nextInt();
		

		switch(number)
		{
			case 1 : f = new Fruit("과일",name); break;
			case 2 : f = new Vegetable("채소",name); break;
			case 3 : f = new Nut("견과",name); break;
		}
		
		if(fc.changeAmount(f,cnt)) {
			System.out.println("농산물 수량 수정에 성공하였습니다.");
		}else {
			System.out.println("농산물 수량 수정에 실패하였습니다.");
		}
	}
	
	
	public void printFarm() {
		HashMap hm = fc.printFarm();
		Set keys = hm.keySet();
		
		for(Object key : keys) {
			System.out.println(key+"("+hm.get(key)+"개)");
		}
		
	}
	
	
	
	public void buyFarm() {
		Farm f = new Farm();
		System.out.println("1. 과일 / 2. 채소 / 3. 견과");
		System.out.print("구매 종류 번호 : ");
		int number = sc.nextInt();
		
		while((number != 1) && (number != 2) && (number != 3)) {
		System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		System.out.println("1. 과일 / 2. 채소 / 3. 견과");
		System.out.print("구매 종류 번호 : ");
		number = sc.nextInt();
		}
		
		System.out.print("구매할 것 : ");
		String name = sc.next();
		
		switch(number)
		{
			case 1 : f = new Fruit("과일",name); break;
			case 2 : f = new Vegetable("채소",name); break;
			case 3 : f = new Nut("견과",name); break;
		}
		fc.buyFarm(f);
	}
	
	
	
	
	public void removeFarm() {
		Farm f = new Farm();
		System.out.println("1. 과일 / 2. 채소 / 3. 견과");
		System.out.print("취소 종류 번호 : ");
		int number = sc.nextInt();
		
		while((number != 1) && (number != 2) && (number != 3)) {
		System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
		System.out.println("1. 과일 / 2. 채소 / 3. 견과");
		System.out.print("취소 종류 번호 : ");
		number = sc.nextInt();
		}
		
		System.out.print("구매 취소할 것 : ");
		String name = sc.next();
		
		
		switch(number)
		{
			case 1 : f = new Fruit("과일",name); break;
			case 2 : f = new Vegetable("채소",name); break;
			case 3 : f = new Nut("견과",name); break;
		}
		fc.removeFarm(f);
	}
	
	
	
	
	public void printBuyFarm() {
		HashMap um = fc.printBuyFarm();
		Set keys = um.keySet();
		
		System.out.println("===== 손님이 구매한 과일 목록과 개수 =====");
		for(Object key : keys) {
			System.out.println(key+"("+um.get(key)+"개)");
		}
		System.out.println("=================================");
		
	}
	
	
	
}
