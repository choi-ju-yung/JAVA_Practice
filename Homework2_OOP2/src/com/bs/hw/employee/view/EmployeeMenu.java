package com.bs.hw.employee.view;
import java.util.Scanner;

import com.bs.hw.employee.controller.EmployeeController;
import com.bs.hw.employee.model.vo.Employee;

public class EmployeeMenu {
	private EmployeeController ec = new EmployeeController();
	
	public EmployeeMenu() {
		
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("1. 사원 추가 ");
			System.out.println("2. 사원 수정 ");
			System.out.println("3. 사원 삭제 ");
			System.out.println("4. 사원 출력 ");
			System.out.println("9. 프로그램 종료 ");
			System.out.print("메뉴 번호를 누르세요 : ");
			int num = sc.nextInt();
			
			switch(num) {
				case 1 : insertEmp(); break;//개발중 
				case 2 : updateEmp(); break;//개발중
				case 3 : deleteEmp(); break;
				case 4 : printEmp(); break;
				case 9 : System.out.println("프로그램 종료"); return;
				default : System.out.println("번호를 잘못 입력했습니다."); break;
			}
		}
	}		

		public void insertEmp() {
			Scanner sc = new Scanner(System.in);
			System.out.print("사원 번호 : ");
			int number = sc.nextInt();
			System.out.print("사원 이름 : ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("사원 성별 : ");
			char gender = sc.next().charAt(0);
			System.out.print("전화 번호 : ");
			sc.nextLine();
			String phone = sc.nextLine();

			
			while(true) {
				System.out.print("추가 정보를 더 입력하시겠습니까?(y/n) : ");
				char answer = sc.next().charAt(0);
				
				if(answer == 'y') {
					System.out.print("사원 부서 : ");
					sc.nextLine();
					String department = sc.nextLine();
					System.out.print("사원 연봉 : ");
					int salary = sc.nextInt();
					System.out.print("보너스 율 : ");
					double bonus = sc.nextDouble();
					ec.add(number, name, gender, phone, department, salary, bonus);
					break;
				}else if(answer == 'n') {
					ec.add(number, name, gender, phone);
					break;
				}else {
					System.out.println("잘못 입력하셨습니다.");
					return;  // 메인화면으로 이동
				}
			}	
		}
		
		
		
		public void updateEmp() {
			Scanner sc = new Scanner(System.in);
			System.out.println("가장 최신의 사원 정보를 수정하게 됩니다.");
			System.out.println("사원의 어떤 정보를 수정하시겠습니까?");
			System.out.println("1. 전화 번호");
			System.out.println("2. 사원 연봉");
			System.out.println("3. 보너스 율");
			System.out.println("9. 돌아가기");
			System.out.print("메뉴 번호를 누르세요 : ");
			int num = sc.nextInt();
			
			switch(num) {
				case 1 : System.out.print("수정할 전화번호 : ");
					sc.nextLine();
					String phone = sc.nextLine();
					ec.modify(phone); break;
				case 2 : System.out.print("수정할 연봉 : ");
					int salary = sc.nextInt();
					ec.modify(salary); break;
				case 3 : System.out.print("수정할 보너스율 : ");
					double bonus = sc.nextDouble();
					ec.modify(bonus); break;
				case 9 : System.out.println("메인 메뉴로 돌아갑니다."); 
					break;
				default : System.out.println("잘못 입력하셨습니다.");
				    break;
			}

		}
		
		
	
		public void deleteEmp() {
			Scanner sc = new Scanner(System.in);
			System.out.print("정말 삭제하시겠습니까? (y/n) : ");
			char answer = sc.next().charAt(0);
			
			if(answer == 'y') {
				Employee e = ec.remove();
			}
			
			if(answer == 'n') {
				return;
			}
		}
		
		
		
		public void printEmp(){
			if(ec == null) {
				System.out.println("사원 데이터가 없습니다.");
			}else {
				System.out.println(ec.inform());
			}
			return;
		}
		
}
