 package com.bs.hw.member.view;
import java.util.Scanner;

import com.bs.hw.member.controller.MemberController;
import com.bs.hw.member.model.vo.Member;

public class MemberMenu {
	private MemberController mc = new MemberController(); 
	// MemberController안의 함수들을 호출하기 위해서 mc 생성 (계속생성하지 않고 하나로접근)
	
	public void mainMenu() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int possibleMember = mc.existMemberNum();
			System.out.println("최대 등록 가능한 회원 수는 "+possibleMember+"명입니다.");
			System.out.println("현재 등록된 회원 수는 "+(10-possibleMember)+"명입니다.");
			
			
			if((10-possibleMember) < 10) { // 현재 등록된 회원 수가 10명이 아닐 때
				System.out.println("1. 새 회원 등록");
				System.out.println("2. 회원 검색");
				System.out.println("3. 회원 정보 수정");
				System.out.println("4. 회원 삭제");
				System.out.println("5. 모두 출력");
				System.out.println("9. 끝내기");
				System.out.print("메뉴 번호 : ");
				int menuNum = sc.nextInt();
				
				switch(menuNum) {
					case 1: insertMember(); break;
					case 2: searchMember(); break;
					case 3: updateMember(); break; 
					case 4: deleteMember(); break; 
					case 5: printAll(); break;
					case 9: System.out.println("프로그램을 종료합니다."); return;
					default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
				}
				
			}else { // 10명일때
				System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
				System.out.println("2. 회원 검색");
				System.out.println("3. 회원 정보 수정");
				System.out.println("4. 회원 삭제");
				System.out.println("5. 모두 출력");
				System.out.println("9. 끝내기");
				System.out.print("메뉴 번호 : ");
				int menuNum = sc.nextInt();
				
				switch(menuNum) {
				case 2: searchMember(); break;
				case 3: updateMember(); break;
				case 4: deleteMember(); break; 
				case 5: printAll(); break;
				case 9: System.out.println("프로그램을 종료합니다."); return;
				default : System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			   }
				
			}
		}
		
	}
	
	
    public void insertMember(){ // 회원등록
        Scanner sc = new Scanner(System.in);
        System.out.println("새 회원을 등록합니다.");

        System.out.print("아이디 : ");
        String id = sc.nextLine();
        while(true) {

          boolean flag = mc.checkId(id);
           
           if(flag == false) {
              break;
           }
           else {
              System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
              System.out.print("아이디 : ");
              id = sc.next();
           }
        }


        System.out.print("이름 : ");
        String name = sc.next();
        System.out.print("비밀번호 : ");
        String password = sc.next();
        System.out.print("이메일 : ");
        String email = sc.next();
        System.out.print("성별(M/F) : ");
        char gender = sc.next().charAt(0);
        while(true) {
           if(gender == 'M' || gender == 'm' || gender == 'f' || gender == 'F') {
              break;
           } else {
              System.out.println("성별을 다시 입력해주세요.");
              System.out.print("성별(M/F) : ");
              gender = sc.next().charAt(0);      // 여기추가!!!!!!
           }
        }

        System.out.print("나이 : ");
        int age = sc.nextInt();
        
        mc.insertMember(id, name, password, email, gender, age);
     }
	
	

	
	public void searchMember() { // 회원찾기
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 아이디로 검색하기 : ");
		System.out.println("2. 이름으로 검색하기 : ");
		System.out.println("3. 이메일로 검색하기 : ");
		System.out.println("9. 메인으로 돌아가기 : ");
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();
		
		switch(num) {
			case 1: searchId(); break;
			case 2: searchName(); break;
			case 3: searchEmail(); break;
			case 9: System.out.println("메인으로 돌아갑니다."); break;
			default: System.out.println("잘못입력했습니다."); break;
			
		}
	}
	
	
	
	public void searchId(){  // 아이디로 검색
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 아이디 : ");
		String id = sc.next();
		
		String answer = mc.searchId(id);
		
		if(answer.equals("못찾음")) {
			System.out.println("검색 결과가 없습니다.");
		}
		else {
			System.out.println("찾으신 회원 조회 결과입니다.");
			System.out.println(answer);
		}

	}
	
	
	
	public void searchName(){  // 이름으로검색
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 이름 : ");
		String name = sc.next();
		
		Member[] mm = mc.searchName(name);
		
		if(mm[0] != null) {
			flag = true;
		}
		
		
		if(flag == true) {
			System.out.println("찾으신 회원 조회 결과입니다."); 
			for(int i=0; i<mm.length; i++) {
				if(mm[i] !=null) {
					System.out.println(mm[i].getId()+" "+mm[i].getName()+" "+
							mm[i].getPassword()+" "+mm[i].getEmail()+" "
							+mm[i].getGender()+" "+mm[i].getAge());
				}
			}
		}
		else {
			System.out.println("검색 결과가 없습니다.");
		}
	}
	
	
	
	
	public void searchEmail(){  // 이메일로 검색
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 이메일 : ");
		String email = sc.next();
		
		Member[] mmm = mc.searchEmail(email);
		
		if(mmm[0] != null) {
			flag = true;
		}
		
		
		if(flag == true) {
			System.out.println("찾으신 회원 조회 결과입니다."); 
			for(int i=0; i<mmm.length; i++) {
				if(mmm[i] !=null) {
					System.out.println(mmm[i].getId()+" "+mmm[i].getName()+" "+
							mmm[i].getPassword()+" "+mmm[i].getEmail()+" "
							+mmm[i].getGender()+" "+mmm[i].getAge());
				}
			}
		}
		else {
			System.out.println("검색 결과가 없습니다.");
		}
		
	}
	
	
	
	public void updateMember() { // 멤버 수정
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 비밀번호 수정하기 : ");
		System.out.println("2. 이름 수정하기 : ");
		System.out.println("3. 이메일 수정하기 : ");
		System.out.println("9. 메인으로 돌아가기 : ");
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();
		
		switch(num) {
			case 1: updatePassword(); break;
			case 2: updateName(); break;
			case 3: updateEmail(); break;
			case 9: System.out.println("메인으로 돌아갑니다."); break;
			default: System.out.println("잘못입력했습니다."); break;
			
		}
	}
	
	
	
	public void updatePassword() { // 비밀번호 수정
		Scanner sc = new Scanner(System.in);
		System.out.print("수정할 회원의 아이디 : ");
		String id = sc.next();
		System.out.print("수정할 비밀번호 : ");
		String pass = sc.next();
		
		boolean flag = mc.updatePassword(id, pass);
		
		if(flag == true) {
			System.out.println("수정이 성공적으로 되었습니다.");
		}else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
	}
	
	
	
	
	public void updateName() { // 이름 수정
		Scanner sc = new Scanner(System.in);
		System.out.print("수정할 회원의 아이디 : ");
		String id = sc.next();
		System.out.print("수정할 이름 : ");
		String name = sc.next();
		
		boolean flag = mc.updateName(id, name);
		
		if(flag == true) {
			System.out.println("수정이 성공적으로 되었습니다.");
		}else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
	}
	
	
	public void updateEmail() { // 이메일 수정
		Scanner sc = new Scanner(System.in);
		System.out.print("수정할 회원의 아이디 : ");
		String id = sc.next();
		System.out.print("수정할 이메일 : ");
		String email = sc.next();
		
		boolean flag = mc.updateEmail(id, email);
		
		if(flag == true) {
			System.out.println("수정이 성공적으로 되었습니다.");
		}else {
			System.out.println("존재하지 않는 아이디입니다.");
		}
	}

	
	
	public void deleteMember(){
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 특정 회원 삭제하기 : ");
		System.out.println("2. 모든 회원 삭제하기 : ");
		System.out.println("9. 메인으로 돌아가기 : ");
		System.out.print("메뉴 번호 : ");
		int num = sc.nextInt();
		
		switch(num) {
			case 1: deleteOne(); break;
			case 2: deleteAll(); break;
			case 9: System.out.println("메인으로 돌아갑니다."); break;
			default: System.out.println("잘못입력했습니다."); break;
			
		}
	}
	

	public void deleteOne(){
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 회원 아이디 입력 : ");
		String id = sc.next();
		
		System.out.print("정말 삭제하시겠습니까? (y or n) : ");
		String answer = sc.next();
		answer = answer.toLowerCase(); // 대문자로 입력할 경우 예외처리
		
		if(answer.equals("y")) {
			boolean flag = mc.delete(id);
			
			if(flag == true) {
				System.out.println("성공적으로 삭제하였습니다.");
			}else {
				System.out.println("존재하지 않는 아이디입니다.");
			}
	
		}else if(answer.equals("n")){
			System.out.println("n을 입력하셔서 메인으로 돌아갑니다.");
		}else {
			System.out.println("잘못입력하셔서 메인으로 돌아갑니다.");
		}
		
		
	}
	
	
	public void deleteAll(){
		Scanner sc = new Scanner(System.in);
		System.out.print("정말 삭제하시겠습니까? (y or n) : ");
		String answer = sc.next();
		answer = answer.toLowerCase(); // 대문자로 입력할 경우 예외처리
		
		if(answer.equals("y")) {
			mc.delete();
			System.out.println("성공적으로 삭제하였습니다.");

		}else if(answer.equals("n")){
			System.out.println("n을 입력하셔서 메인으로 돌아갑니다.");
		}else {
			System.out.println("잘못입력하셔서 메인으로 돌아갑니다.");
		}
	}

	
	public void printAll() { // 현재 리스트 모두 출력
		Member[] m = mc.printAll();
		for(int i=0; i<m.length; i++) {
			if(m[i] != null) {
				System.out.println(m[i].getId()+" "+m[i].getName()+" "+
						m[i].getPassword()+" "+m[i].getEmail()+" "
						+m[i].getGender()+" "+m[i].getAge());
			}
		}
	}
	
}
