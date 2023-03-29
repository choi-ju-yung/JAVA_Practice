package com.bs.practice2.func;
import java.util.Scanner;

public class CastingPractice1 {
	 public void ex1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 : ");
		char alpha = sc.next().charAt(0);
		System.out.println(alpha+" unicode : "+(int)alpha);
	 }
	 
	 
	 public void ex2() {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("국어 : ");
		 double korean = sc.nextDouble();
		 System.out.print("영어 : ");
		 double english = sc.nextDouble();
		 System.out.print("수학 : ");
		 double math = sc.nextDouble();
		 
		 System.out.println("총점 : "+(int)(korean + english + math));
		 System.out.println("평균 : "+(int)(korean + english + math)/3);
	 }
	 
	 
	 
	 public void ex3() {
		 int iNum1 = 10;
		 int iNum2 = 4;
		 float fNum = 3.0f;
		 double dNum = 2.5;
		 char ch = 'A';
		 
		 System.out.println((int)(iNum1 / iNum2));
		 System.out.println((int)dNum);
		 System.out.println();
		 System.out.println((int)(iNum2 * dNum));
		 System.out.println((double)iNum1);
		 System.out.println();
		 System.out.println((double)iNum1 / iNum2);
		 System.out.println(dNum);
		 System.out.println();
		 System.out.println((int)fNum);
		 System.out.println(iNum1 /(int)fNum);
		 System.out.println();
		 System.out.println(iNum1 / fNum);
		 System.out.println((double)iNum1 / fNum);
		 System.out.println();
		 System.out.println(ch);
		 System.out.println((int)ch);
		 System.out.println((int)ch + iNum1);
		 System.out.println((char)(ch + iNum1));
	 }
	 
	 
}
