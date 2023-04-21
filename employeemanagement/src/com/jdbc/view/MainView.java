package com.jdbc.view;

import java.util.List;
import java.util.Scanner;

import com.jdbc.controller.EmpController;
import com.jdbc.model.dto.EmpDTO;

public class MainView {
	Scanner sc = new Scanner(System.in);

	public void mainMenu() {
		EmpController controller = new EmpController(); // 지역변수로 선언해도 가능(외부에서 사용안하기 때문)
		
		while(true) {
			System.out.println("==== 사원관리 프로그램 ====");
			System.out.println("1. 전체 사원 조회");
			System.out.println("2. 사원 조회");
			System.out.println("3. 사원 등록");
			System.out.println("4. 사원 수정");
			System.out.println("5. 사원 삭제");
			System.out.println("6. 부서 관리");
			System.out.println("7. 직책 관리");
			System.out.println("0. 프로그램 종료");
		
			System.out.print("메뉴선택 : ");
			int cho = sc.nextInt();
			
			switch(cho) {
				case 1: controller.selectEmpAll(); break;
				case 2: break;
				case 3: break;
				case 4: break;
				case 5: break;
				case 6: break;
				case 7: break;
				case 0: System.out.println("프로그램을 종료합니다."); return;
				default : System.out.println("0~7사이의 메뉴를 입력하세요");
			}
		}
	}
	
	
	public void printEmpAll(List<EmpDTO> Emps) {
		System.out.println("===== 사원 리스트 =====");
		if(Emps.isEmpty()) {
			System.out.println("조회된 사원이 없습니다.");
		}else {
			Emps.forEach((e)-> System.out.println(e));
		}
		System.out.println("====================");
	}
}
