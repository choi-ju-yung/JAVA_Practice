package com.bs.practice.list.music.view;

import java.util.List;
import java.util.Scanner;

import com.bs.practice.list.music.controller.MusicController;
import com.bs.practice.list.music.model.vo.Music;

public class MusicView {
	Scanner sc = new Scanner(System.in);
	MusicController mc = new MusicController();
	
	public void mainMenu() {
		System.out.println("=====메인 메뉴=====");

		while (true) {
			System.out.println("=====*******메인 메뉴*******=====");
			System.out.println("1. 마지막 위치에 곡 추가");
			System.out.println("2. 첫 위치에 곡 추가");
			System.out.println("3. 전체 곡 목록 출력");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 삭제");
			System.out.println("6. 특정 곡 정보 수정");
			System.out.println("7. 곡명 오름차순 정렬");
			System.out.println("8. 가수명 내림차순 정렬");
			System.out.println("9. 종료");
			
			System.out.print("메뉴 번호 선택 : ");
			int number = sc.nextInt();

			switch (number) {
			case 1:
				addList();
				break;
			case 2:
				addAtZero();
				break;
			case 3:
				printAll();
				break;
			case 4:
				searchMusic();
				break;
			case 5:
				removeMusic();
				break;
			case 6:
				setMusic();
				break;
			case 7:
				ascTitle();
				break;
			case 8:
				descSinger();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다. ");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시입력해주세요");
			}
		}
	}
	
	
	
	public void addList(){
		System.out.println("****** 마지막 위치에 곡 추가 ******");
		sc.nextLine();
		System.out.print("곡 명 입력 : ");
		String title = sc.nextLine();
		System.out.print("가수 명 입력 : ");
		String singer = sc.nextLine();
		
		int addResult = mc.addList(new Music(title,singer));
		
		if(addResult == 1) {
			System.out.println("추가 성공");
		}else {
			System.out.println("추가 실패");
		}
	}
	
	public void addAtZero(){
		
		System.out.println("****** 첫 위치에 곡 추가 ******");
		sc.nextLine();
		System.out.print("곡 명 입력 : ");
		String title = sc.nextLine();
		System.out.print("가수 명 입력 : ");
		String singer = sc.nextLine();
		
		int addZeroResult = mc.addAtZero(new Music(title,singer));
		
		if(addZeroResult == 1) {
			System.out.println("추가 성공");
		}else {
			System.out.println("추가 실패");
		}
	}
	
	
	public void printAll(){
		System.out.println("****** 전체 곡 목록 출력 ******");
		List list = mc.printAll();
		
		System.out.print("[");
		for(int i=0; i<list.size(); i++) {
			Music m = (Music)list.get(i);
			
			System.out.print(m.getSinger()+" - "+m.getTitle());
			
			if(i != list.size()-1) {
				System.out.print(", ");
			}
			
		}
			System.out.println("]");
	}
	
	
	
	
	public void searchMusic(){
		System.out.println("****** 특정 곡 검색 ******");
		sc.nextLine();
		System.out.print("곡 명 입력 : ");
		String title = sc.nextLine();	
		
		Music m = mc.searchMusic(title);
		
		if(m == null) {
			System.out.println("검색한 곡이 없습니다.");
		}else {
			System.out.println(m.getSinger()+ " - "+m.getTitle());
		}
	}
	
	
	
	public void removeMusic(){
		System.out.println("****** 특정 곡 삭제 ******");
		sc.nextLine();
		System.out.print("곡 명 입력 : ");
		String title = sc.nextLine();	
		Music m =mc.removeMusic(title);
		
		if(m == null) {
			System.out.println("삭제할 곡이 없습니다.");
		}else {
			System.out.println(m.getSinger()+ " - "+m.getTitle()+"를 삭제했습니다.");
		}
	}
	
	
	
	public void setMusic(){
		System.out.println("****** 특정 곡 정보 수정 ******");
		sc.nextLine();
		System.out.print("검색할 곡 명 입력 : ");
		String title = sc.nextLine();	
		Music m =mc.searchMusic(title);
		
		if(m == null) {
			System.out.println("수정할 곡이 없습니다.");
			return;
		}
		
		System.out.print("수정할 곡 명 : ");
		String updateTitle = sc.nextLine();
		System.out.print("수정할 가수 명 : ");
		String updateSinger = sc.nextLine();
		m.setTitle(updateTitle);
		m.setSinger(updateSinger);
		
		mc.setMusic(title,m);
		
		System.out.println(m.getSinger()+ " - "+m.getTitle()+"로 수정되었습니다.");
	}

	

	public void ascTitle(){
		System.out.println("****** 곡 명 오름차순 정렬 ******");
		mc.ascTitle();
		
		System.out.println("정렬 성공");
		
		// MusicController에 ascTitle()의 값에 따라 성공 시 “정렬 성공”, 실패 시 “정렬 실패” 
		}
	
	
	
	public void descSinger(){
		System.out.println("****** 가수명 내림차순 정렬 ******");
		mc.descSinger(); 
		
		System.out.println("정렬 성공");
	}

	
}
