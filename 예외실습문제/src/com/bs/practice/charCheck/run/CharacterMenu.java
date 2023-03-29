package com.bs.practice.charCheck.run;

import java.util.Scanner;

import com.bs.practice.charCheck.controller.CharacterController;
import com.bs.practice.charCheck.exception.CharCheckException;

public class CharacterMenu{
	
	public void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		int cnt = 0;
		try {
			cnt = new CharacterController().countAlpha(str); // 문자전달
		} catch (CharCheckException e) { // 예외발생시 경고문 출력
			e.printStackTrace();
		}
		

		if(cnt == 0) {
			return;
		}else {
			System.out.println("'"+str+"'"+"에 포함된 영문자 개수 : "+cnt);

		}
	}
}
