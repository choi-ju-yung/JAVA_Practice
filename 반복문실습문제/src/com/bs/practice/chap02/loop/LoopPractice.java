package com.bs.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {


	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num > 0) {
			for (int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}

	
	public void practice2() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			if (num > 0) {
				for (int i = 1; i <= num; i++) {
					System.out.print(i + " ");
				}
				break;
			} else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
		}
	}

	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (num > 0) {
			for (int i = num; i > 0; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}

	}

	
	public void practice4() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();

			if (num > 0) {
				for (int i = num; i > 0; i--) {
					System.out.print(i + " ");
				}
				break;
			} else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
		}
	}

	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			sum += i;
			if (i == num) {
				System.out.print(i + " = " + sum);
			} else {
				System.out.print(i + " + ");
			}
		}
	}

	
	public void practice6() {
		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 : ");
		int num2 = sc.nextInt();

		if (num1 > 0 && num2 > 0) {
			if (num1 > num2) {
				for (int i = num2; i <= num1; i++) {
					System.out.print(i + " ");
				}
			} else if (num1 < num2) {
				for (int i = num1; i <= num2; i++) {
					System.out.print(i + " ");
				}
			} else {
				System.out.print(num1);
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요");
		}
	}

	
	public void practice7() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("첫 번째 숫자 : ");
			int num1 = sc.nextInt();
			System.out.print("두 번째 숫자 : ");
			int num2 = sc.nextInt();

			if (num1 > 0 && num2 > 0) {
				if (num1 > num2) {
					for (int i = num2; i <= num1; i++) {
						System.out.print(i + " ");
					}
					break;
				}

				else if (num1 < num2) {
					for (int i = num1; i <= num2; i++) {
						System.out.print(i + " ");
					}
					break;
				} else {
					System.out.print(num1);
				}
				break;
			} else {
				System.out.println("1 이상의 숫자를 입력해주세요");
			}
		}
	}

	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		System.out.println("===== " + num + "단 =====");
		for (int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
	}

	
	public void practice9() {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 : ");
		int num = sc.nextInt();
		if (num >= 1 && num <= 9) {
			System.out.println("===== " + num + "단 =====");
			for (int i = 1; i <= 9; i++) {
				System.out.println(num + " * " + i + " = " + (num * i));
			}
		} else {
			System.out.println("9 이하의 숫자만 입력하세요");
		}
	}

	
	public void practice10() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("숫자 : ");
			int num = sc.nextInt();
			if (num >= 1 && num <= 9) {
				System.out.println("===== " + num + "단 =====");
				for (int i = 1; i <= 9; i++) {
					System.out.println(num + " * " + i + " = " + (num * i));
				}
				break;
			} else {
				System.out.println("9 이하의 숫자만 입력하세요");
			}
		}
	}

	
	public void practice11() {
		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		System.out.print("시작 숫자 : ");
		int startNum = sc.nextInt();
		System.out.print("공차 : ");
		int gong = sc.nextInt();

		for (int i = startNum;; i += gong) {
			cnt++;
			System.out.print(i + " ");
			if (cnt == 10) {
				break;
			}
		}
	}

	
	
	public void practice12() {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("연산자 입력 : ");
			String oper = sc.next();

			System.out.print("정수1 : ");
			int num1 = sc.nextInt();
			System.out.print("정수2 : ");
			int num2 = sc.nextInt();

			if (oper.equals("exit")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if ((oper.equals("+")) || (oper.equals("-")) || (oper.equals("*")) || (oper.equals("%")) || (oper == "/")) {
				switch (oper) {
				case "+":
					System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
					break;
				case "-":
					System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
					break;
				case "*":
					System.out.println(num1 + " * " + num2 + " = " + num1 * num2);
					break;
				case "/":
					System.out.println(num1 + " / " + num2 + " = " + num1 / num2);
					break;
				case "%":
					System.out.println(num1 + " % " + num2 + " = " + num1 % num2);
					break;
				}
			}
			else {
				System.out.println("없는 연산자입니다.");
			}
		}
	}
	
	
	
	
	
	public void practice13(){
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	
	
	public void practice14(){
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=num; i>=1; i--) {
			for(int j=i; j>=1; j--) {
				System.out.print("*");
			}

			System.out.println();
		}
	}
	
	
	
	
	public void practice15() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		int count = 0;
		if (num > 2) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println("소수입니다.");
			} else {
				System.out.println("소수가 아닙니다.");
			}

		} else {
			System.out.println("잘못 입력했습니다.");
		}
	}
	
	
	
	
	
	
	public void practice16()
	{
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			boolean flag = false;
			System.out.print("숫자 : ");
			int num = sc.nextInt();
			int count = 0;
			if (num >= 2) {
				for (int i = 1; i <= num; i++) {
					if (num % i == 0) {
						count++;
					}
				}
				if (count == 2) {
					System.out.println("소수입니다.");
				} else {
					System.out.println("소수가 아닙니다.");
				}

			} else {
				System.out.println("잘못 입력했습니다.");
				flag = true;
			}
			if(flag == false) {
				break;
			}
		}
	}
	
	
	
	
	
	
	
	public void practice17() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		int sosuCount = 0;
		if (num >= 2) {
			for(int i=2; i<=num; i++) {
				for(int j=2; j<=num; j++)
				{
					if(i % j == 0) {
						if(i == j) {
							System.out.print(i+" ");
							sosuCount++;
						}else {
							break;
						}
					}
				}
			}
			System.out.println();
			System.out.println("2부터 "+num+"까지의 소수의 개수는 "+sosuCount+"개입니다.");
		}else {
			System.out.println("잘못 입력하였습니다.");
		}
	}
	
	
	
	
	
	public void practice18() {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.print("자연수 하나를 입력하세요 : ");	
		int num = sc.nextInt();
		for(int i=1; i<=num; i++) {
			if((i%2 == 0) || (i%3==0)) {
				System.out.print(i+" ");
			}
			if((i%2 == 0) && (i%3==0)) {
				count++;
			}	
		}
		System.out.println();
		System.out.println("count : "+count);
	}
	
	
	
	
	

	public void practice19() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=num-i; j>=1; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	
	
	public void practice20() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int num = sc.nextInt();
		
		for(int i=0; i<num+2; i++) {
			
			if(i<3) {
				for(int j=0; j<=i; j++) {
					System.out.print("*");
				}
				
			}else {
				for(int k=4-i; k>=0; k--) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	
	
	
	public void practice21() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=num-i; j>=1; j--) {
				System.out.print(" ");
			}
			
			for(int k=2*i-1; k>=1; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	
	
	
	public void practice22() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			if(i==1 || i==num) {
				for(int j=1; j<=num; j++) {
					System.out.print("*");
				}
			}else {
				for(int k=1; k<=num; k++) {
					if(k==1 || k==num) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
	
	
	
	
	
	
}
