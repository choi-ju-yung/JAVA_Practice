package com.bs.practice.charCheck.view;

import com.bs.practice.charCheck.run.CharacterMenu;

public class Run {
	
public static void main(String[] args) {
	new CharacterMenu().menu();
}

//	public static void main(String[] args) throws CharCheckException { // 예외던지기
//		Scanner sc = new Scanner(System.in);
//		System.out.print("문자열 입력 : ");
//		String str = sc.nextLine();
//		int cnt = new CharacterController().countAlpha(str);
//		
//
//		if(cnt == 0) {
//			return;
//		}else {
//			System.out.println("'"+str+"'"+"에 포함된 영문자 개수 : "+cnt);
//
//		}
//		
//	}

}
