package com.bs.practice1.func;
import java.util.Scanner;

public class VariablePractice1 {
	public void ex1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		System.out.print("성별을 입력하세요(남/여) : ");
		char gender  = sc.next().charAt(0);
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		System.out.print("키를 입력하세요(cm) : ");
		double height = sc.nextDouble();
		System.out.println("키 "+height+"인 "+age+"살 "+gender+"자 "
				+ ""+name+"님 반갑습니다 ^^");
	}
	
	
	public void ex2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 정수 : ");
		int num2 = sc.nextInt();
		System.out.println("더하기 결과 : "+(num1 + num2));
	}
}
