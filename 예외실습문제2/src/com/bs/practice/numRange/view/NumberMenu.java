package com.bs.practice.numRange.view;

import java.util.Scanner;

import com.bs.practice.numRange.controller.NumberController;
import com.bs.practice.numRange.exception.NumRangeException;

public class NumberMenu {
	Scanner sc = new Scanner(System.in);
	public void menu() {
		boolean flag = false;
		System.out.print("정수1 : ");
		int number1 = sc.nextInt();
		System.out.print("정수2 : ");
		int number2 = sc.nextInt();

		try{
			flag = new NumberController().checkDouble(number1, number2);
			System.out.println(number1+"은(는) "+number2+"의 배수인가 ? "+flag);
		}catch(NumRangeException e){
			e.printStackTrace();
		}


		
	}
}
